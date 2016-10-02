
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test001"); }


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
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    graph39.init();
    graph39.init();
    node1.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = node1.getDegree();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test002"); }


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
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerNameDirectly("hi!");
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
    node68.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node33, node68);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test003"); }


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
    Node node32 = new Node("[graph]");
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("hi!");
    node34.setOwnerName("");
    node34.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node32, node34);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test004"); }


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
    graph21.name = "[graph]";
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
    node41.setOwnerNameDirectly("hi!");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerName("");
    Graph graph70 = new Graph();
    java.lang.String str71 = graph70.name;
    node61.setOwner(graph70);
    graph70.init();
    graph70.name = "[graph]";
    graph70.name = "hi!";
    graph70.init();
    java.lang.String str79 = graph70.name;
    graph70.name = "hi!";
    node41.setOwner(graph70);
    Node node84 = new Node("hi!");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    node84.setOwner(graph85);
    node84.setOwnerNameDirectly("hi!");
    node84.setOwnerNameDirectly("");
    node84.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node41, node84);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test005"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node49);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test006"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node1.getDegree();

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test007"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node36);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test008"); }


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
    java.lang.String str43 = graph33.name;
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
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerNameDirectly("");
    node54.setOwnerNameDirectly("");
    node54.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph33.addNode(node54);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test009"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test010"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test011"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    java.lang.String str3 = graph0.name;
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
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
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
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    graph52.setName("");
    node33.setOwner(graph52);
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node33.setOwner(graph63);
    node33.setOwnerNameDirectly("[graph]");
    graph19.addNode(node33);
    node5.setOwner(graph19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph0.getDegree(node5);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test012"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test013"); }


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
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node34.setOwnerName("");
    Graph graph43 = new Graph();
    java.lang.String str44 = graph43.name;
    node34.setOwner(graph43);
    node34.setOwnerNameDirectly("hi!");
    node34.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node34);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test014"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test015"); }


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
    graph28.name = "[graph]";
    java.lang.String str36 = graph28.name;
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
    node38.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph28.getDegree(node38);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test016"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.init();
    graph0.name = "";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("[graph]");
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
    graph12.addNode(node22);
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    java.lang.String str42 = graph40.name;
    java.lang.String str43 = graph40.name;
    node22.setOwner(graph40);
    node22.setOwnerName("[graph]");
    graph0.addNode(node22);
    node22.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test017"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test018"); }


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
    node65.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node65);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test019"); }


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
    java.lang.String str34 = graph28.name;
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    node36.setOwnerName("[graph]");
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = graph28.getDegree(node36);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test020"); }


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
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    node32.setOwnerName("[graph]");
    node32.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node32);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test021"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    graph2.init();
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("[graph]");
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
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerNameDirectly("");
    node32.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node11, node32);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test022"); }


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
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    graph43.setName("hi!");
    node32.setOwner(graph43);
    node32.setOwnerName("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    graph64.init();
    graph64.init();
    node53.setOwner(graph64);
    node53.setOwnerNameDirectly("hi!");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerName("");
    Graph graph85 = new Graph();
    java.lang.String str86 = graph85.name;
    node76.setOwner(graph85);
    graph85.setName("");
    graph85.setName("");
    graph85.name = "hi!";
    node53.setOwner(graph85);
    node32.setOwner(graph85);
    node32.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node32);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test023"); }


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
    graph13.setName("[graph]");
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
    graph13.addNode(node32);
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("");
    node56.setOwnerName("[graph]");
    node56.setOwnerName("[graph]");
    graph13.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node56);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test024"); }


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
    graph21.name = "";
    graph21.name = "";
    graph21.name = "[graph]";
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
    node65.setOwnerName("hi!");
    node65.setOwnerNameDirectly("");
    node65.setOwnerNameDirectly("hi!");
    graph21.addNode(node65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = graph0.getDegree(node65);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test025"); }


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
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    graph16.setName("hi!");
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
    graph16.addNode(node23);
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    graph52.init();
    graph52.init();
    node41.setOwner(graph52);
    node41.setOwnerNameDirectly("hi!");
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
    graph73.name = "hi!";
    node41.setOwner(graph73);
    graph16.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph0.getDegree(node41);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test026"); }


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
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.name = "hi!";
    graph25.setName("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
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
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    graph65.setName("");
    node46.setOwner(graph65);
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node46.setOwner(graph76);
    node46.setOwnerNameDirectly("[graph]");
    graph32.addNode(node46);
    graph25.addNode(node46);
    node18.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node18);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test027"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test028"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.setName("[graph]");
    Node node5 = new Node("hi!");
    Graph graph6 = Graph.generateGraph();
    graph6.setName("");
    graph6.init();
    java.lang.String str10 = graph6.name;
    node5.setOwner(graph6);
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerName("");
    node5.setOwnerNameDirectly("");
    node5.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = graph0.getDegree(node5);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test029"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node35.getDegree();

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test030"); }


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
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node32);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test031"); }


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
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node20.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test032"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("hi!");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test033"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test034"); }


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
    node31.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = node31.getDegree();

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test035"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test036"); }


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
    node34.setOwnerName("");
    node34.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node34);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test037"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = node1.getDegree();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test038"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.init();
    graph0.setName("[graph]");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    graph5.setName("");
    graph5.name = "[graph]";
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
    graph5.addNode(node24);
    node24.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph0.getDegree(node24);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test039"); }


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
    java.lang.String str35 = graph25.name;
    graph25.init();
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
    node38.setOwnerName("[graph]");
    node38.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph25.getDegree(node38);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test040"); }


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
    graph68.setName("");
    graph68.setName("");
    graph68.name = "";
    graph68.setName("hi!");
    java.lang.String str79 = graph68.name;
    node10.setOwner(graph68);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test041"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test042"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test043"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test044"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test045"); }


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
    int i21 = node1.getDegree();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test046"); }


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
    java.lang.String str30 = graph21.name;
    graph21.name = "";
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
    node41.setOwnerName("[graph]");
    node41.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = graph21.getDegree(node41);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test047"); }


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
    node8.thisIsNotCalled();

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test048"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = node51.getDegree();

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test049"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test050"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node55);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test051"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    java.lang.String str11 = graph2.name;
    Node node13 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = graph2.getDegree(node13);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test052"); }


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
    node43.setOwnerNameDirectly("hi!");
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
    node43.setOwner(graph67);
    node43.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node43);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test053"); }


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
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node17.setOwner(graph37);
    graph37.init();
    Node node46 = new Node("");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("[graph]");
    graph37.addNode(node46);
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
    graph68.setName("");
    graph68.setName("");
    graph68.name = "";
    node46.setOwner(graph68);
    node46.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph2.getDegree(node46);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test054"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
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
    graph28.setName("");
    graph28.init();
    graph28.setName("hi!");
    node17.setOwner(graph28);
    node17.setOwnerName("hi!");
    node17.setOwnerName("hi!");
    node17.setOwnerName("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("");
    graph41.init();
    graph41.setName("[graph]");
    graph41.name = "";
    graph41.init();
    node17.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test055"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.init();
    graph0.name = "";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("[graph]");
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
    graph12.addNode(node22);
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    java.lang.String str42 = graph40.name;
    java.lang.String str43 = graph40.name;
    node22.setOwner(graph40);
    node22.setOwnerName("[graph]");
    graph0.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = node22.getDegree();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test056"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test057"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.setName("[graph]");
    graph0.name = "hi!";
    Node node9 = new Node("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.setName("");
    graph10.init();
    java.lang.String str14 = graph10.name;
    node9.setOwner(graph10);
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerNameDirectly("");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    graph20.setName("");
    node9.setOwner(graph20);
    node9.setOwnerName("");
    node9.setOwnerName("");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerName("");
    Graph graph44 = new Graph();
    java.lang.String str45 = graph44.name;
    node35.setOwner(graph44);
    graph44.setName("");
    graph44.setName("");
    graph44.name = "";
    graph44.setName("hi!");
    java.lang.String str55 = graph44.name;
    node9.setOwner(graph44);
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node58.setOwnerNameDirectly("hi!");
    node58.setOwnerName("");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.setName("hi!");
    node58.setOwner(graph69);
    node58.setOwnerName("hi!");
    node58.setOwnerName("hi!");
    node58.setOwnerName("hi!");
    node58.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node9, node58);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test058"); }


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
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    graph20.name = "[graph]";
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    graph29.setName("");
    graph29.setName("[graph]");
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
    node39.setOwnerName("hi!");
    graph29.addNode(node39);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerNameDirectly("");
    graph20.addNode(node39);
    node39.setOwnerNameDirectly("[graph]");
    node39.setOwnerName("[graph]");
    node39.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.addEdge(node39);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test059"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test060"); }


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
    Node node21 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = graph0.getDegree(node21);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test061"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    Node node4 = new Node("");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    graph5.setName("");
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("[graph]");
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
    node40.setOwnerName("");
    node40.setOwnerName("");
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node74.setOwnerName("");
    Graph graph83 = new Graph();
    java.lang.String str84 = graph83.name;
    node74.setOwner(graph83);
    graph83.init();
    graph83.name = "[graph]";
    graph83.name = "hi!";
    graph83.init();
    node40.setOwner(graph83);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node4, node40);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test062"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = node10.getDegree();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test063"); }


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
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    graph32.addNode(node40);
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    graph64.init();
    graph64.init();
    node53.setOwner(graph64);
    node53.setOwnerNameDirectly("hi!");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerName("");
    Graph graph85 = new Graph();
    java.lang.String str86 = graph85.name;
    node76.setOwner(graph85);
    graph85.setName("");
    graph85.setName("");
    graph85.name = "hi!";
    node53.setOwner(graph85);
    java.lang.String str95 = graph85.name;
    graph85.init();
    node40.setOwner(graph85);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node40);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test064"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test065"); }


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
    graph12.setName("");
    graph12.name = "hi!";
    java.lang.String str47 = graph12.name;
    Graph graph48 = new Graph();
    java.lang.String str49 = graph48.name;
    graph48.init();
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerNameDirectly("[graph]");
    graph48.addNode(node52);
    node52.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = graph12.getDegree(node52);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test066"); }


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
    int i43 = node19.getDegree();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test067"); }


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
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
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
    Node node84 = new Node("hi!");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    node84.setOwner(graph85);
    graph85.setName("");
    node66.setOwner(graph85);
    graph52.addNode(node66);
    node66.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph39.getDegree(node66);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test068"); }


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
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.name = "";
    graph73.name = "hi!";
    node25.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = node25.getDegree();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test069"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node51.thisIsNotCalled();

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test070"); }


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
    int i34 = node10.getDegree();

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test071"); }


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
    java.lang.String str65 = graph10.name;
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
    node67.setOwnerName("[graph]");
    node67.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph10.getDegree(node67);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test072"); }


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
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerName("");
    Graph graph85 = new Graph();
    java.lang.String str86 = graph85.name;
    node76.setOwner(graph85);
    graph85.name = "";
    java.lang.String str90 = graph85.name;
    node53.setOwner(graph85);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph0.getDegree(node53);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test073"); }


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
    node44.setOwnerNameDirectly("[graph]");
    node44.setOwnerName("hi!");
    node44.setOwnerNameDirectly("");
    node44.setOwnerNameDirectly("hi!");
    graph0.addNode(node44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node44.getDegree();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test074"); }


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
    graph0.init();
    graph0.setName("hi!");
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = graph0.getDegree(node27);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test075"); }


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
    int i53 = node10.getDegree();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test076"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test077"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test078"); }


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
    node10.setOwnerNameDirectly("hi!");
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
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    graph44.setName("hi!");
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
    graph44.addNode(node51);
    graph44.setName("[graph]");
    node32.setOwner(graph44);
    node32.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node32);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test079"); }


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
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph0.getDegree(node31);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test080"); }


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
    node8.setOwnerName("hi!");
    node8.setOwnerName("[graph]");
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
    graph31.setName("");
    graph31.name = "hi!";
    node8.setOwner(graph31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node8);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test081"); }


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
    Node node50 = new Node("");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node50);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test082"); }


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
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph0.getDegree(node31);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test083"); }


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
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    graph43.setName("hi!");
    node32.setOwner(graph43);
    node32.setOwnerName("hi!");
    node32.setOwnerName("hi!");
    node32.setOwnerName("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.setName("");
    graph56.init();
    graph56.setName("[graph]");
    graph56.name = "";
    graph56.init();
    node32.setOwner(graph56);
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    java.lang.String str74 = graph72.name;
    graph72.setName("");
    node32.setOwner(graph72);
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    graph78.setName("hi!");
    graph78.init();
    node32.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = graph0.getDegree(node32);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test084"); }


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
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerName("");
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
    graph57.setName("[graph]");
    node38.setOwner(graph57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node38);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test085"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test086"); }


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
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node18);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test087"); }


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
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerName("");
    Graph graph51 = new Graph();
    java.lang.String str52 = graph51.name;
    node42.setOwner(graph51);
    graph51.init();
    graph51.name = "[graph]";
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node58.setOwnerNameDirectly("hi!");
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    graph69.init();
    graph69.init();
    node58.setOwner(graph69);
    node58.setOwnerNameDirectly("hi!");
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    java.lang.String str88 = graph82.name;
    graph82.name = "";
    node58.setOwner(graph82);
    graph51.addNode(node58);
    node58.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph27.getDegree(node58);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test088"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test089"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
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
    graph58.name = "[graph]";
    graph58.setName("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    graph71.setName("");
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node79.setOwnerNameDirectly("hi!");
    node79.setOwnerName("");
    graph71.addNode(node79);
    node79.setOwnerNameDirectly("hi!");
    graph58.addNode(node79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph0.getDegree(node79);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test090"); }


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
    graph12.name = "hi!";
    graph12.name = "hi!";
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    node29.setOwnerName("[graph]");
    node29.setOwnerName("");
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
    node54.setOwnerNameDirectly("[graph]");
    node54.setOwnerName("");
    node54.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph12.addEdge(node29, node54);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test091"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = graph2.getDegree(node10);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test092"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
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
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    node48.setOwner(graph59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node22, node48);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test093"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.setName("[graph]");
    graph0.setName("");
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
    node17.setOwnerNameDirectly("[graph]");
    node17.setOwnerName("hi!");
    node17.setOwnerNameDirectly("");
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
    node50.setOwnerName("hi!");
    node50.setOwnerNameDirectly("");
    node50.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node17, node50);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test094"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test095"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.init();
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
    graph36.setName("[graph]");
    graph36.name = "[graph]";
    node13.setOwner(graph36);
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    graph65.setName("[graph]");
    Node node75 = new Node("");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    graph76.setName("");
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("[graph]");
    graph65.addNode(node75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node13, node75);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test096"); }


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
    node24.setOwnerNameDirectly("hi!");
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
    graph48.init();
    graph48.name = "";
    node24.setOwner(graph48);
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
    node65.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node24, node65);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test097"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test098"); }


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
    int i30 = node10.getDegree();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test099"); }


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
    node5.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node5.getDegree();

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test100"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node14.getDegree();

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test101"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node24);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test102"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test103"); }


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
    int i76 = node11.getDegree();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test104"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node10.getDegree();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test105"); }


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
    int i62 = node28.getDegree();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test106"); }


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
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    java.lang.String str28 = graph22.name;
    graph22.init();
    node19.setOwner(graph22);
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
    graph31.setName("[graph]");
    node19.setOwner(graph31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test107"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node10.getDegree();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test108"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    Graph graph2 = Graph.generateGraph();
    graph2.name = "hi!";
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
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    graph52.setName("[graph]");
    node30.setOwner(graph52);
    node30.setOwnerName("");
    graph2.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph0.getDegree(node30);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test109"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test110"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test111"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node55.getDegree();

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test112"); }


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
    node40.setOwnerNameDirectly("[graph]");
    node40.setOwnerName("");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    graph61.setName("[graph]");
    java.lang.String str67 = graph61.name;
    node40.setOwner(graph61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node40);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test113"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test114"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
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
    node19.setOwnerName("[graph]");
    node19.setOwnerName("");
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
    graph46.setName("hi!");
    node19.setOwner(graph46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph0.getDegree(node19);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test115"); }


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
    int i60 = node28.getDegree();

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test116"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node43);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test117"); }


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
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
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
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    graph76.setName("");
    node57.setOwner(graph76);
    graph43.addNode(node57);
    graph43.init();
    graph43.init();
    graph43.name = "[graph]";
    node32.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node32);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test118"); }


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
    Graph graph61 = Graph.generateGraph();
    graph61.init();
    java.lang.String str63 = graph61.name;
    java.lang.String str64 = graph61.name;
    node43.setOwner(graph61);
    node43.setOwnerName("[graph]");
    Node node69 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node43, node69);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test119"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node1.getDegree();

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test120"); }


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
    node34.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = node34.getDegree();

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test121"); }


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
    Graph graph65 = Graph.generateGraph();
    graph65.setName("[graph]");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.setName("hi!");
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("");
    Graph graph86 = Graph.generateGraph();
    graph86.init();
    node75.setOwner(graph86);
    node75.setOwnerName("hi!");
    graph68.addNode(node75);
    graph65.addNode(node75);
    node75.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node75);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test122"); }


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
    node38.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node38);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test123"); }


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
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("[graph]");
    graph35.name = "";
    graph35.name = "";
    node10.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test124"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test125"); }


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
    node47.setOwnerName("");
    Graph graph56 = new Graph();
    java.lang.String str57 = graph56.name;
    node47.setOwner(graph56);
    node47.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.addEdge(node47);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test126"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.init();
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
    graph22.addNode(node35);
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    node35.setOwner(graph53);
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    graph57.setName("[graph]");
    node35.setOwner(graph57);
    node35.setOwnerName("");
    node35.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph0.getDegree(node35);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test127"); }


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
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("hi!");
    graph17.init();
    Graph graph26 = Graph.generateGraph();
    graph26.setName("[graph]");
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
    graph26.addNode(node36);
    node36.setOwnerName("[graph]");
    node36.setOwnerName("hi!");
    node36.setOwnerName("");
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
    node36.setOwner(graph72);
    node36.setOwnerNameDirectly("hi!");
    graph17.addNode(node36);
    node36.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node36);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test128"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "";
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
    node7.setOwnerName("[graph]");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    java.lang.String str33 = graph27.name;
    graph27.init();
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
    graph27.addNode(node43);
    node43.setOwnerName("[graph]");
    node43.setOwnerName("");
    node43.setOwnerName("");
    node43.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node7, node43);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test129"); }


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
    graph0.setName("[graph]");
    graph0.name = "";
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("[graph]");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("[graph]");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    graph49.setName("hi!");
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
    graph49.addNode(node56);
    graph46.addNode(node56);
    node56.setOwnerName("[graph]");
    node56.setOwnerName("hi!");
    graph37.addNode(node56);
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    node80.setOwnerNameDirectly("hi!");
    node80.setOwnerName("");
    node80.setOwnerName("[graph]");
    node80.setOwnerName("[graph]");
    graph37.addNode(node80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph0.getDegree(node80);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test130"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
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
    graph33.init();
    java.lang.String str35 = graph33.name;
    java.lang.String str36 = graph33.name;
    node15.setOwner(graph33);
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
    graph38.setName("[graph]");
    graph38.name = "[graph]";
    node15.setOwner(graph38);
    node15.setOwnerNameDirectly("hi!");
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
    node70.setOwnerName("");
    node70.setOwnerName("hi!");
    node70.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node15, node70);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test131"); }


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
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerName("");
    Graph graph41 = new Graph();
    java.lang.String str42 = graph41.name;
    node32.setOwner(graph41);
    graph41.init();
    graph41.name = "[graph]";
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
    java.lang.String str78 = graph72.name;
    graph72.name = "";
    node48.setOwner(graph72);
    graph41.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph0.getDegree(node48);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test132"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test133"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.setName("[graph]");
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
    graph20.setName("");
    graph20.init();
    graph20.setName("hi!");
    node9.setOwner(graph20);
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    node9.setOwner(graph29);
    graph29.init();
    Node node38 = new Node("");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    graph39.setName("");
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("[graph]");
    graph29.addNode(node38);
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
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    graph65.setName("[graph]");
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("");
    Graph graph86 = Graph.generateGraph();
    graph86.init();
    node75.setOwner(graph86);
    node75.setOwnerName("hi!");
    graph65.addNode(node75);
    graph62.addNode(node75);
    Graph graph93 = Graph.generateGraph();
    graph93.setName("");
    graph93.init();
    node75.setOwner(graph93);
    graph29.addNode(node75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph0.getDegree(node75);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test134"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.name = "";
    graph0.setName("");
    Graph graph14 = Graph.generateGraph();
    graph14.init();
    java.lang.String str16 = graph14.name;
    java.lang.String str17 = graph14.name;
    graph14.init();
    java.lang.String str19 = graph14.name;
    graph14.name = "hi!";
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
    graph39.name = "";
    graph39.setName("");
    graph39.setName("[graph]");
    node23.setOwner(graph39);
    node23.setOwnerNameDirectly("");
    graph14.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = graph0.getDegree(node23);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test135"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test136"); }


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
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    graph62.setName("");
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("[graph]");
    node61.setOwnerName("");
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("");
    Graph graph86 = Graph.generateGraph();
    graph86.setName("");
    graph86.init();
    graph86.setName("hi!");
    node75.setOwner(graph86);
    node75.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph48.addEdge(node61, node75);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test137"); }


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
    node17.setOwnerName("");
    node17.setOwnerName("hi!");
    node17.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test138"); }


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
    graph68.setName("");
    graph68.setName("");
    graph68.name = "";
    graph68.setName("hi!");
    java.lang.String str79 = graph68.name;
    node10.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = node10.getDegree();

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test139"); }


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
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    graph44.init();
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
    graph44.addNode(node53);
    node53.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph0.getDegree(node53);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test140"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test141"); }


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
    graph0.name = "";
    Graph graph35 = new Graph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerNameDirectly("[graph]");
    graph35.addNode(node39);
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    graph63.setName("hi!");
    node52.setOwner(graph63);
    graph35.addNode(node52);
    graph35.setName("");
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
    node74.setOwnerName("");
    node74.setOwnerName("hi!");
    node74.setOwnerNameDirectly("[graph]");
    node74.setOwnerName("[graph]");
    graph35.addNode(node74);
    graph0.addNode(node74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node74.thisIsNotCalled();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test142"); }


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
    node27.setOwnerName("");
    Graph graph36 = new Graph();
    java.lang.String str37 = graph36.name;
    node27.setOwner(graph36);
    node27.setOwnerNameDirectly("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
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
    graph41.addNode(node55);
    node27.setOwner(graph41);
    graph0.addNode(node27);
    node27.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = node27.getDegree();

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test143"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    java.lang.String str6 = graph0.name;
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    node8.setOwnerName("[graph]");
    node8.setOwnerName("[graph]");
    Graph graph23 = new Graph();
    java.lang.String str24 = graph23.name;
    node8.setOwner(graph23);
    graph0.addNode(node8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = node8.getDegree();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test144"); }


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
    int i46 = node8.getDegree();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test145"); }


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
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    graph40.setName("hi!");
    node29.setOwner(graph40);
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node29.setOwner(graph49);
    node29.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph21.getDegree(node29);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test146"); }


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
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node25);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test147"); }


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
    node29.setOwnerName("hi!");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test148"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node9.getDegree();

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test149"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
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
    node18.setOwnerName("[graph]");
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = graph0.getDegree(node18);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test150"); }


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
    graph12.name = "[graph]";
    Node node26 = new Node("");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    node26.setOwner(graph27);
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
    node26.setOwner(graph35);
    graph12.addNode(node26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node26.thisIsNotCalled();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test151"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    java.lang.String str6 = graph0.name;
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
    node8.setOwnerName("hi!");
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph0.getDegree(node8);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test152"); }


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
    java.lang.String str20 = graph0.name;
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
    node31.setOwnerName("");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    node53.setOwnerName("[graph]");
    node53.setOwnerName("[graph]");
    node53.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node31, node53);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test153"); }


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
    graph0.name = "";
    graph0.init();
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
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    graph56.setName("");
    node37.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph0.getDegree(node37);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test154"); }


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
    node1.setOwnerName("");
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("hi!");
    node16.setOwnerName("");
    node16.setOwnerName("hi!");
    node16.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node16);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test155"); }


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
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    java.lang.String str72 = graph66.name;
    graph66.init();
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
    graph66.addNode(node82);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node82);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test156"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node11 = new Node("");
    graph2.addNode(node11);
    Graph graph13 = Graph.generateGraph();
    graph13.setName("[graph]");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    graph16.setName("hi!");
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
    graph16.addNode(node23);
    graph13.addNode(node23);
    Graph graph41 = Graph.generateGraph();
    graph41.init();
    java.lang.String str43 = graph41.name;
    java.lang.String str44 = graph41.name;
    node23.setOwner(graph41);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    graph46.setName("hi!");
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
    graph46.addNode(node53);
    graph46.setName("[graph]");
    graph46.name = "[graph]";
    node23.setOwner(graph46);
    node23.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node23);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test157"); }


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
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    graph34.init();
    graph34.init();
    node23.setOwner(graph34);
    node23.setOwnerNameDirectly("hi!");
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
    graph55.name = "hi!";
    node23.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph18.getDegree(node23);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test158"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
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
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    graph52.setName("[graph]");
    node30.setOwner(graph52);
    node30.setOwnerName("");
    node30.setOwnerName("");
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
    graph73.init();
    graph73.name = "[graph]";
    graph73.name = "hi!";
    graph73.init();
    node30.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph0.getDegree(node30);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test159"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test160"); }


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
    int i85 = node35.getDegree();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test161"); }


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
    node69.thisIsNotCalled();

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test162"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test163"); }


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
    int i67 = node55.getDegree();

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test164"); }


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
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    graph73.setName("");
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    node81.setOwnerNameDirectly("hi!");
    node81.setOwnerName("");
    graph73.addNode(node81);
    node81.setOwnerNameDirectly("hi!");
    node81.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node81);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test165"); }


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
    java.lang.String str56 = graph47.name;
    java.lang.String str57 = graph47.name;
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    graph60.name = "hi!";
    Node node69 = new Node("");
    graph60.addNode(node69);
    Graph graph71 = new Graph();
    java.lang.String str72 = graph71.name;
    graph71.init();
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerNameDirectly("[graph]");
    graph71.addNode(node75);
    node75.setOwnerName("");
    node75.setOwnerName("[graph]");
    node75.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph47.addEdge(node69, node75);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test166"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test167"); }


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
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("[graph]");
    node60.setOwnerName("hi!");
    graph52.addNode(node60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node60.getDegree();

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test168"); }


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
    int i42 = node1.getDegree();

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test169"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node10.getDegree();

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test170"); }


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
    node55.setOwnerNameDirectly("hi!");
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    node70.setOwnerName("");
    Graph graph79 = new Graph();
    java.lang.String str80 = graph79.name;
    node70.setOwner(graph79);
    graph79.init();
    graph79.name = "";
    node55.setOwner(graph79);
    Graph graph86 = Graph.generateGraph();
    graph86.name = "";
    graph86.setName("");
    node55.setOwner(graph86);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node55);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test171"); }


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
    int i78 = node55.getDegree();

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test172"); }


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
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    graph36.name = "[graph]";
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
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerNameDirectly("");
    graph36.addNode(node55);
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("[graph]");
    node55.setOwnerName("");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph2.getDegree(node55);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test173"); }


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
    graph48.setName("[graph]");
    graph48.name = "[graph]";
    node25.setOwner(graph48);
    node25.setOwnerName("[graph]");
    node25.setOwnerName("[graph]");
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    node82.setOwnerNameDirectly("hi!");
    node82.setOwnerName("");
    node82.setOwnerName("[graph]");
    node82.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node25, node82);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test174"); }


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
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    graph34.setName("hi!");
    node23.setOwner(graph34);
    node23.setOwnerName("hi!");
    node23.setOwnerName("hi!");
    node23.setOwnerName("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    graph47.setName("");
    graph47.init();
    graph47.setName("[graph]");
    graph47.name = "";
    graph47.init();
    node23.setOwner(graph47);
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    java.lang.String str65 = graph63.name;
    graph63.setName("");
    node23.setOwner(graph63);
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.setName("hi!");
    graph69.init();
    node23.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = graph0.getDegree(node23);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test175"); }


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
    node31.setOwner(graph51);
    node31.setOwnerNameDirectly("");
    graph0.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test176"); }


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
    node7.setOwnerName("");
    node7.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node7.getDegree();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test177"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.name = "hi!";
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("[graph]");
    node10.setOwnerName("");
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
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    graph70.setName("[graph]");
    node48.setOwner(graph70);
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    graph79.name = "hi!";
    Node node88 = new Node("");
    graph79.addNode(node88);
    node48.setOwner(graph79);
    node48.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node10, node48);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test178"); }


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
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test179"); }


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
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    graph39.init();
    graph39.init();
    node1.setOwner(graph39);
    graph39.name = "";
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    graph50.setName("");
    graph50.setName("[graph]");
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
    graph50.addNode(node60);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerNameDirectly("");
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph39.getDegree(node60);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test180"); }


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
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    graph42.setName("[graph]");
    graph42.init();
    node10.setOwner(graph42);
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test181"); }


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
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    graph53.addNode(node61);
    node61.setOwnerNameDirectly("hi!");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerName("");
    Graph graph85 = new Graph();
    java.lang.String str86 = graph85.name;
    node76.setOwner(graph85);
    graph85.setName("");
    graph85.setName("");
    graph85.name = "";
    graph85.setName("hi!");
    node61.setOwner(graph85);
    node61.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node34.addEdge(node61);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test182"); }


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
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    graph39.init();
    graph39.init();
    node1.setOwner(graph39);
    graph39.name = "hi!";
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    graph62.init();
    graph62.init();
    node51.setOwner(graph62);
    node51.setOwnerNameDirectly("hi!");
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    java.lang.String str81 = graph75.name;
    graph75.name = "";
    node51.setOwner(graph75);
    node51.setOwnerNameDirectly("");
    node51.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph39.getDegree(node51);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test183"); }


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
    graph17.addNode(node31);
    node31.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node31);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test184"); }


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
    graph10.name = "hi!";
    graph10.setName("[graph]");
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    graph26.setName("");
    node25.setOwner(graph26);
    node25.setOwnerNameDirectly("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    graph48.init();
    graph48.init();
    node37.setOwner(graph48);
    graph48.name = "";
    graph48.name = "[graph]";
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    java.lang.String str69 = graph63.name;
    graph63.init();
    graph63.name = "hi!";
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
    node74.setOwnerName("[graph]");
    node74.setOwnerName("[graph]");
    graph63.addNode(node74);
    graph48.addNode(node74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node25, node74);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test185"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test186"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node1.getDegree();

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test187"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.name = "";
    graph0.setName("");
    Node node15 = new Node("");
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    java.lang.String str24 = graph18.name;
    graph18.init();
    node15.setOwner(graph18);
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
    graph27.setName("[graph]");
    node15.setOwner(graph27);
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph0.getDegree(node15);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test188"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test189"); }


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
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node25.getDegree();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test190"); }


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
    Graph graph66 = Graph.generateGraph();
    graph66.setName("[graph]");
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
    graph66.addNode(node76);
    node10.setOwner(graph66);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test191"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node14.getDegree();

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test192"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test193"); }


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
    node39.setOwnerName("");
    Graph graph50 = Graph.generateGraph();
    graph50.init();
    node39.setOwner(graph50);
    node39.setOwnerName("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    graph55.setName("");
    graph55.init();
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
    graph55.addNode(node64);
    graph55.setName("hi!");
    graph55.name = "";
    graph55.setName("");
    graph55.setName("[graph]");
    node39.setOwner(graph55);
    node39.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph0.getDegree(node39);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test194"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test195"); }


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
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    java.lang.String str30 = graph24.name;
    graph24.init();
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    graph32.addNode(node40);
    graph24.addNode(node40);
    node40.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph18.getDegree(node40);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test196"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test197"); }


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
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    graph59.setName("hi!");
    graph59.name = "";
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    graph67.setName("");
    graph67.init();
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
    graph67.addNode(node76);
    node76.setOwnerName("[graph]");
    graph59.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node43.addEdge(node76);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test198"); }


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
    int i46 = node24.getDegree();

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test199"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node21.getDegree();

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test200"); }


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
    node4.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test201"); }


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
    graph0.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node68.thisIsNotCalled();

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test202"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test203"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
    graph2.init();
    java.lang.String str14 = graph2.name;
    graph2.init();
    Graph graph16 = new Graph();
    java.lang.String str17 = graph16.name;
    graph16.init();
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("[graph]");
    graph16.addNode(node20);
    node20.setOwnerName("");
    node20.setOwnerName("[graph]");
    Graph graph36 = Graph.generateGraph();
    graph36.name = "hi!";
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
    node64.setOwner(graph82);
    Graph graph86 = Graph.generateGraph();
    graph86.setName("");
    graph86.init();
    graph86.setName("[graph]");
    node64.setOwner(graph86);
    node64.setOwnerName("");
    graph36.addNode(node64);
    node64.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node20, node64);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test204"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test205"); }


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
    node46.thisIsNotCalled();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test206"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node25.getDegree();

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test207"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node8.getDegree();

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test208"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test209"); }


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
    node19.setOwnerName("");
    node19.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test210"); }


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
    node49.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph0.getDegree(node49);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test211"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test212"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test213"); }


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
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test214"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node43.getDegree();

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test215"); }


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
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test216"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = node30.getDegree();

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test217"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.setName("[graph]");
    graph0.init();
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
    node20.setOwnerNameDirectly("hi!");
    Node node69 = new Node("hi!");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    node69.setOwner(graph70);
    node69.setOwnerName("");
    Graph graph78 = new Graph();
    java.lang.String str79 = graph78.name;
    node69.setOwner(graph78);
    graph78.setName("");
    graph78.setName("");
    graph78.name = "";
    graph78.setName("hi!");
    java.lang.String str89 = graph78.name;
    node20.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = graph0.getDegree(node20);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test218"); }


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
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test219"); }


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
    graph11.setName("");
    graph11.init();
    graph11.setName("");
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
    node30.setOwnerNameDirectly("hi!");
    graph11.addNode(node30);
    graph2.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test220"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node10.getDegree();

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test221"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test222"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = node9.getDegree();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test223"); }


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
    node27.setOwnerName("");
    Graph graph36 = new Graph();
    java.lang.String str37 = graph36.name;
    node27.setOwner(graph36);
    node27.setOwnerNameDirectly("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
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
    graph41.addNode(node55);
    node27.setOwner(graph41);
    graph0.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node27.getDegree();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test224"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
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
    node13.setOwnerName("[graph]");
    node13.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = graph0.getDegree(node13);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test225"); }


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
    node1.setOwnerName("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test226"); }


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
    node1.setOwnerName("hi!");
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    graph83.setName("");
    graph83.init();
    node1.setOwner(graph83);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node1.getDegree();

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test227"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node10.getDegree();

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test228"); }


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
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerName("");
    Graph graph29 = new Graph();
    java.lang.String str30 = graph29.name;
    node20.setOwner(graph29);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph10.getDegree(node20);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test229"); }


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
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test230"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = node18.getDegree();

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test231"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = node1.getDegree();

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test232"); }


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
    graph10.name = "hi!";
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
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    graph39.setName("");
    graph39.setName("");
    graph39.init();
    node23.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = graph10.getDegree(node23);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test233"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = node1.getDegree();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test234"); }


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
    graph2.name = "";
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerName("");
    Graph graph46 = new Graph();
    java.lang.String str47 = graph46.name;
    node37.setOwner(graph46);
    node37.setOwnerNameDirectly("hi!");
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
    graph61.init();
    graph61.name = "";
    node37.setOwner(graph61);
    Graph graph68 = Graph.generateGraph();
    graph68.name = "";
    graph68.setName("");
    node37.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph2.getDegree(node37);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test235"); }


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
    graph43.setName("[graph]");
    java.lang.String str49 = graph43.name;
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    node51.setOwnerName("[graph]");
    node51.setOwnerName("[graph]");
    Graph graph66 = new Graph();
    java.lang.String str67 = graph66.name;
    node51.setOwner(graph66);
    graph43.addNode(node51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph12.getDegree(node51);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test236"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test237"); }


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
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.name = "";
    graph73.name = "hi!";
    node25.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test238"); }


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
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    graph80.setName("");
    graph80.setName("");
    graph80.init();
    graph80.init();
    node10.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = node10.getDegree();

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test239"); }


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
    node22.setOwnerNameDirectly("[graph]");
    node22.setOwnerName("hi!");
    node22.setOwnerNameDirectly("");
    node22.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test240"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test241"); }


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
    int i39 = node1.getDegree();

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test242"); }


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
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    graph43.name = "[graph]";
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
    graph43.addNode(node62);
    node62.setOwnerNameDirectly("[graph]");
    graph0.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = node62.getDegree();

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test243"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test244"); }


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
    graph40.name = "hi!";
    graph40.name = "";
    java.lang.String str48 = graph40.name;
    graph40.init();
    graph40.name = "";
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("");
    graph52.addNode(node60);
    graph52.init();
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node74.setOwnerNameDirectly("hi!");
    node74.setOwnerName("");
    node74.setOwnerName("[graph]");
    node74.setOwnerName("");
    graph52.addNode(node74);
    node74.setOwnerNameDirectly("");
    graph40.addNode(node74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node74);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test245"); }


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
    graph10.init();
    graph10.name = "hi!";
    graph10.init();
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("hi!");
    node24.setOwnerName("");
    node24.setOwnerName("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerNameDirectly("");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    graph51.setName("");
    node40.setOwner(graph51);
    node24.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph10.getDegree(node24);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test246"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test247"); }


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
    java.lang.String str30 = graph21.name;
    graph21.name = "";
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
    Graph graph61 = Graph.generateGraph();
    graph61.init();
    java.lang.String str63 = graph61.name;
    java.lang.String str64 = graph61.name;
    node43.setOwner(graph61);
    node43.setOwnerNameDirectly("[graph]");
    node43.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph21.getDegree(node43);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test248"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = node25.getDegree();

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test249"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test250"); }


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
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node29);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test251"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
    java.lang.String str5 = graph0.name;
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
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("");
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = graph0.getDegree(node18);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test252"); }


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
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    node13.setOwner(graph24);
    node13.setOwnerName("[graph]");
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
    graph39.setName("");
    graph39.setName("");
    graph39.name = "";
    graph39.init();
    node13.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node13);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test253"); }


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
    graph21.setName("[graph]");
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
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    graph44.setName("hi!");
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
    graph44.addNode(node51);
    graph44.setName("[graph]");
    node32.setOwner(graph44);
    node32.setOwnerNameDirectly("");
    node32.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = graph21.getDegree(node32);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test254"); }


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
    node23.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test255"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    Node node3 = new Node("hi!");
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    java.lang.String str8 = graph4.name;
    node3.setOwner(graph4);
    node3.setOwnerNameDirectly("hi!");
    node3.setOwnerNameDirectly("[graph]");
    node3.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node3);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test256"); }


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
    node32.setOwnerName("hi!");
    Graph graph82 = new Graph();
    graph82.name = "";
    graph82.name = "[graph]";
    node32.setOwner(graph82);
    graph18.addNode(node32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node32.thisIsNotCalled();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test257"); }


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
    int i98 = node10.getDegree();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test258"); }


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
    java.lang.String str50 = graph44.name;
    graph44.init();
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("");
    graph52.addNode(node60);
    graph44.addNode(node60);
    node60.setOwnerName("[graph]");
    node60.setOwnerName("");
    node60.setOwnerName("");
    graph35.addNode(node60);
    Graph graph80 = Graph.generateGraph();
    node60.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node60);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test259"); }


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
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    graph81.setName("");
    node62.setOwner(graph81);
    node62.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph17.getDegree(node62);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test260"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node74.setOwnerName("[graph]");

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test261"); }


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
    node7.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test262"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test263"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.name = "";
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
    node21.setOwnerNameDirectly("[graph]");
    node21.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph2.getDegree(node21);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test264"); }


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
    node4.setOwnerNameDirectly("");
    node4.setOwnerNameDirectly("hi!");
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
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerName("");
    Graph graph77 = new Graph();
    java.lang.String str78 = graph77.name;
    node68.setOwner(graph77);
    graph77.setName("");
    graph77.name = "hi!";
    graph77.init();
    node49.setOwner(graph77);
    node49.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.addEdge(node49);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test265"); }


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
    node17.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test266"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node10.getDegree();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test267"); }


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
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerName("[graph]");
    node73.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.addEdge(node73);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test268"); }


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
    node18.thisIsNotCalled();

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test269"); }


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
    node18.thisIsNotCalled();

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test270"); }


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
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    graph63.init();
    graph63.init();
    node52.setOwner(graph63);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("[graph]");
    node52.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph0.getDegree(node52);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test271"); }


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
    Graph graph35 = new Graph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerNameDirectly("[graph]");
    graph35.addNode(node39);
    node39.setOwnerName("");
    node39.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node39);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test272"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerNameDirectly("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    graph15.init();
    graph15.init();
    node4.setOwner(graph15);
    node4.setOwnerNameDirectly("");
    node4.setOwnerName("");
    node4.setOwnerNameDirectly("");
    node4.setOwnerNameDirectly("hi!");
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerName("");
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
    graph52.setName("[graph]");
    node33.setOwner(graph52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node4, node33);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test273"); }


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
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = node1.getDegree();

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test274"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "";
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
    graph33.init();
    java.lang.String str35 = graph33.name;
    java.lang.String str36 = graph33.name;
    node15.setOwner(graph33);
    node15.setOwnerName("[graph]");
    node15.setOwnerName("");
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerNameDirectly("");
    node43.setOwnerName("hi!");
    node43.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node15, node43);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test275"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test276"); }


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
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    graph48.init();
    graph48.init();
    node37.setOwner(graph48);
    node37.setOwnerNameDirectly("hi!");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    java.lang.String str67 = graph61.name;
    graph61.name = "";
    node37.setOwner(graph61);
    node37.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.addEdge(node37);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test277"); }


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
    int i82 = graph10.getDegree(node41);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test278"); }


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
    int i59 = node1.getDegree();

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test279"); }


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
    graph0.setName("");
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("hi!");
    node27.setOwnerName("");
    node27.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph0.getDegree(node27);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test280"); }


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
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    graph20.init();
    graph20.init();
    node9.setOwner(graph20);
    node9.setOwnerNameDirectly("");
    node9.setOwnerName("");
    node9.setOwnerNameDirectly("");
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
    node36.setOwnerName("hi!");
    node36.setOwnerName("hi!");
    node36.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node36);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test281"); }


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
    node21.thisIsNotCalled();

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test282"); }


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
    graph0.init();
    graph0.name = "";
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    java.lang.String str48 = graph42.name;
    graph42.init();
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    graph50.setName("");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node58.setOwnerNameDirectly("hi!");
    node58.setOwnerName("");
    graph50.addNode(node58);
    graph42.addNode(node58);
    node58.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node58);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test283"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = node1.getDegree();

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test284"); }


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
    node48.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test285"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test286"); }


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
    Node node27 = new Node("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
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
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    graph71.setName("");
    node52.setOwner(graph71);
    graph38.addNode(node52);
    graph38.init();
    graph38.init();
    graph38.name = "[graph]";
    node27.setOwner(graph38);
    node27.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test287"); }


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
    node36.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node36);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test288"); }


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
    node17.setOwnerNameDirectly("hi!");
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
    graph47.setName("[graph]");
    graph47.name = "[graph]";
    graph47.name = "[graph]";
    node17.setOwner(graph47);
    node17.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph0.getDegree(node17);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test289"); }


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
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    node10.setOwner(graph21);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node10);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test290"); }


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
    graph10.init();
    graph10.name = "hi!";
    graph10.init();
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
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    graph52.init();
    graph52.init();
    node41.setOwner(graph52);
    graph52.name = "";
    graph52.init();
    graph52.name = "hi!";
    node24.setOwner(graph52);
    node24.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph10.getDegree(node24);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test291"); }


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
    graph39.setName("[graph]");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    graph54.name = "[graph]";
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    graph63.setName("");
    graph63.setName("[graph]");
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
    graph63.addNode(node73);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerNameDirectly("");
    graph54.addNode(node73);
    node73.setOwnerNameDirectly("[graph]");
    node73.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph39.getDegree(node73);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test292"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test293"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test294"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node10.getDegree();

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test295"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test296"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node38.getDegree();

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test297"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test298"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test299"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test300"); }


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
    int i67 = node48.getDegree();

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test301"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test302"); }


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
    graph66.name = "";
    node35.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test303"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test304"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    graph2.init();
    graph2.init();
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
    node13.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = graph2.getDegree(node13);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test305"); }


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
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("hi!");
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
    node49.setOwnerName("[graph]");
    node49.setOwnerName("");
    node49.setOwnerName("");
    node49.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node20, node49);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test306"); }


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
    node14.setOwnerNameDirectly("[graph]");
    node14.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = graph0.getDegree(node14);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test307"); }


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
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    graph19.init();
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
    graph19.addNode(node28);
    node28.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node28);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test308"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node1.getDegree();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test309"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node9.getDegree();

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test310"); }


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
    java.lang.String str35 = graph25.name;
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
    graph25.addNode(node61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node61.getDegree();

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test311"); }


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
    node79.setOwnerName("");
    node79.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node79);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test312"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = node10.getDegree();

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test313"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node8.getDegree();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test314"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = node1.getDegree();

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test315"); }


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
    graph68.setName("");
    graph68.setName("");
    graph68.name = "";
    graph68.setName("hi!");
    java.lang.String str79 = graph68.name;
    node10.setOwner(graph68);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = node10.getDegree();

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test316"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test317"); }


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
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    graph27.init();
    graph27.init();
    node16.setOwner(graph27);
    node16.setOwnerNameDirectly("hi!");
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    java.lang.String str46 = graph40.name;
    graph40.name = "";
    node16.setOwner(graph40);
    node16.setOwnerNameDirectly("");
    node16.setOwnerName("");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node16, node55);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test318"); }


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
    int i69 = node55.getDegree();

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test319"); }


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
    Graph graph15 = Graph.generateGraph();
    graph15.name = "hi!";
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
    graph30.addNode(node43);
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    node43.setOwner(graph61);
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    graph65.setName("[graph]");
    node43.setOwner(graph65);
    node43.setOwnerName("");
    graph15.addNode(node43);
    node43.setOwnerNameDirectly("");
    node43.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph10.getDegree(node43);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test320"); }


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
    node10.setOwnerNameDirectly("");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node55);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test321"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test322"); }


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
    node29.setOwnerName("[graph]");
    node29.setOwnerName("hi!");
    node29.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph16.getDegree(node29);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test323"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node1.getDegree();

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test324"); }


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
    int i86 = node1.getDegree();

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test325"); }


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
    graph49.addNode(node62);
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    node62.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node62);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test326"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node10.getDegree();

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test327"); }


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
    java.lang.String str34 = graph28.name;
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    java.lang.String str43 = graph37.name;
    graph37.init();
    Graph graph45 = Graph.generateGraph();
    graph45.setName("");
    graph45.init();
    java.lang.String str49 = graph45.name;
    graph45.setName("");
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("");
    graph45.addNode(node53);
    graph37.addNode(node53);
    node53.setOwnerName("[graph]");
    node53.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph28.getDegree(node53);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test328"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node1.getDegree();

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test329"); }


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
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    node73.setOwnerNameDirectly("hi!");
    node73.setOwnerName("");
    node73.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node73);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test330"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test331"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test332"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test333"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.init();
    graph0.setName("[graph]");
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
    graph25.setName("[graph]");
    node13.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph0.getDegree(node13);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test334"); }


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
    graph10.name = "hi!";
    java.lang.String str18 = graph10.name;
    graph10.name = "hi!";
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
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerNameDirectly("");
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerNameDirectly("");
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph10.getDegree(node31);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test335"); }


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
    node44.setOwnerNameDirectly("[graph]");
    node44.setOwnerName("hi!");
    node44.setOwnerNameDirectly("");
    node44.setOwnerNameDirectly("hi!");
    graph0.addNode(node44);
    node44.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = node44.getDegree();

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test336"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = node1.getDegree();

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test337"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.thisIsNotCalled();

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test338"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.setName("[graph]");
    java.lang.String str12 = graph0.name;
    graph0.setName("");
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    graph27.setName("hi!");
    node16.setOwner(graph27);
    node16.setOwnerName("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    graph48.init();
    graph48.init();
    node37.setOwner(graph48);
    node37.setOwnerNameDirectly("hi!");
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
    graph69.name = "hi!";
    node37.setOwner(graph69);
    node16.setOwner(graph69);
    node16.setOwnerName("");
    node16.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph0.getDegree(node16);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test339"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test340"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node15.thisIsNotCalled();

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test341"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    graph12.setName("[graph]");
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
    graph12.addNode(node31);
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    node55.setOwnerName("[graph]");
    node55.setOwnerName("[graph]");
    graph12.addNode(node55);
    node55.setOwnerName("[graph]");
    node55.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node55);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test342"); }


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
    node44.setOwnerNameDirectly("[graph]");
    node44.setOwnerName("hi!");
    node44.setOwnerNameDirectly("");
    node44.setOwnerNameDirectly("hi!");
    graph0.addNode(node44);
    node44.setOwnerName("");
    node44.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test343"); }


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
    node69.setOwnerNameDirectly("hi!");
    node69.setOwnerName("hi!");
    node69.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.addEdge(node69);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test344"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
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
    Graph graph38 = Graph.generateGraph();
    graph38.init();
    java.lang.String str40 = graph38.name;
    java.lang.String str41 = graph38.name;
    node20.setOwner(graph38);
    graph38.init();
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
    graph38.addNode(node45);
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
    java.lang.String str82 = graph74.name;
    graph74.init();
    node45.setOwner(graph74);
    node45.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph0.getDegree(node45);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test345"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    Node node4 = new Node("hi!");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    java.lang.String str9 = graph5.name;
    node4.setOwner(graph5);
    node4.setOwnerName("");
    Graph graph13 = Graph.generateGraph();
    graph13.init();
    java.lang.String str15 = graph13.name;
    node4.setOwner(graph13);
    graph13.name = "[graph]";
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
    graph19.init();
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    node41.setOwnerName("[graph]");
    node41.setOwnerName("");
    graph19.addNode(node41);
    node41.setOwnerNameDirectly("");
    graph13.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph0.getDegree(node41);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test346"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    graph24.setName("hi!");
    node13.setOwner(graph24);
    node13.setOwnerName("hi!");
    node13.setOwnerName("hi!");
    node13.setOwnerName("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("");
    graph37.init();
    graph37.setName("[graph]");
    graph37.name = "";
    graph37.init();
    node13.setOwner(graph37);
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    java.lang.String str55 = graph53.name;
    graph53.setName("");
    node13.setOwner(graph53);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    graph59.setName("hi!");
    graph59.init();
    node13.setOwner(graph59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node11, node13);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test347"); }


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
    Node node57 = new Node("hi!");
    graph0.addNode(node57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node57.thisIsNotCalled();

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test348"); }


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
    node35.setOwnerName("[graph]");
    node35.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph10.getDegree(node35);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test349"); }


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
    graph12.name = "hi!";
    java.lang.String str20 = graph12.name;
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
    Graph graph49 = Graph.generateGraph();
    graph49.init();
    java.lang.String str51 = graph49.name;
    java.lang.String str52 = graph49.name;
    node31.setOwner(graph49);
    node31.setOwnerName("[graph]");
    node31.setOwnerName("");
    graph12.addNode(node31);
    Graph graph59 = new Graph();
    java.lang.String str60 = graph59.name;
    graph59.init();
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerNameDirectly("[graph]");
    graph59.addNode(node63);
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
    graph59.addNode(node76);
    graph12.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node76);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test350"); }


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
    int i14 = node1.getDegree();

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test351"); }


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
    node48.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node48.getDegree();

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test352"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    graph0.name = "";
    graph0.init();
    Node node7 = new Node("hi!");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    java.lang.String str12 = graph8.name;
    node7.setOwner(graph8);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerNameDirectly("");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    graph18.setName("");
    node7.setOwner(graph18);
    node7.setOwnerName("");
    node7.setOwnerName("");
    Graph graph32 = Graph.generateGraph();
    graph32.name = "hi!";
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
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    graph50.setName("");
    graph50.setName("[graph]");
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
    graph50.addNode(node60);
    graph47.addNode(node60);
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    node60.setOwner(graph78);
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    graph82.setName("[graph]");
    node60.setOwner(graph82);
    node60.setOwnerName("");
    graph32.addNode(node60);
    node7.setOwner(graph32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph0.getDegree(node7);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test353"); }


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
    node10.setOwnerName("hi!");
    Graph graph60 = new Graph();
    graph60.name = "";
    graph60.name = "[graph]";
    node10.setOwner(graph60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node10.getDegree();

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test354"); }


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
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerName("");
    Graph graph51 = new Graph();
    java.lang.String str52 = graph51.name;
    node42.setOwner(graph51);
    node42.setOwnerNameDirectly("hi!");
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
    graph66.name = "";
    node42.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node42);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test355"); }


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
    node55.setOwnerName("");
    Graph graph64 = new Graph();
    java.lang.String str65 = graph64.name;
    node55.setOwner(graph64);
    graph64.setName("");
    graph64.name = "hi!";
    graph64.init();
    java.lang.String str72 = graph64.name;
    graph64.init();
    node35.setOwner(graph64);
    node35.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test356"); }


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
    java.lang.String str53 = graph47.name;
    graph47.init();
    graph47.name = "";
    node25.setOwner(graph47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node25.getDegree();

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test357"); }


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
    node31.thisIsNotCalled();

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test358"); }


    Graph graph0 = Graph.generateGraph();
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
    node30.setOwnerName("hi!");
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    java.lang.String str58 = graph52.name;
    graph52.init();
    graph52.name = "";
    node30.setOwner(graph52);
    graph0.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node30.getDegree();

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test359"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    java.lang.String str3 = graph0.name;
    Graph graph4 = Graph.generateGraph();
    graph4.setName("");
    graph4.init();
    graph4.setName("[graph]");
    graph4.name = "[graph]";
    java.lang.String str12 = graph4.name;
    java.lang.String str13 = graph4.name;
    graph4.init();
    Node node16 = new Node("hi!");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("");
    node16.setOwnerNameDirectly("");
    node16.setOwnerNameDirectly("[graph]");
    graph4.addNode(node16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = graph0.getDegree(node16);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test360"); }


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
    int i91 = node48.getDegree();

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test361"); }


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
    node11.setOwnerNameDirectly("[graph]");

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test362"); }


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
    java.lang.String str19 = graph10.name;
    java.lang.String str20 = graph10.name;
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    node22.setOwner(graph33);
    node22.setOwnerName("hi!");
    node22.setOwnerName("hi!");
    node22.setOwnerName("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    graph46.setName("");
    graph46.init();
    graph46.setName("[graph]");
    graph46.name = "";
    graph46.init();
    node22.setOwner(graph46);
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    java.lang.String str64 = graph62.name;
    graph62.setName("");
    node22.setOwner(graph62);
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.setName("hi!");
    graph68.init();
    node22.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node22);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test363"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node44.getDegree();

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test364"); }


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
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node55.getDegree();

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test365"); }


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
    node59.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node59);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test366"); }


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
    Node node57 = new Node("hi!");
    graph0.addNode(node57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node57.setOwnerNameDirectly("hi!");

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test367"); }


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
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    graph61.name = "hi!";
    graph61.name = "";
    node44.setOwner(graph61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node44);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test368"); }


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
    node47.setOwnerName("");
    node47.setOwnerName("");
    graph22.addNode(node47);
    node47.setOwnerName("hi!");
    node47.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node47);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test369"); }


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
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    node15.setOwnerName("[graph]");
    node15.setOwnerName("");
    node15.setOwnerNameDirectly("");
    node15.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node15);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test370"); }


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
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test371"); }


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
    graph12.name = "hi!";
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    java.lang.String str30 = graph26.name;
    graph26.setName("");
    graph26.name = "[graph]";
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
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerNameDirectly("");
    graph26.addNode(node45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = graph12.getDegree(node45);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test372"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test373"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    java.lang.String str7 = graph0.name;
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
    node18.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph0.getDegree(node18);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test374"); }


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
    Node node57 = new Node("hi!");
    graph0.addNode(node57);
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
    node60.setOwnerNameDirectly("[graph]");
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    graph80.setName("hi!");
    graph80.setName("[graph]");
    graph80.name = "[graph]";
    node60.setOwner(graph80);
    graph80.setName("");
    java.lang.String str95 = graph80.name;
    node57.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node57.getDegree();

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test375"); }


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
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerName("");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    graph60.setName("hi!");
    node49.setOwner(graph60);
    node49.setOwnerName("hi!");
    node49.setOwnerName("hi!");
    node49.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph2.getDegree(node49);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test376"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node18.getDegree();

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test377"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    java.lang.String str7 = graph0.name;
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
    node18.setOwnerName("[graph]");
    node18.setOwnerName("hi!");
    node18.setOwnerName("");
    node18.setOwnerName("");
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
    java.lang.String str64 = graph44.name;
    graph44.name = "";
    node18.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph0.getDegree(node18);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test378"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = node14.getDegree();

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test379"); }


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
    graph35.setName("hi!");
    node24.setOwner(graph35);
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    node24.setOwner(graph44);
    graph44.init();
    Node node53 = new Node("");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("[graph]");
    graph44.addNode(node53);
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
    graph75.name = "";
    node53.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node53);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test380"); }


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
    node22.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test381"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("[graph]");

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test382"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.setName("[graph]");
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
    graph2.addNode(node12);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("");
    node12.setOwnerNameDirectly("hi!");
    graph0.addNode(node12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node12.getDegree();

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test383"); }


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
    node38.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test384"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i2 = node1.getDegree();

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test385"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    graph0.name = "";
    graph0.init();
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerNameDirectly("");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    graph22.setName("");
    graph22.setName("");
    node11.setOwner(graph22);
    node11.setOwnerName("");
    node11.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph0.getDegree(node11);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test386"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
    java.lang.String str10 = graph0.name;
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
    graph11.setName("[graph]");
    graph11.name = "[graph]";
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    graph39.setName("hi!");
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
    graph39.addNode(node46);
    node46.setOwnerName("");
    node46.setOwnerNameDirectly("[graph]");
    graph11.addNode(node46);
    node46.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph0.getDegree(node46);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test387"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test388"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test389"); }


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
    node39.setOwnerName("hi!");
    graph29.addNode(node39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node39.thisIsNotCalled();

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test390"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node18.getDegree();

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test391"); }


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
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    graph62.name = "hi!";
    graph62.init();
    graph62.setName("hi!");
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
    graph62.addNode(node74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node74);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test392"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test393"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
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
    node15.setOwnerName("");
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
    graph33.init();
    java.lang.String str63 = graph33.name;
    node15.setOwner(graph33);
    Graph graph65 = Graph.generateGraph();
    graph65.init();
    java.lang.String str67 = graph65.name;
    java.lang.String str68 = graph65.name;
    graph65.init();
    java.lang.String str70 = graph65.name;
    graph65.name = "[graph]";
    node15.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph0.getDegree(node15);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test394"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test395"); }


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
    graph68.setName("");
    graph68.setName("");
    graph68.name = "hi!";
    node36.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node36);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test396"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node18.getDegree();

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test397"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node25.getDegree();

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test398"); }


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
    graph10.init();
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
    node29.setOwnerName("hi!");
    graph10.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = node29.getDegree();

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test399"); }


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
    node37.thisIsNotCalled();

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test400"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test401"); }


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
    node54.setOwnerName("[graph]");
    node54.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.addEdge(node54);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test402"); }


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
    node33.setOwnerNameDirectly("[graph]");
    node33.setOwnerName("");
    node33.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node33);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test403"); }


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
    graph0.init();
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
    node18.setOwnerNameDirectly("[graph]");
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    graph38.setName("hi!");
    graph38.setName("[graph]");
    graph38.name = "[graph]";
    node18.setOwner(graph38);
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph0.getDegree(node18);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test404"); }


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
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    graph25.init();
    graph25.init();
    node14.setOwner(graph25);
    graph25.name = "";
    graph25.init();
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    graph39.setName("");
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
    java.lang.String str78 = graph72.name;
    graph72.name = "";
    node48.setOwner(graph72);
    node48.setOwnerNameDirectly("hi!");
    graph39.addNode(node48);
    graph25.addNode(node48);
    Node node87 = new Node("hi!");
    Graph graph88 = Graph.generateGraph();
    graph88.setName("");
    graph88.init();
    java.lang.String str92 = graph88.name;
    node87.setOwner(graph88);
    node87.setOwnerNameDirectly("hi!");
    node87.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node48, node87);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test405"); }


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
    graph12.name = "[graph]";
    Node node26 = new Node("");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    node26.setOwner(graph27);
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
    node26.setOwner(graph35);
    graph12.addNode(node26);
    node26.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node26.getDegree();

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test406"); }


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
    graph10.name = "";
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerNameDirectly("[graph]");
    node49.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph10.getDegree(node49);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test407"); }


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
    Node node68 = new Node("[graph]");
    graph39.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node68);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test408"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
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
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("[graph]");
    node13.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = graph0.getDegree(node13);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test409"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.thisIsNotCalled();

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test410"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test411"); }


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
    java.lang.String str15 = graph10.name;
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
    node26.setOwnerNameDirectly("");
    node26.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node26);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test412"); }


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
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerName("");
    node61.setOwnerName("[graph]");
    node61.setOwnerName("");
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
    node77.setOwnerName("[graph]");
    node77.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph36.addEdge(node61, node77);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test413"); }


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
    graph35.name = "";
    graph35.setName("");
    java.lang.String str67 = graph35.name;
    graph35.setName("[graph]");
    node10.setOwner(graph35);
    Graph graph71 = new Graph();
    java.lang.String str72 = graph71.name;
    graph71.init();
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerNameDirectly("[graph]");
    graph71.addNode(node75);
    graph71.init();
    graph71.init();
    node10.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test414"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node10.getDegree();

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test415"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node35.getDegree();

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test416"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    graph2.init();
    graph2.name = "hi!";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("[graph]");
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
    graph12.addNode(node22);
    Graph graph40 = Graph.generateGraph();
    graph40.init();
    java.lang.String str42 = graph40.name;
    java.lang.String str43 = graph40.name;
    node22.setOwner(graph40);
    graph40.init();
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    graph58.setName("hi!");
    node47.setOwner(graph58);
    graph40.addNode(node47);
    node47.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph2.getDegree(node47);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test417"); }


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
    int i95 = node1.getDegree();

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test418"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
    graph0.init();
    graph0.init();
    Node node13 = new Node("hi!");
    Graph graph14 = Graph.generateGraph();
    graph14.setName("");
    graph14.init();
    java.lang.String str18 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    node13.setOwner(graph24);
    graph24.name = "hi!";
    graph24.name = "[graph]";
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
    graph86.name = "hi!";
    graph86.init();
    node58.setOwner(graph86);
    graph24.addNode(node58);
    node58.setOwnerName("[graph]");
    graph0.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node58.thisIsNotCalled();

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test419"); }


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
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerName("");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    node37.setOwner(graph48);
    node37.setOwnerName("hi!");
    node37.setOwnerName("hi!");
    node37.setOwnerName("hi!");
    node37.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node37);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test420"); }


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
    java.lang.String str19 = graph10.name;
    java.lang.String str20 = graph10.name;
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("[graph]");
    node22.setOwnerName("[graph]");
    node22.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node22);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test421"); }


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
    int i33 = node14.getDegree();

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test422"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node17.getDegree();

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test423"); }


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
    node45.setOwnerName("hi!");
    node45.setOwnerName("");
    node45.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph32.getDegree(node45);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test424"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test425"); }


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
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    java.lang.String str35 = graph29.name;
    graph29.init();
    node26.setOwner(graph29);
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
    graph38.setName("[graph]");
    node26.setOwner(graph38);
    node26.setOwnerNameDirectly("");
    node26.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node26);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test426"); }


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
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.setName("[graph]");
    java.lang.String str29 = graph23.name;
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    node31.setOwnerName("[graph]");
    Graph graph46 = new Graph();
    java.lang.String str47 = graph46.name;
    node31.setOwner(graph46);
    graph23.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node31);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test427"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test428"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node37.thisIsNotCalled();

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test429"); }


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
    graph0.setName("[graph]");
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
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("[graph]");
    node25.setOwnerName("[graph]");
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = graph0.getDegree(node25);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test430"); }


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
    int i60 = node18.getDegree();

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test431"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node1.getDegree();

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test432"); }


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
    int i35 = node10.getDegree();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test433"); }


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
    node56.thisIsNotCalled();

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test434"); }


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
    node10.setOwnerName("[graph]");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    java.lang.String str45 = graph39.name;
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    graph48.setName("");
    graph48.init();
    graph48.setName("");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    graph59.addNode(node67);
    node67.setOwnerNameDirectly("hi!");
    graph48.addNode(node67);
    graph39.addNode(node67);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node67);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test435"); }


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
    node30.thisIsNotCalled();

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test436"); }


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
    java.lang.String str31 = graph0.name;
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.setName("[graph]");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("[graph]");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    graph44.setName("hi!");
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
    graph44.addNode(node51);
    graph41.addNode(node51);
    node51.setOwnerName("[graph]");
    node51.setOwnerName("hi!");
    graph32.addNode(node51);
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("");
    node75.setOwnerName("[graph]");
    node75.setOwnerName("[graph]");
    graph32.addNode(node75);
    node75.setOwnerName("[graph]");
    node75.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph0.getDegree(node75);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test437"); }


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
    graph8.name = "hi!";
    Node node17 = new Node("");
    graph8.addNode(node17);
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("");
    node20.setOwner(graph31);
    graph8.addNode(node20);
    node20.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph0.getDegree(node20);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test438"); }


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
    Node node54 = new Node("");
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    java.lang.String str63 = graph57.name;
    graph57.init();
    node54.setOwner(graph57);
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
    graph66.setName("[graph]");
    node54.setOwner(graph66);
    node54.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph21.getDegree(node54);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test439"); }


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
    node31.setOwner(graph51);
    node31.setOwnerNameDirectly("");
    graph0.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node31.getDegree();

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test440"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
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
    node24.setOwnerNameDirectly("[graph]");
    node24.setOwnerName("[graph]");
    graph0.addNode(node24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = node24.getDegree();

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test441"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node10.getDegree();

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test442"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "";
    graph0.init();
    java.lang.String str15 = graph0.name;
    Node node17 = new Node("");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    graph18.setName("");
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerNameDirectly("[graph]");
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
    node31.setOwnerName("");
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
    graph49.init();
    java.lang.String str79 = graph49.name;
    node31.setOwner(graph49);
    Graph graph81 = Graph.generateGraph();
    graph81.init();
    java.lang.String str83 = graph81.name;
    java.lang.String str84 = graph81.name;
    graph81.init();
    java.lang.String str86 = graph81.name;
    graph81.name = "[graph]";
    node31.setOwner(graph81);
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node17, node31);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test443"); }


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
    node38.thisIsNotCalled();

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test444"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node45);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test445"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
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
    node58.setOwnerName("");
    Graph graph67 = new Graph();
    java.lang.String str68 = graph67.name;
    node58.setOwner(graph67);
    graph67.setName("");
    graph67.setName("");
    graph67.name = "hi!";
    node35.setOwner(graph67);
    graph10.addNode(node35);
    node35.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph0.getDegree(node35);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test446"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test447"); }


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
    graph21.init();
    java.lang.String str25 = graph21.name;
    graph21.setName("");
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    graph21.addNode(node29);
    node29.setOwnerName("[graph]");
    node29.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph12.getDegree(node29);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test448"); }


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
    node45.setOwnerNameDirectly("[graph]");
    node45.setOwnerName("hi!");
    node45.setOwnerNameDirectly("");
    node45.setOwnerNameDirectly("[graph]");
    node45.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph0.getDegree(node45);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test449"); }


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
    node40.setOwnerNameDirectly("[graph]");
    node40.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph0.getDegree(node40);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test450"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.init();
    java.lang.String str10 = graph0.name;
    graph0.setName("hi!");
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
    graph13.init();
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("");
    node35.setOwnerName("[graph]");
    node35.setOwnerName("");
    graph13.addNode(node35);
    node35.setOwnerNameDirectly("");
    node35.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph0.getDegree(node35);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test451"); }


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
    java.lang.String str31 = graph0.name;
    Graph graph32 = new Graph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerNameDirectly("[graph]");
    graph32.addNode(node36);
    node36.setOwnerName("");
    node36.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph0.getDegree(node36);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test452"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test453"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = node1.getDegree();

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test454"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test455"); }


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
    node1.setOwnerNameDirectly("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
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
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    graph77.setName("");
    node58.setOwner(graph77);
    graph44.addNode(node58);
    graph44.init();
    node1.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node1.getDegree();

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test456"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test457"); }


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
    node27.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph16.addNode(node27);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test458"); }


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
    node72.setOwnerNameDirectly("[graph]");
    node72.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph12.getDegree(node72);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test459"); }


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
    node1.setOwnerNameDirectly("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
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
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    graph77.setName("");
    node58.setOwner(graph77);
    graph44.addNode(node58);
    graph44.init();
    node1.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test460"); }


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
    java.lang.String str35 = graph25.name;
    graph25.init();
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
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    graph54.init();
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
    graph54.addNode(node63);
    graph54.setName("hi!");
    graph54.name = "";
    graph54.setName("");
    graph54.setName("[graph]");
    node38.setOwner(graph54);
    node38.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = graph25.getDegree(node38);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test461"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.setName("");
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
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerName("");
    node13.setOwnerNameDirectly("");
    node13.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = graph0.getDegree(node13);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test462"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test463"); }


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
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test464"); }


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
    Graph graph60 = Graph.generateGraph();
    graph60.init();
    java.lang.String str62 = graph60.name;
    java.lang.String str63 = graph60.name;
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    graph64.setName("[graph]");
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
    graph64.addNode(node74);
    node74.setOwnerNameDirectly("hi!");
    node74.setOwnerNameDirectly("");
    graph60.addNode(node74);
    node74.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node74);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test465"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test466"); }


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
    graph75.name = "hi!";
    graph75.init();
    node47.setOwner(graph75);
    graph75.name = "[graph]";
    graph75.setName("hi!");
    graph75.setName("hi!");
    graph75.name = "";
    node8.setOwner(graph75);
    node8.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node8.getDegree();

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test467"); }


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
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node35.setOwner(graph55);
    graph55.init();
    Node node64 = new Node("");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("[graph]");
    graph55.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph2.getDegree(node64);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test468"); }


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
    graph0.setName("");
    graph0.setName("[graph]");
    Graph graph35 = new Graph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    Node node39 = new Node("hi!");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("hi!");
    node39.setOwnerNameDirectly("[graph]");
    graph35.addNode(node39);
    node39.setOwnerName("");
    node39.setOwnerName("hi!");
    node39.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = graph0.getDegree(node39);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test469"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = node10.getDegree();

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test470"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test471"); }


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
    node68.thisIsNotCalled();

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test472"); }


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
    node77.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node74.addEdge(node77);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test473"); }


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
    Node node29 = new Node("hi!");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    node29.setOwner(graph30);
    java.lang.String str36 = graph30.name;
    graph30.init();
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
    graph30.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node46);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test474"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    java.lang.String str4 = graph0.name;
    graph0.setName("hi!");
    graph0.name = "hi!";
    graph0.name = "";
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
    Graph graph73 = Graph.generateGraph();
    graph73.init();
    java.lang.String str75 = graph73.name;
    java.lang.String str76 = graph73.name;
    node55.setOwner(graph73);
    node55.setOwnerName("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    graph80.setName("");
    graph80.setName("[graph]");
    graph80.name = "";
    graph80.name = "";
    node55.setOwner(graph80);
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node21, node55);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test475"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    java.lang.String str6 = graph0.name;
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
    node8.setOwnerName("[graph]");
    node8.setOwnerName("[graph]");
    Graph graph23 = new Graph();
    java.lang.String str24 = graph23.name;
    node8.setOwner(graph23);
    graph0.addNode(node8);
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test476"); }


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
    int i92 = node55.getDegree();

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test477"); }


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
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    graph37.init();
    graph37.init();
    node26.setOwner(graph37);
    node26.setOwnerNameDirectly("");
    node26.setOwnerName("");
    node26.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph12.getDegree(node26);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test478"); }


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
    java.lang.String str30 = graph21.name;
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
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    graph60.setName("");
    node41.setOwner(graph60);
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    node41.setOwner(graph71);
    node41.setOwnerNameDirectly("[graph]");
    node41.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph21.getDegree(node41);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test479"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test480"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "";
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
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerNameDirectly("");
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerNameDirectly("");
    node15.setOwnerNameDirectly("[graph]");
    node15.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph0.getDegree(node15);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test481"); }


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
    java.lang.String str51 = graph45.name;
    graph45.init();
    graph45.name = "hi!";
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
    node56.setOwnerName("[graph]");
    node56.setOwnerName("[graph]");
    graph45.addNode(node56);
    graph45.name = "[graph]";
    node25.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node25.getDegree();

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test482"); }


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
    java.lang.String str84 = graph72.name;
    node1.setOwner(graph72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test483"); }


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
    graph76.setName("hi!");
    node65.setOwner(graph76);
    Node node84 = new Node("hi!");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    node84.setOwner(graph85);
    node65.setOwner(graph85);
    node65.setOwnerNameDirectly("[graph]");
    node65.setOwnerNameDirectly("[graph]");
    graph53.addNode(node65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node65.getDegree();

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test484"); }


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
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test485"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test486"); }


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
    graph21.setName("hi!");
    graph21.name = "hi!";
    Node node91 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph21.getDegree(node91);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test487"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node10.getDegree();

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test488"); }


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
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    graph79.setName("[graph]");
    node57.setOwner(graph79);
    node57.setOwnerName("");
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node57);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test489"); }


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
    node14.setOwner(graph69);
    node14.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = node14.getDegree();

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test490"); }


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
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerNameDirectly("");
    node29.setOwnerNameDirectly("[graph]");
    graph10.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.thisIsNotCalled();

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test491"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node21.getDegree();

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test492"); }


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
    Node node76 = new Node("");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    graph77.setName("");
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node20.addEdge(node76);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test493"); }


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
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    graph32.init();
    graph32.init();
    node21.setOwner(graph32);
    node21.setOwnerNameDirectly("hi!");
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
    graph53.setName("");
    graph53.name = "hi!";
    node21.setOwner(graph53);
    java.lang.String str63 = graph53.name;
    graph53.init();
    node8.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test494"); }


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
    node14.thisIsNotCalled();

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test495"); }


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
    node55.setOwnerName("");
    Graph graph64 = new Graph();
    java.lang.String str65 = graph64.name;
    node55.setOwner(graph64);
    graph64.setName("");
    graph64.name = "hi!";
    graph64.init();
    java.lang.String str72 = graph64.name;
    graph64.init();
    node35.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node35.getDegree();

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test496"); }


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
    node28.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = node28.getDegree();

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test497"); }


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
    node66.setOwnerName("");
    node66.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.addEdge(node66);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test498"); }


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
    node45.setOwnerName("");
    node45.setOwnerName("");
    graph21.addNode(node45);
    node45.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node45.thisIsNotCalled();

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test499"); }


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
    graph0.setName("");
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph0.getDegree(node55);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test500"); }


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
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    node32.setOwner(graph33);
    Graph graph41 = Graph.generateGraph();
    graph41.setName("[graph]");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    graph44.setName("hi!");
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
    graph44.addNode(node51);
    graph41.addNode(node51);
    Node node70 = new Node("[graph]");
    graph41.addNode(node70);
    node32.setOwner(graph41);
    node32.setOwnerNameDirectly("");
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerName("");
    Graph graph85 = new Graph();
    java.lang.String str86 = graph85.name;
    node76.setOwner(graph85);
    graph85.init();
    graph85.setName("hi!");
    graph85.init();
    node32.setOwner(graph85);
    graph0.addNode(node32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node32.thisIsNotCalled();

  }

}
