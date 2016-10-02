import korat.finitization.*;
import korat.finitization.impl.*;
import java.util.HashMap;
import java.util.HashSet;

public class AcyclicGraph {
    Vertex root;
    public static class Vertex {
        Vertex[] outgoingEdges;
    }
        
    private boolean depthFirstSearch(Vertex v, HashMap<Vertex, Boolean> marked) {
        HashSet<Vertex> visited = new HashSet<Vertex>();
        if (!marked.containsKey(v)) {
        	marked.put(v, false);
        	for (int i = 0; i < v.outgoingEdges.length; i++) {
        		if (v.outgoingEdges[i] == null)
        			return false;
        		if (!visited.add(v.outgoingEdges[i]))
        			return false;
        		if (!depthFirstSearch(v.outgoingEdges[i], marked))
        			return false;
             }
        } else if (!marked.get(v))
        	return false;
        marked.put(v, true);
        return true;
    }
    
    public boolean repOK() {
        // returns true if and if only the graph reachable from "root" is a directed acyclic graph
        // complete this method
    	// ...which means no cycles
    	
    	// Trivial Case
    	if (root == null)
    		return true;
    	
        HashMap<Vertex, Boolean> marked = new HashMap<Vertex, Boolean>();
        return depthFirstSearch(root, marked);
    }
    
    public static IFinitization finAcyclicGraph(int nodesNum) {
        // complete this method
    	IFinitization f = FinitizationFactory.create(AcyclicGraph.class);
    	IObjSet vertexs = f.createObjSet(Vertex.class, nodesNum, true);
    	f.set("root", vertexs);
    	IIntSet arrayLength = f.createIntSet(0, nodesNum-1);
    	IArraySet oeVertexs = f.createArraySet(Vertex[].class, arrayLength, vertexs, nodesNum);
        f.set("Vertex.outgoingEdges", oeVertexs);
        return f;
    }
}
