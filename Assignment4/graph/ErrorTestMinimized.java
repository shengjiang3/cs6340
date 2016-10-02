
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTestMinimized {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {
    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }
    Graph graph0 = Graph.generateGraph();
    Node node4 = new Node("hi!");
    Node node6 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node4, node6);
  }

  @Test
  public void test003() throws Throwable {
    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }
    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();
  }
  
}
