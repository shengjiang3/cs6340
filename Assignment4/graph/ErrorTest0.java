
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    Node node4 = new Node("hi!");
    Node node6 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node4, node6);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    Node node6 = new Node("hi!");
    Node node8 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node6, node8);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    Graph graph0 = new Graph();
    Node node2 = new Node("hi!");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    node2.setOwner(graph3);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("hi!");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    Node node4 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = graph0.getDegree(node4);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = node1.getDegree();

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node3);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = graph2.getDegree(node10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = node1.getDegree();

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = graph2.getDegree(node12);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    Graph graph0 = new Graph();
    Node node2 = new Node("hi!");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    node2.setOwner(graph3);
    node2.setOwnerName("");
    Graph graph11 = new Graph();
    java.lang.String str12 = graph11.name;
    node2.setOwner(graph11);
    Node node15 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node2, node15);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node11);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node11, node23);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Node node9 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = graph2.getDegree(node9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("");

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node11);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Node node11 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node11);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("hi!");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    graph6.setName("hi!");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerName("hi!");
    graph6.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = graph0.getDegree(node13);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerName("");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node5, node17);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = node1.getDegree();

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    graph20.setName("hi!");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    node27.setOwner(graph38);
    node27.setOwnerName("hi!");
    graph20.addNode(node27);
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node27, node45);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = graph0.getDegree(node3);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("hi!");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    Graph graph19 = Graph.generateGraph();
    graph19.init();
    node8.setOwner(graph19);
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = graph0.getDegree(node8);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerNameDirectly("hi!");
    node3.setOwnerName("");
    Graph graph14 = Graph.generateGraph();
    graph14.init();
    node3.setOwner(graph14);
    node3.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node3);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.setName("[graph]");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("hi!");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    Graph graph49 = Graph.generateGraph();
    graph49.init();
    node38.setOwner(graph49);
    node38.setOwnerName("hi!");
    graph31.addNode(node38);
    graph28.addNode(node38);
    Graph graph56 = Graph.generateGraph();
    graph56.setName("[graph]");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    graph59.setName("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    Graph graph77 = Graph.generateGraph();
    graph77.init();
    node66.setOwner(graph77);
    node66.setOwnerName("hi!");
    graph59.addNode(node66);
    graph56.addNode(node66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node38, node66);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    Graph graph18 = Graph.generateGraph();
    graph18.init();
    node7.setOwner(graph18);
    node7.setOwnerName("hi!");
    graph0.addNode(node7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = node7.getDegree();

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node13);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    Graph graph29 = Graph.generateGraph();
    graph29.init();
    node18.setOwner(graph29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = graph12.getDegree(node18);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    graph11.setName("");
    graph11.setName("[graph]");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.init();
    node21.setOwner(graph32);
    node21.setOwnerName("hi!");
    graph11.addNode(node21);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerName("");
    Graph graph50 = Graph.generateGraph();
    graph50.init();
    node39.setOwner(graph50);
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    graph53.setName("[graph]");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    node63.setOwner(graph74);
    node63.setOwnerName("hi!");
    graph53.addNode(node63);
    graph50.addNode(node63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node21, node63);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node8.getDegree();

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("hi!");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    node2.setOwner(graph3);
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerName("");
    Graph graph13 = Graph.generateGraph();
    graph13.init();
    node2.setOwner(graph13);
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    graph16.setName("[graph]");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerName("hi!");
    graph16.addNode(node26);
    graph13.addNode(node26);
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    node26.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph0.getDegree(node26);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerName("");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    graph15.setName("hi!");
    node4.setOwner(graph15);
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node4.setOwner(graph24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = graph0.getDegree(node4);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("hi!");
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = graph12.getDegree(node20);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    java.lang.String str17 = graph11.name;
    graph11.init();
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    graph19.addNode(node27);
    graph11.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = graph0.getDegree(node27);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node10.getDegree();

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    graph21.setName("hi!");
    node10.setOwner(graph21);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node10.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph0.getDegree(node10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i2 = node1.getDegree();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = node10.getDegree();

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.name = "";
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("");
    Graph graph27 = Graph.generateGraph();
    graph27.init();
    node16.setOwner(graph27);
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    graph30.setName("");
    graph30.setName("[graph]");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph30.addNode(node40);
    graph27.addNode(node40);
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    node40.setOwner(graph58);
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    graph62.setName("[graph]");
    node40.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph10.getDegree(node40);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = graph2.getDegree(node10);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node8.getDegree();

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.setOwnerNameDirectly("");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    Graph graph22 = Graph.generateGraph();
    graph22.init();
    node11.setOwner(graph22);
    node11.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node11);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerName("");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    node44.setOwner(graph53);
    graph53.setName("");
    graph53.name = "hi!";
    graph53.init();
    node25.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node25.getDegree();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.setName("[graph]");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    graph19.addNode(node27);
    node27.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = graph12.getDegree(node27);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.setName("[graph]");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph9.addNode(node19);
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    graph38.setName("");
    node19.setOwner(graph38);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    java.lang.String str55 = graph49.name;
    graph49.init();
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("");
    graph57.addNode(node65);
    graph49.addNode(node65);
    node65.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node19, node65);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph21.getDegree(node29);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    java.lang.String str10 = graph4.name;
    graph4.init();
    node1.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = node1.getDegree();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    graph32.setName("hi!");
    node21.setOwner(graph32);
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node21.setOwner(graph41);
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node21, node55);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerName("");
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = node8.getDegree();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "";
    graph10.setName("[graph]");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    java.lang.String str31 = graph25.name;
    graph25.init();
    node22.setOwner(graph25);
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node22, node35);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerName("");
    Graph graph15 = Graph.generateGraph();
    graph15.init();
    node4.setOwner(graph15);
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    graph18.setName("[graph]");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    node28.setOwner(graph39);
    node28.setOwnerName("hi!");
    graph18.addNode(node28);
    graph15.addNode(node28);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    node28.setOwner(graph46);
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    graph50.setName("[graph]");
    node28.setOwner(graph50);
    node28.setOwnerName("");
    node28.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph0.getDegree(node28);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    java.lang.String str37 = graph31.name;
    graph31.init();
    node28.setOwner(graph31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node18, node28);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    graph15.addNode(node23);
    node23.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph12.getDegree(node23);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    node29.setOwner(graph40);
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    node46.setOwner(graph57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node29, node46);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    graph12.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("[graph]");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    graph19.setName("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerName("hi!");
    graph19.addNode(node26);
    graph16.addNode(node26);
    Graph graph44 = Graph.generateGraph();
    graph44.init();
    java.lang.String str46 = graph44.name;
    java.lang.String str47 = graph44.name;
    node26.setOwner(graph44);
    Node node50 = new Node("");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    node50.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph12.addEdge(node26, node50);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerName("");
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.init();
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    graph3.setName("");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    graph3.addNode(node11);
    node11.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = graph0.getDegree(node11);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerName("");
    node4.setOwnerName("[graph]");
    node4.setOwnerName("[graph]");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    graph19.addNode(node27);
    node27.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node4, node27);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    node25.setOwnerName("");
    Node node57 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node57);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i2 = node1.getDegree();

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    node25.setOwnerName("");
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node25.getDegree();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    Graph graph43 = Graph.generateGraph();
    graph43.init();
    node32.setOwner(graph43);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    graph46.setName("[graph]");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    Graph graph67 = Graph.generateGraph();
    graph67.init();
    node56.setOwner(graph67);
    node56.setOwnerName("hi!");
    graph46.addNode(node56);
    graph43.addNode(node56);
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    node56.setOwner(graph74);
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    graph78.setName("[graph]");
    node56.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph0.getDegree(node56);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    graph49.name = "hi!";
    Node node58 = new Node("");
    graph49.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph43.getDegree(node58);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.setName("[graph]");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    graph27.setName("hi!");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    graph45.init();
    node34.setOwner(graph45);
    node34.setOwnerName("hi!");
    graph27.addNode(node34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node13, node34);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.setOwnerNameDirectly("hi!");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    graph20.setName("[graph]");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    node30.setOwnerName("hi!");
    graph20.addNode(node30);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    graph49.setName("");
    node30.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node30);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerName("");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    node44.setOwner(graph53);
    graph53.setName("");
    graph53.name = "hi!";
    graph53.init();
    node25.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    graph12.addNode(node20);
    node20.setOwnerName("");
    node20.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    Graph graph42 = Graph.generateGraph();
    graph42.init();
    node31.setOwner(graph42);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    graph45.setName("[graph]");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph45.addNode(node55);
    graph42.addNode(node55);
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    node55.setOwner(graph73);
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    graph77.setName("[graph]");
    node55.setOwner(graph77);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node55);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerNameDirectly("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    node44.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node32, node44);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node10.getDegree();

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    graph44.setName("");
    node25.setOwner(graph44);
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node25.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph10.getDegree(node25);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    graph42.setName("hi!");
    node31.setOwner(graph42);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    graph61.setName("hi!");
    node50.setOwner(graph61);
    node50.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node31, node50);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    Node node6 = new Node("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    node6.setOwner(graph7);
    node6.setOwnerName("");
    node6.setOwnerNameDirectly("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerName("");
    Graph graph27 = new Graph();
    java.lang.String str28 = graph27.name;
    node18.setOwner(graph27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node6, node18);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerName("");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    node23.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.name = "";
    graph32.setName("hi!");
    node8.setOwner(graph32);
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    graph44.addNode(node52);
    node52.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node52);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node11 = new Node("");
    graph2.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = node11.getDegree();

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    java.lang.String str28 = graph21.name;
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("[graph]");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    graph41.setName("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    Graph graph59 = Graph.generateGraph();
    graph59.init();
    node48.setOwner(graph59);
    node48.setOwnerName("hi!");
    graph41.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node30, node48);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    graph43.setName("[graph]");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    graph64.init();
    node53.setOwner(graph64);
    node53.setOwnerName("hi!");
    graph43.addNode(node53);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerNameDirectly("");
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node53);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    node28.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph0.getDegree(node28);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerName("");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    node23.setOwnerName("[graph]");
    node23.setOwnerName("[graph]");
    node23.setOwnerName("");
    node23.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node23);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerName("");
    Graph graph48 = new Graph();
    java.lang.String str49 = graph48.name;
    node39.setOwner(graph48);
    graph48.setName("");
    graph48.setName("");
    graph48.name = "";
    graph48.setName("hi!");
    node10.setOwner(graph48);
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    graph60.setName("");
    graph60.setName("[graph]");
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    node70.setOwnerNameDirectly("hi!");
    node70.setOwnerName("");
    Graph graph81 = Graph.generateGraph();
    graph81.init();
    node70.setOwner(graph81);
    node70.setOwnerName("hi!");
    graph60.addNode(node70);
    node70.setOwnerNameDirectly("hi!");
    node70.setOwnerNameDirectly("");
    node70.setOwnerNameDirectly("hi!");
    node70.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph48.addNode(node70);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    Graph graph17 = Graph.generateGraph();
    graph17.setName("[graph]");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    graph20.setName("hi!");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    node27.setOwner(graph38);
    node27.setOwnerName("hi!");
    graph20.addNode(node27);
    graph17.addNode(node27);
    Graph graph45 = Graph.generateGraph();
    graph45.init();
    java.lang.String str47 = graph45.name;
    java.lang.String str48 = graph45.name;
    node27.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node27);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    node25.setOwnerName("");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerName("");
    Graph graph66 = new Graph();
    java.lang.String str67 = graph66.name;
    node57.setOwner(graph66);
    graph66.init();
    graph66.name = "[graph]";
    node25.setOwner(graph66);
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node74.setOwnerNameDirectly("hi!");
    node74.setOwnerName("");
    node74.setOwnerName("[graph]");
    node74.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node74);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    graph10.init();
    graph10.setName("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    node21.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = graph10.getDegree(node21);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    Graph graph5 = Graph.generateGraph();
    graph5.setName("[graph]");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    graph8.setName("hi!");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    Graph graph26 = Graph.generateGraph();
    graph26.init();
    node15.setOwner(graph26);
    node15.setOwnerName("hi!");
    graph8.addNode(node15);
    graph5.addNode(node15);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    graph33.setName("[graph]");
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.init();
    node43.setOwner(graph54);
    node43.setOwnerName("hi!");
    graph33.addNode(node43);
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    graph62.setName("");
    node43.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node15, node43);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("[graph]");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    node27.setOwner(graph38);
    node27.setOwnerName("hi!");
    graph17.addNode(node27);
    node27.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerNameDirectly("");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    graph58.setName("");
    node47.setOwner(graph58);
    node47.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node27, node47);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node14.getDegree();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    graph13.setName("");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    graph13.addNode(node21);
    node21.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = graph10.getDegree(node21);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    node14.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node14.getDegree();

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    node17.setOwnerName("hi!");
    node17.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerName("");
    node13.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node13);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    Graph graph54 = Graph.generateGraph();
    graph54.setName("[graph]");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    graph57.setName("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerName("");
    Graph graph75 = Graph.generateGraph();
    graph75.init();
    node64.setOwner(graph75);
    node64.setOwnerName("hi!");
    graph57.addNode(node64);
    graph54.addNode(node64);
    Graph graph82 = Graph.generateGraph();
    graph82.init();
    java.lang.String str84 = graph82.name;
    java.lang.String str85 = graph82.name;
    node64.setOwner(graph82);
    node64.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node64);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    Graph graph62 = Graph.generateGraph();
    graph62.setName("[graph]");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    graph65.setName("hi!");
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerName("");
    Graph graph83 = Graph.generateGraph();
    graph83.init();
    node72.setOwner(graph83);
    node72.setOwnerName("hi!");
    graph65.addNode(node72);
    graph62.addNode(node72);
    Graph graph90 = Graph.generateGraph();
    graph90.init();
    java.lang.String str92 = graph90.name;
    java.lang.String str93 = graph90.name;
    node72.setOwner(graph90);
    node72.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph33.getDegree(node72);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    Graph graph20 = Graph.generateGraph();
    graph20.setName("[graph]");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.setName("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    node30.setOwnerName("hi!");
    graph23.addNode(node30);
    graph20.addNode(node30);
    Node node49 = new Node("[graph]");
    graph20.addNode(node49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node49);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.setName("");
    Graph graph8 = Graph.generateGraph();
    graph8.init();
    java.lang.String str10 = graph8.name;
    java.lang.String str11 = graph8.name;
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    graph8.addNode(node19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph0.getDegree(node19);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    Graph graph28 = Graph.generateGraph();
    graph28.setName("[graph]");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("hi!");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    Graph graph49 = Graph.generateGraph();
    graph49.init();
    node38.setOwner(graph49);
    node38.setOwnerName("hi!");
    graph31.addNode(node38);
    graph28.addNode(node38);
    Graph graph56 = Graph.generateGraph();
    graph56.init();
    java.lang.String str58 = graph56.name;
    java.lang.String str59 = graph56.name;
    node38.setOwner(graph56);
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerNameDirectly("");
    node62.setOwnerName("hi!");
    node62.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node38, node62);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    java.lang.String str10 = graph4.name;
    graph4.init();
    node1.setOwner(graph4);
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    graph13.setName("");
    graph13.setName("[graph]");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph34 = Graph.generateGraph();
    graph34.init();
    node23.setOwner(graph34);
    node23.setOwnerName("hi!");
    graph13.addNode(node23);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("");
    node23.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("[graph]");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    graph13.setName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph13.addNode(node20);
    graph10.addNode(node20);
    Node node39 = new Node("[graph]");
    graph10.addNode(node39);
    node1.setOwner(graph10);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph10.getDegree(node43);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("");
    node12.setOwnerName("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("[graph]");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.init();
    node35.setOwner(graph46);
    node35.setOwnerName("hi!");
    graph25.addNode(node35);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.setName("");
    node35.setOwner(graph54);
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node35.setOwner(graph65);
    node35.setOwnerNameDirectly("[graph]");
    node35.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node35);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.setName("[graph]");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    node42.setOwnerName("hi!");
    graph32.addNode(node42);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    graph61.setName("");
    node42.setOwner(graph61);
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node42.setOwner(graph72);
    node42.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = graph0.getDegree(node42);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    node18.setOwnerName("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerNameDirectly("");
    node39.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph29.getDegree(node39);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.addEdge(node46);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    graph17.name = "hi!";
    Node node26 = new Node("");
    graph17.addNode(node26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node26);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    Graph graph4 = Graph.generateGraph();
    graph4.setName("[graph]");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    graph7.setName("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph7.addNode(node14);
    graph4.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = graph0.getDegree(node14);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node1.getDegree();

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    java.lang.String str28 = graph21.name;
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    Node node45 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node30, node45);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "";
    Node node6 = new Node("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    node6.setOwner(graph7);
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerName("");
    Graph graph17 = Graph.generateGraph();
    graph17.init();
    node6.setOwner(graph17);
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    graph20.setName("[graph]");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    node30.setOwnerName("hi!");
    graph20.addNode(node30);
    graph17.addNode(node30);
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerName("");
    Graph graph58 = new Graph();
    java.lang.String str59 = graph58.name;
    node49.setOwner(graph58);
    graph58.setName("");
    graph58.name = "hi!";
    graph58.init();
    node30.setOwner(graph58);
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    graph67.setName("");
    graph67.setName("[graph]");
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node77.setOwnerNameDirectly("hi!");
    node77.setOwnerName("");
    Graph graph88 = Graph.generateGraph();
    graph88.init();
    node77.setOwner(graph88);
    node77.setOwnerName("hi!");
    graph67.addNode(node77);
    node77.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node30, node77);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("hi!");
    node10.setOwnerName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    graph35.init();
    graph35.init();
    node24.setOwner(graph35);
    node24.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerName("");
    Graph graph56 = new Graph();
    java.lang.String str57 = graph56.name;
    node47.setOwner(graph56);
    graph56.setName("");
    graph56.setName("");
    graph56.name = "hi!";
    node24.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node10, node24);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = node1.getDegree();

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    node29.setOwner(graph40);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    graph43.setName("[graph]");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    graph64.init();
    node53.setOwner(graph64);
    node53.setOwnerName("hi!");
    graph43.addNode(node53);
    graph40.addNode(node53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = graph0.getDegree(node53);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph0.getDegree(node19);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    graph20.addNode(node28);
    graph12.addNode(node28);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("[graph]");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    Graph graph77 = Graph.generateGraph();
    graph77.init();
    node66.setOwner(graph77);
    node66.setOwnerName("hi!");
    graph56.addNode(node66);
    graph53.addNode(node66);
    Graph graph84 = Graph.generateGraph();
    graph84.setName("");
    node66.setOwner(graph84);
    Graph graph88 = Graph.generateGraph();
    graph88.setName("");
    graph88.init();
    graph88.setName("[graph]");
    node66.setOwner(graph88);
    node28.setOwner(graph88);
    graph2.addNode(node28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node28.getDegree();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    graph10.init();
    graph10.setName("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = graph10.getDegree(node21);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.init();
    graph10.name = "";
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("[graph]");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    Graph graph52 = Graph.generateGraph();
    graph52.init();
    node41.setOwner(graph52);
    node41.setOwnerName("hi!");
    graph31.addNode(node41);
    graph28.addNode(node41);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    node41.setOwner(graph59);
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    graph63.setName("[graph]");
    node41.setOwner(graph63);
    node41.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph10.getDegree(node41);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    graph20.addNode(node28);
    graph12.addNode(node28);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("[graph]");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    Graph graph77 = Graph.generateGraph();
    graph77.init();
    node66.setOwner(graph77);
    node66.setOwnerName("hi!");
    graph56.addNode(node66);
    graph53.addNode(node66);
    Graph graph84 = Graph.generateGraph();
    graph84.setName("");
    node66.setOwner(graph84);
    Graph graph88 = Graph.generateGraph();
    graph88.setName("");
    graph88.init();
    graph88.setName("[graph]");
    node66.setOwner(graph88);
    node28.setOwner(graph88);
    node28.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph2.getDegree(node28);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.setName("[graph]");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    node42.setOwnerName("hi!");
    graph32.addNode(node42);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    graph61.setName("");
    node42.setOwner(graph61);
    graph28.addNode(node42);
    node42.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node42);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    node1.setOwnerName("");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    graph36.init();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerNameDirectly("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.setName("");
    graph57.setName("");
    graph57.name = "hi!";
    node25.setOwner(graph57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node25);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node31.getDegree();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node25.getDegree();

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("[graph]");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    node27.setOwner(graph38);
    node27.setOwnerName("hi!");
    graph17.addNode(node27);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerName("");
    Graph graph60 = Graph.generateGraph();
    graph60.init();
    node49.setOwner(graph60);
    node49.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph12.addEdge(node27, node49);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    graph0.name = "";
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    graph38.setName("[graph]");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    Graph graph59 = Graph.generateGraph();
    graph59.init();
    node48.setOwner(graph59);
    node48.setOwnerName("hi!");
    graph38.addNode(node48);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.setName("");
    node48.setOwner(graph67);
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node48.setOwner(graph78);
    node48.setOwnerNameDirectly("[graph]");
    graph34.addNode(node48);
    graph0.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    Graph graph9 = Graph.generateGraph();
    graph9.setName("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    graph9.addNode(node19);
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    java.lang.String str39 = graph37.name;
    java.lang.String str40 = graph37.name;
    node19.setOwner(graph37);
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    graph42.setName("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerName("");
    Graph graph60 = Graph.generateGraph();
    graph60.init();
    node49.setOwner(graph60);
    node49.setOwnerName("hi!");
    graph42.addNode(node49);
    graph42.setName("[graph]");
    graph42.name = "[graph]";
    node19.setOwner(graph42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = graph0.getDegree(node19);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerName("");
    Graph graph48 = new Graph();
    java.lang.String str49 = graph48.name;
    node39.setOwner(graph48);
    graph48.setName("");
    graph48.setName("");
    graph48.name = "";
    graph48.setName("hi!");
    node10.setOwner(graph48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    graph59.init();
    graph59.init();
    node48.setOwner(graph59);
    node48.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node48);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerName("");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    node23.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.name = "";
    graph32.setName("hi!");
    node8.setOwner(graph32);
    node8.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node11 = new Node("");
    graph2.addNode(node11);
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("hi!");
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node14);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.setName("[graph]");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("hi!");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    Graph graph49 = Graph.generateGraph();
    graph49.init();
    node38.setOwner(graph49);
    node38.setOwnerName("hi!");
    graph31.addNode(node38);
    graph28.addNode(node38);
    node38.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node38);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node10.getDegree();

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test167"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    graph3.setName("");
    graph3.setName("[graph]");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerName("hi!");
    graph3.addNode(node13);
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    graph32.setName("");
    node13.setOwner(graph32);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node13.setOwner(graph43);
    node13.setOwnerNameDirectly("[graph]");
    node13.setOwnerNameDirectly("");
    node13.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph0.getDegree(node13);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test168"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("");
    Graph graph20 = Graph.generateGraph();
    graph20.init();
    node9.setOwner(graph20);
    node9.setOwnerName("hi!");
    graph0.addNode(node9);
    node9.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node9.getDegree();

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test169"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    graph21.setName("");
    graph21.setName("[graph]");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    Graph graph42 = Graph.generateGraph();
    graph42.init();
    node31.setOwner(graph42);
    node31.setOwnerName("hi!");
    graph21.addNode(node31);
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    graph50.setName("");
    node31.setOwner(graph50);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node31.setOwner(graph61);
    node31.setOwnerNameDirectly("[graph]");
    graph17.addNode(node31);
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerNameDirectly("");
    graph17.addNode(node72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph10.getDegree(node72);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test170"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("[graph]");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph30.addNode(node40);
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    java.lang.String str60 = graph58.name;
    java.lang.String str61 = graph58.name;
    node40.setOwner(graph58);
    node40.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node40);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test171"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    graph0.name = "";
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    graph46.setName("hi!");
    node35.setOwner(graph46);
    node35.setOwnerName("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.init();
    graph67.init();
    node56.setOwner(graph67);
    node56.setOwnerNameDirectly("hi!");
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node79.setOwnerName("");
    Graph graph88 = new Graph();
    java.lang.String str89 = graph88.name;
    node79.setOwner(graph88);
    graph88.setName("");
    graph88.setName("");
    graph88.name = "hi!";
    node56.setOwner(graph88);
    node35.setOwner(graph88);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph0.getDegree(node35);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test172"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "hi!";
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    java.lang.String str27 = graph21.name;
    graph21.init();
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    graph29.setName("");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerName("");
    graph29.addNode(node37);
    graph21.addNode(node37);
    node37.setOwnerName("[graph]");
    node37.setOwnerName("");
    node37.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph12.getDegree(node37);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test173"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    graph2.init();
    Node node33 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = graph2.getDegree(node33);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test174"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    node18.setOwnerName("[graph]");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("[graph]");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    graph36.setName("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.init();
    node43.setOwner(graph54);
    node43.setOwnerName("hi!");
    graph36.addNode(node43);
    graph33.addNode(node43);
    node43.setOwnerName("[graph]");
    node43.setOwnerName("hi!");
    node43.setOwnerName("");
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    graph79.init();
    graph79.init();
    node68.setOwner(graph79);
    node43.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node43);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test175"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "";
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    graph14.addNode(node22);
    node22.setOwnerName("[graph]");
    node22.setOwnerNameDirectly("[graph]");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node22, node39);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test176"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node8.getDegree();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test177"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerName("");
    Graph graph48 = new Graph();
    java.lang.String str49 = graph48.name;
    node39.setOwner(graph48);
    graph48.setName("");
    graph48.setName("");
    graph48.name = "";
    graph48.setName("hi!");
    node10.setOwner(graph48);
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    node61.setOwnerName("[graph]");
    node61.setOwnerName("[graph]");
    node61.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node61);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test178"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("");
    graph54.addNode(node62);
    node62.setOwnerName("");
    node62.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph47.getDegree(node62);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test179"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test180"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    java.lang.String str39 = graph33.name;
    graph33.init();
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerName("");
    graph41.addNode(node49);
    graph33.addNode(node49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.addEdge(node49);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test181"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    Graph graph18 = Graph.generateGraph();
    graph18.init();
    node7.setOwner(graph18);
    node7.setOwnerName("hi!");
    graph0.addNode(node7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test182"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    graph3.setName("");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    graph3.addNode(node11);
    node11.setOwnerNameDirectly("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerName("");
    Graph graph35 = new Graph();
    java.lang.String str36 = graph35.name;
    node26.setOwner(graph35);
    graph35.setName("");
    graph35.setName("");
    graph35.name = "";
    graph35.setName("hi!");
    node11.setOwner(graph35);
    node11.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node11);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test183"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    graph28.init();
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    java.lang.String str42 = graph36.name;
    graph36.init();
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    graph44.addNode(node52);
    graph36.addNode(node52);
    node52.setOwnerName("[graph]");
    node52.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph28.getDegree(node52);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test184"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerNameDirectly("hi!");
    node3.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node3);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test185"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    java.lang.String str14 = graph8.name;
    graph8.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    graph16.addNode(node24);
    graph8.addNode(node24);
    node24.setOwnerName("[graph]");
    node24.setOwnerName("");
    node24.setOwnerName("");
    graph0.addNode(node24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node24.getDegree();

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test186"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    graph38.addNode(node46);
    node46.setOwnerName("[graph]");
    node46.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node46);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test187"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test188"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node1.getDegree();

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test189"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.setName("[graph]");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    graph24.init();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerNameDirectly("hi!");
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerName("");
    Graph graph45 = new Graph();
    java.lang.String str46 = graph45.name;
    node36.setOwner(graph45);
    graph45.setName("");
    graph45.setName("");
    graph45.name = "hi!";
    node13.setOwner(graph45);
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerName("");
    node56.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node13, node56);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test190"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerName("");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    node44.setOwner(graph53);
    graph53.setName("");
    graph53.name = "hi!";
    graph53.init();
    node25.setOwner(graph53);
    Graph graph62 = Graph.generateGraph();
    graph62.setName("[graph]");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    graph65.setName("hi!");
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerName("");
    Graph graph83 = Graph.generateGraph();
    graph83.init();
    node72.setOwner(graph83);
    node72.setOwnerName("hi!");
    graph65.addNode(node72);
    graph62.addNode(node72);
    Graph graph90 = Graph.generateGraph();
    graph90.init();
    java.lang.String str92 = graph90.name;
    java.lang.String str93 = graph90.name;
    node72.setOwner(graph90);
    node72.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node72);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test191"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("hi!");
    node9.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = graph0.getDegree(node9);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test192"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "[graph]";
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    graph19.addNode(node27);
    node27.setOwnerName("");
    node27.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node27);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test193"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("[graph]");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    graph13.setName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph13.addNode(node20);
    graph10.addNode(node20);
    Node node39 = new Node("[graph]");
    graph10.addNode(node39);
    node1.setOwner(graph10);
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    graph42.addNode(node50);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    node63.setOwner(graph74);
    node63.setOwnerName("");
    node63.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node50, node63);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test194"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    graph14.setName("[graph]");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.init();
    node24.setOwner(graph35);
    node24.setOwnerName("hi!");
    graph14.addNode(node24);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    graph43.setName("");
    node24.setOwner(graph43);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node24.setOwner(graph54);
    node24.setOwnerNameDirectly("[graph]");
    graph10.addNode(node24);
    node1.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = node1.getDegree();

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test195"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    graph2.init();
    java.lang.String str32 = graph2.name;
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("[graph]");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    node47.setOwner(graph58);
    node47.setOwnerName("hi!");
    graph37.addNode(node47);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    graph66.setName("");
    node47.setOwner(graph66);
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node47.setOwner(graph77);
    node47.setOwnerNameDirectly("[graph]");
    graph33.addNode(node47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph2.getDegree(node47);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test196"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test197"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = node8.getDegree();

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test198"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "[graph]";
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    graph34.setName("");
    graph34.setName("[graph]");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    Graph graph55 = Graph.generateGraph();
    graph55.init();
    node44.setOwner(graph55);
    node44.setOwnerName("hi!");
    graph34.addNode(node44);
    graph31.addNode(node44);
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    node44.setOwner(graph62);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerName("");
    Graph graph76 = new Graph();
    java.lang.String str77 = graph76.name;
    node67.setOwner(graph76);
    graph76.name = "";
    java.lang.String str81 = graph76.name;
    node44.setOwner(graph76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node44);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test199"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerName("");
    Graph graph48 = new Graph();
    java.lang.String str49 = graph48.name;
    node39.setOwner(graph48);
    graph48.setName("");
    graph48.setName("");
    graph48.name = "";
    graph48.setName("hi!");
    node10.setOwner(graph48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = node10.getDegree();

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test200"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerName("");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    node23.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.name = "";
    graph32.setName("hi!");
    node8.setOwner(graph32);
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.init();
    node45.setOwner(graph56);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    graph59.setName("[graph]");
    Node node69 = new Node("hi!");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    node69.setOwner(graph70);
    node69.setOwnerNameDirectly("hi!");
    node69.setOwnerName("");
    Graph graph80 = Graph.generateGraph();
    graph80.init();
    node69.setOwner(graph80);
    node69.setOwnerName("hi!");
    graph59.addNode(node69);
    graph56.addNode(node69);
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    node69.setOwner(graph87);
    Graph graph91 = Graph.generateGraph();
    graph91.setName("");
    graph91.init();
    graph91.setName("[graph]");
    node69.setOwner(graph91);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph32.addNode(node69);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test201"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.setOwnerName("[graph]");

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test202"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("[graph]");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("[graph]");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.init();
    node35.setOwner(graph46);
    node35.setOwnerName("hi!");
    graph25.addNode(node35);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.setName("");
    node35.setOwner(graph54);
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node35.setOwner(graph65);
    node35.setOwnerNameDirectly("[graph]");
    graph21.addNode(node35);
    node35.setOwnerName("[graph]");
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    graph79.setName("hi!");
    graph79.setName("[graph]");
    node35.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node35);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test203"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test204"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    graph15.addNode(node23);
    node23.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test205"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test206"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.init();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerNameDirectly("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerName("");
    Graph graph54 = new Graph();
    java.lang.String str55 = graph54.name;
    node45.setOwner(graph54);
    graph54.setName("");
    graph54.setName("");
    graph54.name = "hi!";
    node22.setOwner(graph54);
    node1.setOwner(graph54);
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerName("");
    graph65.addNode(node73);
    node73.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node73);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test207"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.init();
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("[graph]");
    graph21.addNode(node30);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    graph44.name = "hi!";
    Node node53 = new Node("");
    graph44.addNode(node53);
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node53, node56);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test208"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test209"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test210"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.init();
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    Graph graph22 = Graph.generateGraph();
    graph22.init();
    node11.setOwner(graph22);
    node11.setOwnerName("hi!");
    graph2.addNode(node11);
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.init();
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerName("");
    Graph graph48 = Graph.generateGraph();
    graph48.init();
    node37.setOwner(graph48);
    node37.setOwnerName("hi!");
    graph28.addNode(node37);
    node37.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node11, node37);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test211"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("[graph]");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    graph13.setName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph13.addNode(node20);
    graph10.addNode(node20);
    Node node39 = new Node("[graph]");
    graph10.addNode(node39);
    node1.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test212"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    node20.setOwnerName("[graph]");
    node20.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test213"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    graph10.init();
    graph10.setName("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.init();
    node21.setOwner(graph32);
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("[graph]");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.init();
    node45.setOwner(graph56);
    node45.setOwnerName("hi!");
    graph35.addNode(node45);
    graph32.addNode(node45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph10.getDegree(node45);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test214"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    Graph graph17 = Graph.generateGraph();
    graph17.init();
    java.lang.String str19 = graph17.name;
    java.lang.String str20 = graph17.name;
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    graph21.setName("hi!");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    node28.setOwner(graph39);
    node28.setOwnerName("hi!");
    graph21.addNode(node28);
    graph17.addNode(node28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node28);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test215"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test216"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    node25.setOwnerName("");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerName("");
    Graph graph66 = new Graph();
    java.lang.String str67 = graph66.name;
    node57.setOwner(graph66);
    graph66.init();
    graph66.name = "[graph]";
    node25.setOwner(graph66);
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node74.setOwnerNameDirectly("hi!");
    node74.setOwnerName("");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    graph85.setName("hi!");
    node74.setOwner(graph85);
    node74.setOwnerName("hi!");
    node74.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph66.getDegree(node74);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test217"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test218"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("[graph]");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    graph13.setName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph13.addNode(node20);
    graph10.addNode(node20);
    node20.setOwnerName("[graph]");
    node20.setOwnerName("hi!");
    node20.setOwnerName("");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    graph56.init();
    graph56.init();
    node45.setOwner(graph56);
    node20.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = graph2.getDegree(node20);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test219"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    java.lang.String str37 = graph31.name;
    graph31.init();
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    graph39.setName("");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    graph39.addNode(node47);
    graph31.addNode(node47);
    node47.setOwnerName("[graph]");
    node47.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node47);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test220"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.init();
    graph10.name = "";
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("[graph]");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    Graph graph52 = Graph.generateGraph();
    graph52.init();
    node41.setOwner(graph52);
    node41.setOwnerName("hi!");
    graph31.addNode(node41);
    graph28.addNode(node41);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    node41.setOwner(graph59);
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    graph63.setName("[graph]");
    node41.setOwner(graph63);
    node41.setOwnerName("");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerNameDirectly("");
    Graph graph84 = Graph.generateGraph();
    graph84.setName("");
    graph84.init();
    java.lang.String str88 = graph84.name;
    graph84.setName("");
    graph84.setName("");
    node73.setOwner(graph84);
    node73.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node41, node73);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test221"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = node10.getDegree();

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test222"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node10.getDegree();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test223"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph12.getDegree(node22);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test224"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    node27.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test225"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    node29.setOwner(graph40);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    graph43.setName("[graph]");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    graph64.init();
    node53.setOwner(graph64);
    node53.setOwnerName("hi!");
    graph43.addNode(node53);
    graph40.addNode(node53);
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    node53.setOwner(graph71);
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    graph75.setName("[graph]");
    node53.setOwner(graph75);
    node10.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = node10.getDegree();

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test226"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test227"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    graph4.setName("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    Graph graph22 = Graph.generateGraph();
    graph22.init();
    node11.setOwner(graph22);
    node11.setOwnerName("hi!");
    graph4.addNode(node11);
    graph0.addNode(node11);
    node11.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test228"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    node17.setOwnerName("hi!");
    node17.setOwnerName("hi!");
    node17.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test229"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerName("");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    graph46.init();
    graph46.init();
    node35.setOwner(graph46);
    node10.setOwner(graph46);
    node10.setOwnerNameDirectly("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("[graph]");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    graph61.setName("hi!");
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    node68.setOwnerName("");
    Graph graph79 = Graph.generateGraph();
    graph79.init();
    node68.setOwner(graph79);
    node68.setOwnerName("hi!");
    graph61.addNode(node68);
    graph58.addNode(node68);
    Graph graph86 = Graph.generateGraph();
    graph86.init();
    java.lang.String str88 = graph86.name;
    java.lang.String str89 = graph86.name;
    node68.setOwner(graph86);
    node68.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node68);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test230"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = node10.getDegree();

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test231"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = node10.getDegree();

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test232"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerName("");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    node44.setOwner(graph53);
    graph53.setName("");
    graph53.name = "hi!";
    graph53.init();
    node25.setOwner(graph53);
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    java.lang.String str64 = graph62.name;
    java.lang.String str65 = graph62.name;
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    graph66.setName("hi!");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerName("");
    Graph graph84 = Graph.generateGraph();
    graph84.init();
    node73.setOwner(graph84);
    node73.setOwnerName("hi!");
    graph66.addNode(node73);
    graph62.addNode(node73);
    node25.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test233"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerNameDirectly("");
    graph0.addNode(node55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test234"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    graph45.addNode(node55);
    graph45.name = "";
    graph45.name = "";
    node31.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test235"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerName("");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    node23.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.name = "";
    graph32.setName("hi!");
    node8.setOwner(graph32);
    node8.setOwnerNameDirectly("");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerNameDirectly("");
    node47.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node47);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test236"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    java.lang.String str14 = graph8.name;
    graph8.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    graph16.addNode(node24);
    graph8.addNode(node24);
    node24.setOwnerName("[graph]");
    node24.setOwnerName("");
    node24.setOwnerName("");
    graph0.addNode(node24);
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    node45.setOwner(graph56);
    graph56.name = "hi!";
    node24.setOwner(graph56);
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerName("");
    graph64.addNode(node72);
    node72.setOwnerName("");
    node72.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph56.getDegree(node72);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test237"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    java.lang.String str14 = graph8.name;
    graph8.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    graph16.addNode(node24);
    graph8.addNode(node24);
    node24.setOwnerName("[graph]");
    node24.setOwnerName("");
    node24.setOwnerName("");
    graph0.addNode(node24);
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    node45.setOwner(graph56);
    graph56.name = "hi!";
    node24.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test238"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.setName("[graph]");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph9.addNode(node19);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("");
    graph0.addNode(node19);
    node19.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test239"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerName("");
    graph4.addNode(node12);
    node12.setOwnerName("[graph]");
    Graph graph26 = new Graph();
    java.lang.String str27 = graph26.name;
    graph26.init();
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerNameDirectly("[graph]");
    graph26.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node12, node30);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test240"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerName("");
    Graph graph23 = Graph.generateGraph();
    graph23.init();
    node12.setOwner(graph23);
    node12.setOwnerName("hi!");
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerName("");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    Graph graph44 = Graph.generateGraph();
    graph44.init();
    node33.setOwner(graph44);
    node33.setOwnerName("hi!");
    node33.setOwnerNameDirectly("[graph]");
    node33.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node12, node33);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test241"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "hi!";
    graph12.name = "[graph]";
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerName("");
    node22.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = graph12.getDegree(node22);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test242"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    node14.setOwnerName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    node14.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test243"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    graph10.setName("[graph]");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph10.addNode(node20);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test244"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerName("");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    graph46.init();
    graph46.init();
    node35.setOwner(graph46);
    node10.setOwner(graph46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node10.getDegree();

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test245"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "";
    graph10.init();
    graph10.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph10.getDegree(node22);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test246"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = node10.getDegree();

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test247"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test248"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "[graph]";
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node20);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test249"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test250"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    graph45.addNode(node55);
    graph45.name = "";
    graph45.name = "";
    node31.setOwner(graph45);
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node79.setOwnerNameDirectly("hi!");
    node79.setOwnerName("");
    Graph graph90 = Graph.generateGraph();
    graph90.init();
    node79.setOwner(graph90);
    node79.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph45.getDegree(node79);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test251"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "";
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerNameDirectly("");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("");
    node24.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph12.getDegree(node24);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test252"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    node29.setOwner(graph40);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    graph43.setName("[graph]");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    graph64.init();
    node53.setOwner(graph64);
    node53.setOwnerName("hi!");
    graph43.addNode(node53);
    graph40.addNode(node53);
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    node53.setOwner(graph71);
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    graph75.setName("[graph]");
    node53.setOwner(graph75);
    node10.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test253"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test254"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    graph27.setName("[graph]");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerName("");
    Graph graph48 = Graph.generateGraph();
    graph48.init();
    node37.setOwner(graph48);
    node37.setOwnerName("hi!");
    graph27.addNode(node37);
    graph24.addNode(node37);
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    node37.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node37);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test255"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    graph11.setName("");
    graph11.setName("[graph]");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.init();
    node21.setOwner(graph32);
    node21.setOwnerName("hi!");
    graph11.addNode(node21);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    graph40.setName("");
    node21.setOwner(graph40);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node21.setOwner(graph51);
    node21.setOwnerNameDirectly("[graph]");
    graph7.addNode(node21);
    graph0.addNode(node21);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerName("");
    node63.setOwnerNameDirectly("");
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node63, node75);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test256"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    graph56.name = "hi!";
    Node node65 = new Node("");
    graph56.addNode(node65);
    node25.setOwner(graph56);
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node25.getDegree();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test257"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerName("");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node10.getDegree();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test258"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    graph12.init();
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    graph23.setName("");
    graph23.setName("[graph]");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    Graph graph44 = Graph.generateGraph();
    graph44.init();
    node33.setOwner(graph44);
    node33.setOwnerName("hi!");
    graph23.addNode(node33);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerNameDirectly("");
    node33.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("[graph]");
    Node node66 = new Node("");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    graph67.setName("");
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("[graph]");
    graph56.addNode(node66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph12.addEdge(node33, node66);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test259"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    graph9.init();
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    graph17.addNode(node25);
    graph9.addNode(node25);
    node25.setOwnerName("[graph]");
    node25.setOwnerName("");
    node25.setOwnerName("");
    graph0.addNode(node25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node25.getDegree();

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test260"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node10.getDegree();

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test261"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    graph45.addNode(node55);
    graph45.name = "";
    graph45.name = "";
    node31.setOwner(graph45);
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node31.getDegree();

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test262"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    graph10.setName("");
    graph10.init();
    graph10.name = "";
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    java.lang.String str32 = graph26.name;
    graph26.init();
    node23.setOwner(graph26);
    graph10.addNode(node23);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    graph36.setName("[graph]");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    Graph graph57 = Graph.generateGraph();
    graph57.init();
    node46.setOwner(graph57);
    node46.setOwnerName("hi!");
    graph36.addNode(node46);
    node46.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node23, node46);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test263"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node31);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test264"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test265"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    graph29.name = "";
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    graph40.name = "[graph]";
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    graph49.setName("");
    graph49.setName("[graph]");
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    node59.setOwnerNameDirectly("hi!");
    node59.setOwnerName("");
    Graph graph70 = Graph.generateGraph();
    graph70.init();
    node59.setOwner(graph70);
    node59.setOwnerName("hi!");
    graph49.addNode(node59);
    node59.setOwnerNameDirectly("hi!");
    node59.setOwnerNameDirectly("");
    graph40.addNode(node59);
    node59.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph29.getDegree(node59);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test266"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node1.getDegree();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test267"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "";
    graph10.init();
    graph10.init();
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    graph21.setName("");
    graph21.init();
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    node30.setOwnerName("hi!");
    graph21.addNode(node30);
    graph21.setName("hi!");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerName("");
    Graph graph59 = Graph.generateGraph();
    graph59.init();
    java.lang.String str61 = graph59.name;
    node50.setOwner(graph59);
    graph21.addNode(node50);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node50, node65);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test268"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test269"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    java.lang.String str14 = graph8.name;
    graph8.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    graph16.addNode(node24);
    graph8.addNode(node24);
    node24.setOwnerName("[graph]");
    node24.setOwnerName("");
    node24.setOwnerName("");
    graph0.addNode(node24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test270"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test271"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node10.getDegree();

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test272"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.init();
    graph10.name = "[graph]";
    Node node17 = new Node("");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    node17.setOwner(graph18);
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    graph38.init();
    graph38.init();
    node27.setOwner(graph38);
    node27.setOwnerNameDirectly("hi!");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerName("");
    Graph graph59 = new Graph();
    java.lang.String str60 = graph59.name;
    node50.setOwner(graph59);
    graph59.setName("");
    graph59.setName("");
    graph59.name = "hi!";
    node27.setOwner(graph59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node17, node27);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test273"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node25.getDegree();

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test274"); }


    Node node1 = new Node("[graph]");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node3);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test275"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "";
    graph10.setName("[graph]");
    graph10.name = "[graph]";
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    node24.setOwnerName("[graph]");
    node24.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = graph10.getDegree(node24);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test276"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    graph56.name = "hi!";
    Node node65 = new Node("");
    graph56.addNode(node65);
    node25.setOwner(graph56);
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node25.getDegree();

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test277"); }


    Graph graph0 = new Graph();
    graph0.init();
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerNameDirectly("hi!");
    node3.setOwnerName("");
    node3.setOwnerName("[graph]");
    node3.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = graph0.getDegree(node3);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test278"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    java.lang.String str24 = graph18.name;
    graph18.init();
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    graph26.setName("");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("");
    graph26.addNode(node34);
    graph18.addNode(node34);
    node34.setOwnerName("[graph]");
    node34.setOwnerName("");
    node34.setOwnerName("");
    graph9.addNode(node34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph0.getDegree(node34);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test279"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    graph14.setName("[graph]");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.init();
    node24.setOwner(graph35);
    node24.setOwnerName("hi!");
    graph14.addNode(node24);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    graph43.setName("");
    node24.setOwner(graph43);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node24.setOwner(graph54);
    node24.setOwnerNameDirectly("[graph]");
    graph10.addNode(node24);
    node1.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test280"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Graph graph10 = Graph.generateGraph();
    graph10.init();
    java.lang.String str12 = graph10.name;
    java.lang.String str13 = graph10.name;
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    graph14.setName("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.init();
    node21.setOwner(graph32);
    node21.setOwnerName("hi!");
    graph14.addNode(node21);
    graph10.addNode(node21);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    node40.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node21, node40);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test281"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node10.getDegree();

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test282"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    graph45.addNode(node55);
    graph45.name = "";
    graph45.name = "";
    node31.setOwner(graph45);
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test283"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    graph0.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    node22.setOwnerName("[graph]");
    node22.setOwnerName("");
    graph0.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = node22.getDegree();

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test284"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test285"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    graph18.name = "hi!";
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    graph38.setName("hi!");
    node27.setOwner(graph38);
    node27.setOwnerName("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    graph59.init();
    graph59.init();
    node48.setOwner(graph59);
    node48.setOwnerNameDirectly("hi!");
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node71.setOwnerName("");
    Graph graph80 = new Graph();
    java.lang.String str81 = graph80.name;
    node71.setOwner(graph80);
    graph80.setName("");
    graph80.setName("");
    graph80.name = "hi!";
    node48.setOwner(graph80);
    node27.setOwner(graph80);
    graph18.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test286"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerName("");
    Graph graph33 = new Graph();
    java.lang.String str34 = graph33.name;
    node24.setOwner(graph33);
    graph33.setName("");
    graph33.setName("");
    graph33.name = "hi!";
    node1.setOwner(graph33);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph33.getDegree(node44);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test287"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    graph33.addNode(node41);
    graph33.init();
    graph33.init();
    node10.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node10.getDegree();

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test288"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.init();
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("[graph]");
    graph21.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node30.getDegree();

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test289"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    java.lang.String str12 = graph6.name;
    graph6.init();
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    graph14.addNode(node22);
    graph6.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = graph0.getDegree(node22);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test290"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerNameDirectly("");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    graph19.setName("");
    node8.setOwner(graph19);
    node8.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node8);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test291"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("[graph]");
    graph10.init();
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    graph30.init();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = graph10.getDegree(node19);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test292"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Graph graph4 = new Graph();
    java.lang.String str5 = graph4.name;
    graph4.init();
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerNameDirectly("[graph]");
    graph4.addNode(node8);
    node8.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = graph0.getDegree(node8);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test293"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerNameDirectly("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    graph33.init();
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    node42.setOwnerName("hi!");
    graph33.addNode(node42);
    graph33.setName("hi!");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerName("");
    Graph graph71 = Graph.generateGraph();
    graph71.init();
    java.lang.String str73 = graph71.name;
    node62.setOwner(graph71);
    graph33.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node62);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test294"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    node10.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    graph40.setName("[graph]");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    Graph graph61 = Graph.generateGraph();
    graph61.init();
    node50.setOwner(graph61);
    node50.setOwnerName("hi!");
    graph40.addNode(node50);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node50);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test295"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = node14.getDegree();

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test296"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    graph9.addNode(node19);
    node19.setOwnerName("[graph]");
    node19.setOwnerName("hi!");
    graph0.addNode(node19);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.init();
    node43.setOwner(graph54);
    node43.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.addEdge(node43);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test297"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    node32.setOwnerName("[graph]");
    node32.setOwnerName("[graph]");
    node32.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node32);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test298"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "hi!";
    graph12.name = "[graph]";
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    graph36.setName("[graph]");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    Graph graph57 = Graph.generateGraph();
    graph57.init();
    node46.setOwner(graph57);
    node46.setOwnerName("hi!");
    graph36.addNode(node46);
    graph33.addNode(node46);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerName("");
    Graph graph74 = new Graph();
    java.lang.String str75 = graph74.name;
    node65.setOwner(graph74);
    graph74.setName("");
    graph74.name = "hi!";
    graph74.init();
    node46.setOwner(graph74);
    graph12.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node46.thisIsNotCalled();

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test299"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test300"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerName("");
    Graph graph15 = Graph.generateGraph();
    graph15.init();
    node4.setOwner(graph15);
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    graph18.setName("[graph]");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    node28.setOwner(graph39);
    node28.setOwnerName("hi!");
    graph18.addNode(node28);
    graph15.addNode(node28);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    node28.setOwner(graph46);
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    graph50.setName("[graph]");
    node28.setOwner(graph50);
    node28.setOwnerName("");
    graph0.addNode(node28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test301"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node10.getDegree();

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test302"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    java.lang.String str14 = graph8.name;
    graph8.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    graph16.addNode(node24);
    graph8.addNode(node24);
    node24.setOwnerName("[graph]");
    node24.setOwnerName("");
    node24.setOwnerName("");
    graph0.addNode(node24);
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.init();
    node45.setOwner(graph56);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    graph59.setName("[graph]");
    Node node69 = new Node("hi!");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    node69.setOwner(graph70);
    node69.setOwnerNameDirectly("hi!");
    node69.setOwnerName("");
    Graph graph80 = Graph.generateGraph();
    graph80.init();
    node69.setOwner(graph80);
    node69.setOwnerName("hi!");
    graph59.addNode(node69);
    graph56.addNode(node69);
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    node69.setOwner(graph87);
    Graph graph91 = Graph.generateGraph();
    graph91.setName("");
    graph91.init();
    graph91.setName("[graph]");
    node69.setOwner(graph91);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.addEdge(node69);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test303"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    graph56.name = "hi!";
    Node node65 = new Node("");
    graph56.addNode(node65);
    node25.setOwner(graph56);
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test304"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test305"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test306"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    graph12.name = "hi!";
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    java.lang.String str32 = graph26.name;
    graph26.init();
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    graph34.setName("");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    graph34.addNode(node42);
    graph26.addNode(node42);
    node42.setOwnerName("[graph]");
    node42.setOwnerName("");
    node42.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph12.getDegree(node42);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test307"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    graph10.name = "hi!";
    graph10.setName("");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    graph21.setName("");
    graph21.setName("[graph]");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("[graph]");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph30.addNode(node40);
    node40.setOwnerName("[graph]");
    node40.setOwnerName("hi!");
    graph21.addNode(node40);
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerName("");
    node64.setOwnerName("[graph]");
    node64.setOwnerName("[graph]");
    graph21.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph10.getDegree(node64);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test308"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    graph22.setName("hi!");
    node11.setOwner(graph22);
    node11.setOwnerName("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    graph43.init();
    graph43.init();
    node32.setOwner(graph43);
    node32.setOwnerNameDirectly("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerName("");
    Graph graph64 = new Graph();
    java.lang.String str65 = graph64.name;
    node55.setOwner(graph64);
    graph64.setName("");
    graph64.setName("");
    graph64.name = "hi!";
    node32.setOwner(graph64);
    node11.setOwner(graph64);
    graph2.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test309"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.init();
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("[graph]");
    graph21.addNode(node30);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerName("");
    Graph graph52 = new Graph();
    java.lang.String str53 = graph52.name;
    node43.setOwner(graph52);
    graph52.init();
    graph52.name = "[graph]";
    node30.setOwner(graph52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node30.getDegree();

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test310"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test311"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.name = "hi!";
    graph21.setName("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.setName("[graph]");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    node42.setOwnerName("hi!");
    graph32.addNode(node42);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    graph61.setName("");
    node42.setOwner(graph61);
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node42.setOwner(graph72);
    node42.setOwnerNameDirectly("[graph]");
    graph28.addNode(node42);
    graph21.addNode(node42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node42);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test312"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "hi!";
    graph12.name = "[graph]";
    graph12.setName("");
    graph12.setName("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("[graph]");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.init();
    node35.setOwner(graph46);
    node35.setOwnerName("hi!");
    graph25.addNode(node35);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.setName("");
    node35.setOwner(graph54);
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node35.setOwner(graph65);
    node35.setOwnerNameDirectly("[graph]");
    node35.setOwnerNameDirectly("");
    node35.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph12.getDegree(node35);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test313"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    graph12.name = "hi!";
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test314"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    graph44.setName("hi!");
    node33.setOwner(graph44);
    node33.setOwnerName("hi!");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    graph65.init();
    graph65.init();
    node54.setOwner(graph65);
    node54.setOwnerNameDirectly("hi!");
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node77.setOwnerName("");
    Graph graph86 = new Graph();
    java.lang.String str87 = graph86.name;
    node77.setOwner(graph86);
    graph86.setName("");
    graph86.setName("");
    graph86.name = "hi!";
    node54.setOwner(graph86);
    node33.setOwner(graph86);
    node10.setOwner(graph86);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test315"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test316"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("[graph]");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerName("hi!");
    graph12.addNode(node22);
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    graph41.setName("");
    node22.setOwner(graph41);
    graph8.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test317"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test318"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    node14.setOwnerName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    node14.setOwner(graph45);
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    Graph graph65 = Graph.generateGraph();
    graph65.init();
    node54.setOwner(graph65);
    node54.setOwnerName("");
    node54.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph45.getDegree(node54);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test319"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    graph13.setName("");
    graph13.setName("[graph]");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph34 = Graph.generateGraph();
    graph34.init();
    node23.setOwner(graph34);
    node23.setOwnerName("hi!");
    graph13.addNode(node23);
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    graph42.setName("");
    node23.setOwner(graph42);
    graph9.addNode(node23);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    node53.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node23, node53);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test320"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.name = "";
    java.lang.String str62 = graph57.name;
    node25.setOwner(graph57);
    node25.setOwnerNameDirectly("");
    Node node67 = new Node("");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    graph68.setName("");
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node67);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test321"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    node13.setOwnerName("[graph]");
    node13.setOwnerName("");
    node13.setOwnerName("");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerNameDirectly("");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    graph42.setName("");
    node31.setOwner(graph42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node13, node31);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test322"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "";
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    graph14.setName("[graph]");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.init();
    node24.setOwner(graph35);
    node24.setOwnerName("hi!");
    graph14.addNode(node24);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerNameDirectly("");
    node24.setOwnerNameDirectly("");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    graph47.init();
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    Graph graph67 = Graph.generateGraph();
    graph67.init();
    node56.setOwner(graph67);
    node56.setOwnerName("hi!");
    graph47.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node24, node56);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test323"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    node10.setOwnerNameDirectly("[graph]");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("[graph]");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    graph38.setName("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.init();
    node45.setOwner(graph56);
    node45.setOwnerName("hi!");
    graph38.addNode(node45);
    graph35.addNode(node45);
    node45.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node45);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test324"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node10.getDegree();

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test325"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test326"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    graph58.setName("[graph]");
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    node68.setOwnerName("");
    Graph graph79 = Graph.generateGraph();
    graph79.init();
    node68.setOwner(graph79);
    node68.setOwnerName("hi!");
    graph58.addNode(node68);
    Node node86 = new Node("hi!");
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    graph87.init();
    java.lang.String str91 = graph87.name;
    node86.setOwner(graph87);
    graph87.setName("");
    node68.setOwner(graph87);
    graph54.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node68);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test327"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    graph42.addNode(node50);
    graph42.init();
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerName("");
    node64.setOwnerName("[graph]");
    node64.setOwnerName("");
    graph42.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node64);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test328"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerNameDirectly("");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    node59.setOwnerNameDirectly("hi!");
    node59.setOwnerName("");
    graph51.addNode(node59);
    graph51.init();
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerName("");
    node73.setOwnerName("[graph]");
    node73.setOwnerName("");
    graph51.addNode(node73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node73);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test329"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    graph0.name = "";
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    graph38.setName("[graph]");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    Graph graph59 = Graph.generateGraph();
    graph59.init();
    node48.setOwner(graph59);
    node48.setOwnerName("hi!");
    graph38.addNode(node48);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.setName("");
    node48.setOwner(graph67);
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node48.setOwner(graph78);
    node48.setOwnerNameDirectly("[graph]");
    graph34.addNode(node48);
    graph0.addNode(node48);
    node48.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test330"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    Graph graph18 = Graph.generateGraph();
    graph18.init();
    node7.setOwner(graph18);
    node7.setOwnerName("hi!");
    graph0.addNode(node7);
    graph0.setName("[graph]");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    graph38.setName("");
    node27.setOwner(graph38);
    node27.setOwnerName("");
    node27.setOwnerName("");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerName("");
    Graph graph62 = new Graph();
    java.lang.String str63 = graph62.name;
    node53.setOwner(graph62);
    graph62.setName("");
    graph62.setName("");
    graph62.name = "";
    graph62.setName("hi!");
    java.lang.String str73 = graph62.name;
    node27.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = graph0.getDegree(node27);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test331"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test332"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    graph45.addNode(node55);
    graph45.name = "";
    graph45.name = "";
    node31.setOwner(graph45);
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    node31.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = node31.getDegree();

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test333"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    graph0.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    node22.setOwnerName("[graph]");
    node22.setOwnerName("");
    graph0.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test334"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "hi!";
    graph12.name = "[graph]";
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    graph36.setName("[graph]");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    Graph graph57 = Graph.generateGraph();
    graph57.init();
    node46.setOwner(graph57);
    node46.setOwnerName("hi!");
    graph36.addNode(node46);
    graph33.addNode(node46);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerName("");
    Graph graph74 = new Graph();
    java.lang.String str75 = graph74.name;
    node65.setOwner(graph74);
    graph74.setName("");
    graph74.name = "hi!";
    graph74.init();
    node46.setOwner(graph74);
    graph12.addNode(node46);
    node46.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = node46.getDegree();

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test335"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("[graph]");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    graph10.setName("hi!");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    node17.setOwnerName("hi!");
    graph10.addNode(node17);
    graph7.addNode(node17);
    node17.setOwnerName("[graph]");
    node17.setOwnerName("hi!");
    node17.setOwnerName("");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    graph53.init();
    graph53.init();
    node42.setOwner(graph53);
    node17.setOwner(graph53);
    node17.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph0.getDegree(node17);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test336"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = new Graph();
    java.lang.String str46 = graph45.name;
    graph45.init();
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerNameDirectly("[graph]");
    graph45.addNode(node49);
    node49.setOwnerName("");
    node49.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.addEdge(node49);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test337"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    graph10.setName("[graph]");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph10.addNode(node20);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("");
    node20.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = graph2.getDegree(node20);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test338"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    node18.setOwnerName("[graph]");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    graph33.setName("[graph]");
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("[graph]");
    graph33.addNode(node43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node43);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test339"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    graph43.addNode(node51);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node51);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test340"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("[graph]");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    graph35.setName("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    node42.setOwnerName("hi!");
    graph35.addNode(node42);
    graph32.addNode(node42);
    Graph graph60 = Graph.generateGraph();
    graph60.init();
    java.lang.String str62 = graph60.name;
    java.lang.String str63 = graph60.name;
    node42.setOwner(graph60);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    node66.setOwnerName("[graph]");
    node66.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node42, node66);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test341"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    graph0.name = "";
    java.lang.String str34 = graph0.name;
    java.lang.String str35 = graph0.name;
    graph0.setName("hi!");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerName("");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    graph50.setName("hi!");
    node39.setOwner(graph50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = graph0.getDegree(node39);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test342"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test343"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "[graph]";
    Node node6 = new Node("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    node6.setOwner(graph7);
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerName("");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    graph17.setName("hi!");
    node6.setOwner(graph17);
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node6.setOwner(graph26);
    graph26.name = "";
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    node36.setOwnerName("[graph]");
    graph26.addNode(node36);
    Graph graph50 = Graph.generateGraph();
    graph50.setName("[graph]");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    graph53.setName("hi!");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("");
    Graph graph71 = Graph.generateGraph();
    graph71.init();
    node60.setOwner(graph71);
    node60.setOwnerName("hi!");
    graph53.addNode(node60);
    graph50.addNode(node60);
    graph50.name = "";
    graph50.name = "";
    node36.setOwner(graph50);
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    node36.setOwner(graph83);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node36);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test344"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test345"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.name = "";
    graph0.name = "[graph]";
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    node35.setOwnerName("[graph]");
    node35.setOwnerName("[graph]");
    node35.setOwnerName("");
    node35.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph0.getDegree(node35);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test346"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    graph0.init();
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    graph55.setName("");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    graph55.addNode(node63);
    node63.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = graph0.getDegree(node63);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test347"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    graph9.addNode(node19);
    node19.setOwnerName("[graph]");
    node19.setOwnerName("hi!");
    graph0.addNode(node19);
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    graph42.addNode(node50);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.addEdge(node50);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test348"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    node8.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test349"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerName("");
    Graph graph20 = new Graph();
    java.lang.String str21 = graph20.name;
    node11.setOwner(graph20);
    graph20.setName("");
    graph20.setName("[graph]");
    node1.setOwner(graph20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node1.getDegree();

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test350"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    graph24.setName("");
    graph24.setName("[graph]");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    graph45.init();
    node34.setOwner(graph45);
    node34.setOwnerName("hi!");
    graph24.addNode(node34);
    graph21.addNode(node34);
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    node34.setOwner(graph52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph2.getDegree(node34);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test351"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Node node29 = new Node("[graph]");
    graph0.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node29.getDegree();

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test352"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node10.getDegree();

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test353"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    graph2.name = "";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("[graph]");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerName("hi!");
    graph12.addNode(node22);
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    graph41.setName("");
    node22.setOwner(graph41);
    node22.setOwnerNameDirectly("[graph]");
    node22.setOwnerName("hi!");
    node22.setOwnerName("");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerName("");
    Graph graph68 = Graph.generateGraph();
    graph68.init();
    node57.setOwner(graph68);
    node57.setOwnerName("hi!");
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node22, node57);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test354"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    Graph graph16 = new Graph();
    java.lang.String str17 = graph16.name;
    node1.setOwner(graph16);
    java.lang.String str19 = graph16.name;
    Graph graph20 = Graph.generateGraph();
    graph20.setName("[graph]");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.setName("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    node30.setOwnerName("hi!");
    graph23.addNode(node30);
    graph20.addNode(node30);
    Graph graph48 = Graph.generateGraph();
    graph48.init();
    java.lang.String str50 = graph48.name;
    java.lang.String str51 = graph48.name;
    node30.setOwner(graph48);
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    graph53.setName("hi!");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("");
    Graph graph71 = Graph.generateGraph();
    graph71.init();
    node60.setOwner(graph71);
    node60.setOwnerName("hi!");
    graph53.addNode(node60);
    graph53.setName("[graph]");
    graph53.name = "[graph]";
    node30.setOwner(graph53);
    node30.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph16.getDegree(node30);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test355"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.name = "";
    java.lang.String str62 = graph57.name;
    node25.setOwner(graph57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node25.getDegree();

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test356"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerName("");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    node44.setOwner(graph53);
    graph53.setName("");
    graph53.name = "hi!";
    graph53.init();
    node25.setOwner(graph53);
    graph53.name = "[graph]";
    graph53.setName("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    graph66.setName("");
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node74.setOwnerNameDirectly("hi!");
    node74.setOwnerName("");
    graph66.addNode(node74);
    node74.setOwnerNameDirectly("hi!");
    graph53.addNode(node74);
    Node node90 = new Node("hi!");
    Graph graph91 = Graph.generateGraph();
    graph91.setName("");
    graph91.init();
    java.lang.String str95 = graph91.name;
    node90.setOwner(graph91);
    node90.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph53.getDegree(node90);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test357"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = node1.getDegree();

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test358"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    graph3.setName("");
    graph3.setName("[graph]");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerName("hi!");
    graph3.addNode(node13);
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    graph32.setName("");
    node13.setOwner(graph32);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node13.setOwner(graph43);
    node13.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph0.getDegree(node13);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test359"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.setName("");
    java.lang.String str17 = graph10.name;
    graph10.init();
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    graph19.setName("[graph]");
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    node29.setOwner(graph40);
    node29.setOwnerName("hi!");
    graph19.addNode(node29);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerNameDirectly("");
    node29.setOwnerName("");
    node29.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph10.getDegree(node29);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test360"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    graph5.setName("");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    graph5.addNode(node13);
    node13.setOwnerName("[graph]");
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    java.lang.String str37 = graph31.name;
    graph31.init();
    node28.setOwner(graph31);
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    graph40.setName("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    node47.setOwner(graph58);
    node47.setOwnerName("hi!");
    graph40.addNode(node47);
    graph40.setName("[graph]");
    node28.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node13, node28);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test361"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    graph27.init();
    graph27.init();
    node16.setOwner(graph27);
    graph27.name = "";
    graph27.init();
    graph27.init();
    node1.setOwner(graph27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node1.getDegree();

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test362"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerName("");
    Graph graph36 = new Graph();
    java.lang.String str37 = graph36.name;
    node27.setOwner(graph36);
    graph36.setName("");
    graph36.setName("");
    graph36.name = "";
    graph36.setName("hi!");
    java.lang.String str47 = graph36.name;
    node1.setOwner(graph36);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    node50.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph36.addNode(node50);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test363"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test364"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.name = "[graph]";
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    graph26.setName("");
    graph26.setName("[graph]");
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    Graph graph47 = Graph.generateGraph();
    graph47.init();
    node36.setOwner(graph47);
    node36.setOwnerName("hi!");
    graph26.addNode(node36);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerNameDirectly("");
    graph17.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph12.getDegree(node36);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test365"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    graph9.addNode(node19);
    node19.setOwnerName("[graph]");
    node19.setOwnerName("hi!");
    graph0.addNode(node19);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    graph54.setName("hi!");
    node43.setOwner(graph54);
    node43.setOwnerName("hi!");
    node43.setOwnerName("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    node66.setOwnerName("[graph]");
    node66.setOwnerName("");
    node66.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node43, node66);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test366"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node15);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test367"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    graph15.setName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerName("hi!");
    graph15.addNode(node22);
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    java.lang.String str41 = graph39.name;
    java.lang.String str42 = graph39.name;
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    graph43.setName("hi!");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    Graph graph61 = Graph.generateGraph();
    graph61.init();
    node50.setOwner(graph61);
    node50.setOwnerName("hi!");
    graph43.addNode(node50);
    graph39.addNode(node50);
    node50.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node22, node50);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test368"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    java.lang.String str31 = graph25.name;
    graph25.init();
    node22.setOwner(graph25);
    node22.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test369"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node10.getDegree();

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test370"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    graph0.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    node22.setOwnerName("[graph]");
    node22.setOwnerName("");
    graph0.addNode(node22);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    graph50.init();
    graph50.init();
    node39.setOwner(graph50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = graph0.getDegree(node39);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test371"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.init();
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    graph29.setName("hi!");
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    Graph graph47 = Graph.generateGraph();
    graph47.init();
    node36.setOwner(graph47);
    node36.setOwnerName("hi!");
    graph29.addNode(node36);
    graph29.setName("[graph]");
    graph29.name = "[graph]";
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    graph57.setName("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerName("");
    Graph graph75 = Graph.generateGraph();
    graph75.init();
    node64.setOwner(graph75);
    node64.setOwnerName("hi!");
    graph57.addNode(node64);
    node64.setOwnerName("");
    node64.setOwnerNameDirectly("[graph]");
    graph29.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = graph21.getDegree(node64);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test372"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerName("");
    Graph graph33 = new Graph();
    java.lang.String str34 = graph33.name;
    node24.setOwner(graph33);
    graph33.setName("");
    graph33.setName("");
    graph33.name = "hi!";
    node1.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = node1.getDegree();

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test373"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test374"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.name = "hi!";
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerName("hi!");
    node13.setOwnerNameDirectly("[graph]");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("hi!");
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node13.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = graph2.getDegree(node13);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test375"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node10.getDegree();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test376"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    graph12.name = "hi!";
    node1.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test377"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("[graph]");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    graph7.setName("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph7.addNode(node14);
    graph4.addNode(node14);
    node14.setOwnerName("hi!");
    node14.setOwnerNameDirectly("");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerName("");
    node37.setOwnerName("[graph]");
    node37.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node14, node37);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test378"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    graph10.init();
    graph10.setName("hi!");
    graph10.name = "[graph]";
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph34 = Graph.generateGraph();
    graph34.init();
    node23.setOwner(graph34);
    node23.setOwnerName("");
    node23.setOwnerName("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    graph53.setName("hi!");
    node42.setOwner(graph53);
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node42.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node23, node42);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test379"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerName("");
    Graph graph16 = new Graph();
    java.lang.String str17 = graph16.name;
    node7.setOwner(graph16);
    node7.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = graph0.getDegree(node7);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test380"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerName("");
    Graph graph15 = Graph.generateGraph();
    graph15.init();
    node4.setOwner(graph15);
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    graph18.setName("[graph]");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    node28.setOwner(graph39);
    node28.setOwnerName("hi!");
    graph18.addNode(node28);
    graph15.addNode(node28);
    node28.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph0.getDegree(node28);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test381"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    Graph graph43 = Graph.generateGraph();
    graph43.init();
    node32.setOwner(graph43);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    graph46.setName("[graph]");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    Graph graph67 = Graph.generateGraph();
    graph67.init();
    node56.setOwner(graph67);
    node56.setOwnerName("hi!");
    graph46.addNode(node56);
    graph43.addNode(node56);
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    node56.setOwner(graph74);
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    graph78.setName("[graph]");
    node56.setOwner(graph78);
    node18.setOwner(graph78);
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test382"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.init();
    graph10.setName("hi!");
    java.lang.String str16 = graph10.name;
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    graph17.setName("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.init();
    node24.setOwner(graph35);
    node24.setOwnerName("hi!");
    graph17.addNode(node24);
    node24.setOwnerName("");
    node24.setOwnerNameDirectly("[graph]");
    graph10.addNode(node24);
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    node47.setOwner(graph58);
    node47.setOwnerName("");
    node47.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.addEdge(node47);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test383"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test384"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    graph40.name = "";
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph40.getDegree(node50);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test385"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.name = "";
    java.lang.String str62 = graph57.name;
    node25.setOwner(graph57);
    Graph graph64 = Graph.generateGraph();
    graph64.setName("[graph]");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    graph67.setName("hi!");
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node74.setOwnerNameDirectly("hi!");
    node74.setOwnerName("");
    Graph graph85 = Graph.generateGraph();
    graph85.init();
    node74.setOwner(graph85);
    node74.setOwnerName("hi!");
    graph67.addNode(node74);
    graph64.addNode(node74);
    node25.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test386"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Graph graph10 = Graph.generateGraph();
    graph10.setName("[graph]");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    graph13.setName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph13.addNode(node20);
    graph10.addNode(node20);
    Node node39 = new Node("[graph]");
    graph10.addNode(node39);
    node1.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node1.getDegree();

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test387"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    graph0.addNode(node4);
    node4.setOwnerName("");
    node4.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test388"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node1.getDegree();

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test389"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test390"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    Graph graph18 = Graph.generateGraph();
    graph18.init();
    node7.setOwner(graph18);
    node7.setOwnerName("hi!");
    graph0.addNode(node7);
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    node25.setOwnerNameDirectly("[graph]");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    graph45.setName("hi!");
    graph45.setName("[graph]");
    graph45.name = "[graph]";
    node25.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph0.getDegree(node25);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test391"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.name = "";
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    java.lang.String str22 = graph16.name;
    graph16.init();
    node13.setOwner(graph16);
    graph0.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test392"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    node14.setOwnerName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    node14.setOwner(graph45);
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    graph53.setName("[graph]");
    Node node63 = new Node("");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("[graph]");
    graph53.addNode(node63);
    node14.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test393"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerName("");
    Graph graph33 = new Graph();
    java.lang.String str34 = graph33.name;
    node24.setOwner(graph33);
    graph33.setName("");
    graph33.setName("");
    graph33.name = "hi!";
    node1.setOwner(graph33);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    graph43.setName("[graph]");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("[graph]");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    graph55.setName("hi!");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("");
    Graph graph73 = Graph.generateGraph();
    graph73.init();
    node62.setOwner(graph73);
    node62.setOwnerName("hi!");
    graph55.addNode(node62);
    graph52.addNode(node62);
    node62.setOwnerName("[graph]");
    node62.setOwnerName("hi!");
    graph43.addNode(node62);
    node1.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test394"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    java.lang.String str25 = graph19.name;
    graph19.init();
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    graph27.addNode(node35);
    graph19.addNode(node35);
    graph19.init();
    java.lang.String str49 = graph19.name;
    node1.setOwner(graph19);
    graph19.name = "[graph]";
    graph19.init();
    Node node55 = new Node("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    node55.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = graph19.getDegree(node55);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test395"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("[graph]");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    graph24.setName("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    Graph graph42 = Graph.generateGraph();
    graph42.init();
    node31.setOwner(graph42);
    node31.setOwnerName("hi!");
    graph24.addNode(node31);
    graph21.addNode(node31);
    node31.setOwnerName("[graph]");
    node31.setOwnerName("hi!");
    node31.setOwnerName("");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.init();
    graph67.init();
    node56.setOwner(graph67);
    node31.setOwner(graph67);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node31);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test396"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    graph12.name = "hi!";
    node1.setOwner(graph12);
    graph12.name = "";
    Graph graph25 = Graph.generateGraph();
    graph25.setName("[graph]");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    graph28.setName("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.init();
    node35.setOwner(graph46);
    node35.setOwnerName("hi!");
    graph28.addNode(node35);
    graph25.addNode(node35);
    node35.setOwnerName("[graph]");
    node35.setOwnerName("hi!");
    node35.setOwnerName("");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    graph71.init();
    graph71.init();
    node60.setOwner(graph71);
    node35.setOwner(graph71);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph12.getDegree(node35);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test397"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    java.lang.String str10 = graph4.name;
    graph4.init();
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test398"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = Graph.generateGraph();
    graph10.init();
    java.lang.String str12 = graph10.name;
    node1.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test399"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph34 = Graph.generateGraph();
    graph34.init();
    node23.setOwner(graph34);
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("[graph]");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    node47.setOwner(graph58);
    node47.setOwnerName("hi!");
    graph37.addNode(node47);
    graph34.addNode(node47);
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    node47.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph12.getDegree(node47);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test400"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    graph19.setName("[graph]");
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    node29.setOwner(graph40);
    node29.setOwnerName("hi!");
    graph19.addNode(node29);
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    graph48.setName("");
    node29.setOwner(graph48);
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node58.setOwnerName("");
    Graph graph67 = new Graph();
    java.lang.String str68 = graph67.name;
    node58.setOwner(graph67);
    graph67.setName("");
    graph67.setName("");
    graph67.name = "";
    graph67.setName("hi!");
    node29.setOwner(graph67);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node29);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test401"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("[graph]");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerName("");
    Graph graph27 = new Graph();
    java.lang.String str28 = graph27.name;
    node18.setOwner(graph27);
    graph27.setName("");
    graph27.setName("");
    graph27.name = "";
    graph27.init();
    node1.setOwner(graph27);
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    java.lang.String str48 = graph42.name;
    graph42.init();
    node39.setOwner(graph42);
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    graph51.setName("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node58.setOwnerNameDirectly("hi!");
    node58.setOwnerName("");
    Graph graph69 = Graph.generateGraph();
    graph69.init();
    node58.setOwner(graph69);
    node58.setOwnerName("hi!");
    graph51.addNode(node58);
    graph51.setName("[graph]");
    node39.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph27.getDegree(node39);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test402"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    graph0.addNode(node4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test403"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    Graph graph18 = Graph.generateGraph();
    graph18.init();
    node7.setOwner(graph18);
    node7.setOwnerName("hi!");
    graph0.addNode(node7);
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    graph36.init();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerNameDirectly("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.setName("");
    graph57.setName("");
    graph57.name = "hi!";
    node25.setOwner(graph57);
    graph0.addNode(node25);
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node25.getDegree();

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test404"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node1.getDegree();

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test405"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    java.lang.String str38 = graph29.name;
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = graph29.getDegree(node40);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test406"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    graph20.addNode(node28);
    graph12.addNode(node28);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    node42.setOwner(graph53);
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("[graph]");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    Graph graph77 = Graph.generateGraph();
    graph77.init();
    node66.setOwner(graph77);
    node66.setOwnerName("hi!");
    graph56.addNode(node66);
    graph53.addNode(node66);
    Graph graph84 = Graph.generateGraph();
    graph84.setName("");
    node66.setOwner(graph84);
    Graph graph88 = Graph.generateGraph();
    graph88.setName("");
    graph88.init();
    graph88.setName("[graph]");
    node66.setOwner(graph88);
    node28.setOwner(graph88);
    graph2.addNode(node28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test407"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test408"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.init();
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.init();
    node24.setOwner(graph35);
    node24.setOwnerName("hi!");
    graph15.addNode(node24);
    node24.setOwnerNameDirectly("");
    node24.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph10.getDegree(node24);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test409"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.name = "hi!";
    graph2.setName("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    graph13.setName("");
    graph13.setName("[graph]");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph34 = Graph.generateGraph();
    graph34.init();
    node23.setOwner(graph34);
    node23.setOwnerName("hi!");
    graph13.addNode(node23);
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    graph42.setName("");
    node23.setOwner(graph42);
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node23.setOwner(graph53);
    node23.setOwnerNameDirectly("[graph]");
    graph9.addNode(node23);
    graph2.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test410"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    graph0.addNode(node14);
    node14.setOwnerName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    node14.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = node14.getDegree();

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test411"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node10.getDegree();

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test412"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    graph21.setName("hi!");
    graph21.setName("[graph]");
    graph21.name = "[graph]";
    node1.setOwner(graph21);
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    graph34.setName("");
    graph34.setName("[graph]");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    Graph graph55 = Graph.generateGraph();
    graph55.init();
    node44.setOwner(graph55);
    node44.setOwnerName("hi!");
    graph34.addNode(node44);
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    graph63.setName("");
    node44.setOwner(graph63);
    graph21.addNode(node44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node44.getDegree();

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test413"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    graph28.init();
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    graph46.setName("hi!");
    node35.setOwner(graph46);
    graph28.addNode(node35);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    node55.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.addEdge(node55);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test414"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    graph21.setName("hi!");
    graph21.setName("[graph]");
    graph21.name = "[graph]";
    node1.setOwner(graph21);
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    graph34.setName("");
    graph34.setName("[graph]");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    Graph graph55 = Graph.generateGraph();
    graph55.init();
    node44.setOwner(graph55);
    node44.setOwnerName("hi!");
    graph34.addNode(node44);
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    graph63.setName("");
    node44.setOwner(graph63);
    graph21.addNode(node44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test415"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    graph29.name = "";
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    graph40.setName("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    node47.setOwner(graph58);
    node47.setOwnerName("hi!");
    graph40.addNode(node47);
    node47.setOwnerName("");
    node47.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph29.getDegree(node47);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test416"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node10.getDegree();

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test417"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test418"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    graph44.setName("[graph]");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    Graph graph65 = Graph.generateGraph();
    graph65.init();
    node54.setOwner(graph65);
    node54.setOwnerName("hi!");
    graph44.addNode(node54);
    graph41.addNode(node54);
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    node54.setOwner(graph72);
    java.lang.String str76 = graph72.name;
    graph72.name = "hi!";
    node10.setOwner(graph72);
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    node81.setOwnerNameDirectly("hi!");
    node81.setOwnerName("");
    node81.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph72.getDegree(node81);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test419"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test420"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test421"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    graph12.init();
    graph12.name = "";
    Node node26 = new Node("");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph12.getDegree(node26);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test422"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    Graph graph43 = Graph.generateGraph();
    graph43.init();
    node32.setOwner(graph43);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    graph46.setName("[graph]");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    Graph graph67 = Graph.generateGraph();
    graph67.init();
    node56.setOwner(graph67);
    node56.setOwnerName("hi!");
    graph46.addNode(node56);
    graph43.addNode(node56);
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    node56.setOwner(graph74);
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    graph78.setName("[graph]");
    node56.setOwner(graph78);
    node18.setOwner(graph78);
    node18.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = node18.getDegree();

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test423"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    node30.setOwner(graph41);
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    graph44.setName("[graph]");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    Graph graph65 = Graph.generateGraph();
    graph65.init();
    node54.setOwner(graph65);
    node54.setOwnerName("hi!");
    graph44.addNode(node54);
    graph41.addNode(node54);
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    node54.setOwner(graph72);
    java.lang.String str76 = graph72.name;
    graph72.name = "hi!";
    node10.setOwner(graph72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test424"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    graph66.init();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerNameDirectly("hi!");
    graph47.addNode(node55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test425"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("");
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node10.getDegree();

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test426"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node10.getDegree();

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test427"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.setName("[graph]");
    graph0.setName("");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    node7.setOwnerName("[graph]");
    node7.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = graph0.getDegree(node7);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test428"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    node1.setOwner(graph12);
    graph12.name = "hi!";
    graph12.name = "[graph]";
    graph12.setName("");
    graph12.setName("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    graph25.addNode(node33);
    node33.setOwnerNameDirectly("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.setName("");
    graph57.setName("");
    graph57.name = "";
    graph57.setName("hi!");
    node33.setOwner(graph57);
    node33.setOwnerNameDirectly("");
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerNameDirectly("");
    node72.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph12.addEdge(node33, node72);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test429"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    graph0.init();
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerName("");
    Graph graph23 = new Graph();
    java.lang.String str24 = graph23.name;
    node14.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node14);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test430"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    node10.setOwnerName("[graph]");
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("hi!");
    node29.setOwnerName("");
    node29.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node10, node29);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test431"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.init();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerNameDirectly("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerName("");
    Graph graph54 = new Graph();
    java.lang.String str55 = graph54.name;
    node45.setOwner(graph54);
    graph54.setName("");
    graph54.setName("");
    graph54.name = "hi!";
    node22.setOwner(graph54);
    node1.setOwner(graph54);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.name = "hi!";
    graph67.init();
    graph67.setName("hi!");
    node1.setOwner(graph67);
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    node80.setOwnerNameDirectly("hi!");
    node80.setOwnerName("");
    Graph graph91 = Graph.generateGraph();
    graph91.init();
    node80.setOwner(graph91);
    node80.setOwnerName("hi!");
    node80.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node80);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test432"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    node14.setOwnerName("[graph]");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    graph58.setName("hi!");
    graph58.setName("[graph]");
    node14.setOwner(graph58);
    node14.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test433"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test434"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    graph18.setName("[graph]");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    node28.setOwner(graph39);
    node28.setOwnerName("hi!");
    graph18.addNode(node28);
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    graph47.setName("");
    node28.setOwner(graph47);
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerName("");
    Graph graph66 = new Graph();
    java.lang.String str67 = graph66.name;
    node57.setOwner(graph66);
    graph66.setName("");
    graph66.setName("");
    graph66.name = "";
    graph66.setName("hi!");
    node28.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node28);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test435"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph48.addNode(node55);
    graph45.addNode(node55);
    graph45.name = "";
    graph45.name = "";
    node31.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node31.getDegree();

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test436"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    graph0.name = "";
    graph0.setName("");
    graph0.name = "";
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    graph38.setName("[graph]");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    Graph graph59 = Graph.generateGraph();
    graph59.init();
    node48.setOwner(graph59);
    node48.setOwnerName("hi!");
    graph38.addNode(node48);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.setName("");
    node48.setOwner(graph67);
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node48.setOwner(graph78);
    node48.setOwnerNameDirectly("[graph]");
    graph34.addNode(node48);
    graph0.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node48.getDegree();

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test437"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    graph44.setName("hi!");
    node33.setOwner(graph44);
    node33.setOwnerName("hi!");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    graph65.init();
    graph65.init();
    node54.setOwner(graph65);
    node54.setOwnerNameDirectly("hi!");
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node77.setOwnerName("");
    Graph graph86 = new Graph();
    java.lang.String str87 = graph86.name;
    node77.setOwner(graph86);
    graph86.setName("");
    graph86.setName("");
    graph86.name = "hi!";
    node54.setOwner(graph86);
    node33.setOwner(graph86);
    node10.setOwner(graph86);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = node10.getDegree();

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test438"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    graph19.addNode(node27);
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    graph51.init();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerNameDirectly("hi!");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerName("");
    Graph graph72 = new Graph();
    java.lang.String str73 = graph72.name;
    node63.setOwner(graph72);
    graph72.setName("");
    graph72.setName("");
    graph72.name = "hi!";
    node40.setOwner(graph72);
    java.lang.String str82 = graph72.name;
    graph72.init();
    node27.setOwner(graph72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test439"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("[graph]");

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test440"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node1.setOwner(graph21);
    graph21.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    graph21.addNode(node31);
    graph21.name = "hi!";
    graph21.init();
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    java.lang.String str56 = graph50.name;
    graph50.init();
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    graph58.addNode(node66);
    graph50.addNode(node66);
    node66.setOwnerName("[graph]");
    node66.setOwnerName("");
    node66.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph21.getDegree(node66);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test441"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    java.lang.String str3 = graph0.name;
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerName("");
    Graph graph16 = Graph.generateGraph();
    graph16.init();
    node5.setOwner(graph16);
    node5.setOwnerName("");
    node5.setOwnerName("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    graph23.setName("");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    graph23.addNode(node31);
    node31.setOwnerNameDirectly("hi!");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerName("");
    Graph graph55 = new Graph();
    java.lang.String str56 = graph55.name;
    node46.setOwner(graph55);
    graph55.setName("");
    graph55.setName("");
    graph55.name = "";
    graph55.setName("hi!");
    node31.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node5, node31);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test442"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("");
    Graph graph20 = Graph.generateGraph();
    graph20.init();
    node9.setOwner(graph20);
    node9.setOwnerName("hi!");
    graph0.addNode(node9);
    graph0.setName("hi!");
    graph0.name = "[graph]";
    java.lang.String str30 = graph0.name;
    Node node32 = new Node("");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    java.lang.String str41 = graph35.name;
    graph35.init();
    node32.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph0.getDegree(node32);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test443"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph12.addNode(node19);
    graph9.addNode(node19);
    node19.setOwnerName("[graph]");
    node19.setOwnerName("hi!");
    graph0.addNode(node19);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    graph54.setName("hi!");
    node43.setOwner(graph54);
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node43.setOwner(graph63);
    graph63.init();
    Node node72 = new Node("");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    graph73.setName("");
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("[graph]");
    graph63.addNode(node72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.addEdge(node72);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test444"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    java.lang.String str3 = graph0.name;
    Graph graph4 = new Graph();
    java.lang.String str5 = graph4.name;
    graph4.init();
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerNameDirectly("[graph]");
    graph4.addNode(node8);
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    graph32.setName("hi!");
    node21.setOwner(graph32);
    graph4.addNode(node21);
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    Graph graph52 = Graph.generateGraph();
    graph52.init();
    node41.setOwner(graph52);
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    graph55.setName("");
    graph55.setName("[graph]");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("");
    Graph graph76 = Graph.generateGraph();
    graph76.init();
    node65.setOwner(graph76);
    node65.setOwnerName("hi!");
    graph55.addNode(node65);
    graph52.addNode(node65);
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    node65.setOwner(graph83);
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    graph87.init();
    graph87.setName("[graph]");
    node65.setOwner(graph87);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node21, node65);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test445"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("");
    Graph graph20 = Graph.generateGraph();
    graph20.init();
    node9.setOwner(graph20);
    node9.setOwnerName("hi!");
    graph0.addNode(node9);
    node9.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node9.getDegree();

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test446"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test447"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    node1.setOwner(graph10);
    graph10.setName("");
    graph10.name = "hi!";
    graph10.init();
    graph10.setName("hi!");
    graph10.name = "[graph]";
    Graph graph22 = Graph.generateGraph();
    graph22.setName("[graph]");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    graph25.setName("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    Graph graph43 = Graph.generateGraph();
    graph43.init();
    node32.setOwner(graph43);
    node32.setOwnerName("hi!");
    graph25.addNode(node32);
    graph22.addNode(node32);
    node32.setOwnerName("[graph]");
    node32.setOwnerName("hi!");
    node32.setOwnerName("");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerNameDirectly("hi!");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    graph68.init();
    graph68.init();
    node57.setOwner(graph68);
    node32.setOwner(graph68);
    node32.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph10.getDegree(node32);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test448"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    Graph graph10 = Graph.generateGraph();
    graph10.init();
    java.lang.String str12 = graph10.name;
    node1.setOwner(graph10);
    node1.setOwnerNameDirectly("[graph]");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("[graph]");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    Graph graph52 = Graph.generateGraph();
    graph52.init();
    node41.setOwner(graph52);
    node41.setOwnerName("hi!");
    graph31.addNode(node41);
    graph28.addNode(node41);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    node41.setOwner(graph59);
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    graph63.setName("[graph]");
    node41.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node41);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test449"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    Graph graph16 = new Graph();
    java.lang.String str17 = graph16.name;
    node1.setOwner(graph16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test450"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.init();
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerName("hi!");
    graph17.addNode(node26);
    graph17.setName("hi!");
    graph17.name = "";
    graph17.setName("");
    graph17.setName("[graph]");
    node1.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test451"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    graph0.addNode(node4);
    node4.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node4.getDegree();

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test452"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    graph3.setName("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph3.addNode(node10);
    graph0.addNode(node10);
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    java.lang.String str31 = graph28.name;
    node10.setOwner(graph28);
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("hi!");
    graph33.addNode(node40);
    graph33.setName("[graph]");
    graph33.name = "[graph]";
    node10.setOwner(graph33);
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node10.getDegree();

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test453"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test454"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    node28.setOwnerName("[graph]");
    node28.setOwnerName("[graph]");
    Graph graph43 = new Graph();
    java.lang.String str44 = graph43.name;
    node28.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node28);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test455"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = graph0.getDegree(node10);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test456"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerName("");
    Graph graph18 = Graph.generateGraph();
    graph18.init();
    node7.setOwner(graph18);
    node7.setOwnerName("hi!");
    graph0.addNode(node7);
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    graph36.init();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerNameDirectly("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerName("");
    Graph graph57 = new Graph();
    java.lang.String str58 = graph57.name;
    node48.setOwner(graph57);
    graph57.setName("");
    graph57.setName("");
    graph57.name = "hi!";
    node25.setOwner(graph57);
    graph0.addNode(node25);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    graph68.setName("");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerName("");
    graph68.addNode(node76);
    node76.setOwnerName("");
    node76.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node76);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test457"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("");
    node10.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    graph33.addNode(node41);
    node41.setOwnerNameDirectly("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerName("");
    Graph graph65 = new Graph();
    java.lang.String str66 = graph65.name;
    node56.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.name = "";
    graph65.setName("hi!");
    node41.setOwner(graph65);
    node41.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node41);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test458"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    node25.setOwnerName("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    graph45.setName("[graph]");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    graph45.addNode(node55);
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node55);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test459"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    graph2.name = "hi!";
    graph2.name = "";
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    java.lang.String str29 = graph23.name;
    graph23.init();
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerName("");
    graph31.addNode(node39);
    graph23.addNode(node39);
    node39.setOwnerName("[graph]");
    node39.setOwnerName("");
    node39.setOwnerName("");
    graph14.addNode(node39);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    graph59.init();
    graph59.name = "[graph]";
    node39.setOwner(graph59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph2.getDegree(node39);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test460"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.init();
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerName("hi!");
    graph17.addNode(node26);
    graph17.setName("hi!");
    graph17.name = "";
    graph17.setName("");
    graph17.setName("[graph]");
    node1.setOwner(graph17);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerNameDirectly("");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    graph64.setName("");
    node53.setOwner(graph64);
    node53.setOwnerName("");
    node53.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph17.getDegree(node53);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test461"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerName("");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    node23.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.name = "";
    graph32.setName("hi!");
    node8.setOwner(graph32);
    node8.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = node8.getDegree();

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test462"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    graph0.addNode(node4);
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    graph28.setName("hi!");
    node17.setOwner(graph28);
    graph0.addNode(node17);
    graph0.setName("");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerName("");
    Graph graph50 = Graph.generateGraph();
    graph50.init();
    node39.setOwner(graph50);
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    graph53.setName("[graph]");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    node63.setOwner(graph74);
    node63.setOwnerName("hi!");
    graph53.addNode(node63);
    graph50.addNode(node63);
    node63.setOwnerName("hi!");
    Node node84 = new Node("hi!");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    node84.setOwner(graph85);
    java.lang.String str91 = graph85.name;
    graph85.init();
    graph85.name = "";
    node63.setOwner(graph85);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph0.getDegree(node63);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test463"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Graph graph23 = new Graph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("[graph]");
    graph23.addNode(node27);
    node27.setOwnerName("");
    node27.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test464"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("");
    Graph graph20 = Graph.generateGraph();
    graph20.init();
    node9.setOwner(graph20);
    node9.setOwnerName("hi!");
    graph0.addNode(node9);
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    graph26.name = "hi!";
    graph26.name = "";
    node9.setOwner(graph26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test465"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    graph0.addNode(node8);
    node8.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("hi!");
    node23.setOwnerName("");
    node23.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node23);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test466"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    Node node32 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node32);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test467"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test468"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test469"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("");
    node1.setOwner(graph12);
    graph12.name = "[graph]";
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    graph51.init();
    graph51.init();
    node40.setOwner(graph51);
    graph51.name = "";
    graph51.init();
    graph51.init();
    node25.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph12.getDegree(node25);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test470"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.setName("[graph]");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph9.addNode(node19);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("");
    graph0.addNode(node19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test471"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerName("");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    node44.setOwner(graph53);
    graph53.setName("");
    graph53.name = "hi!";
    graph53.init();
    node25.setOwner(graph53);
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    java.lang.String str64 = graph62.name;
    java.lang.String str65 = graph62.name;
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    graph66.setName("hi!");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerName("");
    Graph graph84 = Graph.generateGraph();
    graph84.init();
    node73.setOwner(graph84);
    node73.setOwnerName("hi!");
    graph66.addNode(node73);
    graph62.addNode(node73);
    node25.setOwner(graph62);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test472"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    graph0.addNode(node4);
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    graph16.addNode(node24);
    graph16.init();
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    node38.setOwnerName("[graph]");
    node38.setOwnerName("");
    graph16.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph0.getDegree(node38);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test473"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("hi!");
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.init();
    graph33.init();
    node22.setOwner(graph33);
    node22.setOwnerNameDirectly("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerName("");
    Graph graph54 = new Graph();
    java.lang.String str55 = graph54.name;
    node45.setOwner(graph54);
    graph54.setName("");
    graph54.setName("");
    graph54.name = "hi!";
    node22.setOwner(graph54);
    node1.setOwner(graph54);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    graph67.name = "hi!";
    graph67.init();
    graph67.setName("hi!");
    node1.setOwner(graph67);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = node1.getDegree();

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test474"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.setName("[graph]");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph9.addNode(node19);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("");
    graph0.addNode(node19);
    node19.setOwnerNameDirectly("[graph]");
    node19.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test475"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test476"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    java.lang.String str31 = graph25.name;
    graph25.name = "";
    node1.setOwner(graph25);
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("[graph]");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    graph50.setName("hi!");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerName("");
    Graph graph68 = Graph.generateGraph();
    graph68.init();
    node57.setOwner(graph68);
    node57.setOwnerName("hi!");
    graph50.addNode(node57);
    graph47.addNode(node57);
    node57.setOwnerName("[graph]");
    node57.setOwnerName("hi!");
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph25.addEdge(node36, node57);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test477"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    java.lang.String str18 = graph12.name;
    graph12.init();
    graph12.name = "hi!";
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("[graph]");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.init();
    node35.setOwner(graph46);
    node35.setOwnerName("hi!");
    graph25.addNode(node35);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.setName("");
    node35.setOwner(graph54);
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerName("");
    Graph graph73 = new Graph();
    java.lang.String str74 = graph73.name;
    node64.setOwner(graph73);
    graph73.setName("");
    graph73.setName("");
    graph73.name = "";
    graph73.setName("hi!");
    node35.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node35);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test478"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    graph22.setName("hi!");
    node11.setOwner(graph22);
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node11.setOwner(graph31);
    graph31.name = "";
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    node41.setOwnerName("[graph]");
    graph31.addNode(node41);
    Graph graph55 = Graph.generateGraph();
    graph55.setName("[graph]");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    graph58.setName("hi!");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("");
    Graph graph76 = Graph.generateGraph();
    graph76.init();
    node65.setOwner(graph76);
    node65.setOwnerName("hi!");
    graph58.addNode(node65);
    graph55.addNode(node65);
    graph55.name = "";
    graph55.name = "";
    node41.setOwner(graph55);
    node41.setOwnerName("[graph]");
    node41.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node41);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test479"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    node10.setOwner(graph29);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node10.setOwner(graph40);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("[graph]");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    graph53.setName("[graph]");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    node63.setOwner(graph74);
    node63.setOwnerName("hi!");
    graph53.addNode(node63);
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    graph82.setName("");
    node63.setOwner(graph82);
    graph82.name = "";
    node10.setOwner(graph82);
    node10.setOwnerName("");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test480"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    graph0.addNode(node4);
    node4.setOwnerName("");
    node4.setOwnerName("[graph]");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.name = "hi!";
    graph28.setName("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    graph39.setName("");
    graph39.setName("[graph]");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerName("");
    Graph graph60 = Graph.generateGraph();
    graph60.init();
    node49.setOwner(graph60);
    node49.setOwnerName("hi!");
    graph39.addNode(node49);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    graph68.setName("");
    node49.setOwner(graph68);
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    node49.setOwner(graph79);
    node49.setOwnerNameDirectly("[graph]");
    graph35.addNode(node49);
    graph28.addNode(node49);
    node21.setOwner(graph28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.addEdge(node21);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test481"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    graph0.setName("[graph]");
    graph0.name = "";
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    Graph graph28 = Graph.generateGraph();
    graph28.init();
    node17.setOwner(graph28);
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("[graph]");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    Graph graph52 = Graph.generateGraph();
    graph52.init();
    node41.setOwner(graph52);
    node41.setOwnerName("hi!");
    graph31.addNode(node41);
    graph28.addNode(node41);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    node41.setOwner(graph59);
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerName("");
    Graph graph73 = new Graph();
    java.lang.String str74 = graph73.name;
    node64.setOwner(graph73);
    graph73.name = "";
    java.lang.String str78 = graph73.name;
    node41.setOwner(graph73);
    node41.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph0.getDegree(node41);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test482"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node10.getDegree();

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test483"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    graph15.setName("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    graph15.addNode(node25);
    graph12.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    node25.setOwner(graph43);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    node25.setOwner(graph47);
    node25.setOwnerName("");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerName("");
    Graph graph66 = new Graph();
    java.lang.String str67 = graph66.name;
    node57.setOwner(graph66);
    graph66.init();
    graph66.name = "[graph]";
    node25.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node25.getDegree();

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test484"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test485"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    node18.setOwnerName("[graph]");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    graph33.setName("");
    graph33.init();
    graph33.name = "";
    Node node46 = new Node("");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    java.lang.String str55 = graph49.name;
    graph49.init();
    node46.setOwner(graph49);
    graph33.addNode(node46);
    node18.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test486"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    graph33.addNode(node41);
    graph33.init();
    graph33.init();
    node10.setOwner(graph33);
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    graph56.setName("hi!");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    node63.setOwner(graph74);
    node63.setOwnerName("hi!");
    graph56.addNode(node63);
    node63.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node63);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test487"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    java.lang.String str10 = graph4.name;
    graph4.init();
    node1.setOwner(graph4);
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    graph13.setName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
    graph13.addNode(node20);
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node1.getDegree();

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test488"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph12 = Graph.generateGraph();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test489"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.init();
    graph12.init();
    node1.setOwner(graph12);
    node1.setOwnerNameDirectly("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    java.lang.String str31 = graph25.name;
    graph25.name = "";
    node1.setOwner(graph25);
    node1.setOwnerNameDirectly("hi!");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    graph49.setName("hi!");
    node38.setOwner(graph49);
    node38.setOwnerName("hi!");
    node38.setOwnerName("hi!");
    node38.setOwnerName("hi!");
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node38);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test490"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    graph10.setName("");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    graph10.addNode(node18);
    graph2.addNode(node18);
    node18.setOwnerName("[graph]");
    node18.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node18.getDegree();

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test491"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    graph11.setName("");
    graph11.setName("[graph]");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.init();
    node21.setOwner(graph32);
    node21.setOwnerName("hi!");
    graph11.addNode(node21);
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    graph40.setName("");
    node21.setOwner(graph40);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node21.setOwner(graph51);
    node21.setOwnerNameDirectly("[graph]");
    graph7.addNode(node21);
    graph0.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test492"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("");
    Graph graph20 = Graph.generateGraph();
    graph20.init();
    node9.setOwner(graph20);
    node9.setOwnerName("hi!");
    graph0.addNode(node9);
    java.lang.String str26 = graph0.name;
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("");
    node28.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = graph0.getDegree(node28);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test493"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.setName("[graph]");
    graph2.name = "[graph]";
    graph2.init();
    java.lang.String str15 = graph2.name;
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    graph16.setName("[graph]");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerName("hi!");
    graph16.addNode(node26);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = graph2.getDegree(node26);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test494"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "";
    graph0.name = "hi!";
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    graph16.setName("[graph]");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerName("hi!");
    graph16.addNode(node26);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    graph45.setName("");
    node26.setOwner(graph45);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node26.setOwner(graph56);
    node26.setOwnerNameDirectly("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("[graph]");
    node66.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node26, node66);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test495"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node11 = new Node("");
    graph2.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.setOwnerName("hi!");

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test496"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("[graph]");

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test497"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("hi!");
    graph0.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("");
    Graph graph31 = new Graph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("[graph]");
    graph31.addNode(node35);
    node35.setOwnerName("");
    node35.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node35);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test498"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    graph4.setName("");
    graph4.setName("[graph]");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    node14.setOwner(graph25);
    node14.setOwnerName("hi!");
    graph4.addNode(node14);
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    graph33.setName("");
    node14.setOwner(graph33);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node14.setOwner(graph44);
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    graph66.setName("hi!");
    node55.setOwner(graph66);
    node55.setOwnerName("hi!");
    node55.setOwnerName("hi!");
    node55.setOwnerName("hi!");
    node55.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node55);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test499"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    Graph graph3 = Graph.generateGraph();
    graph3.setName("[graph]");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    graph6.setName("hi!");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerName("hi!");
    graph6.addNode(node13);
    graph3.addNode(node13);
    Graph graph31 = Graph.generateGraph();
    graph31.init();
    java.lang.String str33 = graph31.name;
    java.lang.String str34 = graph31.name;
    node13.setOwner(graph31);
    node13.setOwnerName("hi!");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    java.lang.String str46 = graph40.name;
    graph40.init();
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    graph48.setName("");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    graph48.addNode(node56);
    graph40.addNode(node56);
    node56.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node13, node56);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test500"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.setName("[graph]");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.init();
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    graph9.addNode(node19);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("");
    graph0.addNode(node19);
    node19.setOwnerNameDirectly("[graph]");
    node19.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node19.getDegree();

  }

}
