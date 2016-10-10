import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import chord.project.Chord;
import joeq.Compiler.Quad.RegisterFactory.Register;
import joeq.Compiler.Quad.Quad;
import joeq.Compiler.Quad.Operand.RegisterOperand;
import joeq.Compiler.Quad.BasicBlock;

@Chord(name="liveness")
public class LivenessAnalysis extends DataflowAnalysis<Register> {
	
	boolean setsDifferent(Map<Quad, Set<Register>> m1, Map<Quad, Set<Register>> m2) {
		if (m1.size() != m2.size())
			return true;
		for (Quad q1 : m1.keySet()) {
			if (!m2.containsKey(q1))
				return true;
			if (m1.get(q1).size() != m2.get(q1).size())
				return true;
			if (!m1.get(q1).equals(m2.get(q1)))
				return true;
		}
		return false;
	}
	
	@Override
	public void doAnalysis() {
		// Implement your liveness dataflow analysis here. 
		//
		// File DataflowAnalysis.java defines instance fields main, inMap, and
		// outMap, which will serve as the inputs and outputs of your analysis:
		//
		// INPUT: Method main.
		//
		// OUTPUT: Populate maps inMap and outMap with the results of your
		// liveness analysis of method main.
		//
		// Specifically, for each Quad q in the control-flow graph of main,
		// inMap(q) and outMap(q) must contain the sets of all Registers that
		// may be live on entry and on exit, respectively, of q.  You can leave
		// a set either null or empty if it does not contain any registers.
		//
		// Your analysis will be graded for the following aspects in decreasing
		// order of importance:
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
		for (BasicBlock bb : main.getCFG().reversePostOrderOnReverseGraph()) {
			for (int i = 0; i < bb.size(); i++) {
				Quad q = bb.getQuad(i);
				inMap.put(q, new HashSet<Register>());
				outMap.put(q, new HashSet<Register>());
			}
		}
		
		boolean changed = true;
		Map<Quad, Set<Register>> lastInMap = new HashMap<Quad, Set<Register>>(inMap);
		Map<Quad, Set<Register>> lastOutMap = new HashMap<Quad, Set<Register>>(outMap);
		
		while(changed) {
			for (BasicBlock bb : main.getCFG().reversePostOrderOnReverseGraph()) { // reverse order
				for (int i = bb.size() - 1; i >= 0 ; i--) { // reverse order
					Quad q = bb.getQuad(i);
					
					// set OUT to the union of all successor quads
					outMap.put(q, new HashSet<Register>());
					if (i == bb.size() - 1) { // if last quad in basic block, look forward to first quad of sucessor basic blocks
						for (BasicBlock bbs : bb.getSuccessors())
							if (bbs.size() > 0) {
								Set<Register> newOutSet = new HashSet<Register>(outMap.get(q));
								newOutSet.addAll(inMap.get(bbs.getQuad(0))); 
								outMap.put(q, newOutSet); // Set.addAll is in place
							}
					} else
						outMap.put(q, inMap.get(bb.getQuad(i+1)));
					
					// generate kill and gen sets
					Set<Register> killSet = new HashSet<Register>();
					Set<Register> genSet = new HashSet<Register>();
					for (RegisterOperand ro : q.getDefinedRegisters())
						killSet.add(ro.getRegister());
					for (RegisterOperand ro : q.getUsedRegisters())
						genSet.add(ro.getRegister());	
					// set IN to (OUT[n] - KILL[n]) U GEN[n]
					Set<Register> tmpSet = new HashSet<Register>(outMap.get(q));
					tmpSet.removeAll(killSet); // OUT[n] - KILL[n]
					tmpSet.addAll(genSet); // U GEN[n]
					inMap.put(q, tmpSet);					
				}
			}
			
			// continue to iterate over the recursive blocks until the inMap and outMap elements stop changing
			changed = setsDifferent(lastInMap, inMap) || setsDifferent(lastOutMap, outMap);
			lastInMap = new HashMap<Quad, Set<Register>>(inMap);
			lastOutMap = new HashMap<Quad, Set<Register>>(outMap);
		}
	}
}

