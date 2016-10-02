
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test001"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test002"); }


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
    graph21.name = "[graph]";
    graph21.init();
    graph21.setName("hi!");
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
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph21.getDegree(node53);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test003"); }


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
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    graph42.name = "[graph]";
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    graph51.setName("[graph]");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    node61.setOwner(graph72);
    node61.setOwnerName("hi!");
    graph51.addNode(node61);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerNameDirectly("");
    graph42.addNode(node61);
    node61.setOwnerNameDirectly("[graph]");
    graph21.addNode(node61);
    node61.setOwnerName("");
    node61.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node61.getDegree();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test004"); }


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
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
    node36.setOwner(graph47);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node36.setOwner(graph56);
    node36.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node36);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test005"); }


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
    node1.setOwnerNameDirectly("");
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
    graph54.init();
    graph54.setName("hi!");
    graph54.init();
    node1.setOwner(graph54);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    graph74.setName("hi!");
    node63.setOwner(graph74);
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    node63.setOwner(graph83);
    graph83.name = "";
    graph83.setName("hi!");
    node1.setOwner(graph83);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test006"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    graph7.setName("");
    graph7.setName("[graph]");
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
    graph7.addNode(node17);
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    graph36.setName("");
    node17.setOwner(graph36);
    node17.setOwnerName("");
    node17.setOwnerNameDirectly("");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    graph49.setName("");
    graph49.setName("[graph]");
    graph49.init();
    node17.setOwner(graph49);
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerNameDirectly("[graph]");
    node61.setOwnerName("hi!");
    node61.setOwnerName("hi!");
    node61.setOwnerNameDirectly("[graph]");
    graph49.addNode(node61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph0.getDegree(node61);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test007"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    graph0.name = "";
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
    node10.setOwnerNameDirectly("[graph]");
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    graph30.setName("hi!");
    graph30.setName("[graph]");
    graph30.name = "[graph]";
    node10.setOwner(graph30);
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
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    graph72.setName("");
    node53.setOwner(graph72);
    graph30.addNode(node53);
    node53.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph0.getDegree(node53);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test008"); }


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
    node13.setOwnerName("[graph]");
    node13.setOwnerNameDirectly("[graph]");
    node13.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test009"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test010"); }


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
    node10.setOwnerNameDirectly("[graph]");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    graph51.name = "hi!";
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
    node56.setOwnerNameDirectly("hi!");
    graph51.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node56);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test011"); }


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
    node21.setOwnerNameDirectly("[graph]");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    node65.setOwner(graph76);
    graph76.setName("[graph]");
    node21.setOwner(graph76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test012"); }


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
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerName("");
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test013"); }


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
    node1.setOwnerNameDirectly("[graph]");
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
    node30.setOwnerName("");
    node30.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node30);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test014"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    graph7.setName("");
    graph7.setName("[graph]");
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
    graph7.addNode(node17);
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    graph36.setName("");
    node17.setOwner(graph36);
    node17.setOwnerName("");
    node17.setOwnerNameDirectly("[graph]");
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
    node50.setOwnerNameDirectly("hi!");
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
    graph74.init();
    graph74.name = "";
    node50.setOwner(graph74);
    Graph graph81 = Graph.generateGraph();
    graph81.name = "";
    graph81.setName("");
    node50.setOwner(graph81);
    node17.setOwner(graph81);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node17);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test015"); }


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
    node30.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test016"); }


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
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node55.getDegree();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test017"); }


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
    node1.setOwnerNameDirectly("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerName("");
    Graph graph25 = new Graph();
    java.lang.String str26 = graph25.name;
    node16.setOwner(graph25);
    graph25.init();
    graph25.name = "";
    node1.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test018"); }


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
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerNameDirectly("");
    node18.setOwnerName("[graph]");
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = node18.getDegree();

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test019"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = node1.getDegree();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test020"); }


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
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = node1.getDegree();

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test021"); }


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
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test022"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.init();
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
    graph8.addNode(node17);
    node17.setOwnerName("[graph]");
    graph0.addNode(node17);
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
    node47.setOwnerNameDirectly("[graph]");
    node47.setOwnerName("hi!");
    node47.setOwnerNameDirectly("");
    graph0.addNode(node47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = node47.getDegree();

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test023"); }


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
    node16.setOwnerName("[graph]");
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node16);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test024"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    graph0.setName("[graph]");
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
    graph0.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test025"); }


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
    graph36.addNode(node49);
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    node49.setOwner(graph67);
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    graph71.setName("[graph]");
    node49.setOwner(graph71);
    java.lang.String str78 = graph71.name;
    graph71.init();
    graph71.setName("[graph]");
    node7.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test026"); }


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
    node7.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test027"); }


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
    node10.setOwnerNameDirectly("");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    graph45.setName("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    node52.setOwner(graph63);
    node52.setOwnerName("hi!");
    graph45.addNode(node52);
    graph42.addNode(node52);
    Graph graph70 = Graph.generateGraph();
    graph70.init();
    java.lang.String str72 = graph70.name;
    java.lang.String str73 = graph70.name;
    node52.setOwner(graph70);
    node52.setOwnerName("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    graph77.setName("");
    graph77.setName("[graph]");
    graph77.name = "";
    graph77.name = "";
    node52.setOwner(graph77);
    node10.setOwner(graph77);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = node10.getDegree();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test028"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = node10.getDegree();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test029"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test030"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    graph14.name = "";
    graph14.setName("");
    node1.setOwner(graph14);
    node1.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    node26.setOwnerName("[graph]");
    node26.setOwnerName("");
    node26.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node26);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test031"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "";
    graph0.init();
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    graph7.setName("");
    graph7.setName("[graph]");
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
    graph7.addNode(node17);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerNameDirectly("");
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    graph45.setName("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    node52.setOwner(graph63);
    node52.setOwnerName("hi!");
    graph45.addNode(node52);
    graph42.addNode(node52);
    graph42.name = "";
    graph42.setName("");
    java.lang.String str74 = graph42.name;
    graph42.setName("[graph]");
    node17.setOwner(graph42);
    Graph graph78 = new Graph();
    java.lang.String str79 = graph78.name;
    graph78.init();
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    node82.setOwnerNameDirectly("hi!");
    node82.setOwnerNameDirectly("[graph]");
    graph78.addNode(node82);
    graph78.init();
    graph78.init();
    node17.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph0.getDegree(node17);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test032"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test033"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    graph14.name = "";
    graph14.setName("");
    node1.setOwner(graph14);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test034"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.setName("");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.setName("[graph]");
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
    node18.setOwnerName("hi!");
    graph8.addNode(node18);
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    graph37.setName("");
    node18.setOwner(graph37);
    node18.setOwnerName("");
    node18.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = graph0.getDegree(node18);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test035"); }


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
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("");
    node16.setOwnerName("[graph]");
    node16.setOwnerName("");
    node16.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node16);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test036"); }


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
    graph10.setName("[graph]");
    graph10.init();
    java.lang.String str21 = graph10.name;
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    graph22.setName("");
    graph22.setName("[graph]");
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
    graph22.addNode(node32);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    graph51.setName("");
    node32.setOwner(graph51);
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node32.setOwner(graph62);
    node32.setOwnerNameDirectly("[graph]");
    node32.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph10.getDegree(node32);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test037"); }


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
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    java.lang.String str49 = graph43.name;
    graph43.init();
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
    graph43.addNode(node59);
    node59.setOwnerName("[graph]");
    node59.setOwnerName("");
    node59.setOwnerName("");
    graph34.addNode(node59);
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    graph79.setName("");
    graph79.init();
    graph79.name = "[graph]";
    node59.setOwner(graph79);
    node1.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node1.getDegree();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test038"); }


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
    graph13.init();
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
    graph13.addNode(node22);
    graph13.setName("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    java.lang.String str53 = graph51.name;
    node42.setOwner(graph51);
    graph13.addNode(node42);
    node42.setOwnerName("");
    node42.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node42);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test039"); }


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
    Node node69 = new Node("");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    graph70.setName("");
    node69.setOwner(graph70);
    node69.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node69);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test040"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node10.getDegree();

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test041"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
    java.lang.String str5 = graph0.name;
    java.lang.String str6 = graph0.name;
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
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    graph42.setName("[graph]");
    graph42.name = "";
    graph42.name = "";
    graph42.name = "hi!";
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
    node58.setOwnerNameDirectly("[graph]");
    graph42.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node25, node58);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test042"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    graph2.setName("");
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
    node21.setOwnerNameDirectly("hi!");
    graph2.addNode(node21);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    graph36.addNode(node44);
    graph2.addNode(node44);
    node44.setOwnerName("[graph]");
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test043"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test044"); }


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
    graph42.setName("[graph]");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    node52.setOwner(graph63);
    node52.setOwnerName("hi!");
    graph42.addNode(node52);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerNameDirectly("");
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerNameDirectly("");
    node52.setOwnerNameDirectly("[graph]");
    node52.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.addEdge(node52);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test045"); }


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
    java.lang.String str47 = graph21.name;
    graph21.setName("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    graph50.setName("");
    graph50.name = "[graph]";
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
    node69.setOwnerNameDirectly("hi!");
    node69.setOwnerNameDirectly("");
    graph50.addNode(node69);
    node69.setOwnerNameDirectly("[graph]");
    node69.setOwnerName("[graph]");
    node69.setOwnerName("");
    node69.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph21.getDegree(node69);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test046"); }


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
    graph0.name = "";
    graph0.name = "";
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
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerNameDirectly("");
    node40.setOwnerName("");
    node40.setOwnerNameDirectly("[graph]");
    node40.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = graph0.getDegree(node40);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test047"); }


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
    node9.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test048"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.init();
    graph0.setName("[graph]");
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
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    node30.setOwner(graph48);
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
    graph62.name = "";
    java.lang.String str67 = graph62.name;
    node30.setOwner(graph62);
    node30.setOwnerNameDirectly("");
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
    node72.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node30, node72);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test049"); }


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
    int i21 = node1.getDegree();

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test050"); }


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
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    java.lang.String str53 = graph51.name;
    java.lang.String str54 = graph51.name;
    graph51.init();
    java.lang.String str56 = graph51.name;
    graph51.name = "[graph]";
    node1.setOwner(graph51);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node1.getDegree();

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test051"); }


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
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    node24.setOwnerName("[graph]");
    node24.setOwnerName("");
    node24.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node24);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test052"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test053"); }


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
    node1.setOwnerName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    graph45.name = "hi!";
    node1.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test054"); }


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
    java.lang.String str21 = graph0.name;
    java.lang.String str22 = graph0.name;
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    node24.setOwner(graph35);
    graph0.addNode(node24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test055"); }


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
    node22.setOwnerNameDirectly("");
    node22.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node22.getDegree();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test056"); }


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
    graph21.setName("hi!");
    graph21.name = "";
    graph21.name = "";
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
    graph34.addNode(node48);
    node48.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph21.getDegree(node48);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test057"); }


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
    node55.setOwnerNameDirectly("[graph]");
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    java.lang.String str77 = graph71.name;
    graph71.init();
    graph71.setName("");
    node55.setOwner(graph71);
    node55.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node55.getDegree();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test058"); }


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
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    graph40.addNode(node48);
    node48.setOwnerNameDirectly("hi!");
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
    graph72.name = "";
    graph72.setName("hi!");
    node48.setOwner(graph72);
    graph13.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test059"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    graph11.setName("");
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("[graph]");
    graph0.addNode(node10);
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = node10.getDegree();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test060"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
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
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerNameDirectly("");
    node24.setOwnerNameDirectly("[graph]");
    node24.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node24);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test061"); }


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
    java.lang.String str20 = graph0.name;
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
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    node46.setOwner(graph64);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.setName("[graph]");
    node46.setOwner(graph68);
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    graph77.name = "hi!";
    Node node86 = new Node("");
    graph77.addNode(node86);
    node46.setOwner(graph77);
    graph0.addNode(node46);
    node46.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = node46.getDegree();

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test062"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    java.lang.String str3 = graph0.name;
    java.lang.String str4 = graph0.name;
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    graph5.setName("");
    graph5.setName("[graph]");
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
    graph5.addNode(node15);
    node15.setOwnerNameDirectly("[graph]");
    graph0.addNode(node15);
    node15.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node15.thisIsNotCalled();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test063"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test064"); }


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
    java.lang.String str64 = graph53.name;
    java.lang.String str65 = graph53.name;
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    graph66.setName("");
    graph66.setName("");
    graph66.init();
    graph66.name = "";
    Node node79 = new Node("");
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    java.lang.String str88 = graph82.name;
    graph82.init();
    node79.setOwner(graph82);
    graph66.addNode(node79);
    node79.setOwnerName("[graph]");
    node79.setOwnerNameDirectly("[graph]");
    node79.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph53.getDegree(node79);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test065"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node1.getDegree();

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test066"); }


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
    node14.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node14.getDegree();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test067"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    graph2.setName("");
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
    node21.setOwnerNameDirectly("hi!");
    graph2.addNode(node21);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    graph36.addNode(node44);
    graph2.addNode(node44);
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.setName("[graph]");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.init();
    node67.setOwner(graph78);
    node67.setOwnerName("hi!");
    graph57.addNode(node67);
    Node node85 = new Node("hi!");
    Graph graph86 = Graph.generateGraph();
    graph86.setName("");
    graph86.init();
    java.lang.String str90 = graph86.name;
    node85.setOwner(graph86);
    graph86.setName("");
    node67.setOwner(graph86);
    node67.setOwnerName("");
    node67.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.addEdge(node67);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test068"); }


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
    graph0.setName("[graph]");
    graph0.init();
    graph0.name = "[graph]";
    java.lang.String str33 = graph0.name;
    graph0.setName("[graph]");
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
    node37.setOwnerName("");
    node37.setOwnerName("hi!");
    node37.setOwnerName("");
    node37.setOwnerName("");
    node37.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph0.getDegree(node37);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test069"); }


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
    java.lang.String str94 = graph87.name;
    graph87.init();
    node10.setOwner(graph87);
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = node10.getDegree();

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test070"); }


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
    node14.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node14.getDegree();

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test071"); }


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
    node12.setOwnerName("");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.setName("hi!");
    node12.setOwner(graph23);
    node12.setOwnerName("hi!");
    node12.setOwnerName("hi!");
    node12.setOwnerName("hi!");
    node12.setOwnerNameDirectly("hi!");
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
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node39.setOwner(graph59);
    graph59.name = "";
    node12.setOwner(graph59);
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.name = "";
    graph69.name = "hi!";
    node12.setOwner(graph69);
    graph2.addNode(node12);
    node12.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node12.getDegree();

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test072"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
    java.lang.String str5 = graph0.name;
    graph0.name = "hi!";
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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.init();
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
    graph25.addNode(node34);
    graph25.setName("hi!");
    graph25.name = "";
    graph25.setName("");
    graph25.setName("[graph]");
    node9.setOwner(graph25);
    node9.setOwnerNameDirectly("");
    graph0.addNode(node9);
    node9.setOwnerNameDirectly("[graph]");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    graph65.name = "";
    Node node78 = new Node("");
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    java.lang.String str87 = graph81.name;
    graph81.init();
    node78.setOwner(graph81);
    graph65.addNode(node78);
    node78.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.addEdge(node78);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test073"); }


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
    graph0.setName("[graph]");
    graph0.init();
    java.lang.String str31 = graph0.name;
    graph0.name = "hi!";
    graph0.name = "[graph]";
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
    node37.setOwnerNameDirectly("[graph]");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.setName("hi!");
    graph57.setName("[graph]");
    graph57.name = "[graph]";
    node37.setOwner(graph57);
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    graph70.setName("");
    graph70.init();
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
    node79.setOwnerName("hi!");
    graph70.addNode(node79);
    node79.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node37, node79);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test074"); }


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
    Graph graph26 = Graph.generateGraph();
    graph26.name = "hi!";
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
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    graph76.setName("[graph]");
    node54.setOwner(graph76);
    node54.setOwnerName("");
    graph26.addNode(node54);
    node1.setOwner(graph26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test075"); }


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
    graph0.setName("hi!");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.init();
    graph57.init();
    node46.setOwner(graph57);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    graph0.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node46.getDegree();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test076"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    graph2.name = "hi!";
    graph2.setName("");
    graph2.setName("[graph]");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("");
    graph17.init();
    graph17.name = "";
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    java.lang.String str39 = graph33.name;
    graph33.init();
    node30.setOwner(graph33);
    graph17.addNode(node30);
    node30.setOwnerName("[graph]");
    graph2.addNode(node30);
    Graph graph46 = new Graph();
    java.lang.String str47 = graph46.name;
    graph46.init();
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerNameDirectly("[graph]");
    graph46.addNode(node50);
    node50.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("[graph]");
    node50.setOwner(graph64);
    node50.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph2.getDegree(node50);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test077"); }


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
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    graph29.setName("hi!");
    node18.setOwner(graph29);
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node18.setOwner(graph38);
    graph38.name = "";
    graph38.name = "hi!";
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    graph49.setName("hi!");
    graph49.name = "";
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.init();
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
    graph57.addNode(node66);
    node66.setOwnerName("[graph]");
    graph49.addNode(node66);
    graph38.addNode(node66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node66);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test078"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    graph2.name = "hi!";
    graph2.setName("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("[graph]");
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
    graph14.addNode(node24);
    Graph graph42 = Graph.generateGraph();
    graph42.init();
    java.lang.String str44 = graph42.name;
    java.lang.String str45 = graph42.name;
    node24.setOwner(graph42);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
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
    graph47.addNode(node54);
    graph47.setName("[graph]");
    graph47.name = "[graph]";
    node24.setOwner(graph47);
    node24.setOwnerName("[graph]");
    node24.setOwnerName("hi!");
    node24.setOwnerName("hi!");
    node24.setOwnerName("hi!");
    node24.setOwnerNameDirectly("hi!");
    graph2.addNode(node24);
    node24.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test079"); }


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
    Graph graph80 = Graph.generateGraph();
    graph80.setName("[graph]");
    node10.setOwner(graph80);
    Graph graph84 = Graph.generateGraph();
    graph84.setName("");
    graph84.name = "";
    graph84.name = "hi!";
    graph84.setName("");
    node10.setOwner(graph84);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = node10.getDegree();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test080"); }


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
    graph61.setName("[graph]");
    graph61.name = "[graph]";
    node38.setOwner(graph61);
    node38.setOwnerName("[graph]");
    graph21.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node38.getDegree();

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test081"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("[graph]");
    node9.setOwnerName("hi!");
    graph2.addNode(node9);
    graph2.setName("");
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
    node26.setOwnerName("[graph]");
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
    graph52.setName("");
    graph52.setName("");
    graph52.name = "";
    graph52.init();
    node26.setOwner(graph52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph2.getDegree(node26);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test082"); }


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
    graph42.setName("[graph]");
    graph42.name = "[graph]";
    java.lang.String str50 = graph42.name;
    java.lang.String str51 = graph42.name;
    node19.setOwner(graph42);
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    node54.setOwnerName("[graph]");
    node54.setOwnerName("[graph]");
    node54.setOwnerName("");
    node54.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.addEdge(node54);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test083"); }


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
    node25.setOwnerName("[graph]");
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test084"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.setName("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("[graph]");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    graph11.setName("hi!");
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
    node18.setOwnerName("hi!");
    graph11.addNode(node18);
    graph8.addNode(node18);
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    java.lang.String str38 = graph36.name;
    java.lang.String str39 = graph36.name;
    node18.setOwner(graph36);
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
    graph41.setName("[graph]");
    graph41.name = "[graph]";
    node18.setOwner(graph41);
    node18.setOwnerName("[graph]");
    node18.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph0.getDegree(node18);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test085"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerName("");
    Graph graph14 = new Graph();
    java.lang.String str15 = graph14.name;
    node5.setOwner(graph14);
    node5.setOwnerNameDirectly("hi!");
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.thisIsNotCalled();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test086"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test087"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test088"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerName("");
    Graph graph14 = new Graph();
    java.lang.String str15 = graph14.name;
    node5.setOwner(graph14);
    node5.setOwnerNameDirectly("hi!");
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("");
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerNameDirectly("");
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
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.addEdge(node27);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test089"); }


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
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("[graph]");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    node51.setOwner(graph62);
    node51.setOwnerName("hi!");
    graph41.addNode(node51);
    node19.setOwner(graph41);
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    node70.setOwnerNameDirectly("hi!");
    node70.setOwnerNameDirectly("");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    graph81.setName("");
    graph81.setName("");
    node70.setOwner(graph81);
    node70.setOwnerName("");
    node70.setOwnerName("");
    node70.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph41.getDegree(node70);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test090"); }


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
    graph10.init();
    graph10.name = "[graph]";
    Graph graph19 = new Graph();
    java.lang.String str20 = graph19.name;
    graph19.init();
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("[graph]");
    graph19.addNode(node23);
    node23.setOwnerName("");
    node23.setOwnerName("hi!");
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
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    graph54.setName("[graph]");
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
    graph54.addNode(node64);
    graph51.addNode(node64);
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    node64.setOwner(graph82);
    node64.setOwnerName("hi!");
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node23, node64);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test091"); }


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
    graph0.init();
    graph0.setName("hi!");
    graph0.setName("[graph]");
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
    node35.setOwnerName("");
    node35.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph0.getDegree(node35);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test092"); }


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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("");
    graph25.init();
    graph25.setName("[graph]");
    graph25.name = "";
    graph25.init();
    node1.setOwner(graph25);
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    java.lang.String str43 = graph41.name;
    graph41.setName("");
    node1.setOwner(graph41);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
    graph47.init();
    node1.setOwner(graph47);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = node1.getDegree();

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test093"); }


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
    int i21 = node1.getDegree();

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test094"); }


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
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    graph36.addNode(node44);
    java.lang.String str56 = graph36.name;
    graph36.name = "";
    node10.setOwner(graph36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test095"); }


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
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node25.getDegree();

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test096"); }


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
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("[graph]");
    java.lang.String str37 = graph31.name;
    node10.setOwner(graph31);
    graph31.init();
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
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    node50.setOwner(graph69);
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node50.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph31.getDegree(node50);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test097"); }


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
    node1.setOwnerNameDirectly("[graph]");
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    node31.setOwner(graph32);
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
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
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    graph73.setName("");
    node54.setOwner(graph73);
    Node node83 = new Node("hi!");
    Graph graph84 = Graph.generateGraph();
    graph84.setName("");
    graph84.init();
    java.lang.String str88 = graph84.name;
    node83.setOwner(graph84);
    node54.setOwner(graph84);
    node54.setOwnerNameDirectly("[graph]");
    graph40.addNode(node54);
    node31.setOwner(graph40);
    node31.setOwnerName("[graph]");
    node31.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node31);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test098"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test099"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.name = "";
    graph0.setName("");
    java.lang.String str14 = graph0.name;
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
    node16.setOwnerName("hi!");
    node16.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = graph0.getDegree(node16);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test100"); }


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
    Graph graph23 = Graph.generateGraph();
    graph23.name = "hi!";
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
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("[graph]");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    node51.setOwner(graph62);
    node51.setOwnerName("hi!");
    graph41.addNode(node51);
    graph38.addNode(node51);
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    node51.setOwner(graph69);
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    graph73.setName("[graph]");
    node51.setOwner(graph73);
    node51.setOwnerName("");
    graph23.addNode(node51);
    node51.setOwnerNameDirectly("");
    node51.setOwnerNameDirectly("hi!");
    graph12.addNode(node51);
    node51.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node51.thisIsNotCalled();

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test101"); }


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
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("[graph]");
    java.lang.String str37 = graph31.name;
    node10.setOwner(graph31);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test102"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test103"); }


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
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test104"); }


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
    node14.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test105"); }


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
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    graph40.init();
    graph40.init();
    node29.setOwner(graph40);
    node29.setOwnerNameDirectly("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerName("");
    Graph graph61 = new Graph();
    java.lang.String str62 = graph61.name;
    node52.setOwner(graph61);
    graph61.setName("");
    graph61.setName("");
    graph61.name = "hi!";
    node29.setOwner(graph61);
    java.lang.String str71 = graph61.name;
    graph61.init();
    node1.setOwner(graph61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node1.getDegree();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test106"); }


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
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "hi!";
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
    node31.setOwnerNameDirectly("hi!");
    Graph graph53 = new Graph();
    java.lang.String str54 = graph53.name;
    graph53.init();
    node31.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = graph0.getDegree(node31);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test107"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Graph graph11 = Graph.generateGraph();
    graph11.setName("[graph]");
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
    graph11.addNode(node21);
    node21.setOwnerName("[graph]");
    node21.setOwnerName("hi!");
    node21.setOwnerName("");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.init();
    graph57.init();
    node46.setOwner(graph57);
    node21.setOwner(graph57);
    node21.setOwnerNameDirectly("hi!");
    graph2.addNode(node21);
    node21.setOwnerName("hi!");
    node21.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node21.getDegree();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test108"); }


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
    java.lang.String str73 = graph66.name;
    graph66.name = "hi!";
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node77.setOwnerName("");
    Graph graph86 = Graph.generateGraph();
    graph86.init();
    java.lang.String str88 = graph86.name;
    node77.setOwner(graph86);
    node77.setOwnerNameDirectly("[graph]");
    node77.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph66.getDegree(node77);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test109"); }


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
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
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
    node42.setOwnerName("");
    node42.setOwnerNameDirectly("[graph]");
    graph0.addNode(node42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node42.getDegree();

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test110"); }


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
    node4.setOwnerNameDirectly("");
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
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    java.lang.String str49 = graph43.name;
    graph43.name = "";
    node19.setOwner(graph43);
    node19.setOwnerNameDirectly("");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.init();
    graph57.init();
    node19.setOwner(graph57);
    graph57.init();
    graph57.setName("");
    node4.setOwner(graph57);
    node4.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test111"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test112"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test113"); }


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
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test114"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
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
    node20.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    graph46.addNode(node54);
    java.lang.String str66 = graph46.name;
    graph46.name = "";
    node20.setOwner(graph46);
    graph0.addNode(node20);
    node20.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node20.thisIsNotCalled();

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test115"); }


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
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    graph31.init();
    graph31.init();
    node20.setOwner(graph31);
    graph31.name = "";
    graph31.name = "[graph]";
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    java.lang.String str52 = graph46.name;
    graph46.init();
    graph46.name = "hi!";
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
    node57.setOwnerName("[graph]");
    node57.setOwnerName("[graph]");
    graph46.addNode(node57);
    graph31.addNode(node57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node57);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test116"); }


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
    Graph graph14 = Graph.generateGraph();
    graph14.setName("[graph]");
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
    graph14.addNode(node24);
    graph14.name = "";
    graph14.name = "";
    graph14.name = "[graph]";
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    graph48.setName("");
    graph48.setName("[graph]");
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
    graph48.addNode(node58);
    node58.setOwnerNameDirectly("[graph]");
    node58.setOwnerName("hi!");
    node58.setOwnerNameDirectly("");
    node58.setOwnerNameDirectly("hi!");
    graph14.addNode(node58);
    graph10.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = node58.getDegree();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test117"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    graph2.name = "hi!";
    graph2.setName("[graph]");
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
    node25.setOwnerNameDirectly("[graph]");
    graph2.addNode(node25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test118"); }


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
    node18.setOwnerNameDirectly("");
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
    graph35.name = "[graph]";
    graph35.init();
    node18.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node18.getDegree();

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test119"); }


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
    node48.setOwnerNameDirectly("[graph]");
    node48.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test120"); }


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
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    graph29.setName("");
    graph29.init();
    graph29.name = "[graph]";
    graph29.init();
    node10.setOwner(graph29);
    graph29.name = "[graph]";
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    node44.setOwner(graph55);
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    graph72.init();
    graph72.init();
    node61.setOwner(graph72);
    graph72.name = "";
    graph72.init();
    graph72.name = "hi!";
    node44.setOwner(graph72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph29.getDegree(node44);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test121"); }


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
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    graph49.name = "hi!";
    java.lang.String str57 = graph49.name;
    graph49.name = "hi!";
    node10.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node10.getDegree();

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test122"); }


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
    node13.setOwnerName("[graph]");
    node13.setOwnerName("");
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
    node31.setOwner(graph42);
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
    graph59.name = "";
    graph59.init();
    graph59.name = "hi!";
    node31.setOwner(graph59);
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    java.lang.String str82 = graph76.name;
    graph76.init();
    graph76.name = "hi!";
    graph76.name = "";
    node31.setOwner(graph76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node31);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test123"); }


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
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
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
    graph47.addNode(node54);
    node54.setOwnerName("[graph]");
    graph40.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node54.thisIsNotCalled();

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test124"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.name = "hi!";
    graph0.setName("hi!");
    graph0.setName("hi!");
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
    node23.setOwnerNameDirectly("[graph]");
    node23.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph0.getDegree(node23);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test125"); }


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
    graph0.init();
    graph0.setName("[graph]");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("");
    node34.setOwnerName("[graph]");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.name = "";
    graph47.setName("");
    node34.setOwner(graph47);
    node34.setOwnerNameDirectly("[graph]");
    graph0.addNode(node34);
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
    node69.setOwnerNameDirectly("hi!");
    node69.setOwnerNameDirectly("");
    node69.setOwnerNameDirectly("");
    node69.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node34.addEdge(node69);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test126"); }


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
    node10.setOwnerNameDirectly("");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("[graph]");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    graph45.setName("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    node52.setOwner(graph63);
    node52.setOwnerName("hi!");
    graph45.addNode(node52);
    graph42.addNode(node52);
    node52.setOwnerName("hi!");
    node52.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node52);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test127"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.name = "hi!";
    graph8.setName("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
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
    node29.setOwner(graph59);
    node29.setOwnerNameDirectly("[graph]");
    graph15.addNode(node29);
    graph8.addNode(node29);
    node1.setOwner(graph8);
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node1.getDegree();

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test128"); }


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
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node1.getDegree();

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test129"); }


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
    node8.setOwnerNameDirectly("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node25);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test130"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test131"); }


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
    node35.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test132"); }


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
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node28.getDegree();

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test133"); }


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
    node29.thisIsNotCalled();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test134"); }


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
    node10.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.init();
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
    graph35.addNode(node44);
    graph35.setName("hi!");
    graph35.name = "";
    graph35.setName("");
    graph35.setName("[graph]");
    graph35.name = "";
    node10.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = node10.getDegree();

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test135"); }


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
    int i52 = node1.getDegree();

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test136"); }


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
    graph10.init();
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
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    node27.setOwnerNameDirectly("");
    node27.setOwnerNameDirectly("hi!");
    graph10.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test137"); }


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
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node10.getDegree();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test138"); }


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
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.init();
    graph29.init();
    node18.setOwner(graph29);
    graph29.name = "";
    graph29.init();
    graph29.name = "hi!";
    node1.setOwner(graph29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test139"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    graph0.name = "";
    graph0.name = "";
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
    node16.setOwnerName("");
    node16.setOwnerName("hi!");
    node16.setOwnerName("");
    node16.setOwnerName("");
    node16.setOwnerName("[graph]");
    graph0.addNode(node16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node16.getDegree();

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test140"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.name = "hi!";
    Node node10 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = graph0.getDegree(node10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test141"); }


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
    node7.setOwnerNameDirectly("[graph]");
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
    java.lang.String str44 = graph38.name;
    graph38.init();
    graph38.name = "hi!";
    node27.setOwner(graph38);
    graph38.setName("[graph]");
    node7.setOwner(graph38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test142"); }


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
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test143"); }


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
    node11.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node11.getDegree();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test144"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test145"); }


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
    node18.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node18.getDegree();

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test146"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test147"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test148"); }


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
    node24.setOwnerNameDirectly("[graph]");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.init();
    node67.setOwner(graph78);
    node67.setOwnerName("hi!");
    node67.setOwnerName("[graph]");
    node67.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.addEdge(node67);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test149"); }


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
    Graph graph22 = Graph.generateGraph();
    graph22.name = "hi!";
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
    graph37.addNode(node50);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    node50.setOwner(graph68);
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    graph72.setName("[graph]");
    node50.setOwner(graph72);
    node50.setOwnerName("");
    graph22.addNode(node50);
    node1.setOwner(graph22);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = node1.getDegree();

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test150"); }


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
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    graph49.name = "hi!";
    java.lang.String str57 = graph49.name;
    graph49.name = "hi!";
    node10.setOwner(graph49);
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test151"); }


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
    graph10.setName("");
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
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.setName("[graph]");
    node47.setOwner(graph69);
    node47.setOwnerName("");
    node47.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph10.getDegree(node47);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test152"); }


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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("");
    graph25.init();
    graph25.setName("[graph]");
    graph25.name = "";
    graph25.init();
    node1.setOwner(graph25);
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    java.lang.String str43 = graph41.name;
    graph41.setName("");
    node1.setOwner(graph41);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
    graph47.init();
    node1.setOwner(graph47);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test153"); }


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
    graph0.init();
    graph0.name = "";
    graph0.init();
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerNameDirectly("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.setName("");
    node21.setOwner(graph32);
    node21.setOwnerName("");
    node21.setOwnerName("[graph]");
    graph0.addNode(node21);
    node21.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = node21.getDegree();

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test154"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test155"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    graph0.name = "";
    graph0.name = "hi!";
    Graph graph15 = Graph.generateGraph();
    graph15.setName("[graph]");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    graph18.setName("hi!");
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
    graph18.addNode(node25);
    graph15.addNode(node25);
    Graph graph43 = Graph.generateGraph();
    graph43.init();
    java.lang.String str45 = graph43.name;
    java.lang.String str46 = graph43.name;
    node25.setOwner(graph43);
    node25.setOwnerNameDirectly("[graph]");
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph0.getDegree(node25);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test156"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = node1.getDegree();

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test157"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
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
    node20.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    graph46.addNode(node54);
    java.lang.String str66 = graph46.name;
    graph46.name = "";
    node20.setOwner(graph46);
    graph0.addNode(node20);
    node20.setOwnerName("[graph]");
    node20.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node20.thisIsNotCalled();

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test158"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerName("");
    Graph graph14 = new Graph();
    java.lang.String str15 = graph14.name;
    node5.setOwner(graph14);
    node5.setOwnerNameDirectly("hi!");
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("");
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.thisIsNotCalled();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test159"); }


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
    node30.setOwnerName("[graph]");
    node30.setOwnerNameDirectly("");
    node30.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test160"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.name = "hi!";
    graph8.setName("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
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
    node29.setOwner(graph59);
    node29.setOwnerNameDirectly("[graph]");
    graph15.addNode(node29);
    graph8.addNode(node29);
    node1.setOwner(graph8);
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = node1.getDegree();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test161"); }


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
    graph0.setName("");
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
    int i65 = graph0.getDegree(node40);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test162"); }


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
    node28.setOwnerName("[graph]");
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("hi!");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.init();
    node67.setOwner(graph78);
    node67.setOwnerName("hi!");
    node67.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.addEdge(node67);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test163"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test164"); }


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
    node10.setOwnerName("[graph]");
    node10.setOwnerName("");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("[graph]");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    graph29.setName("");
    graph29.setName("[graph]");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("[graph]");
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
    graph38.addNode(node48);
    node48.setOwnerName("[graph]");
    node48.setOwnerName("hi!");
    graph29.addNode(node48);
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerName("");
    node72.setOwnerName("[graph]");
    node72.setOwnerName("[graph]");
    graph29.addNode(node72);
    node72.setOwnerName("[graph]");
    node72.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node10, node72);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test165"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    java.lang.String str3 = graph0.name;
    Graph graph4 = Graph.generateGraph();
    graph4.init();
    java.lang.String str6 = graph4.name;
    java.lang.String str7 = graph4.name;
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.setName("[graph]");
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
    node18.setOwnerName("hi!");
    graph8.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("");
    graph4.addNode(node18);
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
    node50.setOwnerNameDirectly("[graph]");
    node50.setOwnerName("");
    node50.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node18, node50);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test166"); }


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
    java.lang.String str32 = graph0.name;
    java.lang.String str33 = graph0.name;
    graph0.setName("");
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
    node37.setOwnerName("");
    node37.setOwnerName("hi!");
    node37.setOwnerName("");
    node37.setOwnerName("");
    graph0.addNode(node37);
    node37.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node37.getDegree();

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test167"); }


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
    node1.setOwnerNameDirectly("[graph]");
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
    node21.setOwnerName("[graph]");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerName("");
    Graph graph47 = new Graph();
    java.lang.String str48 = graph47.name;
    node38.setOwner(graph47);
    graph47.setName("");
    graph47.setName("");
    graph47.name = "";
    graph47.init();
    node21.setOwner(graph47);
    node1.setOwner(graph47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test168"); }


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
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("hi!");
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
    graph83.init();
    graph83.init();
    java.lang.String str88 = graph83.name;
    node55.setOwner(graph83);
    node55.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test169"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test170"); }


    Graph graph0 = Graph.generateGraph();
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
    node11.setOwnerName("");
    node11.setOwnerNameDirectly("");
    node11.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = graph0.getDegree(node11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test171"); }


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
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test172"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    graph7.setName("hi!");
    graph7.name = "";
    graph7.setName("[graph]");
    Node node18 = new Node("");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("[graph]");
    graph7.addNode(node18);
    graph0.addNode(node18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node18.getDegree();

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test173"); }


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
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node10.getDegree();

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test174"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Graph graph11 = Graph.generateGraph();
    graph11.setName("[graph]");
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
    graph11.addNode(node21);
    node21.setOwnerName("[graph]");
    node21.setOwnerName("hi!");
    node21.setOwnerName("");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.init();
    graph57.init();
    node46.setOwner(graph57);
    node21.setOwner(graph57);
    node21.setOwnerNameDirectly("hi!");
    graph2.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node21.getDegree();

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test175"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test176"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test177"); }


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
    node1.setOwnerNameDirectly("");
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
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    graph66.setName("[graph]");
    node44.setOwner(graph66);
    node44.setOwnerName("");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    graph75.setName("");
    graph75.setName("");
    graph75.init();
    graph75.setName("[graph]");
    graph75.name = "";
    node44.setOwner(graph75);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node44);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test178"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.init();
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerName("");
    node12.setOwnerNameDirectly("");
    node12.setOwnerNameDirectly("[graph]");
    graph0.addNode(node12);
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerNameDirectly("");
    node29.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node12.addEdge(node29);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test179"); }


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
    graph10.setName("[graph]");
    graph10.init();
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
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("hi!");
    node31.setOwnerNameDirectly("");
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerNameDirectly("");
    graph10.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test180"); }


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
    node7.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node7.getDegree();

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test181"); }


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
    graph12.init();
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    graph26.setName("");
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
    node35.setOwnerNameDirectly("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    java.lang.String str65 = graph59.name;
    graph59.name = "";
    node35.setOwner(graph59);
    node35.setOwnerNameDirectly("hi!");
    graph26.addNode(node35);
    graph12.addNode(node35);
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
    node74.setOwnerNameDirectly("[graph]");
    graph12.addNode(node74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node74.thisIsNotCalled();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test182"); }


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
    graph21.setName("hi!");
    java.lang.String str32 = graph21.name;
    Graph graph33 = new Graph();
    java.lang.String str34 = graph33.name;
    graph33.init();
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerNameDirectly("[graph]");
    graph33.addNode(node37);
    node37.setOwnerName("");
    node37.setOwnerName("[graph]");
    node37.setOwnerNameDirectly("");
    graph21.addNode(node37);
    node37.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node37.getDegree();

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test183"); }


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
    graph0.setName("");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.name = "hi!";
    graph23.name = "";
    java.lang.String str31 = graph23.name;
    graph23.init();
    graph23.name = "";
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    graph35.addNode(node43);
    graph35.init();
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerName("");
    node57.setOwnerName("[graph]");
    node57.setOwnerName("");
    graph35.addNode(node57);
    node57.setOwnerNameDirectly("");
    graph23.addNode(node57);
    graph0.addNode(node57);
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    node78.setOwnerNameDirectly("hi!");
    node78.setOwnerName("hi!");
    node78.setOwnerName("");
    node78.setOwnerName("hi!");
    node78.setOwnerNameDirectly("");
    node78.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph0.getDegree(node78);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test184"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
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
    graph2.addNode(node14);
    node14.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test185"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
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
    graph20.addNode(node33);
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerName("");
    Graph graph61 = new Graph();
    java.lang.String str62 = graph61.name;
    node52.setOwner(graph61);
    graph61.setName("");
    graph61.name = "hi!";
    graph61.init();
    node33.setOwner(graph61);
    node33.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph0.getDegree(node33);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test186"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    graph0.name = "";
    Node node6 = new Node("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    node6.setOwner(graph7);
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerName("");
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
    java.lang.String str34 = graph28.name;
    graph28.init();
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    graph36.addNode(node44);
    graph28.addNode(node44);
    node44.setOwnerName("[graph]");
    node44.setOwnerName("");
    node44.setOwnerName("");
    graph19.addNode(node44);
    node44.setOwnerName("hi!");
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node6, node44);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test187"); }


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
    Graph graph45 = Graph.generateGraph();
    node25.setOwner(graph45);
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
    node48.setOwnerName("");
    node48.setOwnerNameDirectly("");
    graph45.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test188"); }


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
    graph45.name = "";
    graph45.setName("[graph]");
    graph45.name = "[graph]";
    graph45.setName("[graph]");
    node10.setOwner(graph45);
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test189"); }


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
    graph13.init();
    graph13.init();
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.init();
    graph54.init();
    node43.setOwner(graph54);
    node43.setOwnerNameDirectly("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerName("");
    Graph graph75 = new Graph();
    java.lang.String str76 = graph75.name;
    node66.setOwner(graph75);
    graph75.setName("");
    graph75.setName("");
    graph75.name = "hi!";
    node43.setOwner(graph75);
    node43.setOwnerNameDirectly("");
    node43.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph13.getDegree(node43);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test190"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node1.getDegree();

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test191"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test192"); }


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
    graph12.init();
    java.lang.String str17 = graph12.name;
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph12.getDegree(node19);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test193"); }


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
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    graph74.setName("");
    node55.setOwner(graph74);
    Node node84 = new Node("hi!");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    node84.setOwner(graph85);
    node55.setOwner(graph85);
    node55.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node55);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test194"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    graph16.init();
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
    graph16.addNode(node25);
    graph16.setName("hi!");
    graph16.setName("[graph]");
    Node node47 = new Node("");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    graph48.setName("");
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("[graph]");
    node47.setOwnerName("");
    graph16.addNode(node47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node47);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test195"); }


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
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    graph55.setName("");
    node36.setOwner(graph55);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node36.setOwner(graph66);
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    graph75.name = "hi!";
    java.lang.String str83 = graph75.name;
    graph75.name = "hi!";
    node36.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node36);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test196"); }


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
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerNameDirectly("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    graph33.setName("");
    node22.setOwner(graph33);
    node22.setOwnerName("");
    node22.setOwnerName("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    graph47.setName("[graph]");
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
    graph47.addNode(node57);
    node22.setOwner(graph47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = graph10.getDegree(node22);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test197"); }


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
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    graph42.name = "[graph]";
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    graph51.setName("[graph]");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    node61.setOwner(graph72);
    node61.setOwnerName("hi!");
    graph51.addNode(node61);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerNameDirectly("");
    graph42.addNode(node61);
    node61.setOwnerNameDirectly("[graph]");
    graph21.addNode(node61);
    node61.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node61.thisIsNotCalled();

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test198"); }


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
    graph2.init();
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("[graph]");
    node43.setOwnerName("hi!");
    graph36.addNode(node43);
    graph2.addNode(node43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node43.thisIsNotCalled();

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test199"); }


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
    graph52.setName("");
    graph52.setName("");
    graph52.name = "";
    node30.setOwner(graph52);
    node30.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node30.getDegree();

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test200"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test201"); }


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
    int i35 = node10.getDegree();

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test202"); }


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
    Graph graph18 = Graph.generateGraph();
    graph18.setName("[graph]");
    node4.setOwner(graph18);
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    graph22.setName("");
    graph22.setName("[graph]");
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
    graph22.addNode(node32);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    graph51.setName("");
    node32.setOwner(graph51);
    node32.setOwnerName("");
    node32.setOwnerNameDirectly("");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    graph64.setName("[graph]");
    graph64.init();
    node32.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.addEdge(node32);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test203"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = node1.getDegree();

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test204"); }


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
    node1.setOwnerName("[graph]");
    Graph graph25 = Graph.generateGraph();
    graph25.init();
    java.lang.String str27 = graph25.name;
    java.lang.String str28 = graph25.name;
    graph25.init();
    java.lang.String str30 = graph25.name;
    graph25.name = "hi!";
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
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    graph50.setName("");
    graph50.init();
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
    graph50.addNode(node59);
    graph50.setName("hi!");
    graph50.name = "";
    graph50.setName("");
    graph50.setName("[graph]");
    node34.setOwner(graph50);
    node34.setOwnerNameDirectly("");
    graph25.addNode(node34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node34);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test205"); }


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
    node28.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test206"); }


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
    node21.setOwnerNameDirectly("[graph]");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    node65.setOwner(graph76);
    graph76.setName("[graph]");
    node21.setOwner(graph76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node21.getDegree();

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test207"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("");

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test208"); }


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
    java.lang.String str16 = graph0.name;
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
    node26.setOwnerNameDirectly("");
    node26.setOwnerName("[graph]");
    node26.setOwnerName("");
    node26.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = graph0.getDegree(node26);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test209"); }


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
    Graph graph19 = Graph.generateGraph();
    graph19.name = "hi!";
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
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.setName("[graph]");
    node47.setOwner(graph69);
    node47.setOwnerName("");
    graph19.addNode(node47);
    node47.setOwnerName("[graph]");
    node47.setOwnerName("[graph]");
    node47.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node47);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test210"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    graph14.setName("");
    graph14.setName("[graph]");
    graph14.name = "";
    java.lang.String str25 = graph14.name;
    graph14.setName("[graph]");
    graph14.name = "";
    graph14.init();
    graph14.name = "";
    graph14.init();
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    graph46.setName("");
    node35.setOwner(graph46);
    node35.setOwnerName("");
    node35.setOwnerName("[graph]");
    graph14.addNode(node35);
    graph14.name = "hi!";
    graph14.init();
    node1.setOwner(graph14);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test211"); }


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
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node55.getDegree();

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test212"); }


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
    graph21.setName("hi!");
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
    node33.setOwnerName("hi!");
    node33.setOwnerName("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.setName("");
    graph57.init();
    graph57.setName("[graph]");
    graph57.name = "";
    graph57.init();
    node33.setOwner(graph57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph21.getDegree(node33);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test213"); }


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
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerNameDirectly("");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    graph53.setName("");
    node42.setOwner(graph53);
    node42.setOwnerName("");
    node42.setOwnerName("");
    node42.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph0.getDegree(node42);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test214"); }


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
    java.lang.String str18 = graph10.name;
    graph10.init();
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("");
    node21.setOwnerName("[graph]");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    graph34.name = "";
    graph34.setName("");
    node21.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = graph10.getDegree(node21);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test215"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = node1.getDegree();

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test216"); }


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
    node14.setOwnerNameDirectly("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("");
    node14.setOwner(graph25);
    graph2.addNode(node14);
    Graph graph36 = Graph.generateGraph();
    graph36.init();
    graph36.init();
    Graph graph39 = Graph.generateGraph();
    graph39.setName("[graph]");
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
    graph39.addNode(node49);
    node49.setOwnerName("[graph]");
    node49.setOwnerName("hi!");
    node49.setOwnerName("");
    graph36.addNode(node49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node49);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test217"); }


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
    node1.setOwnerNameDirectly("");
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
    node20.setOwnerNameDirectly("[graph]");
    node20.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test218"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    graph2.setName("");
    graph2.init();
    graph2.setName("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerNameDirectly("[graph]");
    node16.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = graph2.getDegree(node16);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test219"); }


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
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerName("");
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node8.getDegree();

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test220"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test221"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    java.lang.String str6 = graph0.name;
    Graph graph7 = new Graph();
    java.lang.String str8 = graph7.name;
    graph7.init();
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerNameDirectly("[graph]");
    graph7.addNode(node11);
    node11.setOwnerName("");
    node11.setOwnerName("[graph]");
    node11.setOwnerNameDirectly("");
    node11.setOwnerNameDirectly("[graph]");
    node11.setOwnerName("hi!");
    Node node34 = new Node("");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
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
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    graph78.setName("");
    node59.setOwner(graph78);
    graph45.addNode(node59);
    graph45.init();
    graph45.init();
    graph45.name = "[graph]";
    node34.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node11, node34);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test222"); }


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
    node28.setOwnerName("[graph]");
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test223"); }


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
    Graph graph78 = Graph.generateGraph();
    graph78.name = "";
    graph78.name = "";
    graph78.setName("hi!");
    graph78.name = "hi!";
    graph78.setName("hi!");
    graph78.setName("hi!");
    node55.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test224"); }


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
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    node56.setOwnerName("[graph]");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.name = "";
    graph69.setName("");
    node56.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node56);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test225"); }


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
    graph0.name = "[graph]";
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
    node35.setOwnerName("");
    node35.setOwnerNameDirectly("[graph]");
    graph0.addNode(node35);
    node35.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node35.getDegree();

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test226"); }


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
    Graph graph78 = Graph.generateGraph();
    graph78.name = "";
    graph78.name = "";
    graph78.setName("hi!");
    graph78.name = "hi!";
    graph78.setName("hi!");
    graph78.setName("hi!");
    node55.setOwner(graph78);
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = node55.getDegree();

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test227"); }


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
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("");
    graph56.init();
    graph56.setName("[graph]");
    graph56.name = "";
    node25.setOwner(graph56);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerNameDirectly("");
    node25.setOwnerName("hi!");
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = node25.getDegree();

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test228"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    graph7.setName("hi!");
    graph7.name = "";
    graph7.setName("[graph]");
    Node node18 = new Node("");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("[graph]");
    graph7.addNode(node18);
    graph0.addNode(node18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test229"); }


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
    int i93 = node25.getDegree();

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test230"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    Graph graph11 = Graph.generateGraph();
    graph11.setName("[graph]");
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
    graph11.addNode(node21);
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    java.lang.String str41 = graph39.name;
    java.lang.String str42 = graph39.name;
    node21.setOwner(graph39);
    node21.setOwnerName("[graph]");
    node21.setOwnerName("");
    graph2.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test231"); }


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
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node5.getDegree();

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test232"); }


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
    graph10.setName("hi!");
    graph10.name = "hi!";
    graph10.init();
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
    node34.setOwnerNameDirectly("[graph]");
    node34.setOwnerName("");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    graph55.setName("[graph]");
    java.lang.String str61 = graph55.name;
    node34.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph10.getDegree(node34);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test233"); }


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
    graph61.setName("[graph]");
    graph61.name = "[graph]";
    node38.setOwner(graph61);
    node38.setOwnerName("[graph]");
    graph21.addNode(node38);
    node38.setOwnerName("hi!");
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test234"); }


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
    node9.setOwnerName("hi!");
    node9.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node9.getDegree();

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test235"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerName("");
    Graph graph24 = new Graph();
    java.lang.String str25 = graph24.name;
    node15.setOwner(graph24);
    graph24.setName("");
    graph24.name = "hi!";
    node1.setOwner(graph24);
    node1.setOwnerNameDirectly("hi!");
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
    node1.addEdge(node35);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test236"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test237"); }


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
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node8.getDegree();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test238"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test239"); }


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
    graph2.init();
    graph2.name = "hi!";
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    graph36.addNode(node44);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    node44.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph2.getDegree(node44);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test240"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test241"); }


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
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.init();
    node43.setOwner(graph54);
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.setName("[graph]");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.init();
    node67.setOwner(graph78);
    node67.setOwnerName("hi!");
    graph57.addNode(node67);
    graph54.addNode(node67);
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    node67.setOwner(graph85);
    graph21.addNode(node67);
    node67.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node67.getDegree();

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test242"); }


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
    node22.setOwnerName("[graph]");
    node22.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = graph10.getDegree(node22);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test243"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    Graph graph11 = Graph.generateGraph();
    graph11.setName("[graph]");
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
    graph11.addNode(node21);
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    java.lang.String str41 = graph39.name;
    java.lang.String str42 = graph39.name;
    node21.setOwner(graph39);
    node21.setOwnerName("[graph]");
    node21.setOwnerName("");
    graph2.addNode(node21);
    Graph graph49 = new Graph();
    java.lang.String str50 = graph49.name;
    graph49.init();
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerNameDirectly("[graph]");
    graph49.addNode(node53);
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    graph77.setName("hi!");
    node66.setOwner(graph77);
    graph49.addNode(node66);
    graph2.addNode(node66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node66.thisIsNotCalled();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test244"); }


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
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerNameDirectly("");
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test245"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    java.lang.String str3 = graph0.name;
    java.lang.String str4 = graph0.name;
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    graph5.setName("");
    graph5.setName("[graph]");
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
    graph5.addNode(node15);
    node15.setOwnerNameDirectly("[graph]");
    graph0.addNode(node15);
    node15.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node15.getDegree();

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test246"); }


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
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node10.getDegree();

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test247"); }


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
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    graph54.init();
    node43.setOwner(graph54);
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.setName("[graph]");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.init();
    node67.setOwner(graph78);
    node67.setOwnerName("hi!");
    graph57.addNode(node67);
    graph54.addNode(node67);
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    node67.setOwner(graph85);
    graph21.addNode(node67);
    node67.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node67.thisIsNotCalled();

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test248"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    graph2.name = "hi!";
    graph2.setName("[graph]");
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
    node25.setOwnerNameDirectly("[graph]");
    graph2.addNode(node25);
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    graph45.name = "[graph]";
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    graph54.setName("[graph]");
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
    graph54.addNode(node64);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerNameDirectly("");
    graph45.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node64);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test249"); }


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
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    graph55.init();
    graph55.init();
    node44.setOwner(graph55);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("[graph]");
    node44.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph33.addNode(node44);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test250"); }


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
    node25.setOwnerName("[graph]");
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = node25.getDegree();

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test251"); }


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
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    graph51.setName("[graph]");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    node61.setOwner(graph72);
    node61.setOwnerName("hi!");
    graph51.addNode(node61);
    graph48.addNode(node61);
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    node61.setOwner(graph79);
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    graph83.setName("[graph]");
    node61.setOwner(graph83);
    node61.setOwnerName("");
    node61.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node61);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test252"); }


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
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("[graph]");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    java.lang.String str25 = graph22.name;
    graph22.name = "";
    java.lang.String str28 = graph22.name;
    node5.setOwner(graph22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node5.getDegree();

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test253"); }


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
    node18.thisIsNotCalled();

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test254"); }


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
    node10.setOwnerNameDirectly("hi!");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    node10.setOwner(graph32);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    graph36.name = "hi!";
    graph36.name = "";
    java.lang.String str44 = graph36.name;
    graph36.init();
    graph36.name = "";
    Graph graph48 = Graph.generateGraph();
    graph48.setName("[graph]");
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
    graph48.addNode(node58);
    Graph graph76 = Graph.generateGraph();
    graph76.init();
    java.lang.String str78 = graph76.name;
    java.lang.String str79 = graph76.name;
    node58.setOwner(graph76);
    node58.setOwnerName("[graph]");
    graph36.addNode(node58);
    node58.setOwnerName("hi!");
    node58.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph32.getDegree(node58);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test255"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
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
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerNameDirectly("");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node14.getDegree();

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test256"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test257"); }


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
    graph0.init();
    java.lang.String str31 = graph0.name;
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
    graph32.name = "";
    graph32.setName("");
    java.lang.String str64 = graph32.name;
    java.lang.String str65 = graph32.name;
    graph32.setName("");
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
    node69.setOwnerName("");
    node69.setOwnerName("hi!");
    node69.setOwnerName("");
    node69.setOwnerName("");
    graph32.addNode(node69);
    graph0.addNode(node69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node69.thisIsNotCalled();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test258"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "";
    graph0.init();
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    graph7.setName("");
    graph7.setName("[graph]");
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
    graph7.addNode(node17);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerNameDirectly("");
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph0.getDegree(node17);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test259"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.name = "hi!";
    graph12.name = "";
    java.lang.String str20 = graph12.name;
    java.lang.String str21 = graph12.name;
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
    node32.setOwnerName("");
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
    java.lang.String str78 = graph58.name;
    graph58.name = "";
    node32.setOwner(graph58);
    graph12.addNode(node32);
    node32.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node32);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test260"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    graph5.setName("");
    graph5.setName("[graph]");
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
    graph5.addNode(node15);
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    graph34.setName("");
    node15.setOwner(graph34);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node15.setOwner(graph45);
    node15.setOwnerNameDirectly("[graph]");
    node15.setOwnerNameDirectly("[graph]");
    node15.setOwnerNameDirectly("");
    graph0.addNode(node15);
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node15.thisIsNotCalled();

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test261"); }


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
    java.lang.String str19 = graph12.name;
    java.lang.String str20 = graph12.name;
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
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    node46.setOwner(graph64);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.setName("[graph]");
    node46.setOwner(graph68);
    node46.setOwnerName("");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    graph77.setName("");
    graph77.setName("");
    graph77.init();
    graph77.setName("[graph]");
    graph77.name = "";
    node46.setOwner(graph77);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerNameDirectly("");
    graph12.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node46.thisIsNotCalled();

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test262"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node1.getDegree();

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test263"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test264"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    graph2.name = "hi!";
    graph2.setName("");
    graph2.setName("[graph]");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("");
    graph17.init();
    graph17.name = "";
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    java.lang.String str39 = graph33.name;
    graph33.init();
    node30.setOwner(graph33);
    graph17.addNode(node30);
    node30.setOwnerName("[graph]");
    graph2.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = node30.getDegree();

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test265"); }


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
    node30.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node30.getDegree();

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test266"); }


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
    graph10.setName("[graph]");
    java.lang.String str25 = graph10.name;
    graph10.init();
    graph10.setName("[graph]");
    graph10.setName("[graph]");
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
    node32.setOwnerNameDirectly("");
    node32.setOwnerName("");
    node32.setOwnerNameDirectly("");
    node32.setOwnerNameDirectly("hi!");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    graph72.setName("hi!");
    node61.setOwner(graph72);
    node61.setOwnerName("hi!");
    node61.setOwnerName("hi!");
    node61.setOwnerName("hi!");
    node61.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node32, node61);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test267"); }


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
    Graph graph45 = Graph.generateGraph();
    node25.setOwner(graph45);
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
    node48.setOwnerName("");
    node48.setOwnerNameDirectly("");
    graph45.addNode(node48);
    node48.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = node48.getDegree();

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test268"); }


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
    graph48.name = "";
    graph48.name = "";
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("");
    node65.setOwnerName("[graph]");
    node65.setOwnerName("");
    node65.setOwnerNameDirectly("");
    node65.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph48.addNode(node65);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test269"); }


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
    graph35.addNode(node48);
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    node48.setOwner(graph66);
    graph66.init();
    node1.setOwner(graph66);
    node1.setOwnerName("hi!");
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node75);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test270"); }


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
    node11.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test271"); }


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
    node30.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node30.getDegree();

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test272"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    graph2.name = "hi!";
    graph2.setName("[graph]");
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
    node25.setOwnerNameDirectly("[graph]");
    graph2.addNode(node25);
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test273"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerName("");
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
    node13.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node13);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test274"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.name = "";
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerName("");
    Graph graph22 = new Graph();
    java.lang.String str23 = graph22.name;
    node13.setOwner(graph22);
    graph22.init();
    graph22.name = "[graph]";
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    graph40.init();
    graph40.init();
    node29.setOwner(graph40);
    node29.setOwnerNameDirectly("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    java.lang.String str59 = graph53.name;
    graph53.name = "";
    node29.setOwner(graph53);
    graph22.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = graph0.getDegree(node29);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test275"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Graph graph11 = Graph.generateGraph();
    graph11.setName("[graph]");
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
    graph11.addNode(node21);
    node21.setOwnerName("[graph]");
    node21.setOwnerName("hi!");
    node21.setOwnerName("");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.init();
    graph57.init();
    node46.setOwner(graph57);
    node21.setOwner(graph57);
    node21.setOwnerNameDirectly("hi!");
    graph2.addNode(node21);
    node21.setOwnerName("hi!");
    node21.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test276"); }


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
    node10.setOwnerNameDirectly("");
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
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    graph47.setName("[graph]");
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
    graph47.addNode(node57);
    graph44.addNode(node57);
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    node57.setOwner(graph75);
    node57.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node57);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test277"); }


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
    node10.setOwnerNameDirectly("");
    Graph graph42 = Graph.generateGraph();
    graph42.init();
    graph42.name = "hi!";
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
    node47.setOwnerNameDirectly("hi!");
    graph42.addNode(node47);
    Graph graph62 = Graph.generateGraph();
    node47.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node47);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test278"); }


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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("");
    graph25.init();
    graph25.setName("[graph]");
    graph25.name = "";
    graph25.init();
    node1.setOwner(graph25);
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    java.lang.String str43 = graph41.name;
    graph41.setName("");
    node1.setOwner(graph41);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
    graph47.init();
    node1.setOwner(graph47);
    graph47.name = "hi!";
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
    graph57.init();
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node79.setOwnerNameDirectly("hi!");
    node79.setOwnerName("");
    node79.setOwnerName("[graph]");
    node79.setOwnerName("");
    graph57.addNode(node79);
    node79.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph47.getDegree(node79);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test279"); }


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
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerNameDirectly("[graph]");
    graph46.addNode(node57);
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = node57.getDegree();

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test280"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node17.getDegree();

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test281"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    java.lang.String str2 = graph0.name;
    graph0.init();
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerName("");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    graph16.setName("hi!");
    node5.setOwner(graph16);
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node5.setOwner(graph25);
    node5.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = graph0.getDegree(node5);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test282"); }


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
    java.lang.String str26 = graph0.name;
    java.lang.String str27 = graph0.name;
    graph0.setName("");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    java.lang.String str38 = graph32.name;
    graph32.init();
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    graph40.addNode(node48);
    graph32.addNode(node48);
    node48.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph0.getDegree(node48);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test283"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test284"); }


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
    node55.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test285"); }


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
    node25.setOwner(graph43);
    node25.setOwnerName("hi!");
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = node25.getDegree();

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test286"); }


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
    node10.setOwnerName("");
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test287"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node10.getDegree();

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test288"); }


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
    java.lang.String str32 = graph0.name;
    java.lang.String str33 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    graph39.setName("");
    graph39.init();
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
    graph39.addNode(node48);
    graph39.setName("hi!");
    graph39.setName("[graph]");
    Node node70 = new Node("");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    graph71.setName("");
    node70.setOwner(graph71);
    node70.setOwnerNameDirectly("[graph]");
    node70.setOwnerName("");
    graph39.addNode(node70);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph0.getDegree(node70);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test289"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.name = "hi!";
    java.lang.String str12 = graph0.name;
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerNameDirectly("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("");
    node14.setOwner(graph25);
    node14.setOwnerName("");
    node14.setOwnerName("");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerName("");
    Graph graph49 = new Graph();
    java.lang.String str50 = graph49.name;
    node40.setOwner(graph49);
    graph49.setName("");
    graph49.setName("");
    graph49.name = "";
    graph49.setName("hi!");
    java.lang.String str60 = graph49.name;
    node14.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph0.getDegree(node14);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test290"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.init();
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
    graph7.name = "";
    graph7.name = "";
    graph7.name = "[graph]";
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("[graph]");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    node51.setOwner(graph62);
    node51.setOwnerName("hi!");
    graph41.addNode(node51);
    node51.setOwnerNameDirectly("[graph]");
    node51.setOwnerName("hi!");
    node51.setOwnerNameDirectly("");
    node51.setOwnerNameDirectly("hi!");
    graph7.addNode(node51);
    node51.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph0.getDegree(node51);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test291"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node1.getDegree();

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test292"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerName("");
    Graph graph14 = new Graph();
    java.lang.String str15 = graph14.name;
    node5.setOwner(graph14);
    node5.setOwnerNameDirectly("hi!");
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("");
    node5.setOwnerNameDirectly("hi!");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    graph36.setName("hi!");
    node25.setOwner(graph36);
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node25.setOwner(graph45);
    graph45.init();
    Node node54 = new Node("");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    graph55.setName("");
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("[graph]");
    graph45.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.addEdge(node54);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test293"); }


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
    graph10.name = "hi!";
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    graph18.addNode(node26);
    graph18.init();
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    node40.setOwnerName("[graph]");
    node40.setOwnerName("");
    graph18.addNode(node40);
    node40.setOwnerNameDirectly("");
    node40.setOwnerName("[graph]");
    graph10.addNode(node40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node40.getDegree();

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test294"); }


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
    node10.setOwnerNameDirectly("hi!");
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
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerNameDirectly("");
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("hi!");
    node47.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node47);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test295"); }


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
    graph12.addNode(node25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test296"); }


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
    node10.setOwnerName("[graph]");
    node10.setOwnerName("hi!");
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test297"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
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
    node10.setOwnerNameDirectly("[graph]");
    Graph graph29 = Graph.generateGraph();
    graph29.init();
    java.lang.String str31 = graph29.name;
    java.lang.String str32 = graph29.name;
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
    graph29.addNode(node40);
    graph29.init();
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
    node60.setOwnerName("");
    node60.setOwnerName("hi!");
    node60.setOwnerName("");
    graph29.addNode(node60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node10, node60);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test298"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
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
    graph2.addNode(node14);
    node14.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test299"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    graph6.setName("");
    graph6.init();
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
    graph6.addNode(node15);
    graph6.setName("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerName("");
    Graph graph44 = Graph.generateGraph();
    graph44.init();
    java.lang.String str46 = graph44.name;
    node35.setOwner(graph44);
    graph6.addNode(node35);
    node35.setOwnerName("");
    node35.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph0.getDegree(node35);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test300"); }


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
    node55.setOwnerNameDirectly("");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.setName("hi!");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerName("");
    Graph graph87 = Graph.generateGraph();
    graph87.init();
    node76.setOwner(graph87);
    node76.setOwnerName("hi!");
    graph69.addNode(node76);
    node76.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.addEdge(node76);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test301"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node19.getDegree();

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test302"); }


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
    node10.setOwnerNameDirectly("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    graph30.name = "hi!";
    node10.setOwner(graph30);
    node10.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    graph39.setName("");
    graph39.setName("[graph]");
    graph39.name = "";
    java.lang.String str50 = graph39.name;
    graph39.init();
    graph39.init();
    node10.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node10.getDegree();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test303"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "";
    graph0.setName("");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    java.lang.String str23 = graph17.name;
    graph17.init();
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
    graph17.addNode(node33);
    node33.setOwnerName("[graph]");
    node33.setOwnerName("");
    node33.setOwnerName("");
    graph8.addNode(node33);
    Graph graph53 = Graph.generateGraph();
    node33.setOwner(graph53);
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
    node56.setOwnerName("");
    node56.setOwnerNameDirectly("");
    graph53.addNode(node56);
    node56.setOwnerName("hi!");
    graph0.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node56.getDegree();

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test304"); }


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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    graph25.name = "hi!";
    graph25.name = "";
    java.lang.String str33 = graph25.name;
    graph25.init();
    graph25.name = "";
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    graph37.addNode(node45);
    graph37.init();
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    node59.setOwnerNameDirectly("hi!");
    node59.setOwnerName("");
    node59.setOwnerName("[graph]");
    node59.setOwnerName("");
    graph37.addNode(node59);
    node59.setOwnerNameDirectly("");
    graph25.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node59);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test305"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.name = "hi!";
    graph8.setName("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
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
    node29.setOwner(graph59);
    node29.setOwnerNameDirectly("[graph]");
    graph15.addNode(node29);
    graph8.addNode(node29);
    node1.setOwner(graph8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test306"); }


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
    graph20.name = "hi!";
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
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    graph65.setName("[graph]");
    graph65.name = "";
    graph65.name = "";
    node40.setOwner(graph65);
    node40.setOwnerName("[graph]");
    node40.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph20.getDegree(node40);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test307"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test308"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test309"); }


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
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerName("");
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    java.lang.String str40 = graph38.name;
    node29.setOwner(graph38);
    graph0.addNode(node29);
    node29.setOwnerName("");
    node29.setOwnerName("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    node48.setOwnerNameDirectly("");
    node48.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.addEdge(node48);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test310"); }


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
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    graph64.name = "hi!";
    graph64.name = "";
    java.lang.String str72 = graph64.name;
    graph64.setName("[graph]");
    node10.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test311"); }


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
    node9.setOwnerName("hi!");
    node9.setOwnerName("[graph]");
    node9.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test312"); }


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
    graph47.name = "[graph]";
    graph47.init();
    Graph graph57 = Graph.generateGraph();
    graph57.init();
    java.lang.String str59 = graph57.name;
    java.lang.String str60 = graph57.name;
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
    graph57.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = graph47.getDegree(node68);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test313"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerName("");
    Graph graph14 = new Graph();
    java.lang.String str15 = graph14.name;
    node5.setOwner(graph14);
    node5.setOwnerNameDirectly("hi!");
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("");
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node5.getDegree();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test314"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test315"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test316"); }


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
    graph35.addNode(node48);
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    node48.setOwner(graph66);
    graph66.init();
    node1.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test317"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.setName("[graph]");
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
    node27.setOwnerName("[graph]");
    node27.setOwnerName("hi!");
    graph8.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test318"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    graph0.init();
    java.lang.String str12 = graph0.name;
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    java.lang.String str16 = graph15.name;
    graph15.init();
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("[graph]");
    graph15.addNode(node19);
    node19.setOwnerName("");
    node19.setOwnerName("[graph]");
    node19.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node14, node19);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test319"); }


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
    graph52.setName("");
    graph52.setName("");
    graph52.name = "";
    node30.setOwner(graph52);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    node63.setOwnerName("[graph]");
    node63.setOwnerName("");
    node63.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph52.addNode(node63);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test320"); }


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
    node9.setOwnerName("hi!");
    node9.setOwnerName("[graph]");
    node9.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node9.getDegree();

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test321"); }


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
    node43.setOwnerName("[graph]");
    node43.setOwnerName("[graph]");
    graph0.addNode(node43);
    node43.setOwnerName("[graph]");
    node43.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node43.thisIsNotCalled();

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test322"); }


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
    graph10.name = "";
    graph10.name = "[graph]";
    Graph graph19 = Graph.generateGraph();
    graph19.setName("[graph]");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    graph22.setName("hi!");
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
    graph22.addNode(node29);
    graph19.addNode(node29);
    Graph graph47 = Graph.generateGraph();
    graph47.init();
    java.lang.String str49 = graph47.name;
    java.lang.String str50 = graph47.name;
    node29.setOwner(graph47);
    graph47.init();
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    graph65.setName("hi!");
    node54.setOwner(graph65);
    graph47.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph10.getDegree(node54);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test323"); }


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
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test324"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "";
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
    java.lang.String str20 = graph14.name;
    graph14.init();
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    graph22.setName("");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    graph22.addNode(node30);
    graph14.addNode(node30);
    node30.setOwnerName("[graph]");
    node30.setOwnerName("");
    node30.setOwnerName("");
    graph5.addNode(node30);
    node30.setOwnerName("hi!");
    node30.setOwnerName("");
    node30.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph0.getDegree(node30);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test325"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("hi!");
    node22.setOwnerName("");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    graph35.setName("[graph]");
    graph35.name = "[graph]";
    java.lang.String str43 = graph35.name;
    java.lang.String str44 = graph35.name;
    graph35.setName("[graph]");
    node22.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test326"); }


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
    node1.setOwnerNameDirectly("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerName("");
    Graph graph25 = new Graph();
    java.lang.String str26 = graph25.name;
    node16.setOwner(graph25);
    graph25.init();
    graph25.name = "";
    node1.setOwner(graph25);
    Graph graph32 = Graph.generateGraph();
    graph32.name = "";
    graph32.setName("");
    node1.setOwner(graph32);
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    graph38.name = "hi!";
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
    node43.setOwnerNameDirectly("hi!");
    graph38.addNode(node43);
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    java.lang.String str60 = graph58.name;
    java.lang.String str61 = graph58.name;
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    graph62.setName("hi!");
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
    graph62.addNode(node69);
    graph58.addNode(node69);
    node69.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph32.addEdge(node43, node69);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test327"); }


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
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node18 = new Node("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    node18.setOwnerName("[graph]");
    Graph graph33 = new Graph();
    java.lang.String str34 = graph33.name;
    node18.setOwner(graph33);
    graph33.init();
    node1.setOwner(graph33);
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
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerName("");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    graph55.setName("");
    graph55.setName("");
    graph55.init();
    node39.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node39);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test328"); }


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
    graph0.name = "hi!";
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
    node31.setOwnerName("hi!");
    node31.setOwnerNameDirectly("hi!");
    graph0.addNode(node31);
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    graph52.setName("[graph]");
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
    graph52.addNode(node62);
    node62.setOwnerNameDirectly("[graph]");
    node62.setOwnerName("");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    graph83.setName("[graph]");
    java.lang.String str89 = graph83.name;
    node62.setOwner(graph83);
    Node node92 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node62, node92);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test329"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    graph2.name = "hi!";
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerName("");
    node12.setOwnerNameDirectly("");
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
    java.lang.String str40 = graph34.name;
    graph34.init();
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
    graph34.addNode(node50);
    node50.setOwnerName("[graph]");
    node50.setOwnerName("");
    node50.setOwnerName("");
    graph25.addNode(node50);
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    graph70.setName("");
    graph70.init();
    graph70.name = "[graph]";
    node50.setOwner(graph70);
    node50.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node50);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test330"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test331"); }


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
    node30.setOwnerName("");
    Graph graph39 = new Graph();
    java.lang.String str40 = graph39.name;
    node30.setOwner(graph39);
    graph39.init();
    graph39.name = "[graph]";
    graph39.name = "hi!";
    graph39.init();
    java.lang.String str48 = graph39.name;
    graph39.name = "hi!";
    node10.setOwner(graph39);
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test332"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = node1.getDegree();

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test333"); }


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
    graph21.name = "hi!";
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    graph32.setName("hi!");
    graph32.name = "";
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    graph40.init();
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
    graph40.addNode(node49);
    node49.setOwnerName("[graph]");
    graph32.addNode(node49);
    graph21.addNode(node49);
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
    graph80.init();
    graph80.name = "[graph]";
    graph80.name = "hi!";
    graph80.init();
    java.lang.String str89 = graph80.name;
    graph80.name = "hi!";
    node49.setOwner(graph80);
    node49.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node49.thisIsNotCalled();

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test334"); }


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
    node35.setOwnerName("hi!");
    node35.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test335"); }


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
    node25.setOwner(graph43);
    node25.setOwnerName("hi!");
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test336"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test337"); }


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
    node25.setOwnerName("[graph]");
    node25.setOwnerName("[graph]");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("hi!");
    node50.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    graph63.setName("[graph]");
    graph63.name = "[graph]";
    java.lang.String str71 = graph63.name;
    java.lang.String str72 = graph63.name;
    graph63.setName("[graph]");
    node50.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node50);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test338"); }


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
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test339"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.init();
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
    graph8.addNode(node17);
    node17.setOwnerName("[graph]");
    graph0.addNode(node17);
    node17.setOwnerName("[graph]");
    node17.setOwnerNameDirectly("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    graph41.name = "hi!";
    graph41.name = "";
    node17.setOwner(graph41);
    node17.setOwnerNameDirectly("[graph]");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    graph52.setName("[graph]");
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
    graph52.addNode(node62);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerNameDirectly("");
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("hi!");
    node62.setOwnerName("[graph]");
    node62.setOwnerName("hi!");
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node62);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test340"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    graph14.name = "";
    graph14.setName("");
    node1.setOwner(graph14);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test341"); }


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
    graph10.init();
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
    graph15.setName("[graph]");
    graph15.name = "[graph]";
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
    node50.setOwnerName("");
    node50.setOwnerNameDirectly("[graph]");
    graph15.addNode(node50);
    node50.setOwnerName("[graph]");
    node50.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph10.getDegree(node50);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test342"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test343"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
    java.lang.String str5 = graph0.name;
    graph0.name = "[graph]";
    graph0.name = "[graph]";
    java.lang.String str10 = graph0.name;
    graph0.name = "";
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    graph25.setName("hi!");
    node14.setOwner(graph25);
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node14.setOwner(graph34);
    node14.setOwnerNameDirectly("[graph]");
    node14.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph0.getDegree(node14);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test344"); }


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
    node8.setOwnerNameDirectly("[graph]");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerName("");
    Graph graph34 = new Graph();
    java.lang.String str35 = graph34.name;
    node25.setOwner(graph34);
    graph34.setName("");
    graph34.setName("");
    graph34.name = "hi!";
    graph34.init();
    graph34.name = "hi!";
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    graph48.name = "hi!";
    graph48.init();
    graph48.setName("hi!");
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
    graph48.addNode(node60);
    node60.setOwnerNameDirectly("hi!");
    graph34.addNode(node60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node60);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test345"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("hi!");
    java.lang.String str7 = graph0.name;
    java.lang.String str8 = graph0.name;
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
    node19.setOwner(graph49);
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    graph58.name = "hi!";
    java.lang.String str66 = graph58.name;
    graph58.name = "hi!";
    node19.setOwner(graph58);
    node19.setOwnerNameDirectly("[graph]");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    graph72.setName("");
    graph72.setName("[graph]");
    graph72.init();
    java.lang.String str82 = graph72.name;
    graph72.setName("hi!");
    node19.setOwner(graph72);
    Node node87 = new Node("hi!");
    Graph graph88 = Graph.generateGraph();
    graph88.setName("");
    graph88.init();
    java.lang.String str92 = graph88.name;
    node87.setOwner(graph88);
    graph88.name = "hi!";
    java.lang.String str96 = graph88.name;
    node19.setOwner(graph88);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node19);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test346"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("");
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    graph22.init();
    graph22.init();
    node11.setOwner(graph22);
    node11.setOwnerNameDirectly("hi!");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    java.lang.String str41 = graph35.name;
    graph35.name = "";
    node11.setOwner(graph35);
    node11.setOwnerNameDirectly("hi!");
    graph2.addNode(node11);
    java.lang.String str48 = graph2.name;
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = graph2.getDegree(node50);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test347"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test348"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    java.lang.String str7 = graph0.name;
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
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node22.setOwner(graph52);
    node22.setOwnerNameDirectly("[graph]");
    graph8.addNode(node22);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerNameDirectly("");
    graph8.addNode(node63);
    node63.setOwnerNameDirectly("");
    node63.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node63);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test349"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    graph11.setName("");
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("[graph]");
    graph0.addNode(node10);
    node10.setOwnerName("");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    graph36.setName("hi!");
    node25.setOwner(graph36);
    node25.setOwnerName("hi!");
    node25.setOwnerName("hi!");
    node25.setOwnerName("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    graph49.setName("");
    graph49.setName("");
    graph49.init();
    graph49.setName("[graph]");
    graph49.name = "";
    graph49.init();
    node25.setOwner(graph49);
    Graph graph65 = Graph.generateGraph();
    graph65.init();
    java.lang.String str67 = graph65.name;
    graph65.setName("");
    node25.setOwner(graph65);
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    graph71.setName("hi!");
    graph71.init();
    node25.setOwner(graph71);
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node25);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test350"); }


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
    node4.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node4.getDegree();

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test351"); }


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
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = node10.getDegree();

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test352"); }


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
    node31.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test353"); }


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
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("[graph]");
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
    graph28.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerNameDirectly("");
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerNameDirectly("");
    node38.setOwnerNameDirectly("[graph]");
    node38.setOwnerName("[graph]");
    node38.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.addEdge(node38);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test354"); }


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
    graph61.setName("[graph]");
    graph61.name = "[graph]";
    node38.setOwner(graph61);
    node38.setOwnerName("[graph]");
    graph21.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node38.getDegree();

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test355"); }


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
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test356"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "";
    graph0.name = "hi!";
    Graph graph7 = Graph.generateGraph();
    graph7.init();
    java.lang.String str9 = graph7.name;
    java.lang.String str10 = graph7.name;
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    graph11.setName("hi!");
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
    node18.setOwnerName("hi!");
    graph11.addNode(node18);
    graph7.addNode(node18);
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = graph0.getDegree(node18);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test357"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.setName("[graph]");
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
    node18.setOwnerName("hi!");
    graph8.addNode(node18);
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    graph37.setName("");
    node18.setOwner(graph37);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerNameDirectly("");
    graph0.addNode(node18);
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
    graph51.name = "hi!";
    node18.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test358"); }


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
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    graph40.init();
    graph40.init();
    node29.setOwner(graph40);
    node29.setOwnerNameDirectly("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerName("");
    Graph graph61 = new Graph();
    java.lang.String str62 = graph61.name;
    node52.setOwner(graph61);
    graph61.setName("");
    graph61.setName("");
    graph61.name = "hi!";
    node29.setOwner(graph61);
    java.lang.String str71 = graph61.name;
    graph61.init();
    node1.setOwner(graph61);
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    graph74.setName("");
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    node82.setOwnerNameDirectly("hi!");
    node82.setOwnerName("");
    graph74.addNode(node82);
    node82.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph61.getDegree(node82);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test359"); }


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
    node1.setOwnerName("[graph]");
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
    node60.setOwnerName("");
    Graph graph69 = new Graph();
    java.lang.String str70 = graph69.name;
    node60.setOwner(graph69);
    graph69.setName("");
    graph69.setName("");
    graph69.name = "";
    graph69.setName("hi!");
    node31.setOwner(graph69);
    graph69.name = "";
    node1.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test360"); }


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
    node12.setOwnerName("");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.setName("hi!");
    node12.setOwner(graph23);
    node12.setOwnerName("hi!");
    node12.setOwnerName("hi!");
    node12.setOwnerName("hi!");
    node12.setOwnerNameDirectly("hi!");
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
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node39.setOwner(graph59);
    graph59.name = "";
    node12.setOwner(graph59);
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.name = "";
    graph69.name = "hi!";
    node12.setOwner(graph69);
    graph2.addNode(node12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node12.getDegree();

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test361"); }


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
    Graph graph22 = Graph.generateGraph();
    graph22.name = "hi!";
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
    graph37.addNode(node50);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    node50.setOwner(graph68);
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    graph72.setName("[graph]");
    node50.setOwner(graph72);
    node50.setOwnerName("");
    graph22.addNode(node50);
    node1.setOwner(graph22);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test362"); }


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
    node10.setOwnerNameDirectly("[graph]");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("[graph]");
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
    graph39.addNode(node49);
    Graph graph67 = Graph.generateGraph();
    graph67.init();
    java.lang.String str69 = graph67.name;
    java.lang.String str70 = graph67.name;
    node49.setOwner(graph67);
    node49.setOwnerName("[graph]");
    node49.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node49);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test363"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.init();
    graph0.init();
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
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerNameDirectly("");
    node22.setOwnerNameDirectly("");
    node22.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = graph0.getDegree(node22);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test364"); }


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
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test365"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
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
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node33.setOwner(graph53);
    graph53.init();
    Node node62 = new Node("");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    graph63.setName("");
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("[graph]");
    graph53.addNode(node62);
    node1.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node1.getDegree();

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test366"); }


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
    graph21.name = "hi!";
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    graph32.setName("hi!");
    graph32.name = "";
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    graph40.init();
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
    graph40.addNode(node49);
    node49.setOwnerName("[graph]");
    graph32.addNode(node49);
    graph21.addNode(node49);
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
    graph80.init();
    graph80.name = "[graph]";
    graph80.name = "hi!";
    graph80.init();
    java.lang.String str89 = graph80.name;
    graph80.name = "hi!";
    node49.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node49.getDegree();

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test367"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.name = "hi!";
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
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    graph55.setName("");
    node36.setOwner(graph55);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node36.setOwner(graph66);
    node36.setOwnerNameDirectly("[graph]");
    node36.setOwnerNameDirectly("[graph]");
    node36.setOwnerNameDirectly("");
    graph21.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node36);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test368"); }


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
    graph21.setName("hi!");
    graph21.name = "hi!";
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
    node42.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph21.getDegree(node42);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test369"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
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
    graph2.addNode(node14);
    node14.setOwnerNameDirectly("");
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
    node43.setOwnerName("");
    node43.setOwnerNameDirectly("");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    graph75.setName("");
    graph75.setName("[graph]");
    graph75.init();
    node43.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node43);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test370"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test371"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "";
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    Node node25 = new Node("hi!");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    node25.setOwner(graph26);
    graph26.init();
    graph26.init();
    node15.setOwner(graph26);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("[graph]");
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
    node49.setOwnerName("");
    node49.setOwnerNameDirectly("");
    node49.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node15, node49);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test372"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.init();
    graph0.name = "";
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
    graph12.init();
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("");
    node34.setOwnerName("[graph]");
    node34.setOwnerName("");
    graph12.addNode(node34);
    node34.setOwnerNameDirectly("");
    graph0.addNode(node34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node34.thisIsNotCalled();

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test373"); }


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
    node10.setOwnerNameDirectly("");
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.init();
    graph54.init();
    node43.setOwner(graph54);
    graph54.name = "";
    graph54.init();
    graph54.name = "hi!";
    graph54.name = "hi!";
    java.lang.String str70 = graph54.name;
    node10.setOwner(graph54);
    node10.setOwnerName("[graph]");
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    graph74.name = "hi!";
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
    node79.setOwnerNameDirectly("hi!");
    graph74.addNode(node79);
    node79.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node79);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test374"); }


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
    node22.setOwnerNameDirectly("");
    node22.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test375"); }


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
    graph0.name = "";
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerName("");
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    java.lang.String str42 = graph40.name;
    node31.setOwner(graph40);
    graph40.name = "[graph]";
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    graph46.addNode(node54);
    graph46.init();
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    node68.setOwnerName("");
    node68.setOwnerName("[graph]");
    node68.setOwnerName("");
    graph46.addNode(node68);
    node68.setOwnerNameDirectly("");
    graph40.addNode(node68);
    node68.setOwnerNameDirectly("hi!");
    graph0.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node68.getDegree();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test376"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
    graph0.name = "hi!";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.init();
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
    graph12.addNode(node21);
    node21.setOwnerNameDirectly("");
    node21.setOwnerName("[graph]");
    node21.setOwnerName("");
    node21.setOwnerNameDirectly("hi!");
    graph0.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test377"); }


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
    node16.setOwnerName("hi!");
    node16.setOwnerNameDirectly("[graph]");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    graph36.setName("hi!");
    graph36.setName("[graph]");
    graph36.name = "[graph]";
    node16.setOwner(graph36);
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
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    graph78.setName("");
    node59.setOwner(graph78);
    graph36.addNode(node59);
    node59.setOwnerName("");
    node59.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph10.getDegree(node59);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test378"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
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
    graph5.init();
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    node27.setOwnerName("[graph]");
    node27.setOwnerName("");
    graph5.addNode(node27);
    node27.setOwnerNameDirectly("");
    node27.setOwnerNameDirectly("");
    node27.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = graph0.getDegree(node27);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test379"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test380"); }


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
    graph21.name = "[graph]";
    graph21.init();
    graph21.setName("hi!");
    java.lang.String str52 = graph21.name;
    graph21.setName("");
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
    node65.setOwnerNameDirectly("[graph]");
    node65.setOwnerName("");
    node65.setOwnerName("");
    graph21.addNode(node65);
    node65.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node65.getDegree();

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test381"); }


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
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.init();
    graph29.init();
    node18.setOwner(graph29);
    graph29.name = "";
    graph29.init();
    graph29.name = "hi!";
    node1.setOwner(graph29);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test382"); }


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
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    graph48.setName("");
    graph48.setName("[graph]");
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
    graph48.addNode(node58);
    graph45.addNode(node58);
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    node58.setOwner(graph76);
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    graph81.setName("");
    graph81.setName("[graph]");
    graph81.init();
    java.lang.String str91 = graph81.name;
    node58.setOwner(graph81);
    node58.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node58);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test383"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    Graph graph11 = Graph.generateGraph();
    graph11.setName("[graph]");
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
    graph11.addNode(node21);
    Graph graph39 = Graph.generateGraph();
    graph39.init();
    java.lang.String str41 = graph39.name;
    java.lang.String str42 = graph39.name;
    node21.setOwner(graph39);
    node21.setOwnerName("[graph]");
    node21.setOwnerName("");
    graph2.addNode(node21);
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
    graph59.init();
    graph59.setName("hi!");
    java.lang.String str65 = graph59.name;
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
    node73.setOwnerName("");
    node73.setOwnerNameDirectly("[graph]");
    graph59.addNode(node73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph2.getDegree(node73);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test384"); }


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
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node10.getDegree();

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test385"); }


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
    graph35.addNode(node48);
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    node48.setOwner(graph66);
    graph66.init();
    node1.setOwner(graph66);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node1.getDegree();

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test386"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test387"); }


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
    graph10.init();
    graph10.name = "[graph]";
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    node20.setOwnerName("[graph]");
    node20.setOwnerName("[graph]");
    node20.setOwnerName("");
    node20.setOwnerNameDirectly("[graph]");
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
    node40.setOwnerName("[graph]");
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
    graph66.init();
    node40.setOwner(graph66);
    node20.setOwner(graph66);
    node20.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph10.getDegree(node20);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test388"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = node1.getDegree();

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test389"); }


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
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    graph75.setName("");
    node56.setOwner(graph75);
    Node node85 = new Node("hi!");
    Graph graph86 = Graph.generateGraph();
    graph86.setName("");
    graph86.init();
    java.lang.String str90 = graph86.name;
    node85.setOwner(graph86);
    node56.setOwner(graph86);
    node56.setOwnerNameDirectly("[graph]");
    graph42.addNode(node56);
    node56.setOwnerName("[graph]");
    graph0.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = node56.getDegree();

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test390"); }


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
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    graph52.init();
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    node61.setOwner(graph72);
    node61.setOwnerName("hi!");
    graph52.addNode(node61);
    graph52.setName("hi!");
    graph52.name = "";
    graph52.setName("");
    graph52.init();
    graph52.name = "[graph]";
    node1.setOwner(graph52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test391"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test392"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test393"); }


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
    node10.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    graph37.addNode(node45);
    java.lang.String str57 = graph37.name;
    graph37.setName("hi!");
    node10.setOwner(graph37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test394"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
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
    node13.setOwnerName("[graph]");
    node13.setOwnerName("[graph]");
    graph2.addNode(node13);
    graph2.name = "[graph]";
    java.lang.String str34 = graph2.name;
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    graph47.init();
    graph47.init();
    node36.setOwner(graph47);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    graph2.addNode(node36);
    graph2.name = "hi!";
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph2.getDegree(node64);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test395"); }


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
    graph0.setName("[graph]");
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("");
    graph0.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test396"); }


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
    graph10.setName("[graph]");
    graph10.init();
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
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("hi!");
    node31.setOwnerNameDirectly("");
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerNameDirectly("");
    graph10.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node31.getDegree();

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test397"); }


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
    node74.setOwnerNameDirectly("");
    node74.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node74.getDegree();

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test398"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("");
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    node8.setOwnerNameDirectly("");
    node8.setOwnerName("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("[graph]");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    graph26.setName("hi!");
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
    graph26.addNode(node33);
    graph23.addNode(node33);
    graph23.name = "";
    graph23.setName("");
    graph23.init();
    graph23.name = "hi!";
    graph23.setName("hi!");
    node8.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph0.getDegree(node8);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test399"); }


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
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test400"); }


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
    graph52.setName("");
    graph52.setName("");
    graph52.name = "";
    node30.setOwner(graph52);
    node30.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node30.getDegree();

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test401"); }


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
    graph10.name = "[graph]";
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
    node38.setOwnerNameDirectly("");
    graph10.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test402"); }


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
    int i80 = node10.getDegree();

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test403"); }


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
    node1.setOwnerName("");
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
    graph25.name = "";
    graph25.name = "";
    graph25.name = "[graph]";
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
    node69.setOwnerNameDirectly("[graph]");
    node69.setOwnerName("hi!");
    node69.setOwnerNameDirectly("");
    node69.setOwnerNameDirectly("hi!");
    graph25.addNode(node69);
    node69.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node69);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test404"); }


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
    node8.setOwnerNameDirectly("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    graph28.name = "hi!";
    graph28.name = "";
    java.lang.String str36 = graph28.name;
    graph28.init();
    graph28.name = "";
    Graph graph40 = Graph.generateGraph();
    graph40.setName("[graph]");
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
    graph40.addNode(node50);
    Graph graph68 = Graph.generateGraph();
    graph68.init();
    java.lang.String str70 = graph68.name;
    java.lang.String str71 = graph68.name;
    node50.setOwner(graph68);
    node50.setOwnerName("[graph]");
    graph28.addNode(node50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node50);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test405"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    graph2.name = "hi!";
    graph2.setName("hi!");
    graph2.init();
    graph2.setName("hi!");
    graph2.setName("hi!");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    graph19.setName("hi!");
    graph19.name = "";
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    graph27.init();
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
    graph27.addNode(node36);
    node36.setOwnerName("[graph]");
    graph19.addNode(node36);
    node36.setOwnerName("[graph]");
    node36.setOwnerNameDirectly("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    graph60.name = "hi!";
    graph60.name = "";
    node36.setOwner(graph60);
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    node70.setOwnerNameDirectly("hi!");
    node70.setOwnerName("");
    node70.setOwnerName("[graph]");
    node70.setOwnerName("[graph]");
    Graph graph85 = new Graph();
    java.lang.String str86 = graph85.name;
    node70.setOwner(graph85);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node36, node70);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test406"); }


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
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test407"); }


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
    graph20.name = "hi!";
    java.lang.String str30 = graph20.name;
    java.lang.String str31 = graph20.name;
    graph20.setName("");
    graph20.name = "[graph]";
    Node node37 = new Node("");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    node37.setOwner(graph38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph20.addNode(node37);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test408"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.init();
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
    graph8.addNode(node17);
    node17.setOwnerName("[graph]");
    graph0.addNode(node17);
    node17.setOwnerName("[graph]");
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test409"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    graph2.setName("");
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
    node21.setOwnerNameDirectly("hi!");
    graph2.addNode(node21);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    Node node44 = new Node("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    node44.setOwner(graph45);
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    graph36.addNode(node44);
    graph2.addNode(node44);
    node44.setOwnerName("[graph]");
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node44.getDegree();

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test410"); }


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
    graph32.setName("[graph]");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    graph46.name = "[graph]";
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
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerNameDirectly("");
    graph46.addNode(node65);
    node65.setOwnerNameDirectly("[graph]");
    node65.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = graph32.getDegree(node65);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test411"); }


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
    node10.setOwnerNameDirectly("[graph]");
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    graph45.init();
    java.lang.String str47 = graph45.name;
    node36.setOwner(graph45);
    graph45.name = "[graph]";
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
    node73.setOwnerNameDirectly("");
    graph45.addNode(node73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node73);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test412"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.name = "hi!";
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
    graph12.addNode(node37);
    Graph graph57 = Graph.generateGraph();
    node37.setOwner(graph57);
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
    node60.setOwnerName("");
    node60.setOwnerNameDirectly("");
    graph57.addNode(node60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph0.getDegree(node60);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test413"); }


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
    graph12.init();
    java.lang.String str24 = graph12.name;
    java.lang.String str25 = graph12.name;
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
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("[graph]");
    node36.setOwnerName("");
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph12.getDegree(node36);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test414"); }


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
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    graph29.setName("");
    graph29.setName("[graph]");
    graph29.name = "";
    java.lang.String str40 = graph29.name;
    node10.setOwner(graph29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test415"); }


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
    graph21.name = "hi!";
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
    graph87.init();
    node69.setOwner(graph87);
    graph21.addNode(node69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node69.getDegree();

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test416"); }


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
    graph66.setName("hi!");
    node55.setOwner(graph66);
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node55.setOwner(graph75);
    java.lang.String str82 = graph75.name;
    graph75.init();
    node35.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test417"); }


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
    graph10.setName("[graph]");
    graph10.init();
    java.lang.String str21 = graph10.name;
    Graph graph22 = Graph.generateGraph();
    graph22.name = "hi!";
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
    graph37.addNode(node50);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    node50.setOwner(graph68);
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    graph72.setName("[graph]");
    node50.setOwner(graph72);
    node50.setOwnerName("");
    graph22.addNode(node50);
    node50.setOwnerName("[graph]");
    graph10.addNode(node50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node50.thisIsNotCalled();

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test418"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node1.getDegree();

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test419"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerName("");
    Graph graph14 = new Graph();
    java.lang.String str15 = graph14.name;
    node5.setOwner(graph14);
    node5.setOwnerNameDirectly("hi!");
    graph0.addNode(node5);
    node5.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node5.getDegree();

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test420"); }


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
    node25.setOwnerName("");
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    node59.setOwnerName("");
    Graph graph68 = new Graph();
    java.lang.String str69 = graph68.name;
    node59.setOwner(graph68);
    graph68.init();
    graph68.name = "[graph]";
    graph68.name = "hi!";
    graph68.init();
    node25.setOwner(graph68);
    node25.setOwnerName("");
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = node25.getDegree();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test421"); }


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
    node28.setOwnerName("[graph]");
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node28.getDegree();

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test422"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test423"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.setName("[graph]");
    graph0.init();
    graph0.name = "[graph]";
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
    java.lang.String str50 = graph41.name;
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    node52.setOwner(graph63);
    node52.setOwnerName("");
    graph41.addNode(node52);
    graph0.addNode(node52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node52.getDegree();

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test424"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.name = "hi!";
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
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    graph59.setName("[graph]");
    node37.setOwner(graph59);
    node37.setOwnerName("");
    graph9.addNode(node37);
    node37.setOwnerName("[graph]");
    node37.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node37);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test425"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node1.getDegree();

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test426"); }


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
    graph45.name = "";
    graph45.setName("[graph]");
    graph45.name = "[graph]";
    graph45.setName("[graph]");
    node10.setOwner(graph45);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test427"); }


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
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("");
    graph56.init();
    graph56.setName("[graph]");
    graph56.name = "";
    node25.setOwner(graph56);
    graph56.setName("hi!");
    Node node74 = new Node("");
    graph56.addNode(node74);
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
    graph86.name = "";
    graph86.setName("[graph]");
    node74.setOwner(graph86);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node74.thisIsNotCalled();

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test428"); }


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
    int i32 = node10.getDegree();

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test429"); }


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
    node43.setOwnerNameDirectly("[graph]");
    node43.setOwnerName("hi!");
    node43.setOwnerNameDirectly("");
    node43.setOwnerName("");
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph28.getDegree(node43);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test430"); }


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
    graph0.init();
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
    node26.setOwnerName("hi!");
    graph0.addNode(node26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node26.thisIsNotCalled();

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test431"); }


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
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerName("");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.setName("hi!");
    node57.setOwner(graph68);
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node57.setOwner(graph77);
    graph77.init();
    graph77.init();
    node10.setOwner(graph77);
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node10.getDegree();

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test432"); }


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
    node25.setOwner(graph43);
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    graph48.setName("");
    graph48.setName("[graph]");
    graph48.init();
    java.lang.String str58 = graph48.name;
    node25.setOwner(graph48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test433"); }


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
    graph10.setName("[graph]");
    graph10.init();
    graph10.name = "hi!";
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("[graph]");
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
    graph28.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerNameDirectly("");
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("hi!");
    node38.setOwnerName("[graph]");
    node38.setOwnerName("hi!");
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = graph10.getDegree(node38);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test434"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "";
    Graph graph6 = Graph.generateGraph();
    graph6.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    graph9.setName("hi!");
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
    node16.setOwnerName("hi!");
    graph9.addNode(node16);
    graph6.addNode(node16);
    node16.setOwnerName("hi!");
    node16.setOwnerNameDirectly("");
    node16.setOwnerNameDirectly("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("[graph]");
    node16.setOwner(graph40);
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
    graph56.setName("hi!");
    node45.setOwner(graph56);
    node45.setOwnerName("hi!");
    node45.setOwnerName("hi!");
    node45.setOwnerName("hi!");
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node16, node45);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test435"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.setName("");
    graph0.name = "[graph]";
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerName("hi!");
    node11.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    graph24.setName("");
    graph24.setName("[graph]");
    graph24.name = "";
    java.lang.String str35 = graph24.name;
    graph24.setName("[graph]");
    graph24.name = "";
    graph24.init();
    graph24.name = "";
    graph24.init();
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerNameDirectly("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("");
    node45.setOwner(graph56);
    node45.setOwnerName("");
    node45.setOwnerName("[graph]");
    graph24.addNode(node45);
    graph24.name = "hi!";
    graph24.init();
    node11.setOwner(graph24);
    node11.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = graph0.getDegree(node11);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test436"); }


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
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test437"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test438"); }


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
    Node node17 = new Node("");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    node17.setOwner(graph18);
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
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
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    graph59.setName("");
    node40.setOwner(graph59);
    Node node69 = new Node("hi!");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    node69.setOwner(graph70);
    node40.setOwner(graph70);
    node40.setOwnerNameDirectly("[graph]");
    graph26.addNode(node40);
    node17.setOwner(graph26);
    java.lang.String str81 = graph26.name;
    node1.setOwner(graph26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test439"); }


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
    graph0.name = "[graph]";
    graph0.setName("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    graph35.name = "hi!";
    graph35.name = "";
    java.lang.String str43 = graph35.name;
    graph35.init();
    graph35.name = "";
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
    Graph graph75 = Graph.generateGraph();
    graph75.init();
    java.lang.String str77 = graph75.name;
    java.lang.String str78 = graph75.name;
    node57.setOwner(graph75);
    node57.setOwnerName("[graph]");
    graph35.addNode(node57);
    graph0.addNode(node57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node57.getDegree();

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test440"); }


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
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "hi!";
    graph0.init();
    java.lang.String str22 = graph0.name;
    java.lang.String str23 = graph0.name;
    graph0.init();
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
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("[graph]");
    node26.setOwnerName("hi!");
    node26.setOwnerName("");
    graph0.addNode(node26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node26.getDegree();

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test441"); }


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
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("");
    graph56.init();
    graph56.setName("[graph]");
    graph56.name = "";
    node25.setOwner(graph56);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("hi!");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerName("");
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    graph87.init();
    graph87.setName("hi!");
    node76.setOwner(graph87);
    node76.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node76);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test442"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node18.getDegree();

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test443"); }


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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("");
    graph25.init();
    graph25.setName("[graph]");
    graph25.name = "";
    graph25.init();
    node1.setOwner(graph25);
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    java.lang.String str43 = graph41.name;
    graph41.setName("");
    node1.setOwner(graph41);
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    graph47.setName("hi!");
    graph47.init();
    node1.setOwner(graph47);
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
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerNameDirectly("");
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("hi!");
    node65.setOwnerName("[graph]");
    node65.setOwnerName("hi!");
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node65);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test444"); }


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
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test445"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerName("");
    Graph graph24 = new Graph();
    java.lang.String str25 = graph24.name;
    node15.setOwner(graph24);
    graph24.setName("");
    graph24.name = "hi!";
    node1.setOwner(graph24);
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
    node42.setOwnerName("[graph]");
    node42.setOwnerName("hi!");
    node42.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node42);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test446"); }


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
    node25.setOwnerName("");
    node25.setOwnerName("[graph]");
    node25.setOwnerName("[graph]");
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("");
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test447"); }


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
    node22.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test448"); }


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
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("hi!");
    node14.setOwnerName("");
    node14.setOwnerName("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerNameDirectly("");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("");
    node30.setOwner(graph41);
    node14.setOwner(graph41);
    graph0.addNode(node14);
    node14.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = node14.getDegree();

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test449"); }


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
    node10.setOwnerNameDirectly("");
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.init();
    graph54.init();
    node43.setOwner(graph54);
    graph54.name = "";
    graph54.init();
    graph54.name = "hi!";
    graph54.name = "hi!";
    java.lang.String str70 = graph54.name;
    node10.setOwner(graph54);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test450"); }


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
    int i31 = node11.getDegree();

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test451"); }


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
    node1.setOwnerName("");
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
    graph79.name = "";
    graph79.init();
    java.lang.String str91 = graph79.name;
    graph79.init();
    graph79.setName("");
    node1.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test452"); }


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
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    graph28.init();
    graph28.init();
    node17.setOwner(graph28);
    node17.setOwnerNameDirectly("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    java.lang.String str47 = graph41.name;
    graph41.name = "";
    node17.setOwner(graph41);
    graph10.addNode(node17);
    node17.setOwnerNameDirectly("");
    node17.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test453"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
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
    node24.setOwnerNameDirectly("[graph]");
    node24.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    graph45.setName("[graph]");
    java.lang.String str51 = graph45.name;
    node24.setOwner(graph45);
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerName("");
    Graph graph63 = new Graph();
    java.lang.String str64 = graph63.name;
    node54.setOwner(graph63);
    graph63.init();
    graph63.setName("hi!");
    java.lang.String str69 = graph63.name;
    node24.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node24);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test454"); }


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
    node1.setOwnerName("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.name = "[graph]";
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
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerNameDirectly("");
    graph25.addNode(node44);
    node44.setOwnerNameDirectly("[graph]");
    node44.setOwnerName("[graph]");
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node44);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test455"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.init();
    java.lang.String str7 = graph0.name;
    graph0.init();
    java.lang.String str9 = graph0.name;
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
    node11.setOwnerName("hi!");
    node11.setOwnerName("hi!");
    node11.setOwnerName("hi!");
    node11.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = graph0.getDegree(node11);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test456"); }


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
    graph10.init();
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    graph16.setName("");
    graph16.name = "[graph]";
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
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("");
    graph16.addNode(node35);
    node35.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = graph10.getDegree(node35);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test457"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
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
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    java.lang.String str49 = graph43.name;
    graph43.name = "";
    node19.setOwner(graph43);
    node19.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test458"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node1.getDegree();

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test459"); }


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
    node25.setOwnerName("hi!");
    node25.setOwnerName("");
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test460"); }


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
    node10.setOwnerNameDirectly("hi!");
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    node10.setOwner(graph32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node10.getDegree();

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test461"); }


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
    node1.setOwnerNameDirectly("");
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
    graph54.init();
    graph54.setName("hi!");
    graph54.init();
    node1.setOwner(graph54);
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    graph62.setName("[graph]");
    graph62.name = "[graph]";
    java.lang.String str70 = graph62.name;
    java.lang.String str71 = graph62.name;
    graph62.name = "";
    graph62.setName("");
    java.lang.String str76 = graph62.name;
    node1.setOwner(graph62);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node1.getDegree();

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test462"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    Node node6 = new Node("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    node6.setOwner(graph7);
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerName("hi!");
    node6.setOwnerName("");
    node6.setOwnerName("hi!");
    node6.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = graph0.getDegree(node6);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test463"); }


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
    node4.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test464"); }


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
    node10.setOwnerNameDirectly("hi!");
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
    graph47.setName("hi!");
    graph47.name = "";
    graph47.setName("");
    graph47.setName("[graph]");
    node31.setOwner(graph47);
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("");
    node31.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node31);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test465"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    graph8.setName("");
    graph8.setName("[graph]");
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
    node18.setOwnerName("hi!");
    graph8.addNode(node18);
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    graph37.setName("");
    node18.setOwner(graph37);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerNameDirectly("");
    graph0.addNode(node18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = node18.getDegree();

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test466"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test467"); }


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
    node8.setOwnerNameDirectly("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("[graph]");
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
    graph24.addNode(node34);
    node34.setOwnerName("[graph]");
    node34.setOwnerName("hi!");
    node34.setOwnerName("");
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    node59.setOwnerNameDirectly("hi!");
    Node node69 = new Node("hi!");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    node69.setOwner(graph70);
    graph70.init();
    graph70.init();
    node59.setOwner(graph70);
    node34.setOwner(graph70);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node34);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test468"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    graph0.init();
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    graph15.setName("");
    node14.setOwner(graph15);
    Graph graph23 = Graph.generateGraph();
    graph23.setName("[graph]");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    graph26.setName("hi!");
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
    graph26.addNode(node33);
    graph23.addNode(node33);
    Node node52 = new Node("[graph]");
    graph23.addNode(node52);
    node14.setOwner(graph23);
    node14.setOwnerNameDirectly("");
    node14.setOwnerName("[graph]");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test469"); }


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
    node10.setOwnerName("");
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test470"); }


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
    graph0.name = "[graph]";
    java.lang.String str56 = graph0.name;
    Graph graph57 = Graph.generateGraph();
    graph57.init();
    java.lang.String str59 = graph57.name;
    java.lang.String str60 = graph57.name;
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
    graph57.addNode(node68);
    node68.setOwnerName("[graph]");
    graph0.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node68.getDegree();

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test471"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    graph8.setName("hi!");
    graph8.init();
    Graph graph17 = Graph.generateGraph();
    graph17.init();
    graph17.name = "hi!";
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerName("");
    Graph graph31 = new Graph();
    java.lang.String str32 = graph31.name;
    node22.setOwner(graph31);
    node22.setOwnerNameDirectly("hi!");
    graph17.addNode(node22);
    node22.setOwnerNameDirectly("");
    node22.setOwnerNameDirectly("hi!");
    graph8.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph0.getDegree(node22);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test472"); }


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
    node55.setOwnerNameDirectly("");
    node55.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test473"); }


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
    graph0.name = "[graph]";
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerNameDirectly("");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("");
    node30.setOwner(graph41);
    node30.setOwnerName("");
    node30.setOwnerName("hi!");
    node30.setOwnerName("");
    node30.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = graph0.getDegree(node30);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test474"); }


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
    node9.setOwnerName("[graph]");
    node9.setOwnerName("");
    node9.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test475"); }


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
    node10.setOwnerName("hi!");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node10.getDegree();

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test476"); }


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
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.init();
    graph57.init();
    node46.setOwner(graph57);
    node46.setOwnerNameDirectly("");
    node46.setOwnerName("");
    node46.setOwnerNameDirectly("");
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node46);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test477"); }


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
    graph41.setName("");
    graph41.name = "hi!";
    java.lang.String str76 = graph41.name;
    graph41.setName("[graph]");
    node10.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node10.getDegree();

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test478"); }


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
    node30.setOwnerName("[graph]");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    graph46.name = "hi!";
    graph46.init();
    graph46.setName("hi!");
    graph46.init();
    node30.setOwner(graph46);
    node30.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test479"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.init();
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerName("");
    Graph graph19 = Graph.generateGraph();
    graph19.init();
    java.lang.String str21 = graph19.name;
    node10.setOwner(graph19);
    node10.setOwnerNameDirectly("[graph]");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.init();
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
    graph25.addNode(node34);
    node34.setOwnerName("hi!");
    node34.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node10, node34);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test480"); }


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
    node10.setOwnerNameDirectly("[graph]");
    Graph graph35 = Graph.generateGraph();
    graph35.name = "";
    java.lang.String str38 = graph35.name;
    node10.setOwner(graph35);
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("hi!");
    node41.setOwnerName("");
    node41.setOwnerName("hi!");
    node41.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph35.getDegree(node41);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test481"); }


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
    graph0.setName("[graph]");
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("");
    graph0.addNode(node31);
    node31.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node31.getDegree();

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test482"); }


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
    node10.setOwnerName("");
    node10.setOwnerName("");
    node10.setOwnerName("hi!");
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
    java.lang.String str77 = graph68.name;
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
    node79.setOwnerName("");
    graph68.addNode(node79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node79);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test483"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
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
    node20.setOwnerName("");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerName("");
    graph46.addNode(node54);
    java.lang.String str66 = graph46.name;
    graph46.name = "";
    node20.setOwner(graph46);
    graph0.addNode(node20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node20.getDegree();

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test484"); }


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
    java.lang.String str20 = graph0.name;
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
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    node46.setOwner(graph64);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.setName("[graph]");
    node46.setOwner(graph68);
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    graph77.name = "hi!";
    Node node86 = new Node("");
    graph77.addNode(node86);
    node46.setOwner(graph77);
    graph0.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node46.getDegree();

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test485"); }


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
    node31.setOwnerName("[graph]");
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    graph75.setName("hi!");
    graph75.setName("[graph]");
    node31.setOwner(graph75);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerNameDirectly("hi!");
    graph10.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node31.getDegree();

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test486"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node25.getDegree();

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test487"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test488"); }


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
    node18.setOwnerName("[graph]");
    node18.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node18.getDegree();

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test489"); }


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
    node44.setOwnerName("");
    node44.setOwnerName("[graph]");
    node44.setOwnerName("[graph]");
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    node80.setOwnerName("");
    Graph graph89 = Graph.generateGraph();
    graph89.init();
    java.lang.String str91 = graph89.name;
    node80.setOwner(graph89);
    node80.setOwnerNameDirectly("[graph]");
    node80.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.addEdge(node80);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test490"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
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
    node26.setOwnerNameDirectly("[graph]");
    graph12.addNode(node26);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerNameDirectly("");
    graph12.addNode(node67);
    node67.setOwnerNameDirectly("[graph]");
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    java.lang.String str89 = graph83.name;
    graph83.init();
    graph83.setName("");
    node67.setOwner(graph83);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph0.getDegree(node67);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test491"); }


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
    graph21.init();
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    graph42.init();
    graph42.init();
    node31.setOwner(graph42);
    node31.setOwnerNameDirectly("hi!");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerName("");
    Graph graph63 = new Graph();
    java.lang.String str64 = graph63.name;
    node54.setOwner(graph63);
    graph63.setName("");
    graph63.setName("");
    graph63.name = "hi!";
    node31.setOwner(graph63);
    node31.setOwnerNameDirectly("");
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = graph21.getDegree(node31);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test492"); }


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
    node31.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test493"); }


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
    graph0.name = "";
    graph0.setName("");
    graph0.init();
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    node34.setOwner(graph45);
    node34.setOwnerNameDirectly("");
    node34.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph0.getDegree(node34);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test494"); }


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
    node10.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    graph37.addNode(node45);
    java.lang.String str57 = graph37.name;
    graph37.setName("hi!");
    node10.setOwner(graph37);
    java.lang.String str61 = graph37.name;
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph37.getDegree(node63);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test495"); }


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
    node19.setOwnerName("[graph]");
    node19.setOwnerNameDirectly("");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    graph47.setName("[graph]");
    graph47.name = "";
    java.lang.String str58 = graph47.name;
    graph47.setName("[graph]");
    graph47.name = "";
    graph47.init();
    graph47.name = "";
    graph47.init();
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    node68.setOwnerNameDirectly("");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    graph79.setName("");
    graph79.setName("");
    node68.setOwner(graph79);
    node68.setOwnerName("");
    node68.setOwnerName("[graph]");
    graph47.addNode(node68);
    node68.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.addEdge(node68);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test496"); }


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
    node1.setOwnerNameDirectly("");
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
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node35);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test497"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.init();
    Graph graph10 = new Graph();
    java.lang.String str11 = graph10.name;
    graph10.init();
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerNameDirectly("[graph]");
    graph10.addNode(node14);
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph0.getDegree(node14);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test498"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test499"); }


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
    node9.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test500"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
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
    graph12.addNode(node26);
    graph12.init();
    graph12.init();
    graph12.name = "[graph]";
    node1.setOwner(graph12);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerNameDirectly("");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    graph76.setName("");
    graph76.setName("");
    node65.setOwner(graph76);
    node65.setOwnerName("");
    node65.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node65);

  }

}
