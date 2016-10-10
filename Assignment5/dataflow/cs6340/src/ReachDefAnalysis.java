import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import chord.project.Chord;
import chord.util.tuple.object.Pair;
import joeq.Compiler.Quad.Quad;
import joeq.Compiler.Quad.RegisterFactory.Register;
import joeq.Compiler.Quad.Operand.RegisterOperand;
import joeq.Compiler.Quad.BasicBlock;


@Chord(name="reachdef")
public class ReachDefAnalysis extends DataflowAnalysis<Pair<Quad, Register>> {
	
	boolean setsDifferent(Map<Quad, Set<Pair<Quad, Register>>> m1, Map<Quad, Set<Pair<Quad, Register>>> m2) {
		if (m1.size() != m2.size())
			return true;
		for (Quad q1 : m1.keySet()) {
			if (!m2.containsKey(q1))
				return true;
			if (m1.get(q1).size() != m2.get(q1).size())
				return true;
			for (Pair<Quad, Register> p : m1.get(q1)) {
				if (!m2.get(q1).contains(p))
					return true;
			}
		}
		return false;
	}
	
	@Override
	public void doAnalysis() {
		// Implement your reaching definitions dataflow analysis here. 
		//
		// File DataflowAnalysis.java defines instance fields main, inMap, and
		// outMap, which will serve as the inputs and outputs of your analysis:
		//
		// INPUT: Method main.
		//
		// OUTPUT: Populate maps inMap and outMap with the results of your
		// reaching definitions analysis of method main.
		//
		// Specifically, for each Quad q in the control-flow graph of main,
		// inMap(q) and outMap(q) must contain the sets of all <Quad, Register>
		// definitions that may reach the entry and the exit, respectively, of
		// q.  You can leave a set either null or empty if it does not contain
		// any reaching definitions.
		//
		// Your analysis will be graded for the following aspects in decreasing
		// order of importance:
		//
		// 1. Correctness of the results produced by the analysis.
		// 2. Efficiency of the analysis, in particular, the number of times you
		// revisit each quad.
		//
		// Add helper instance methods to this class if necessary.  All your
		// code must be in this class itself, and it must be written in Java.
		//
		// Note: This is a single procedure analysis; you do not need to
		// consult any pointer analysis, call graph, or any method of the given
		// program besides the provided main method.
		
		// initialize all in and out sets to the empty set
		for (BasicBlock bb : main.getCFG().reversePostOrder()) {
			for (int i = 0; i < bb.size(); i++) {
				Quad q = bb.getQuad(i);
				inMap.put(q, new HashSet<Pair<Quad, Register>>());
				outMap.put(q, new HashSet<Pair<Quad, Register>>());
			}
		}
		
		boolean changed = true;
		Map<Quad, Set<Pair<Quad, Register>>> lastInMap = new HashMap<Quad, Set<Pair<Quad, Register>>>(inMap);
		Map<Quad, Set<Pair<Quad, Register>>> lastOutMap = new HashMap<Quad, Set<Pair<Quad, Register>>>(outMap);
		
		while(changed) {
			for (BasicBlock bb : main.getCFG().reversePostOrder()) { // forward order
				for (int i = 0; i < bb.size(); i++) { // forward order
					Quad q = bb.getQuad(i);
					
					// set IN to the union of all predeccesor quads
					inMap.put(q, new HashSet<Pair<Quad, Register>>());
					if (i == 0) { // if first quad in basic block, look back to last quad of predecesor basic blocks
						for (BasicBlock bbp : bb.getPredecessors())
							if (bbp.size() > 0) {
								Set<Pair<Quad, Register>> newInSet = new HashSet<Pair<Quad, Register>>(inMap.get(q));
								newInSet.addAll(outMap.get(bbp.getQuad(bbp.size() - 1))); 
								inMap.put(q, newInSet); // Set.addAll is in place
							}
					} else
						inMap.put(q, outMap.get(bb.getQuad(i-1)));
					
					// generate kill and gen sets
					Set<Pair<Quad, Register>> killSet = new HashSet<Pair<Quad, Register>>();
					Set<Pair<Quad, Register>> genSet = new HashSet<Pair<Quad, Register>>();
					for (RegisterOperand ro : q.getDefinedRegisters()) {
						Register r = ro.getRegister();
						genSet.add(new Pair<Quad, Register>(q, r));
						for (Pair<Quad, Register> p : inMap.get(q))
							if (p.val1.equals(r) && !p.val0.equals(q))
								killSet.add(p);
					}
					// set OUT to (IN[n] - KILL[n]) U GEN[n]
					Set<Pair<Quad, Register>> tmpSet = new HashSet<Pair<Quad, Register>>(inMap.get(q));
					tmpSet.removeAll(killSet); // IN[n] - KILL[n]
					tmpSet.addAll(genSet); // U GEN[n]
					outMap.put(q, tmpSet);
				}
			}
			
			// continue to iterate over the recursive blocks until the inMap and outMap elements stop changing
			changed = setsDifferent(lastInMap, inMap) || setsDifferent(lastOutMap, outMap);
			lastInMap = new HashMap<Quad, Set<Pair<Quad, Register>>>(inMap);
			lastOutMap = new HashMap<Quad, Set<Pair<Quad, Register>>>(outMap);
		}
	}
}

