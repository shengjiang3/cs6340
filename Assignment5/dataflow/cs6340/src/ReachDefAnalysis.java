import chord.project.Chord;
import chord.util.tuple.object.Pair;
import joeq.Compiler.Quad.Quad;
import joeq.Compiler.Quad.RegisterFactory.Register;

@Chord(name="reachdef")
public class ReachDefAnalysis extends DataflowAnalysis<Pair<Quad, Register>> {
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
	}
}

