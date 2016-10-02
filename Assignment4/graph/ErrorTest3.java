
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test001"); }


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
    node12.setOwnerName("hi!");
    node12.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = node12.getDegree();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test002"); }


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
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node14.getDegree();

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test003"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.name = "[graph]";
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
    node39.setOwnerNameDirectly("hi!");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerName("");
    Graph graph71 = new Graph();
    java.lang.String str72 = graph71.name;
    node62.setOwner(graph71);
    graph71.setName("");
    graph71.setName("");
    graph71.name = "hi!";
    node39.setOwner(graph71);
    java.lang.String str81 = graph71.name;
    graph71.init();
    node11.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph0.getDegree(node11);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test004"); }


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
    node9.thisIsNotCalled();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test005"); }


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
    Graph graph26 = Graph.generateGraph();
    graph26.name = "";
    graph26.name = "";
    graph26.setName("hi!");
    graph26.name = "hi!";
    graph26.init();
    Graph graph36 = Graph.generateGraph();
    graph36.setName("[graph]");
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
    graph36.addNode(node46);
    node46.setOwnerNameDirectly("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    graph66.name = "hi!";
    node46.setOwner(graph66);
    node46.setOwnerName("");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    graph75.setName("");
    graph75.setName("[graph]");
    graph75.name = "";
    java.lang.String str86 = graph75.name;
    graph75.init();
    graph75.init();
    node46.setOwner(graph75);
    graph26.addNode(node46);
    node46.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.addEdge(node46);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test006"); }


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
    int i94 = node18.getDegree();

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test007"); }


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
    node8.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node8.getDegree();

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test008"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test009"); }


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
    graph35.init();
    graph35.name = "[graph]";
    graph35.name = "hi!";
    graph35.init();
    java.lang.String str44 = graph35.name;
    graph35.name = "hi!";
    node1.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = node1.getDegree();

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test010"); }


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
    int i63 = node9.getDegree();

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test011"); }


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
    node31.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test012"); }


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
    Graph graph60 = Graph.generateGraph();
    graph60.init();
    java.lang.String str62 = graph60.name;
    java.lang.String str63 = graph60.name;
    graph60.setName("[graph]");
    java.lang.String str66 = graph60.name;
    node10.setOwner(graph60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test013"); }


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
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerNameDirectly("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    graph44.setName("");
    node33.setOwner(graph44);
    node33.setOwnerName("");
    node33.setOwnerName("hi!");
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
    node33.setOwner(graph58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = graph0.getDegree(node33);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test014"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
    java.lang.String str13 = graph2.name;
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerNameDirectly("");
    node15.setOwnerName("");
    node15.setOwnerNameDirectly("");
    graph2.addNode(node15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node15.thisIsNotCalled();

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test015"); }


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
    node50.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph35.getDegree(node50);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test016"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node1.getDegree();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test017"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    graph36.init();
    graph36.name = "[graph]";
    graph36.init();
    graph36.init();
    graph36.name = "[graph]";
    graph36.name = "";
    node1.setOwner(graph36);
    Graph graph53 = Graph.generateGraph();
    graph53.init();
    java.lang.String str55 = graph53.name;
    node1.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = node1.getDegree();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test018"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test019"); }


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
    node25.setOwnerName("hi!");
    node25.setOwnerName("[graph]");
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
    graph48.name = "hi!";
    node25.setOwner(graph48);
    graph0.addNode(node25);
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test020"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test021"); }


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
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("[graph]");
    graph37.name = "";
    java.lang.String str48 = graph37.name;
    graph37.setName("[graph]");
    graph37.name = "";
    graph37.init();
    graph37.name = "";
    graph37.init();
    node10.setOwner(graph37);
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    graph58.setName("[graph]");
    graph58.name = "[graph]";
    java.lang.String str66 = graph58.name;
    java.lang.String str67 = graph58.name;
    graph58.name = "hi!";
    node10.setOwner(graph58);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test022"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.setName("[graph]");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.name = "[graph]";
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
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerNameDirectly("");
    graph9.addNode(node28);
    node28.setOwnerNameDirectly("[graph]");
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph0.getDegree(node28);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test023"); }


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
    int i93 = node69.getDegree();

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test024"); }


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
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node1.getDegree();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test025"); }


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
    graph25.name = "";
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerNameDirectly("");
    node38.setOwnerName("");
    node38.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph25.getDegree(node38);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test026"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    graph0.setName("[graph]");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph0.getDegree(node15);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test027"); }


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
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test028"); }


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
    Graph graph77 = new Graph();
    graph77.init();
    node35.setOwner(graph77);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test029"); }


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
    node44.setOwnerNameDirectly("hi!");
    node44.setOwnerName("");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    graph60.setName("");
    graph60.setName("");
    graph60.init();
    node44.setOwner(graph60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = graph12.getDegree(node44);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test030"); }


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
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    java.lang.String str29 = graph23.name;
    graph23.init();
    graph23.name = "hi!";
    node12.setOwner(graph23);
    graph0.addNode(node12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node12.thisIsNotCalled();

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test031"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.name = "";
    graph0.setName("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    graph11.setName("hi!");
    graph11.init();
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
    node30.setOwnerName("[graph]");
    node30.setOwnerName("hi!");
    node30.setOwnerName("");
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
    node30.setOwner(graph66);
    node30.setOwnerNameDirectly("hi!");
    graph11.addNode(node30);
    node30.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node30);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test032"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test033"); }


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
    graph10.init();
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    graph24.name = "hi!";
    graph24.init();
    graph24.setName("hi!");
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
    graph24.addNode(node36);
    node36.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph10.getDegree(node36);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test034"); }


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
    Graph graph52 = new Graph();
    java.lang.String str53 = graph52.name;
    graph52.init();
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerNameDirectly("[graph]");
    graph52.addNode(node56);
    node56.setOwnerName("");
    node56.setOwnerName("hi!");
    node56.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph0.getDegree(node56);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test035"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test036"); }


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
    node18.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test037"); }


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
    int i20 = node4.getDegree();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test038"); }


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
    node14.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = node14.getDegree();

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test039"); }


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
    node20.setOwnerName("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    graph31.setName("hi!");
    node20.setOwner(graph31);
    node20.setOwnerName("hi!");
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
    node20.setOwner(graph73);
    node20.setOwnerName("");
    node20.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph10.getDegree(node20);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test040"); }


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
    graph0.setName("");
    graph0.setName("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    node49.setOwnerNameDirectly("hi!");
    Node node59 = new Node("hi!");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    node59.setOwner(graph60);
    graph60.init();
    graph60.init();
    node49.setOwner(graph60);
    node49.setOwnerNameDirectly("hi!");
    node49.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node49);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test041"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.setName("[graph]");
    graph0.name = "hi!";
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
    graph30.init();
    Node node39 = new Node("");
    Graph graph40 = Graph.generateGraph();
    graph40.setName("");
    graph40.init();
    java.lang.String str44 = graph40.name;
    graph40.setName("");
    node39.setOwner(graph40);
    node39.setOwnerNameDirectly("[graph]");
    graph30.addNode(node39);
    graph30.name = "hi!";
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
    node54.setOwnerName("");
    graph30.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node54);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test042"); }


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
    Graph graph35 = Graph.generateGraph();
    graph35.setName("[graph]");
    graph35.name = "[graph]";
    graph35.setName("hi!");
    graph35.init();
    node18.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node18.getDegree();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test043"); }


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
    node74.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node74.thisIsNotCalled();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test044"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test045"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test046"); }


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
    graph19.setName("");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    graph42.name = "hi!";
    graph42.name = "";
    java.lang.String str50 = graph42.name;
    graph42.init();
    graph42.name = "";
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
    graph54.init();
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerName("");
    node76.setOwnerName("[graph]");
    node76.setOwnerName("");
    graph54.addNode(node76);
    node76.setOwnerNameDirectly("");
    graph42.addNode(node76);
    graph19.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph10.getDegree(node76);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test047"); }


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
    graph0.name = "[graph]";
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
    graph0.addNode(node31);
    node31.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node31.getDegree();

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test048"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Graph graph11 = Graph.generateGraph();
    graph11.init();
    graph11.name = "hi!";
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
    node16.setOwnerNameDirectly("hi!");
    graph11.addNode(node16);
    node16.setOwnerNameDirectly("");
    node16.setOwnerNameDirectly("hi!");
    graph2.addNode(node16);
    Graph graph36 = new Graph();
    java.lang.String str37 = graph36.name;
    graph36.setName("[graph]");
    graph36.init();
    node16.setOwner(graph36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node16.thisIsNotCalled();

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test049"); }


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
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test050"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test051"); }


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
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("");
    graph29.addNode(node40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node40.thisIsNotCalled();

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test052"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test053"); }


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
    node14.thisIsNotCalled();

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test054"); }


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
    int i32 = node1.getDegree();

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test055"); }


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
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("hi!");
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test056"); }


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
    node1.setOwnerName("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    graph21.init();
    java.lang.String str25 = graph21.name;
    node20.setOwner(graph21);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test057"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    Graph graph2 = new Graph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    Node node6 = new Node("hi!");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    node6.setOwner(graph7);
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerNameDirectly("[graph]");
    graph2.addNode(node6);
    node6.setOwnerName("");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("[graph]");
    node6.setOwner(graph20);
    node6.setOwnerNameDirectly("[graph]");
    node6.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node6);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test058"); }


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
    node1.addEdge(node46);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test059"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = node37.getDegree();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test060"); }


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
    graph43.name = "hi!";
    graph43.name = "";
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
    Graph graph71 = Graph.generateGraph();
    node56.setOwner(graph71);
    node56.setOwnerNameDirectly("[graph]");
    graph43.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph33.getDegree(node56);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test061"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node10.getDegree();

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test062"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node1.getDegree();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test063"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test064"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test065"); }


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
    graph2.setName("");
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
    graph2.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test066"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test067"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.thisIsNotCalled();

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test068"); }


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
    Graph graph33 = Graph.generateGraph();
    graph33.name = "";
    java.lang.String str36 = graph33.name;
    java.lang.String str37 = graph33.name;
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
    node48.setOwnerNameDirectly("[graph]");
    graph33.addNode(node48);
    node48.setOwnerName("[graph]");
    node48.setOwnerName("[graph]");
    node48.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node48);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test069"); }


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
    java.lang.String str17 = graph2.name;
    java.lang.String str18 = graph2.name;
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    graph19.name = "hi!";
    graph19.name = "";
    java.lang.String str27 = graph19.name;
    java.lang.String str28 = graph19.name;
    Graph graph29 = Graph.generateGraph();
    graph29.setName("[graph]");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    graph32.setName("hi!");
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
    graph32.addNode(node39);
    graph29.addNode(node39);
    node39.setOwnerName("[graph]");
    node39.setOwnerName("hi!");
    node39.setOwnerName("");
    node39.setOwnerName("");
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
    java.lang.String str85 = graph65.name;
    graph65.name = "";
    node39.setOwner(graph65);
    graph19.addNode(node39);
    node39.setOwnerName("");
    node39.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph2.getDegree(node39);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test070"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    java.lang.String str11 = graph0.name;
    graph0.init();
    graph0.init();
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph0.getDegree(node24);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test071"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test072"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test073"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
    java.lang.String str5 = graph0.name;
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
    graph6.name = "";
    graph6.name = "";
    graph6.name = "[graph]";
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
    node50.setOwnerNameDirectly("hi!");
    graph6.addNode(node50);
    graph0.addNode(node50);
    java.lang.String str77 = graph0.name;
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node79.setOwnerNameDirectly("hi!");
    node79.setOwnerName("");
    node79.setOwnerName("[graph]");
    node79.setOwnerNameDirectly("hi!");
    graph0.addNode(node79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node79.thisIsNotCalled();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test074"); }


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
    node14.setOwner(graph71);
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node14.getDegree();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test075"); }


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
    Graph graph31 = Graph.generateGraph();
    graph31.setName("[graph]");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    graph34.setName("hi!");
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
    graph34.addNode(node41);
    graph31.addNode(node41);
    node41.setOwnerName("[graph]");
    node41.setOwnerName("hi!");
    node41.setOwnerName("");
    node41.setOwnerName("");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    graph67.setName("");
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("");
    graph67.addNode(node75);
    java.lang.String str87 = graph67.name;
    graph67.name = "";
    node41.setOwner(graph67);
    java.lang.String str91 = graph67.name;
    node18.setOwner(graph67);
    node18.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node18.getDegree();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test076"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("[graph]");
    graph0.addNode(node11);
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
    node24.setOwnerName("hi!");
    node24.setOwnerName("hi!");
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node24);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test077"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.init();
    java.lang.String str5 = graph0.name;
    graph0.name = "hi!";
    graph0.init();
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
    node19.setOwnerName("");
    node19.setOwnerNameDirectly("");
    node19.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph0.getDegree(node19);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test078"); }


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
    graph2.init();
    graph2.setName("");
    graph2.setName("[graph]");
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
    graph19.addNode(node33);
    node33.setOwnerName("[graph]");
    node33.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = graph2.getDegree(node33);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test079"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    Graph graph14 = Graph.generateGraph();
    graph14.name = "";
    java.lang.String str17 = graph14.name;
    java.lang.String str18 = graph14.name;
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
    node29.setOwnerNameDirectly("[graph]");
    graph14.addNode(node29);
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node29);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test080"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node25.getDegree();

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test081"); }


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
    graph10.init();
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
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.init();
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
    graph32.addNode(node41);
    graph32.setName("hi!");
    graph32.name = "";
    graph32.setName("");
    graph32.setName("[graph]");
    node16.setOwner(graph32);
    node16.setOwnerNameDirectly("[graph]");
    node16.setOwnerNameDirectly("[graph]");
    node16.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph10.getDegree(node16);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test082"); }


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
    graph29.name = "hi!";
    java.lang.String str46 = graph29.name;
    graph29.name = "[graph]";
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("hi!");
    node50.setOwnerName("");
    node50.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph29.getDegree(node50);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test083"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test084"); }


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
    graph12.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerNameDirectly("");
    node22.setOwnerName("hi!");
    graph12.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test085"); }


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
    node21.thisIsNotCalled();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test086"); }


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
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test087"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test088"); }


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
    graph10.name = "[graph]";
    Graph graph19 = Graph.generateGraph();
    graph19.name = "";
    graph19.name = "";
    graph19.setName("hi!");
    graph19.name = "hi!";
    graph19.init();
    Graph graph29 = Graph.generateGraph();
    graph29.setName("[graph]");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    graph32.setName("hi!");
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
    graph32.addNode(node39);
    graph29.addNode(node39);
    node39.setOwnerNameDirectly("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    graph59.name = "hi!";
    node39.setOwner(graph59);
    node39.setOwnerName("");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    graph68.setName("");
    graph68.setName("[graph]");
    graph68.name = "";
    java.lang.String str79 = graph68.name;
    graph68.init();
    graph68.init();
    node39.setOwner(graph68);
    graph19.addNode(node39);
    node39.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node39);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test089"); }


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
    graph10.init();
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
    node23.setOwnerNameDirectly("[graph]");
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
    node53.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node23, node53);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test090"); }


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
    node11.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node11.getDegree();

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test091"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test092"); }


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
    node1.setOwnerNameDirectly("hi!");
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
    node74.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node74);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test093"); }


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
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node25.getDegree();

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test094"); }


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
    graph41.name = "hi!";
    graph41.setName("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    graph48.setName("hi!");
    graph48.name = "";
    graph48.setName("[graph]");
    Node node59 = new Node("");
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    graph60.setName("");
    node59.setOwner(graph60);
    node59.setOwnerNameDirectly("[graph]");
    graph48.addNode(node59);
    graph41.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node59);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test095"); }


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
    node17.setOwnerNameDirectly("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("");
    node17.setOwner(graph28);
    node1.setOwner(graph28);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node1.getDegree();

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test096"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test097"); }


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
    java.lang.String str60 = graph0.name;
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerName("");
    Graph graph71 = new Graph();
    java.lang.String str72 = graph71.name;
    node62.setOwner(graph71);
    node62.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph0.getDegree(node62);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test098"); }


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
    node31.setOwnerName("");
    Graph graph40 = new Graph();
    java.lang.String str41 = graph40.name;
    node31.setOwner(graph40);
    graph40.setName("");
    graph40.setName("");
    graph40.name = "";
    graph40.setName("[graph]");
    graph40.name = "[graph]";
    graph40.name = "[graph]";
    node10.setOwner(graph40);
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
    graph66.name = "hi!";
    graph66.init();
    graph66.setName("hi!");
    graph66.name = "[graph]";
    graph66.setName("");
    node10.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = node10.getDegree();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test099"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node1.getDegree();

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test100"); }


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
    graph56.setName("[graph]");
    graph56.name = "[graph]";
    java.lang.String str64 = graph56.name;
    java.lang.String str65 = graph56.name;
    graph56.init();
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
    java.lang.String str85 = graph79.name;
    graph79.init();
    graph79.name = "hi!";
    node68.setOwner(graph79);
    graph56.addNode(node68);
    node68.setOwnerNameDirectly("hi!");
    graph33.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node68.thisIsNotCalled();

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test101"); }


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
    node1.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    graph37.setName("hi!");
    node26.setOwner(graph37);
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node26.setOwner(graph46);
    graph46.init();
    Node node55 = new Node("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("[graph]");
    graph46.addNode(node55);
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
    graph77.init();
    graph77.name = "[graph]";
    node55.setOwner(graph77);
    Node node85 = new Node("hi!");
    Graph graph86 = Graph.generateGraph();
    graph86.setName("");
    graph86.init();
    java.lang.String str90 = graph86.name;
    node85.setOwner(graph86);
    node85.setOwnerNameDirectly("hi!");
    node85.setOwnerName("[graph]");
    node85.setOwnerName("hi!");
    graph77.addNode(node85);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node85);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test102"); }


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
    Graph graph16 = Graph.generateGraph();
    graph16.init();
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
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerNameDirectly("");
    node28.setOwnerNameDirectly("hi!");
    graph16.addNode(node28);
    node1.setOwner(graph16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test103"); }


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
    node17.setOwnerNameDirectly("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("");
    node17.setOwner(graph28);
    node1.setOwner(graph28);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test104"); }


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
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    graph23.setName("");
    graph23.init();
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
    graph23.addNode(node32);
    graph23.setName("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerName("");
    Graph graph61 = Graph.generateGraph();
    graph61.init();
    java.lang.String str63 = graph61.name;
    node52.setOwner(graph61);
    graph23.addNode(node52);
    graph23.setName("[graph]");
    graph23.init();
    graph23.init();
    node1.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node1.getDegree();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test105"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test106"); }


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
    java.lang.String str19 = graph10.name;
    graph10.name = "hi!";
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph10.getDegree(node32);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test107"); }


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
    node39.setOwnerName("");
    node39.setOwnerName("hi!");
    node39.setOwnerNameDirectly("[graph]");
    node39.setOwnerName("[graph]");
    graph0.addNode(node39);
    node39.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node39.thisIsNotCalled();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test108"); }


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
    Graph graph16 = Graph.generateGraph();
    graph16.init();
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
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerNameDirectly("");
    node28.setOwnerNameDirectly("hi!");
    graph16.addNode(node28);
    node1.setOwner(graph16);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test109"); }


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
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    graph27.setName("");
    graph27.setName("[graph]");
    graph27.name = "";
    java.lang.String str38 = graph27.name;
    graph27.init();
    Node node41 = new Node("");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    graph42.setName("");
    node41.setOwner(graph42);
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
    Node node79 = new Node("[graph]");
    graph50.addNode(node79);
    node41.setOwner(graph50);
    node41.setOwnerNameDirectly("");
    node41.setOwnerName("[graph]");
    graph27.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node41);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test110"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test111"); }


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
    graph19.name = "";
    graph19.name = "";
    graph19.name = "[graph]";
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
    node63.setOwnerNameDirectly("[graph]");
    node63.setOwnerName("hi!");
    node63.setOwnerNameDirectly("");
    node63.setOwnerNameDirectly("hi!");
    graph19.addNode(node63);
    node63.setOwnerName("");
    node63.setOwnerNameDirectly("");
    node63.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node63);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test112"); }


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
    node6.setOwnerNameDirectly("");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("");
    node6.setOwner(graph17);
    node6.setOwnerName("");
    node6.setOwnerName("hi!");
    node6.setOwnerName("");
    graph0.addNode(node6);
    node6.setOwnerNameDirectly("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
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
    node50.setOwnerNameDirectly("[graph]");
    graph36.addNode(node50);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("[graph]");
    node50.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node6.addEdge(node50);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test113"); }


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
    node1.setOwnerName("hi!");
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
    node23.setOwnerNameDirectly("");
    node23.setOwnerName("");
    node23.setOwnerNameDirectly("");
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test114"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.init();
    graph0.init();
    graph0.setName("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    graph15.init();
    java.lang.String str19 = graph15.name;
    node14.setOwner(graph15);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerName("");
    node14.setOwnerName("[graph]");
    node14.setOwnerName("[graph]");
    node14.setOwnerName("");
    node14.setOwnerNameDirectly("[graph]");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = node14.getDegree();

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test115"); }


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
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    java.lang.String str26 = graph24.name;
    java.lang.String str27 = graph24.name;
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
    graph24.addNode(node35);
    graph24.init();
    graph24.setName("hi!");
    graph24.setName("[graph]");
    node1.setOwner(graph24);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node1.getDegree();

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test116"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node1.getDegree();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test117"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test118"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = node1.getDegree();

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test119"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("[graph]");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test120"); }


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
    node21.setOwnerNameDirectly("");
    node21.setOwnerName("[graph]");
    node21.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = node21.getDegree();

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test121"); }


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
    graph0.name = "";
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
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
    graph22.addNode(node36);
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    node77.setOwnerNameDirectly("hi!");
    node77.setOwnerNameDirectly("");
    graph22.addNode(node77);
    node77.setOwnerNameDirectly("[graph]");
    node77.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph0.getDegree(node77);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test122"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test123"); }


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
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    graph30.setName("");
    node29.setOwner(graph30);
    node29.setOwnerNameDirectly("hi!");
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
    graph40.addNode(node54);
    graph40.init();
    graph40.init();
    graph40.name = "[graph]";
    node29.setOwner(graph40);
    node29.setOwnerName("");
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.addEdge(node29);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test124"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.thisIsNotCalled();

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test125"); }


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
    graph0.name = "hi!";
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
    node18.setOwnerName("");
    node18.setOwnerNameDirectly("[graph]");
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
    graph64.name = "";
    graph64.init();
    node38.setOwner(graph64);
    node18.setOwner(graph64);
    node18.setOwnerNameDirectly("[graph]");
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    graph80.name = "hi!";
    graph80.init();
    graph80.setName("hi!");
    graph80.init();
    graph80.setName("hi!");
    node18.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph0.getDegree(node18);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test126"); }


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
    node41.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph35.getDegree(node41);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test127"); }


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
    java.lang.String str67 = graph0.name;
    java.lang.String str68 = graph0.name;
    graph0.setName("[graph]");
    java.lang.String str71 = graph0.name;
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    graph72.setName("hi!");
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
    graph72.addNode(node79);
    node79.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node79);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test128"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node36.getDegree();

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test129"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.setName("[graph]");
    java.lang.String str12 = graph0.name;
    graph0.name = "hi!";
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
    graph25.name = "[graph]";
    graph25.name = "hi!";
    graph25.init();
    Graph graph34 = Graph.generateGraph();
    graph34.setName("[graph]");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    graph37.setName("hi!");
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
    graph37.addNode(node44);
    graph34.addNode(node44);
    Graph graph62 = Graph.generateGraph();
    graph62.init();
    java.lang.String str64 = graph62.name;
    java.lang.String str65 = graph62.name;
    node44.setOwner(graph62);
    node44.setOwnerName("hi!");
    graph25.addNode(node44);
    node44.setOwnerName("hi!");
    graph0.addNode(node44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node44.getDegree();

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test130"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test131"); }


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
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node10.getDegree();

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test132"); }


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
    int i53 = node10.getDegree();

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test133"); }


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
    graph14.setName("");
    graph14.init();
    graph14.setName("hi!");
    node3.setOwner(graph14);
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node3.setOwner(graph23);
    graph23.name = "";
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    node33.setOwnerName("[graph]");
    graph23.addNode(node33);
    graph23.name = "hi!";
    graph23.name = "[graph]";
    node1.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = node1.getDegree();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test134"); }


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
    node12.setOwnerNameDirectly("");
    node12.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node12.thisIsNotCalled();

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test135"); }


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
    int i58 = node1.getDegree();

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test136"); }


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
    node39.setOwnerName("");
    node39.setOwnerName("hi!");
    node39.setOwnerNameDirectly("[graph]");
    node39.setOwnerName("[graph]");
    graph0.addNode(node39);
    Node node63 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node39.addEdge(node63);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test137"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test138"); }


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
    node28.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test139"); }


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
    node29.setOwnerNameDirectly("[graph]");
    node29.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node29.getDegree();

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test140"); }


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
    graph53.init();
    Node node68 = new Node("");
    Node node70 = new Node("hi!");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    java.lang.String str75 = graph71.name;
    node70.setOwner(graph71);
    java.lang.String str77 = graph71.name;
    graph71.init();
    node68.setOwner(graph71);
    node68.setOwnerNameDirectly("");
    node68.setOwnerNameDirectly("");
    graph53.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = node68.getDegree();

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test141"); }


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
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    graph63.setName("");
    graph63.setName("[graph]");
    graph63.init();
    java.lang.String str73 = graph63.name;
    graph63.setName("hi!");
    node10.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test142"); }


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
    node1.setOwnerNameDirectly("");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.name = "hi!";
    graph17.setName("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    graph24.setName("hi!");
    graph24.name = "";
    graph24.setName("[graph]");
    Node node35 = new Node("");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("[graph]");
    graph24.addNode(node35);
    graph17.addNode(node35);
    node1.setOwner(graph17);
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
    node59.setOwnerNameDirectly("hi!");
    node59.setOwnerName("hi!");
    node59.setOwnerName("[graph]");
    node59.setOwnerName("hi!");
    node59.setOwnerNameDirectly("hi!");
    graph17.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node59.getDegree();

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test143"); }


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
    node22.setOwnerName("hi!");
    node22.setOwnerNameDirectly("[graph]");
    node22.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test144"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node10.getDegree();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test145"); }


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
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.setName("");
    graph54.init();
    graph54.setName("");
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
    node73.setOwnerNameDirectly("hi!");
    graph54.addNode(node73);
    node10.setOwner(graph54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test146"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test147"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    Graph graph64 = new Graph();
    java.lang.String str65 = graph64.name;
    graph64.init();
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    node68.setOwnerNameDirectly("[graph]");
    graph64.addNode(node68);
    node68.setOwnerName("");
    node68.setOwnerName("[graph]");
    node68.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node68);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test148"); }


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
    graph45.setName("hi!");
    node34.setOwner(graph45);
    node34.setOwnerName("hi!");
    node34.setOwnerName("hi!");
    node34.setOwnerName("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    graph58.setName("");
    graph58.init();
    graph58.setName("[graph]");
    graph58.name = "";
    graph58.init();
    node34.setOwner(graph58);
    Graph graph74 = Graph.generateGraph();
    graph74.init();
    java.lang.String str76 = graph74.name;
    graph74.setName("");
    node34.setOwner(graph74);
    node18.setOwner(graph74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test149"); }


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
    int i41 = node19.getDegree();

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test150"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
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
    graph16.name = "";
    graph16.setName("");
    graph16.init();
    graph16.name = "hi!";
    graph16.setName("hi!");
    node1.setOwner(graph16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node1.getDegree();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test151"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test152"); }


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
    graph14.setName("");
    graph14.init();
    graph14.setName("hi!");
    node3.setOwner(graph14);
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node3.setOwner(graph23);
    graph23.name = "";
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerNameDirectly("hi!");
    node33.setOwnerName("");
    node33.setOwnerName("[graph]");
    graph23.addNode(node33);
    graph23.name = "hi!";
    graph23.name = "[graph]";
    node1.setOwner(graph23);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node1.getDegree();

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test153"); }


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
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    java.lang.String str29 = graph23.name;
    graph23.init();
    graph23.name = "hi!";
    node12.setOwner(graph23);
    graph0.addNode(node12);
    node12.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node12.thisIsNotCalled();

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test154"); }


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
    node30.setOwnerNameDirectly("");
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
    node47.setOwner(graph58);
    graph58.name = "hi!";
    graph58.name = "[graph]";
    node30.setOwner(graph58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node30.getDegree();

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test155"); }


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
    graph17.name = "";
    graph17.name = "";
    graph17.setName("hi!");
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
    node59.setOwnerName("");
    node59.setOwnerNameDirectly("[graph]");
    graph17.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph10.getDegree(node59);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test156"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test157"); }


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
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test158"); }


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
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test159"); }


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
    int i49 = node19.getDegree();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test160"); }


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
    node10.setOwnerNameDirectly("[graph]");
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
    graph67.init();
    graph67.name = "";
    node43.setOwner(graph67);
    Graph graph74 = Graph.generateGraph();
    graph74.name = "";
    graph74.setName("");
    node43.setOwner(graph74);
    node10.setOwner(graph74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test161"); }


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
    int i20 = node5.getDegree();

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test162"); }


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
    int i44 = node1.getDegree();

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test163"); }


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
    node8.setOwnerName("");
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
    node46.setOwnerName("[graph]");
    node46.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node46);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test164"); }


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
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.init();
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
    graph41.addNode(node50);
    graph41.setName("hi!");
    graph41.setName("[graph]");
    Node node72 = new Node("");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    graph73.setName("");
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("[graph]");
    node72.setOwnerName("");
    graph41.addNode(node72);
    node72.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node72);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test165"); }


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
    graph57.setName("hi!");
    node46.setOwner(graph57);
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node46.setOwner(graph66);
    graph66.init();
    Node node75 = new Node("");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    graph76.setName("");
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("[graph]");
    graph66.addNode(node75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node75);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test166"); }


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
    node46.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node46.thisIsNotCalled();

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test167"); }


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
    node43.setOwnerName("hi!");
    Node node61 = new Node("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    node61.setOwner(graph62);
    node61.setOwnerNameDirectly("hi!");
    node61.setOwnerNameDirectly("");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    graph72.setName("");
    graph72.setName("");
    node61.setOwner(graph72);
    node61.setOwnerName("");
    node61.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node43.addEdge(node61);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test168"); }


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
    int i24 = node1.getDegree();

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test169"); }


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
    java.lang.String str41 = graph25.name;
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
    graph71.init();
    graph71.name = "[graph]";
    node43.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph25.getDegree(node43);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test170"); }


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
    Graph graph15 = Graph.generateGraph();
    graph15.setName("");
    java.lang.String str18 = graph15.name;
    graph15.name = "";
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
    graph15.addNode(node39);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    node60.setOwner(graph71);
    graph71.name = "hi!";
    node39.setOwner(graph71);
    node39.setOwnerNameDirectly("[graph]");
    node39.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph2.getDegree(node39);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test171"); }


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
    node46.thisIsNotCalled();

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test172"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test173"); }


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
    node14.setOwnerName("");
    node14.setOwnerName("");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    java.lang.String str70 = graph64.name;
    graph64.init();
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    graph72.setName("");
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    node80.setOwnerNameDirectly("hi!");
    node80.setOwnerName("");
    graph72.addNode(node80);
    graph64.addNode(node80);
    node80.setOwnerName("[graph]");
    node80.setOwnerName("[graph]");
    node80.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node80);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test174"); }


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
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    java.lang.String str22 = graph16.name;
    graph16.init();
    graph16.name = "hi!";
    node5.setOwner(graph16);
    graph16.init();
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
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.setName("");
    node38.setOwner(graph57);
    node38.setOwnerNameDirectly("[graph]");
    node38.setOwnerNameDirectly("[graph]");
    graph16.addNode(node38);
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node38, node75);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test175"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node1.getDegree();

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test176"); }


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
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    graph54.setName("");
    graph54.init();
    graph54.setName("");
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
    node73.setOwnerNameDirectly("hi!");
    graph54.addNode(node73);
    node10.setOwner(graph54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node10.getDegree();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test177"); }


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
    node14.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test178"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node10.getDegree();

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test179"); }


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
    node10.setOwnerName("[graph]");
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node10.getDegree();

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test180"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test181"); }


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
    graph0.name = "hi!";
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    node37.setOwnerNameDirectly("[graph]");
    node37.setOwnerName("[graph]");
    node37.setOwnerName("");
    graph0.addNode(node37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = node37.getDegree();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test182"); }


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
    graph10.init();
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
    node23.setOwner(graph34);
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
    graph51.name = "hi!";
    node23.setOwner(graph51);
    node23.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph10.getDegree(node23);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test183"); }


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
    int i87 = node1.getDegree();

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test184"); }


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
    node19.setOwnerName("[graph]");
    node19.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test185"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node10.getDegree();

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test186"); }


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
    node28.thisIsNotCalled();

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test187"); }


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
    node17.setOwnerNameDirectly("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("");
    node17.setOwner(graph28);
    node1.setOwner(graph28);
    node1.setOwnerName("");
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
    Graph graph69 = Graph.generateGraph();
    graph69.init();
    java.lang.String str71 = graph69.name;
    java.lang.String str72 = graph69.name;
    node51.setOwner(graph69);
    graph69.init();
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
    graph69.addNode(node76);
    node76.setOwnerName("hi!");
    node76.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node76);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test188"); }


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
    node40.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node40);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test189"); }


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
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test190"); }


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
    node21.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test191"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
    graph0.init();
    graph0.init();
    graph0.name = "[graph]";
    graph0.name = "";
    graph0.setName("");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerName("");
    Graph graph28 = new Graph();
    java.lang.String str29 = graph28.name;
    node19.setOwner(graph28);
    node19.setOwnerNameDirectly("hi!");
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
    node19.setOwner(graph33);
    Graph graph88 = Graph.generateGraph();
    graph88.init();
    graph88.init();
    graph88.init();
    java.lang.String str92 = graph88.name;
    node19.setOwner(graph88);
    node19.setOwnerNameDirectly("[graph]");
    node19.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node19);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test192"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.init();
    java.lang.String str10 = graph0.name;
    graph0.setName("hi!");
    java.lang.String str13 = graph0.name;
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    node15.setOwnerName("[graph]");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    graph28.name = "";
    graph28.setName("");
    node15.setOwner(graph28);
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = graph0.getDegree(node15);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test193"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test194"); }


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
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test195"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test196"); }


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
    graph0.init();
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
    node28.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph0.getDegree(node28);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test197"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerNameDirectly("");
    node11.setOwnerName("hi!");
    node11.setOwnerNameDirectly("[graph]");
    node11.setOwnerNameDirectly("[graph]");
    graph0.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test198"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node25.getDegree();

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test199"); }


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
    node18.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node18.getDegree();

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test200"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node25.getDegree();

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test201"); }


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
    graph39.init();
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    graph51.setName("hi!");
    graph51.name = "";
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    graph59.init();
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
    graph59.addNode(node68);
    node68.setOwnerName("[graph]");
    graph51.addNode(node68);
    node68.setOwnerName("[graph]");
    graph39.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node68.thisIsNotCalled();

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test202"); }


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
    node17.setOwnerNameDirectly("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("");
    node17.setOwner(graph28);
    node1.setOwner(graph28);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test203"); }


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
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.name = "hi!";
    graph32.setName("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
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
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    node53.setOwner(graph83);
    node53.setOwnerNameDirectly("[graph]");
    graph39.addNode(node53);
    graph32.addNode(node53);
    node25.setOwner(graph32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node25);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test204"); }


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
    int i56 = node37.getDegree();

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test205"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.init();
    Graph graph11 = Graph.generateGraph();
    graph11.init();
    graph11.name = "hi!";
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
    node16.setOwnerNameDirectly("hi!");
    graph11.addNode(node16);
    node16.setOwnerNameDirectly("");
    node16.setOwnerNameDirectly("hi!");
    graph2.addNode(node16);
    Graph graph36 = Graph.generateGraph();
    graph36.setName("[graph]");
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
    graph36.addNode(node46);
    Graph graph64 = Graph.generateGraph();
    graph64.init();
    java.lang.String str66 = graph64.name;
    java.lang.String str67 = graph64.name;
    node46.setOwner(graph64);
    graph64.init();
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node71.setOwnerNameDirectly("hi!");
    node71.setOwnerName("");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    graph82.setName("hi!");
    node71.setOwner(graph82);
    graph64.addNode(node71);
    node71.setOwnerName("");
    graph2.addNode(node71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node71.thisIsNotCalled();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test206"); }


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
    node25.setOwnerNameDirectly("hi!");
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node71.setOwnerNameDirectly("hi!");
    node71.setOwnerName("");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    graph82.setName("hi!");
    node71.setOwner(graph82);
    node71.setOwnerName("hi!");
    node71.setOwnerName("hi!");
    node71.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node71);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test207"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
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
    graph22.setName("");
    graph22.init();
    graph22.setName("hi!");
    node11.setOwner(graph22);
    node11.setOwnerName("hi!");
    node11.setOwnerName("hi!");
    node11.setOwnerName("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("");
    graph35.init();
    graph35.setName("[graph]");
    graph35.name = "";
    graph35.init();
    node11.setOwner(graph35);
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    java.lang.String str53 = graph51.name;
    graph51.setName("");
    node11.setOwner(graph51);
    graph2.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node11.getDegree();

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test208"); }


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
    node65.setOwnerName("");
    node65.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node65.getDegree();

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test209"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node1.getDegree();

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test210"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test211"); }


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
    node47.thisIsNotCalled();

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test212"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node31);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test213"); }


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
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = node14.getDegree();

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test214"); }


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
    graph12.name = "[graph]";
    graph12.name = "";
    java.lang.String str20 = graph12.name;
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    graph23.setName("");
    node22.setOwner(graph23);
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
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
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    graph64.setName("");
    node45.setOwner(graph64);
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    node45.setOwner(graph75);
    node45.setOwnerNameDirectly("[graph]");
    graph31.addNode(node45);
    node22.setOwner(graph31);
    graph12.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test215"); }


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
    Graph graph52 = new Graph();
    java.lang.String str53 = graph52.name;
    graph52.init();
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerNameDirectly("[graph]");
    graph52.addNode(node56);
    node56.setOwnerName("");
    graph21.addNode(node56);
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
    node72.setOwnerName("");
    node72.setOwnerNameDirectly("[graph]");
    node72.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph21.getDegree(node72);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test216"); }


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
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test217"); }


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
    node31.setOwnerName("");
    Graph graph40 = new Graph();
    java.lang.String str41 = graph40.name;
    node31.setOwner(graph40);
    graph40.setName("");
    graph40.setName("");
    graph40.name = "";
    graph40.setName("[graph]");
    graph40.name = "[graph]";
    graph40.name = "[graph]";
    node10.setOwner(graph40);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node10.getDegree();

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test218"); }


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
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    graph34.init();
    graph34.init();
    node23.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.addEdge(node23);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test219"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node10.getDegree();

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test220"); }


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
    graph25.init();
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
    node39.setOwnerNameDirectly("hi!");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    java.lang.String str69 = graph63.name;
    graph63.name = "";
    node39.setOwner(graph63);
    node39.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = graph25.getDegree(node39);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test221"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = node57.getDegree();

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test222"); }


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
    node30.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test223"); }


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
    node24.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node24.getDegree();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test224"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test225"); }


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
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    graph48.setName("");
    graph48.name = "[graph]";
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
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerNameDirectly("");
    graph48.addNode(node67);
    node67.setOwnerNameDirectly("[graph]");
    node67.setOwnerName("[graph]");
    node67.setOwnerName("");
    node67.setOwnerName("[graph]");
    graph12.addNode(node67);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node67.thisIsNotCalled();

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test226"); }


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
    node21.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test227"); }


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
    int i48 = node25.getDegree();

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test228"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test229"); }


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
    graph2.setName("hi!");
    java.lang.String str17 = graph2.name;
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("[graph]");
    node19.setOwnerName("hi!");
    node19.setOwnerName("hi!");
    node19.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph2.getDegree(node19);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test230"); }


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
    Node node17 = new Node("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    java.lang.String str22 = graph18.name;
    node17.setOwner(graph18);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerNameDirectly("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("");
    node17.setOwner(graph28);
    node17.setOwnerName("");
    node17.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test231"); }


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
    java.lang.String str34 = graph0.name;
    java.lang.String str35 = graph0.name;
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
    node37.setOwner(graph48);
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
    graph65.name = "";
    graph65.init();
    graph65.name = "hi!";
    node37.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph0.getDegree(node37);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test232"); }


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
    node67.setOwnerName("[graph]");
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    graph83.setName("");
    graph83.name = "[graph]";
    graph83.setName("[graph]");
    node67.setOwner(graph83);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node67);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test233"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test234"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test235"); }


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
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    graph56.init();
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
    graph56.addNode(node65);
    graph56.setName("hi!");
    graph56.setName("[graph]");
    graph56.name = "[graph]";
    graph56.name = "[graph]";
    node10.setOwner(graph56);
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test236"); }


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
    node17.setOwnerNameDirectly("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    graph28.setName("");
    node17.setOwner(graph28);
    node1.setOwner(graph28);
    node1.setOwnerNameDirectly("[graph]");
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("[graph]");
    node42.setOwnerNameDirectly("");
    node42.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node42);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test237"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test238"); }


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
    node15.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node15.thisIsNotCalled();

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test239"); }


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
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node44.getDegree();

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test240"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    graph36.setName("");
    graph36.init();
    graph36.name = "[graph]";
    graph36.init();
    graph36.init();
    graph36.name = "[graph]";
    graph36.name = "";
    node1.setOwner(graph36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test241"); }


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
    java.lang.String str51 = graph19.name;
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
    node53.setOwnerNameDirectly("");
    graph19.addNode(node53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node53.thisIsNotCalled();

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test242"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = node10.getDegree();

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test243"); }


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
    node15.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = node15.getDegree();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test244"); }


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
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    Graph graph29 = Graph.generateGraph();
    graph29.init();
    node18.setOwner(graph29);
    graph29.init();
    graph29.name = "[graph]";
    node1.setOwner(graph29);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = node1.getDegree();

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test245"); }


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
    graph0.init();
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
    node40.setOwnerName("[graph]");
    node40.setOwnerNameDirectly("[graph]");
    node40.setOwnerNameDirectly("hi!");
    graph0.addNode(node40);
    node40.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node40.getDegree();

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test246"); }


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
    graph12.name = "hi!";
    graph12.setName("hi!");
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
    Graph graph52 = Graph.generateGraph();
    graph52.init();
    java.lang.String str54 = graph52.name;
    java.lang.String str55 = graph52.name;
    node34.setOwner(graph52);
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
    graph57.setName("[graph]");
    graph57.name = "[graph]";
    node34.setOwner(graph57);
    node34.setOwnerName("[graph]");
    node34.setOwnerName("hi!");
    node34.setOwnerName("hi!");
    node34.setOwnerName("hi!");
    node34.setOwnerNameDirectly("hi!");
    graph12.addNode(node34);
    node34.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node34);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test247"); }


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
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    graph30.setName("");
    graph30.init();
    graph30.init();
    graph30.setName("");
    node1.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test248"); }


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
    node32.setOwnerName("");
    node32.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node32.getDegree();

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test249"); }


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
    node55.setOwnerName("");
    Graph graph64 = new Graph();
    java.lang.String str65 = graph64.name;
    node55.setOwner(graph64);
    graph64.setName("");
    graph64.setName("");
    graph64.name = "";
    graph64.setName("hi!");
    node26.setOwner(graph64);
    graph64.name = "";
    graph64.init();
    graph64.name = "hi!";
    graph64.setName("hi!");
    graph64.setName("[graph]");
    node1.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = node1.getDegree();

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test250"); }


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
    graph21.name = "";
    graph21.setName("hi!");
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
    graph45.setName("hi!");
    node34.setOwner(graph45);
    node34.setOwnerName("hi!");
    node34.setOwnerName("hi!");
    node34.setOwnerName("hi!");
    node34.setOwnerNameDirectly("hi!");
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
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    node61.setOwner(graph81);
    graph81.name = "";
    node34.setOwner(graph81);
    Graph graph91 = Graph.generateGraph();
    graph91.setName("");
    graph91.name = "";
    graph91.name = "hi!";
    node34.setOwner(graph91);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph21.getDegree(node34);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test251"); }


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
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph0.getDegree(node38);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test252"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "";
    graph0.name = "";
    graph0.setName("hi!");
    graph0.name = "hi!";
    graph0.setName("hi!");
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
    node13.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph0.getDegree(node13);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test253"); }


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
    node10.setOwnerName("[graph]");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    graph41.name = "hi!";
    graph41.name = "";
    java.lang.String str49 = graph41.name;
    graph41.init();
    graph41.name = "";
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
    graph53.init();
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("");
    node75.setOwnerName("[graph]");
    node75.setOwnerName("");
    graph53.addNode(node75);
    node75.setOwnerNameDirectly("");
    graph41.addNode(node75);
    node75.setOwnerName("[graph]");
    node75.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node75);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test254"); }


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
    node18.setOwnerNameDirectly("[graph]");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    graph53.init();
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
    graph53.addNode(node62);
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    graph79.name = "hi!";
    graph79.name = "";
    node62.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node62);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test255"); }


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
    node36.setOwnerName("");
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node36);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test256"); }


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
    node1.setOwnerNameDirectly("[graph]");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    graph63.name = "hi!";
    graph63.init();
    graph63.setName("hi!");
    graph63.init();
    graph63.setName("hi!");
    node1.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node1.getDegree();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test257"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test258"); }


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
    int i42 = node10.getDegree();

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test259"); }


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
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node25.getDegree();

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test260"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test261"); }


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
    java.lang.String str32 = graph0.name;
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph0.getDegree(node34);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test262"); }


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
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    graph56.setName("hi!");
    graph56.name = "";
    graph56.setName("[graph]");
    node14.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node14.getDegree();

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test263"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test264"); }


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
    graph0.setName("");
    Graph graph21 = Graph.generateGraph();
    graph21.init();
    java.lang.String str23 = graph21.name;
    java.lang.String str24 = graph21.name;
    graph21.init();
    java.lang.String str26 = graph21.name;
    Graph graph27 = Graph.generateGraph();
    graph27.setName("[graph]");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    graph30.setName("hi!");
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
    graph30.addNode(node37);
    graph27.addNode(node37);
    graph27.name = "";
    graph27.name = "";
    graph27.name = "[graph]";
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    graph61.setName("");
    graph61.setName("[graph]");
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node71.setOwnerNameDirectly("hi!");
    node71.setOwnerName("");
    Graph graph82 = Graph.generateGraph();
    graph82.init();
    node71.setOwner(graph82);
    node71.setOwnerName("hi!");
    graph61.addNode(node71);
    node71.setOwnerNameDirectly("[graph]");
    node71.setOwnerName("hi!");
    node71.setOwnerNameDirectly("");
    node71.setOwnerNameDirectly("hi!");
    graph27.addNode(node71);
    graph21.addNode(node71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node71);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test265"); }


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
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    Graph graph29 = Graph.generateGraph();
    graph29.init();
    node18.setOwner(graph29);
    graph29.init();
    graph29.name = "[graph]";
    node1.setOwner(graph29);
    Node node37 = new Node("hi!");
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    node37.setOwner(graph38);
    java.lang.String str44 = graph38.name;
    graph38.init();
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
    graph38.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = graph29.getDegree(node54);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test266"); }


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
    int i13 = node1.getDegree();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test267"); }


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
    int i72 = node21.getDegree();

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test268"); }


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
    node22.setOwnerName("");
    node22.setOwnerName("");
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
    graph75.init();
    Node node84 = new Node("");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    graph85.setName("");
    node84.setOwner(graph85);
    node84.setOwnerNameDirectly("[graph]");
    graph75.addNode(node84);
    node84.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.addEdge(node84);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test269"); }


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
    graph10.setName("");
    graph10.name = "";
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
    node34.setOwnerNameDirectly("");
    node34.setOwnerName("[graph]");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    graph55.setName("hi!");
    graph55.name = "";
    java.lang.String str63 = graph55.name;
    node34.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph10.getDegree(node34);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test270"); }


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
    node46.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = node46.getDegree();

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test271"); }


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
    graph10.init();
    graph10.init();
    Node node58 = new Node("");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    node58.setOwner(graph59);
    graph10.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node58.getDegree();

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test272"); }


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
    node66.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = graph0.getDegree(node66);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test273"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test274"); }


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
    node14.thisIsNotCalled();

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test275"); }


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
    node27.setOwnerNameDirectly("");
    node27.setOwnerName("");
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
    node60.setOwnerName("hi!");
    node60.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node27, node60);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test276"); }


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
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("[graph]");
    graph31.setName("");
    node10.setOwner(graph31);
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
    node44.setOwnerName("[graph]");
    node44.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph31.getDegree(node44);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test277"); }


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
    node29.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node29.getDegree();

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test278"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    graph0.name = "";
    graph0.init();
    java.lang.String str6 = graph0.name;
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
    graph29.name = "";
    graph29.setName("hi!");
    java.lang.String str40 = graph29.name;
    Graph graph41 = new Graph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerNameDirectly("[graph]");
    graph41.addNode(node45);
    node45.setOwnerName("");
    node45.setOwnerName("[graph]");
    node45.setOwnerNameDirectly("");
    graph29.addNode(node45);
    node45.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = graph0.getDegree(node45);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test279"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node1.getDegree();

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test280"); }


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
    graph10.name = "hi!";
    java.lang.String str20 = graph10.name;
    java.lang.String str21 = graph10.name;
    Graph graph22 = Graph.generateGraph();
    graph22.init();
    graph22.name = "hi!";
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
    graph22.addNode(node27);
    Graph graph42 = Graph.generateGraph();
    node27.setOwner(graph42);
    graph10.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node27.getDegree();

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test281"); }


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
    graph14.name = "";
    java.lang.String str17 = graph14.name;
    java.lang.String str18 = graph14.name;
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
    node29.setOwnerNameDirectly("[graph]");
    graph14.addNode(node29);
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph0.getDegree(node29);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test282"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("[graph]");
    graph0.addNode(node11);
    node11.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node11.getDegree();

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test283"); }


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
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test284"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.addEdge(node34);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test285"); }


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
    int i38 = node1.getDegree();

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test286"); }


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
    node43.setOwnerName("[graph]");
    node43.setOwnerNameDirectly("");
    node43.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node43.getDegree();

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test287"); }


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
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test288"); }


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
    int i58 = node35.getDegree();

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test289"); }


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
    node9.thisIsNotCalled();

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test290"); }


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
    graph29.setName("[graph]");
    graph29.setName("hi!");
    graph29.init();
    graph29.init();
    graph29.init();
    java.lang.String str46 = graph29.name;
    java.lang.String str47 = graph29.name;
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
    node58.setOwnerNameDirectly("hi!");
    node58.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph29.getDegree(node58);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test291"); }


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
    Graph graph52 = new Graph();
    java.lang.String str53 = graph52.name;
    graph52.init();
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerNameDirectly("[graph]");
    graph52.addNode(node56);
    node56.setOwnerName("");
    graph21.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node56.getDegree();

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test292"); }


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
    node14.setOwnerNameDirectly("");
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node14.getDegree();

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test293"); }


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
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = node25.getDegree();

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test294"); }


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
    node43.thisIsNotCalled();

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test295"); }


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
    int i24 = node8.getDegree();

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test296"); }


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
    graph10.init();
    graph10.init();
    Node node58 = new Node("");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    node58.setOwner(graph59);
    graph10.addNode(node58);
    graph10.init();
    graph10.init();
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node71.setOwnerNameDirectly("hi!");
    node71.setOwnerName("");
    Graph graph82 = Graph.generateGraph();
    graph82.init();
    node71.setOwner(graph82);
    node71.setOwnerName("");
    node71.setOwnerName("hi!");
    node71.setOwnerName("");
    node71.setOwnerName("");
    node71.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph10.getDegree(node71);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test297"); }


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
    node22.setOwnerName("[graph]");
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    node43.setOwner(graph44);
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
    node43.setOwner(graph62);
    node22.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test298"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node13);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test299"); }


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
    node14.thisIsNotCalled();

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test300"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
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
    graph22.setName("");
    graph22.init();
    graph22.setName("hi!");
    node11.setOwner(graph22);
    node11.setOwnerName("hi!");
    node11.setOwnerName("hi!");
    node11.setOwnerName("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("");
    graph35.init();
    graph35.setName("[graph]");
    graph35.name = "";
    graph35.init();
    node11.setOwner(graph35);
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    java.lang.String str53 = graph51.name;
    graph51.setName("");
    node11.setOwner(graph51);
    graph2.addNode(node11);
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    graph58.setName("[graph]");
    graph58.name = "";
    graph58.name = "";
    graph58.name = "hi!";
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
    node74.setOwnerNameDirectly("[graph]");
    graph58.addNode(node74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node74);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test301"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test302"); }


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
    node21.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = node21.getDegree();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test303"); }


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
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.setName("");
    node38.setOwner(graph57);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node38.setOwner(graph68);
    node38.setOwnerNameDirectly("[graph]");
    node38.setOwnerNameDirectly("");
    graph0.addNode(node38);
    node38.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test304"); }


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
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    node38.setOwnerName("[graph]");
    node38.setOwnerNameDirectly("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.init();
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
    graph53.addNode(node65);
    node38.setOwner(graph53);
    node10.setOwner(graph53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node10.getDegree();

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test305"); }


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
    node8.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test306"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test307"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test308"); }


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
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test309"); }


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
    graph14.name = "hi!";
    Node node24 = new Node("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    node24.setOwner(graph25);
    java.lang.String str31 = graph25.name;
    graph25.init();
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
    graph25.addNode(node41);
    node41.setOwnerName("[graph]");
    node41.setOwnerName("");
    node41.setOwnerNameDirectly("[graph]");
    node41.setOwnerName("[graph]");
    graph14.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node41);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test310"); }


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
    java.lang.String str31 = graph25.name;
    graph25.init();
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
    graph25.addNode(node41);
    node41.setOwnerName("[graph]");
    node41.setOwnerNameDirectly("[graph]");
    graph10.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node41.thisIsNotCalled();

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test311"); }


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
    Graph graph63 = Graph.generateGraph();
    graph63.init();
    java.lang.String str65 = graph63.name;
    java.lang.String str66 = graph63.name;
    node45.setOwner(graph63);
    node45.setOwnerName("[graph]");
    node45.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph25.getDegree(node45);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test312"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test313"); }


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
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node25.getDegree();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test314"); }


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
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
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
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.setName("");
    node38.setOwner(graph57);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node38.setOwner(graph68);
    node38.setOwnerNameDirectly("[graph]");
    graph24.addNode(node38);
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    node79.setOwnerNameDirectly("hi!");
    node79.setOwnerNameDirectly("");
    graph24.addNode(node79);
    node79.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph0.getDegree(node79);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test315"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    graph3.setName("");
    node2.setOwner(graph3);
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
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
    node25.setOwnerNameDirectly("[graph]");
    graph11.addNode(node25);
    node2.setOwner(graph11);
    node2.setOwnerName("[graph]");
    node2.setOwnerName("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("[graph]");
    node2.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node2.getDegree();

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test316"); }


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
    node25.thisIsNotCalled();

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test317"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node10.getDegree();

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test318"); }


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
    node11.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = graph0.getDegree(node11);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test319"); }


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
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test320"); }


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
    graph58.name = "[graph]";
    java.lang.String str87 = graph58.name;
    java.lang.String str88 = graph58.name;
    node10.setOwner(graph58);
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = node10.getDegree();

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test321"); }


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
    node18.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node18.getDegree();

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test322"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
    java.lang.String str7 = graph3.name;
    graph3.setName("");
    node2.setOwner(graph3);
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
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
    node25.setOwnerNameDirectly("[graph]");
    graph11.addNode(node25);
    node2.setOwner(graph11);
    node2.setOwnerName("[graph]");
    node2.setOwnerName("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node2.getDegree();

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test323"); }


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
    node12.thisIsNotCalled();

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test324"); }


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
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.name = "hi!";
    graph18.setName("hi!");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
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
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    graph58.setName("");
    node39.setOwner(graph58);
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node39.setOwner(graph69);
    node39.setOwnerNameDirectly("[graph]");
    graph25.addNode(node39);
    graph18.addNode(node39);
    node11.setOwner(graph18);
    node11.setOwnerNameDirectly("");
    node11.setOwnerName("hi!");
    graph2.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test325"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test326"); }


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
    node12.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node12.thisIsNotCalled();

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test327"); }


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
    node44.setOwnerNameDirectly("");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    graph55.setName("");
    graph55.setName("");
    node44.setOwner(graph55);
    node44.setOwnerName("");
    node44.setOwnerName("[graph]");
    graph29.addNode(node44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test328"); }


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
    graph0.name = "";
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
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node27.setOwner(graph47);
    graph47.init();
    Node node56 = new Node("");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("[graph]");
    graph47.addNode(node56);
    node56.setOwnerNameDirectly("");
    node56.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph0.getDegree(node56);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test329"); }


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
    java.lang.String str21 = graph15.name;
    graph15.init();
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
    graph15.addNode(node31);
    graph15.init();
    java.lang.String str45 = graph15.name;
    graph15.init();
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("hi!");
    node56.setOwnerName("[graph]");
    node56.setOwnerName("hi!");
    graph49.addNode(node56);
    graph15.addNode(node56);
    node56.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node56);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test330"); }


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
    node26.setOwnerName("");
    node26.setOwnerName("[graph]");
    node26.setOwnerName("");
    node26.setOwnerNameDirectly("");
    graph12.addNode(node26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node26.getDegree();

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test331"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test332"); }


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
    node14.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test333"); }


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
    node12.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node12.getDegree();

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test334"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test335"); }


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
    int i75 = node25.getDegree();

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test336"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    Graph graph5 = Graph.generateGraph();
    graph5.init();
    graph5.name = "hi!";
    Node node10 = new Node("hi!");
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerName("");
    Graph graph19 = new Graph();
    java.lang.String str20 = graph19.name;
    node10.setOwner(graph19);
    node10.setOwnerNameDirectly("hi!");
    graph5.addNode(node10);
    node10.setOwnerNameDirectly("hi!");
    Node node28 = new Node("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
    java.lang.String str33 = graph29.name;
    node28.setOwner(graph29);
    graph29.name = "hi!";
    graph29.init();
    graph29.setName("hi!");
    graph29.init();
    java.lang.String str41 = graph29.name;
    graph29.setName("hi!");
    node10.setOwner(graph29);
    graph0.addNode(node10);
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    graph46.setName("hi!");
    graph46.name = "";
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
    node63.setOwnerName("[graph]");
    graph46.addNode(node63);
    node63.setOwnerName("[graph]");
    node63.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph0.getDegree(node63);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test337"); }


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
    node16.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node16.thisIsNotCalled();

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test338"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node15.thisIsNotCalled();

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test339"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test340"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test341"); }


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
    node46.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node46.thisIsNotCalled();

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test342"); }


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
    node10.setOwnerNameDirectly("");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.name = "[graph]";
    node10.setOwner(graph37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test343"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test344"); }


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
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    graph30.setName("");
    graph30.init();
    graph30.init();
    graph30.setName("");
    node1.setOwner(graph30);
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
    node43.setOwnerName("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    graph67.setName("");
    graph67.setName("");
    graph67.init();
    graph67.setName("[graph]");
    graph67.name = "";
    graph67.init();
    node43.setOwner(graph67);
    graph67.name = "";
    node1.setOwner(graph67);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = node1.getDegree();

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test345"); }


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
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node57.thisIsNotCalled();

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test346"); }


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
    node14.setOwnerNameDirectly("");
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test347"); }


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
    int i59 = node38.getDegree();

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test348"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test349"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node1.getDegree();

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test350"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "";
    graph0.name = "hi!";
    graph0.setName("");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    graph9.setName("");
    graph9.setName("[graph]");
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    graph20.setName("");
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("[graph]");
    graph9.addNode(node19);
    node19.setOwnerName("");
    node19.setOwnerName("[graph]");
    node19.setOwnerName("[graph]");
    graph0.addNode(node19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test351"); }


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
    int i55 = node10.getDegree();

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test352"); }


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
    int i74 = node44.getDegree();

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test353"); }


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
    node30.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node30.thisIsNotCalled();

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test354"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test355"); }


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
    node38.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node38.getDegree();

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test356"); }


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
    java.lang.String str41 = graph34.name;
    graph34.name = "[graph]";
    graph34.init();
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerNameDirectly("");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.setName("");
    node46.setOwner(graph57);
    node46.setOwnerName("");
    node46.setOwnerName("[graph]");
    graph34.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node46);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test357"); }


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
    java.lang.String str29 = graph0.name;
    graph0.name = "";
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
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    graph49.setName("");
    graph49.init();
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
    graph49.addNode(node58);
    graph49.setName("hi!");
    graph49.name = "";
    graph49.setName("");
    graph49.setName("[graph]");
    node33.setOwner(graph49);
    node33.setOwnerName("hi!");
    graph0.addNode(node33);
    node33.setOwnerName("hi!");
    node33.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node33.getDegree();

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test358"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test359"); }


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
    node48.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node48);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test360"); }


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
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    graph24.setName("");
    Node node32 = new Node("hi!");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    graph24.addNode(node32);
    java.lang.String str44 = graph24.name;
    graph24.setName("hi!");
    graph24.name = "";
    node5.setOwner(graph24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.thisIsNotCalled();

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test361"); }


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
    node47.setOwnerName("[graph]");
    node47.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node47);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test362"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test363"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test364"); }


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
    node38.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test365"); }


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
    graph16.name = "hi!";
    java.lang.String str21 = graph16.name;
    graph16.setName("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    graph24.setName("");
    graph24.init();
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
    graph24.addNode(node33);
    graph24.setName("hi!");
    graph24.name = "[graph]";
    java.lang.String str54 = graph24.name;
    graph24.name = "[graph]";
    graph24.setName("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    graph59.setName("");
    graph59.setName("");
    graph59.init();
    graph59.name = "";
    Node node72 = new Node("");
    Node node74 = new Node("hi!");
    Graph graph75 = Graph.generateGraph();
    graph75.setName("");
    graph75.init();
    java.lang.String str79 = graph75.name;
    node74.setOwner(graph75);
    java.lang.String str81 = graph75.name;
    graph75.init();
    node72.setOwner(graph75);
    graph59.addNode(node72);
    node72.setOwnerName("[graph]");
    node72.setOwnerName("");
    graph24.addNode(node72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = graph16.getDegree(node72);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test366"); }


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
    node37.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = node37.getDegree();

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test367"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.setName("[graph]");
    graph0.setName("[graph]");
    graph0.name = "hi!";
    java.lang.String str16 = graph0.name;
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
    Node node87 = new Node("hi!");
    Graph graph88 = Graph.generateGraph();
    graph88.setName("");
    graph88.init();
    java.lang.String str92 = graph88.name;
    node87.setOwner(graph88);
    java.lang.String str94 = graph88.name;
    graph88.init();
    graph88.setName("");
    node72.setOwner(graph88);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph0.getDegree(node72);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test368"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    java.lang.String str6 = graph0.name;
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("hi!");
    node8.setOwnerName("");
    node8.setOwnerName("hi!");
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerNameDirectly("hi!");
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
    node30.setOwnerName("hi!");
    node30.setOwnerName("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    graph50.setName("");
    graph50.setName("[graph]");
    graph50.name = "";
    java.lang.String str61 = graph50.name;
    graph50.init();
    node30.setOwner(graph50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node8, node30);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test369"); }


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
    node46.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node46.getDegree();

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test370"); }


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
    node50.setOwnerName("");
    node50.setOwnerName("[graph]");
    node50.setOwnerName("[graph]");
    node50.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node50);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test371"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node11 = new Node("");
    graph2.addNode(node11);
    java.lang.String str13 = graph2.name;
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    node15.setOwnerNameDirectly("");
    node15.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = graph2.getDegree(node15);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test372"); }


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
    graph12.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerNameDirectly("");
    node22.setOwnerName("hi!");
    graph12.addNode(node22);
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
    node37.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph12.getDegree(node37);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test373"); }


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
    graph2.name = "[graph]";
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = graph2.getDegree(node20);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test374"); }


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
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
    node40.setOwner(graph51);
    node40.setOwnerName("");
    graph29.addNode(node40);
    node40.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node40.thisIsNotCalled();

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test375"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node10.getDegree();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test376"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph0.getDegree(node43);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test377"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test378"); }


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
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node46.getDegree();

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test379"); }


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
    int i29 = node8.getDegree();

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test380"); }


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
    node23.setOwnerNameDirectly("");
    node23.setOwnerName("");
    node23.setOwnerNameDirectly("");
    node23.setOwnerName("[graph]");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    graph51.setName("");
    graph51.setName("");
    graph51.init();
    graph51.setName("hi!");
    graph51.init();
    graph51.init();
    node23.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = graph18.getDegree(node23);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test381"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test382"); }


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
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    graph39.setName("hi!");
    node28.setOwner(graph39);
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node28.setOwner(graph48);
    graph48.name = "";
    node1.setOwner(graph48);
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.name = "";
    graph58.name = "hi!";
    node1.setOwner(graph58);
    node1.setOwnerName("[graph]");
    Node node69 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node69);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test383"); }


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
    graph10.init();
    graph10.init();
    graph10.setName("[graph]");
    java.lang.String str59 = graph10.name;
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
    node61.setOwnerNameDirectly("[graph]");
    node61.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph10.getDegree(node61);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test384"); }


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
    node74.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node74.getDegree();

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test385"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    node11.setOwner(graph12);
    node11.setOwnerNameDirectly("[graph]");
    graph0.addNode(node11);
    node11.setOwnerNameDirectly("");
    Graph graph25 = Graph.generateGraph();
    graph25.setName("");
    graph25.init();
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("[graph]");
    graph25.name = "";
    graph25.name = "";
    graph25.name = "";
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
    node41.setOwnerName("");
    node41.setOwnerName("hi!");
    node41.setOwnerName("");
    node41.setOwnerName("");
    node41.setOwnerName("[graph]");
    graph25.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node41);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test386"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Graph graph3 = Graph.generateGraph();
    graph3.setName("");
    graph3.init();
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
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node17.setOwner(graph47);
    node17.setOwnerNameDirectly("[graph]");
    graph3.addNode(node17);
    graph3.name = "[graph]";
    Node node60 = new Node("hi!");
    graph3.addNode(node60);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerNameDirectly("");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    graph74.setName("");
    graph74.setName("");
    node63.setOwner(graph74);
    node63.setOwnerName("");
    node63.setOwnerName("hi!");
    node63.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node60, node63);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test387"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node43.getDegree();

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test388"); }


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
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    graph32.setName("");
    graph32.setName("[graph]");
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    graph43.setName("");
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("[graph]");
    graph32.addNode(node42);
    node42.setOwnerName("");
    node42.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node42);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test389"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test390"); }


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
    node7.thisIsNotCalled();

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test391"); }


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
    graph12.name = "[graph]";
    Graph graph27 = new Graph();
    java.lang.String str28 = graph27.name;
    graph27.init();
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node31.setOwnerNameDirectly("hi!");
    node31.setOwnerNameDirectly("[graph]");
    graph27.addNode(node31);
    node31.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    node31.setOwner(graph45);
    node31.setOwnerNameDirectly("[graph]");
    node31.setOwnerName("[graph]");
    graph12.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = node31.getDegree();

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test392"); }


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
    node10.setOwnerNameDirectly("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    graph68.name = "";
    graph68.init();
    graph68.setName("[graph]");
    node10.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node10.getDegree();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test393"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = node10.getDegree();

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test394"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node1.getDegree();

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test395"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
    java.lang.String str13 = graph2.name;
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerNameDirectly("");
    node15.setOwnerName("");
    node15.setOwnerNameDirectly("");
    graph2.addNode(node15);
    java.lang.String str31 = graph2.name;
    Graph graph32 = Graph.generateGraph();
    graph32.init();
    graph32.name = "hi!";
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
    graph32.addNode(node37);
    node37.setOwnerNameDirectly("");
    node37.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerName("");
    graph56.addNode(node64);
    java.lang.String str76 = graph56.name;
    graph56.setName("hi!");
    graph56.name = "";
    node37.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph2.getDegree(node37);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test396"); }


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
    int i85 = node48.getDegree();

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test397"); }


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
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test398"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    Graph graph10 = Graph.generateGraph();
    graph10.init();
    graph10.name = "hi!";
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
    node15.setOwnerNameDirectly("hi!");
    graph10.addNode(node15);
    node15.setOwnerNameDirectly("");
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
    node33.setOwner(graph44);
    graph44.name = "hi!";
    graph44.name = "[graph]";
    graph44.setName("");
    graph44.setName("hi!");
    node15.setOwner(graph44);
    node15.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph2.getDegree(node15);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test399"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.init();
    graph2.setName("hi!");
    java.lang.String str13 = graph2.name;
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerNameDirectly("");
    node15.setOwnerName("");
    node15.setOwnerNameDirectly("");
    graph2.addNode(node15);
    java.lang.String str31 = graph2.name;
    java.lang.String str32 = graph2.name;
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    graph33.setName("[graph]");
    graph33.name = "";
    java.lang.String str44 = graph33.name;
    graph33.setName("[graph]");
    graph33.name = "";
    graph33.init();
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
    node59.setOwnerName("hi!");
    graph33.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph2.getDegree(node59);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test400"); }


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
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    node78.setOwnerName("");
    Graph graph87 = new Graph();
    java.lang.String str88 = graph87.name;
    node78.setOwner(graph87);
    graph87.init();
    graph87.name = "[graph]";
    node46.setOwner(graph87);
    java.lang.String str94 = graph87.name;
    graph87.name = "hi!";
    node1.setOwner(graph87);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test401"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test402"); }


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
    java.lang.String str92 = graph82.name;
    node35.setOwner(graph82);
    node35.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test403"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test404"); }


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
    node9.setOwnerName("hi!");
    node9.setOwnerName("hi!");
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerName("[graph]");
    node9.setOwnerName("");
    node9.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = graph0.getDegree(node9);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test405"); }


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
    java.lang.String str61 = graph10.name;
    java.lang.String str62 = graph10.name;
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    graph63.setName("");
    graph63.setName("");
    graph63.init();
    graph63.name = "";
    Node node76 = new Node("");
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    java.lang.String str85 = graph79.name;
    graph79.init();
    node76.setOwner(graph79);
    graph63.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph10.getDegree(node76);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test406"); }


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
    node29.setOwnerNameDirectly("[graph]");
    node29.setOwnerNameDirectly("");
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
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.addEdge(node57);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test407"); }


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
    graph30.name = "hi!";
    java.lang.String str38 = graph30.name;
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
    graph30.addNode(node49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node49);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test408"); }


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
    graph10.name = "[graph]";
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    graph57.setName("hi!");
    graph57.name = "";
    graph57.setName("[graph]");
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    graph69.setName("");
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("[graph]");
    graph57.addNode(node68);
    node68.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph10.getDegree(node68);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test409"); }


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
    node1.setOwnerName("[graph]");
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
    node44.setOwnerName("");
    node44.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node44);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test410"); }


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
    graph58.name = "[graph]";
    java.lang.String str87 = graph58.name;
    java.lang.String str88 = graph58.name;
    node10.setOwner(graph58);
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test411"); }


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
    node1.setOwnerNameDirectly("hi!");
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
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node22.setOwner(graph42);
    graph42.init();
    Node node51 = new Node("");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("[graph]");
    graph42.addNode(node51);
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
    node51.setOwner(graph73);
    graph73.init();
    graph73.setName("hi!");
    graph73.name = "";
    node1.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test412"); }


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
    node10.setOwnerNameDirectly("");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.name = "[graph]";
    node10.setOwner(graph37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node10.getDegree();

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test413"); }


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
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerNameDirectly("");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    graph57.setName("");
    node46.setOwner(graph57);
    graph57.name = "[graph]";
    graph57.setName("");
    node19.setOwner(graph57);
    Graph graph72 = new Graph();
    java.lang.String str73 = graph72.name;
    graph72.init();
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerNameDirectly("[graph]");
    graph72.addNode(node76);
    node76.setOwnerName("");
    Graph graph90 = Graph.generateGraph();
    graph90.setName("[graph]");
    node76.setOwner(graph90);
    graph90.setName("[graph]");
    node19.setOwner(graph90);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node19.getDegree();

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test414"); }


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
    Graph graph38 = Graph.generateGraph();
    graph38.setName("");
    graph38.init();
    java.lang.String str42 = graph38.name;
    graph38.setName("");
    graph38.setName("");
    graph38.init();
    graph38.setName("hi!");
    graph38.name = "";
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
    Graph graph80 = Graph.generateGraph();
    graph80.init();
    java.lang.String str82 = graph80.name;
    java.lang.String str83 = graph80.name;
    node62.setOwner(graph80);
    node62.setOwnerNameDirectly("[graph]");
    node62.setOwnerName("[graph]");
    graph38.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node62);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test415"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    java.lang.String str8 = graph2.name;
    Graph graph9 = Graph.generateGraph();
    graph9.name = "";
    graph9.name = "";
    graph9.setName("hi!");
    graph9.name = "hi!";
    graph9.init();
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
    node29.setOwnerNameDirectly("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    graph49.name = "hi!";
    node29.setOwner(graph49);
    node29.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    graph58.setName("[graph]");
    graph58.name = "";
    java.lang.String str69 = graph58.name;
    graph58.init();
    graph58.init();
    node29.setOwner(graph58);
    graph9.addNode(node29);
    node29.setOwnerNameDirectly("[graph]");
    node29.setOwnerName("hi!");
    graph2.addNode(node29);
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.thisIsNotCalled();

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test416"); }


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
    node9.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test417"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    java.lang.String str2 = graph0.name;
    graph0.setName("");
    graph0.setName("");
    java.lang.String str7 = graph0.name;
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
    node16.setOwnerNameDirectly("hi!");
    node16.setOwnerName("");
    graph8.addNode(node16);
    node16.setOwnerName("[graph]");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    graph32.setName("");
    graph32.name = "[graph]";
    graph32.setName("[graph]");
    node16.setOwner(graph32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph0.getDegree(node16);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test418"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    graph0.name = "hi!";
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
    node21.setOwnerName("[graph]");
    node21.setOwnerNameDirectly("");
    Graph graph44 = Graph.generateGraph();
    graph44.init();
    graph44.name = "hi!";
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
    node49.setOwnerNameDirectly("hi!");
    graph44.addNode(node49);
    Graph graph64 = Graph.generateGraph();
    node49.setOwner(graph64);
    node49.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node21, node49);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test419"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test420"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test421"); }


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
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    graph78.init();
    graph78.init();
    node67.setOwner(graph78);
    node42.setOwner(graph78);
    node42.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node42);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test422"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node25.getDegree();

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test423"); }


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
    graph10.setName("[graph]");
    Node node24 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addNode(node24);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test424"); }


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
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    graph19.setName("[graph]");
    graph19.name = "";
    graph19.name = "";
    graph19.name = "";
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
    node35.setOwnerName("");
    node35.setOwnerName("hi!");
    node35.setOwnerName("");
    node35.setOwnerName("");
    node35.setOwnerName("[graph]");
    graph19.addNode(node35);
    node35.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node35);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test425"); }


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
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    java.lang.String str26 = graph24.name;
    java.lang.String str27 = graph24.name;
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
    graph24.addNode(node35);
    graph24.init();
    graph24.setName("hi!");
    graph24.setName("[graph]");
    node1.setOwner(graph24);
    node1.setOwnerName("[graph]");
    Graph graph61 = Graph.generateGraph();
    graph61.name = "hi!";
    java.lang.String str64 = graph61.name;
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
    graph61.addNode(node66);
    node66.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node66);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test426"); }


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
    graph45.setName("");
    graph45.name = "hi!";
    graph45.setName("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    graph52.setName("hi!");
    graph52.name = "";
    graph52.setName("[graph]");
    Node node63 = new Node("");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("[graph]");
    graph52.addNode(node63);
    graph45.addNode(node63);
    node63.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph21.getDegree(node63);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test427"); }


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
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test428"); }


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
    java.lang.String str92 = graph82.name;
    node35.setOwner(graph82);
    node35.setOwnerName("");
    node35.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = node35.getDegree();

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test429"); }


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
    node36.setOwnerNameDirectly("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.init();
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
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerNameDirectly("");
    node63.setOwnerNameDirectly("hi!");
    graph51.addNode(node63);
    node36.setOwner(graph51);
    graph28.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node36.getDegree();

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test430"); }


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
    node48.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.thisIsNotCalled();

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test431"); }


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
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("[graph]");
    graph37.name = "";
    java.lang.String str48 = graph37.name;
    graph37.setName("[graph]");
    graph37.name = "";
    graph37.init();
    graph37.name = "";
    graph37.init();
    node10.setOwner(graph37);
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    graph58.setName("[graph]");
    graph58.name = "[graph]";
    java.lang.String str66 = graph58.name;
    java.lang.String str67 = graph58.name;
    graph58.name = "hi!";
    node10.setOwner(graph58);
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node10.getDegree();

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test432"); }


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
    Graph graph24 = Graph.generateGraph();
    graph24.init();
    java.lang.String str26 = graph24.name;
    java.lang.String str27 = graph24.name;
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
    graph24.addNode(node35);
    graph24.init();
    graph24.setName("hi!");
    graph24.setName("[graph]");
    node1.setOwner(graph24);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test433"); }


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
    node43.setOwnerName("[graph]");
    node43.setOwnerNameDirectly("[graph]");
    node43.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph26.getDegree(node43);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test434"); }


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
    graph0.init();
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
    node40.setOwnerName("[graph]");
    node40.setOwnerNameDirectly("[graph]");
    node40.setOwnerNameDirectly("hi!");
    graph0.addNode(node40);
    node40.setOwnerName("");
    node40.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node40.thisIsNotCalled();

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test435"); }


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
    int i43 = node25.getDegree();

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test436"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test437"); }


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
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    node22.setOwner(graph33);
    node22.setOwnerName("hi!");
    node22.setOwnerName("hi!");
    node22.setOwnerName("hi!");
    node22.setOwnerNameDirectly("hi!");
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
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node49.setOwner(graph69);
    graph69.name = "";
    node22.setOwner(graph69);
    node1.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test438"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.setName("");
    Graph graph8 = Graph.generateGraph();
    graph8.setName("");
    graph8.init();
    graph8.setName("[graph]");
    graph8.name = "[graph]";
    java.lang.String str16 = graph8.name;
    java.lang.String str17 = graph8.name;
    graph8.setName("[graph]");
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
    node30.setOwnerName("[graph]");
    node30.setOwnerName("hi!");
    node30.setOwnerName("");
    node30.setOwnerName("");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    graph56.setName("");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerName("");
    graph56.addNode(node64);
    java.lang.String str76 = graph56.name;
    graph56.name = "";
    node30.setOwner(graph56);
    node30.setOwnerNameDirectly("");
    graph8.addNode(node30);
    graph0.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node30.getDegree();

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test439"); }


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
    Graph graph78 = new Graph();
    graph78.name = "";
    graph78.name = "[graph]";
    graph78.name = "";
    node31.setOwner(graph78);
    node31.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = node31.getDegree();

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test440"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test441"); }


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
    int i85 = node31.getDegree();

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test442"); }


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
    graph10.name = "";
    graph10.name = "";
    java.lang.String str25 = graph10.name;
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
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node27.setOwner(graph47);
    graph47.init();
    Node node56 = new Node("");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    graph57.setName("");
    node56.setOwner(graph57);
    node56.setOwnerNameDirectly("[graph]");
    graph47.addNode(node56);
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
    graph78.init();
    graph78.name = "[graph]";
    node56.setOwner(graph78);
    node56.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph10.getDegree(node56);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test443"); }


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
    node42.setOwnerNameDirectly("[graph]");
    node42.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph25.getDegree(node42);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test444"); }


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
    int i16 = node1.getDegree();

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test445"); }


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
    int i57 = node35.getDegree();

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test446"); }


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
    graph0.init();
    Node node53 = new Node("hi!");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    node53.setOwner(graph54);
    node53.setOwnerNameDirectly("hi!");
    node53.setOwnerName("hi!");
    node53.setOwnerName("");
    node53.setOwnerName("hi!");
    node53.setOwnerNameDirectly("[graph]");
    node53.setOwnerNameDirectly("[graph]");
    node53.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph0.getDegree(node53);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test447"); }


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
    node6.setOwnerNameDirectly("");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("");
    node6.setOwner(graph17);
    node6.setOwnerName("");
    node6.setOwnerName("hi!");
    node6.setOwnerName("");
    graph0.addNode(node6);
    node6.setOwnerNameDirectly("hi!");
    node6.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node6.thisIsNotCalled();

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test448"); }


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
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    graph66.setName("");
    graph66.setName("[graph]");
    Node node76 = new Node("");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    graph77.setName("");
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("[graph]");
    graph66.addNode(node76);
    node76.setOwnerName("");
    graph10.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node76.getDegree();

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test449"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node1.getDegree();

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test450"); }


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
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node29.getDegree();

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test451"); }


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
    int i33 = node14.getDegree();

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test452"); }


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
    graph47.name = "hi!";
    Graph graph58 = Graph.generateGraph();
    graph58.init();
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
    graph58.addNode(node70);
    node70.setOwnerName("");
    graph47.addNode(node70);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node70.thisIsNotCalled();

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test453"); }


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
    node18.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node18.getDegree();

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test454"); }


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
    int i16 = node1.getDegree();

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test455"); }


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
    graph56.name = "";
    graph56.name = "hi!";
    Graph graph67 = new Graph();
    java.lang.String str68 = graph67.name;
    graph67.init();
    Node node71 = new Node("hi!");
    Graph graph72 = Graph.generateGraph();
    graph72.setName("");
    graph72.init();
    java.lang.String str76 = graph72.name;
    node71.setOwner(graph72);
    node71.setOwnerNameDirectly("hi!");
    node71.setOwnerNameDirectly("[graph]");
    graph67.addNode(node71);
    node71.setOwnerName("");
    node71.setOwnerName("[graph]");
    node71.setOwnerName("hi!");
    graph56.addNode(node71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node71);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test456"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test457"); }


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
    Graph graph44 = Graph.generateGraph();
    graph44.setName("[graph]");
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
    graph44.addNode(node54);
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    java.lang.String str74 = graph72.name;
    java.lang.String str75 = graph72.name;
    node54.setOwner(graph72);
    node54.setOwnerName("hi!");
    node54.setOwnerNameDirectly("");
    node54.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node54);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test458"); }


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
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("");
    graph35.init();
    graph35.name = "";
    Node node48 = new Node("");
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    java.lang.String str57 = graph51.name;
    graph51.init();
    node48.setOwner(graph51);
    graph35.addNode(node48);
    node48.setOwnerName("[graph]");
    node48.setOwnerName("");
    graph0.addNode(node48);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerName("");
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
    graph86.setName("[graph]");
    node67.setOwner(graph86);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph0.getDegree(node67);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test459"); }


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
    int i63 = node10.getDegree();

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test460"); }


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
    Node node43 = new Node("hi!");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    node43.setOwner(graph44);
    graph44.name = "hi!";
    graph44.init();
    graph44.setName("hi!");
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
    graph44.addNode(node56);
    graph44.setName("");
    node10.setOwner(graph44);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node10.getDegree();

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test461"); }


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
    node69.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node69.getDegree();

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test462"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test463"); }


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
    node22.setOwnerName("");
    node22.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test464"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerName("");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = node1.getDegree();

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test465"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test466"); }


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
    graph36.init();
    node25.setOwner(graph36);
    node25.setOwnerName("[graph]");
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.addEdge(node25);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test467"); }


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
    graph23.setName("");
    graph23.setName("");
    java.lang.String str30 = graph23.name;
    graph23.setName("[graph]");
    graph23.init();
    java.lang.String str34 = graph23.name;
    Graph graph35 = Graph.generateGraph();
    graph35.name = "hi!";
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
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    node63.setOwner(graph81);
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    graph85.setName("[graph]");
    node63.setOwner(graph85);
    node63.setOwnerName("");
    graph35.addNode(node63);
    node63.setOwnerName("[graph]");
    graph23.addNode(node63);
    graph0.addNode(node63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = node63.getDegree();

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test468"); }


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
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerNameDirectly("hi!");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    graph74.init();
    graph74.init();
    node63.setOwner(graph74);
    node63.setOwnerNameDirectly("hi!");
    node63.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.addEdge(node63);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test469"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test470"); }


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
    Graph graph35 = Graph.generateGraph();
    graph35.setName("[graph]");
    graph35.name = "[graph]";
    graph35.setName("hi!");
    graph35.init();
    node18.setOwner(graph35);
    Graph graph44 = Graph.generateGraph();
    graph44.setName("[graph]");
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
    graph44.addNode(node54);
    graph44.name = "";
    graph44.name = "";
    graph44.init();
    java.lang.String str77 = graph44.name;
    node18.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test471"); }


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
    graph12.init();
    Node node22 = new Node("hi!");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    node22.setOwner(graph23);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerNameDirectly("");
    node22.setOwnerName("hi!");
    graph12.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node22.getDegree();

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test472"); }


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
    Node node56 = new Node("hi!");
    Graph graph57 = Graph.generateGraph();
    graph57.setName("");
    graph57.init();
    java.lang.String str61 = graph57.name;
    node56.setOwner(graph57);
    graph57.setName("");
    node38.setOwner(graph57);
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node38.setOwner(graph68);
    node38.setOwnerNameDirectly("[graph]");
    node38.setOwnerNameDirectly("");
    graph0.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test473"); }


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
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    java.lang.String str28 = graph22.name;
    graph22.init();
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    java.lang.String str34 = graph30.name;
    graph30.setName("");
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("");
    graph30.addNode(node38);
    graph22.addNode(node38);
    graph22.init();
    java.lang.String str52 = graph22.name;
    graph22.init();
    node5.setOwner(graph22);
    node5.setOwnerNameDirectly("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    node58.setOwnerNameDirectly("hi!");
    node58.setOwnerNameDirectly("[graph]");
    node58.setOwnerName("hi!");
    node58.setOwnerName("hi!");
    node58.setOwnerNameDirectly("[graph]");
    node58.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.addEdge(node58);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test474"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = node10.getDegree();

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test475"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test476"); }


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
    int i83 = node1.getDegree();

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test477"); }


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
    node20.setOwnerName("hi!");
    node20.setOwnerName("");
    node20.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node20.thisIsNotCalled();

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test478"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
    Node node11 = new Node("hi!");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    node11.setOwner(graph12);
    graph12.setName("");
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
    java.lang.String str51 = graph45.name;
    graph45.name = "";
    node21.setOwner(graph45);
    node21.setOwnerNameDirectly("hi!");
    graph12.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph0.getDegree(node21);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test479"); }


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
    Node node68 = new Node("hi!");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    node68.setOwner(graph69);
    node68.setOwnerNameDirectly("hi!");
    node68.setOwnerNameDirectly("");
    node68.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node48.addEdge(node68);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test480"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test481"); }


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
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test482"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test483"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test484"); }


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
    node19.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node19.getDegree();

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test485"); }


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
    node20.setOwnerName("");
    node20.setOwnerName("hi!");
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
    java.lang.String str96 = graph85.name;
    node20.setOwner(graph85);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node20.thisIsNotCalled();

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test486"); }


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
    int i59 = node57.getDegree();

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test487"); }


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
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("[graph]");
    node16.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node16);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test488"); }


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
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = node25.getDegree();

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test489"); }


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
    graph20.init();
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerName("hi!");
    node38.setOwnerName("");
    node38.setOwnerName("hi!");
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerNameDirectly("");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    graph65.setName("");
    node54.setOwner(graph65);
    node38.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph20.getDegree(node38);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test490"); }


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
    node31.setOwnerName("[graph]");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    graph52.setName("");
    graph52.setName("[graph]");
    graph52.setName("");
    node31.setOwner(graph52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node31);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test491"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.setName("[graph]");
    graph0.setName("hi!");
    graph0.setName("");
    Graph graph8 = Graph.generateGraph();
    graph8.name = "hi!";
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
    graph23.addNode(node36);
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    node36.setOwner(graph54);
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    graph58.setName("[graph]");
    node36.setOwner(graph58);
    node36.setOwnerName("");
    graph8.addNode(node36);
    node36.setOwnerName("[graph]");
    node36.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node36);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test492"); }


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
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerNameDirectly("");
    graph33.addNode(node66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node66.thisIsNotCalled();

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test493"); }


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
    node1.setOwner(graph15);
    Graph graph70 = Graph.generateGraph();
    graph70.init();
    graph70.init();
    graph70.init();
    java.lang.String str74 = graph70.name;
    node1.setOwner(graph70);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node1.getDegree();

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test494"); }


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
    node31.thisIsNotCalled();

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test495"); }


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
    graph0.name = "hi!";
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerName("");
    Graph graph71 = new Graph();
    java.lang.String str72 = graph71.name;
    node62.setOwner(graph71);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    graph78.setName("");
    graph78.setName("");
    graph78.init();
    node62.setOwner(graph78);
    Graph graph89 = new Graph();
    graph89.init();
    graph89.init();
    node62.setOwner(graph89);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph0.getDegree(node62);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test496"); }


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
    node19.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test497"); }


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
    graph31.setName("");
    java.lang.String str38 = graph31.name;
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
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerNameDirectly("");
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerNameDirectly("");
    node50.setOwnerNameDirectly("[graph]");
    graph31.addNode(node50);
    node50.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph10.getDegree(node50);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test498"); }


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
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.setName("[graph]");
    graph37.name = "";
    java.lang.String str48 = graph37.name;
    graph37.setName("[graph]");
    graph37.name = "";
    graph37.init();
    graph37.setName("[graph]");
    graph37.name = "hi!";
    graph37.init();
    graph37.setName("[graph]");
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("hi!");
    node62.setOwnerName("[graph]");
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
    graph85.name = "hi!";
    node62.setOwner(graph85);
    graph37.addNode(node62);
    node62.setOwnerName("");
    graph30.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node62.getDegree();

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test499"); }


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
    node37.setOwnerName("");
    node37.setOwnerNameDirectly("");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    java.lang.String str73 = graph69.name;
    graph69.setName("");
    graph69.setName("[graph]");
    graph69.init();
    node37.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph0.getDegree(node37);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest3.test500"); }


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
    node24.thisIsNotCalled();

  }

}
