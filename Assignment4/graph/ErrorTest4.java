
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test001"); }


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
    int i33 = node18.getDegree();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test002"); }


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
    graph28.name = "[graph]";
    java.lang.String str35 = graph28.name;
    graph28.name = "";
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
    graph28.addNode(node39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node39.getDegree();

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test003"); }


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
    node43.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node43.thisIsNotCalled();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test004"); }


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
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test005"); }


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
    java.lang.String str51 = graph44.name;
    graph44.setName("[graph]");
    graph44.setName("");
    graph44.init();
    node9.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node9.getDegree();

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test006"); }


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
    node14.thisIsNotCalled();

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test007"); }


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
    node31.setOwnerName("hi!");
    node31.setOwnerNameDirectly("");
    node31.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = node31.getDegree();

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test008"); }


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
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test009"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test010"); }


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
    int i77 = node35.getDegree();

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test011"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test012"); }


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
    node4.thisIsNotCalled();

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test013"); }


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
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node55.getDegree();

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test014"); }


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
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test015"); }


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
    graph0.setName("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
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
    node53.setOwnerName("");
    graph28.addNode(node53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph0.getDegree(node53);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test016"); }


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
    node74.setOwnerName("");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test017"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    graph0.name = "[graph]";
    graph0.init();
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
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    node12.setOwner(graph32);
    graph32.name = "";
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("");
    node42.setOwnerName("[graph]");
    graph32.addNode(node42);
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
    graph56.name = "";
    graph56.name = "";
    node42.setOwner(graph56);
    Graph graph89 = new Graph();
    graph89.name = "";
    graph89.name = "[graph]";
    graph89.name = "";
    node42.setOwner(graph89);
    graph0.addNode(node42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node42.thisIsNotCalled();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test018"); }


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
    node14.thisIsNotCalled();

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test019"); }


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
    int i52 = node17.getDegree();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test020"); }


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
    int i88 = node1.getDegree();

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test021"); }


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
    int i53 = node34.getDegree();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test022"); }


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
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test023"); }


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
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node10.getDegree();

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test024"); }


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
    node10.setOwnerNameDirectly("[graph]");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    graph39.name = "hi!";
    graph39.name = "";
    java.lang.String str47 = graph39.name;
    graph39.init();
    graph39.name = "";
    Graph graph51 = Graph.generateGraph();
    graph51.setName("[graph]");
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    graph54.setName("hi!");
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
    graph54.addNode(node61);
    graph51.addNode(node61);
    Graph graph79 = Graph.generateGraph();
    graph79.init();
    java.lang.String str81 = graph79.name;
    java.lang.String str82 = graph79.name;
    node61.setOwner(graph79);
    node61.setOwnerName("[graph]");
    graph39.addNode(node61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node61);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test025"); }


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
    node64.setOwnerName("[graph]");
    node64.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node64);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test026"); }


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
    node8.setOwnerNameDirectly("");
    Graph graph19 = Graph.generateGraph();
    graph19.setName("");
    graph19.init();
    java.lang.String str23 = graph19.name;
    graph19.setName("");
    graph19.setName("");
    node8.setOwner(graph19);
    node8.setOwnerName("");
    node8.setOwnerName("");
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
    graph43.setName("");
    graph43.setName("");
    graph43.name = "";
    graph43.setName("hi!");
    java.lang.String str54 = graph43.name;
    node8.setOwner(graph43);
    node8.setOwnerName("[graph]");
    node8.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph0.getDegree(node8);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test027"); }


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
    node18.thisIsNotCalled();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test028"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    Graph graph7 = Graph.generateGraph();
    graph7.setName("");
    graph7.init();
    java.lang.String str11 = graph7.name;
    graph7.setName("");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    graph7.addNode(node15);
    java.lang.String str27 = graph7.name;
    graph7.setName("hi!");
    graph7.init();
    java.lang.String str31 = graph7.name;
    java.lang.String str32 = graph7.name;
    graph7.init();
    graph7.init();
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
    node36.setOwnerName("");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    graph65.setName("");
    graph65.init();
    graph65.init();
    graph65.setName("");
    node36.setOwner(graph65);
    graph7.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph0.getDegree(node36);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test029"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test030"); }


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
    node30.setOwnerName("hi!");
    Graph graph80 = new Graph();
    graph80.name = "";
    graph80.name = "[graph]";
    node30.setOwner(graph80);
    java.lang.String str86 = graph80.name;
    graph80.setName("");
    node4.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node4.getDegree();

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test031"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test032"); }


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
    int i46 = node26.getDegree();

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test033"); }


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
    node1.setOwnerNameDirectly("");
    Node node52 = new Node("");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    graph53.setName("");
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("[graph]");
    node52.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node52);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test034"); }


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
    node25.setOwnerNameDirectly("[graph]");
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
    node50.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node50);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test035"); }


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
    graph12.init();
    graph12.name = "[graph]";
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
    int i87 = graph12.getDegree(node41);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test036"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test037"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test038"); }


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
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node16.setOwner(graph36);
    graph36.name = "";
    Node node46 = new Node("hi!");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    node46.setOwner(graph47);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerName("");
    node46.setOwnerName("[graph]");
    graph36.addNode(node46);
    graph36.name = "hi!";
    java.lang.String str62 = graph36.name;
    graph36.setName("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = Graph.generateGraph();
    graph67.setName("");
    graph67.init();
    java.lang.String str71 = graph67.name;
    node66.setOwner(graph67);
    node66.setOwnerNameDirectly("hi!");
    node66.setOwnerName("");
    node66.setOwnerName("[graph]");
    graph36.addNode(node66);
    node66.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph0.getDegree(node66);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test039"); }


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
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node10.getDegree();

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test040"); }


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
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = node1.getDegree();

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test041"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test042"); }


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
    node11.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = node11.getDegree();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test043"); }


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
    graph34.name = "hi!";
    graph34.name = "[graph]";
    graph34.setName("");
    graph34.setName("hi!");
    node5.setOwner(graph34);
    node5.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.thisIsNotCalled();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test044"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test045"); }


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
    node11.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node11.getDegree();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test046"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test047"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test048"); }


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
    node42.setOwnerName("[graph]");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    graph58.setName("");
    graph58.setName("");
    graph58.init();
    graph58.name = "";
    Node node71 = new Node("");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    java.lang.String str80 = graph74.name;
    graph74.init();
    node71.setOwner(graph74);
    graph58.addNode(node71);
    node71.setOwnerName("[graph]");
    node71.setOwnerNameDirectly("[graph]");
    node71.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node42, node71);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test049"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node10.getDegree();

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test050"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("hi!");
    graph2.setName("[graph]");
    graph2.init();
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
    node23.setOwnerName("");
    node23.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = graph2.getDegree(node23);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test051"); }


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
    node8.setOwnerName("[graph]");
    node8.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test052"); }


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
    node76.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node76.thisIsNotCalled();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test053"); }


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
    node58.setOwnerNameDirectly("");
    node58.setOwnerName("");
    node58.setOwnerNameDirectly("");
    node58.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node58);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test054"); }


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
    graph30.setName("[graph]");
    graph30.name = "[graph]";
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
    node65.setOwnerName("");
    node65.setOwnerNameDirectly("[graph]");
    graph30.addNode(node65);
    node65.setOwnerName("[graph]");
    node65.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node65);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test055"); }


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
    node59.thisIsNotCalled();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test056"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test057"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test058"); }


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
    graph10.init();
    graph10.name = "hi!";
    graph10.name = "[graph]";
    Node node27 = new Node("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerName("");
    node27.setOwnerNameDirectly("[graph]");
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
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    node81.setOwnerNameDirectly("hi!");
    node81.setOwnerNameDirectly("");
    node81.setOwnerName("hi!");
    graph71.addNode(node81);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph10.addEdge(node27, node81);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test059"); }


    Node node1 = new Node("[graph]");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("[graph]");
    Graph graph5 = Graph.generateGraph();
    graph5.setName("");
    graph5.init();
    graph5.setName("hi!");
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
    graph5.addNode(node12);
    graph2.addNode(node12);
    graph2.name = "";
    graph2.setName("");
    graph2.name = "";
    graph2.name = "hi!";
    Graph graph38 = Graph.generateGraph();
    graph38.name = "";
    java.lang.String str41 = graph38.name;
    java.lang.String str42 = graph38.name;
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
    graph38.addNode(node53);
    node53.setOwnerName("[graph]");
    graph2.addNode(node53);
    node53.setOwnerName("");
    node53.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node53);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test060"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.setName("[graph]");
    graph0.name = "";
    Graph graph11 = Graph.generateGraph();
    graph11.name = "";
    java.lang.String str14 = graph11.name;
    java.lang.String str15 = graph11.name;
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
    node26.setOwnerNameDirectly("[graph]");
    graph11.addNode(node26);
    node26.setOwnerName("[graph]");
    node26.setOwnerName("[graph]");
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
    node60.setOwnerNameDirectly("[graph]");
    node60.setOwnerName("");
    node60.setOwnerName("");
    node60.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node26, node60);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test061"); }


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
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    graph64.setName("");
    graph64.init();
    graph64.name = "";
    Node node77 = new Node("");
    Node node79 = new Node("hi!");
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    java.lang.String str84 = graph80.name;
    node79.setOwner(graph80);
    java.lang.String str86 = graph80.name;
    graph80.init();
    node77.setOwner(graph80);
    graph64.addNode(node77);
    node28.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node28.getDegree();

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test062"); }


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
    graph2.name = "";
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
    node17.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph2.getDegree(node17);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test063"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = node10.getDegree();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test064"); }


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
    java.lang.String str54 = graph47.name;
    graph47.init();
    graph47.setName("");
    graph47.name = "[graph]";
    graph47.init();
    Node node62 = new Node("hi!");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerName("");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    graph73.setName("hi!");
    node62.setOwner(graph73);
    Node node81 = new Node("hi!");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    node81.setOwner(graph82);
    node62.setOwner(graph82);
    node62.setOwnerNameDirectly("");
    node62.setOwnerName("hi!");
    node62.setOwnerName("[graph]");
    graph47.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node62.thisIsNotCalled();

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test065"); }


    Graph graph0 = new Graph();
    Graph graph1 = Graph.generateGraph();
    graph1.setName("");
    graph1.init();
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
    graph1.addNode(node15);
    node15.setOwnerName("[graph]");
    Node node58 = new Node("hi!");
    Graph graph59 = Graph.generateGraph();
    graph59.setName("");
    graph59.init();
    java.lang.String str63 = graph59.name;
    node58.setOwner(graph59);
    graph59.setName("hi!");
    graph59.setName("[graph]");
    node15.setOwner(graph59);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node15);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test066"); }


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
    graph49.setName("hi!");
    node38.setOwner(graph49);
    node38.setOwnerName("hi!");
    node38.setOwnerName("hi!");
    node38.setOwnerName("hi!");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    java.lang.String str66 = graph62.name;
    graph62.setName("");
    graph62.setName("");
    graph62.init();
    graph62.setName("[graph]");
    graph62.name = "";
    graph62.init();
    node38.setOwner(graph62);
    java.lang.String str78 = graph62.name;
    node10.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node10.getDegree();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test067"); }


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
    node29.setOwnerNameDirectly("");
    node29.setOwnerName("hi!");
    node29.setOwnerNameDirectly("[graph]");
    node29.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph10.getDegree(node29);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test068"); }


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
    int i80 = node35.getDegree();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test069"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test070"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = node10.getDegree();

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test071"); }


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
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test072"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node10.getDegree();

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test073"); }


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
    node61.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node61.getDegree();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test074"); }


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
    graph76.init();
    graph76.name = "[graph]";
    node54.setOwner(graph76);
    Node node84 = new Node("hi!");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    node84.setOwner(graph85);
    node84.setOwnerNameDirectly("hi!");
    node84.setOwnerName("[graph]");
    node84.setOwnerName("hi!");
    graph76.addNode(node84);
    node10.setOwner(graph76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test075"); }


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
    node12.setOwnerName("");
    node12.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node12.getDegree();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test076"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test077"); }


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
    Graph graph77 = Graph.generateGraph();
    graph77.name = "hi!";
    java.lang.String str80 = graph77.name;
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    node82.setOwnerNameDirectly("hi!");
    node82.setOwnerName("");
    Graph graph93 = Graph.generateGraph();
    graph93.init();
    node82.setOwner(graph93);
    graph77.addNode(node82);
    node82.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node20.addEdge(node82);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test078"); }


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
    Node node48 = new Node("hi!");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    node48.setOwner(graph49);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerName("");
    node48.setOwnerName("[graph]");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    graph61.name = "";
    graph61.setName("");
    node48.setOwner(graph61);
    node48.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node48);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test079"); }


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
    graph59.setName("[graph]");
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
    graph59.addNode(node69);
    graph59.name = "";
    graph59.setName("");
    java.lang.String str91 = graph59.name;
    graph59.setName("[graph]");
    node34.setOwner(graph59);
    node34.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node34.thisIsNotCalled();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test080"); }


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
    node31.setOwnerName("hi!");
    node31.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = node31.getDegree();

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test081"); }


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
    int i29 = node10.getDegree();

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test082"); }


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
    node14.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test083"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node1.getDegree();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test084"); }


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
    node4.setOwnerNameDirectly("[graph]");
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
    node25.setOwnerName("");
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node4.addEdge(node25);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test085"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test086"); }


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
    node33.setOwnerName("");
    node33.setOwnerNameDirectly("");
    node33.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node33);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test087"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.init();
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
    node22.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = graph0.getDegree(node22);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test088"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test089"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test090"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test091"); }


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
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    java.lang.String str53 = graph46.name;
    node1.setOwner(graph46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test092"); }


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
    graph0.name = "hi!";
    graph0.setName("hi!");
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
    node40.setOwnerName("hi!");
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("[graph]");
    node40.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = graph0.getDegree(node40);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test093"); }


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
    graph29.name = "hi!";
    java.lang.String str37 = graph29.name;
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
    Graph graph66 = Graph.generateGraph();
    graph66.init();
    java.lang.String str68 = graph66.name;
    java.lang.String str69 = graph66.name;
    node48.setOwner(graph66);
    node48.setOwnerName("[graph]");
    node48.setOwnerName("");
    graph29.addNode(node48);
    node10.setOwner(graph29);
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = node10.getDegree();

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test094"); }


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
    graph21.init();
    graph21.init();
    graph21.init();
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
    graph46.addNode(node59);
    node59.setOwnerName("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.init();
    graph79.init();
    graph79.init();
    java.lang.String str83 = graph79.name;
    node59.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph21.getDegree(node59);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test095"); }


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
    java.lang.String str19 = graph10.name;
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    java.lang.String str28 = graph22.name;
    Node node30 = new Node("hi!");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    node30.setOwner(graph31);
    graph31.setName("");
    graph31.init();
    graph31.setName("");
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
    graph31.addNode(node50);
    graph22.addNode(node50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = graph10.getDegree(node50);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test096"); }


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
    node55.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test097"); }


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
    node14.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test098"); }


    Graph graph0 = Graph.generateGraph();
    graph0.name = "hi!";
    java.lang.String str3 = graph0.name;
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
    Graph graph34 = Graph.generateGraph();
    graph34.init();
    java.lang.String str36 = graph34.name;
    java.lang.String str37 = graph34.name;
    node16.setOwner(graph34);
    node16.setOwnerName("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    graph41.setName("");
    graph41.setName("[graph]");
    graph41.name = "";
    graph41.name = "";
    node16.setOwner(graph41);
    node16.setOwnerName("[graph]");
    graph0.addNode(node16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node16.thisIsNotCalled();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test099"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test100"); }


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
    node68.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.addEdge(node68);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test101"); }


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
    node24.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test102"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    java.lang.String str3 = graph0.name;
    graph0.setName("[graph]");
    java.lang.String str6 = graph0.name;
    Node node8 = new Node("hi!");
    Graph graph9 = Graph.generateGraph();
    graph9.setName("");
    graph9.init();
    java.lang.String str13 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerName("");
    Graph graph17 = new Graph();
    java.lang.String str18 = graph17.name;
    node8.setOwner(graph17);
    node8.setOwnerNameDirectly("hi!");
    node8.setOwnerName("");
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
    graph0.addEdge(node8, node25);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test103"); }


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
    node48.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = node48.getDegree();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test104"); }


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
    node1.setOwnerName("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.init();
    java.lang.String str26 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerName("");
    Graph graph30 = new Graph();
    java.lang.String str31 = graph30.name;
    node21.setOwner(graph30);
    graph30.name = "";
    graph30.init();
    java.lang.String str36 = graph30.name;
    node1.setOwner(graph30);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node1.getDegree();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test105"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = node1.getDegree();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test106"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node39.getDegree();

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test107"); }


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
    node24.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node24.thisIsNotCalled();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test108"); }


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
    node11.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test109"); }


    Graph graph0 = Graph.generateGraph();
    graph0.init();
    graph0.setName("[graph]");
    graph0.setName("");
    graph0.init();
    java.lang.String str7 = graph0.name;
    graph0.init();
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    java.lang.String str16 = graph12.name;
    graph12.setName("");
    node11.setOwner(graph12);
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
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
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    graph53.setName("");
    node34.setOwner(graph53);
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node34.setOwner(graph64);
    node34.setOwnerNameDirectly("[graph]");
    graph20.addNode(node34);
    node11.setOwner(graph20);
    node11.setOwnerName("[graph]");
    node11.setOwnerName("hi!");
    graph9.addNode(node11);
    graph0.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = node11.getDegree();

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test110"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = node10.getDegree();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test111"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node43.thisIsNotCalled();

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test112"); }


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
    graph16.setName("");
    graph16.name = "hi!";
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
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph16.addNode(node25);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test113"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.name = "[graph]";
    graph0.name = "hi!";
    java.lang.String str12 = graph0.name;
    java.lang.String str13 = graph0.name;
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.name = "hi!";
    graph22.setName("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
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
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node43.setOwner(graph73);
    node43.setOwnerNameDirectly("[graph]");
    graph29.addNode(node43);
    graph22.addNode(node43);
    node15.setOwner(graph22);
    node15.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph0.getDegree(node15);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test114"); }


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
    node18.setOwnerName("hi!");
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node18.getDegree();

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test115"); }


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
    Graph graph54 = Graph.generateGraph();
    graph54.setName("");
    graph54.init();
    java.lang.String str58 = graph54.name;
    graph54.setName("");
    graph54.setName("");
    graph54.init();
    graph54.name = "";
    Node node67 = new Node("");
    Node node69 = new Node("hi!");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    node69.setOwner(graph70);
    java.lang.String str76 = graph70.name;
    graph70.init();
    node67.setOwner(graph70);
    graph54.addNode(node67);
    node67.setOwnerName("[graph]");
    node67.setOwnerNameDirectly("[graph]");
    node67.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node67);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test116"); }


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
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    graph39.name = "hi!";
    java.lang.String str47 = graph39.name;
    graph39.name = "hi!";
    graph39.name = "";
    node17.setOwner(graph39);
    node17.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = node17.getDegree();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test117"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node1.getDegree();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test118"); }


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
    Graph graph60 = Graph.generateGraph();
    graph60.setName("");
    graph60.init();
    java.lang.String str64 = graph60.name;
    graph60.setName("");
    graph60.setName("");
    graph60.init();
    graph60.setName("hi!");
    graph60.init();
    graph60.init();
    node25.setOwner(graph60);
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
    node76.setOwnerName("");
    node76.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph60.getDegree(node76);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test119"); }


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
    graph0.setName("[graph]");
    graph0.init();
    graph0.setName("");
    Node node63 = new Node("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    node63.setOwner(graph64);
    node63.setOwnerName("");
    Graph graph72 = Graph.generateGraph();
    graph72.init();
    java.lang.String str74 = graph72.name;
    node63.setOwner(graph72);
    graph0.addNode(node63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = node63.getDegree();

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test120"); }


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
    node38.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node38.thisIsNotCalled();

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test121"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = node10.getDegree();

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test122"); }


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
    node19.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test123"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "hi!";
    graph0.setName("hi!");
    java.lang.String str7 = graph0.name;
    graph0.setName("[graph]");
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
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerNameDirectly("");
    graph10.addNode(node65);
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    node78.setOwnerNameDirectly("hi!");
    node78.setOwnerName("");
    Graph graph89 = Graph.generateGraph();
    graph89.init();
    node78.setOwner(graph89);
    graph10.addNode(node78);
    node78.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph0.getDegree(node78);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test124"); }


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
    node10.setOwnerNameDirectly("");
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
    node35.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node35);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test125"); }


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
    node36.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node36.getDegree();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test126"); }


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
    node31.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test127"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test128"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node11.getDegree();

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test129"); }


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
    node8.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test130"); }


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
    node55.setOwnerName("[graph]");
    node55.setOwnerName("hi!");
    node55.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node55.thisIsNotCalled();

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test131"); }


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
    node58.setOwner(graph76);
    Graph graph80 = Graph.generateGraph();
    graph80.setName("");
    graph80.init();
    graph80.setName("[graph]");
    node58.setOwner(graph80);
    java.lang.String str87 = graph80.name;
    graph80.init();
    graph80.setName("[graph]");
    graph80.init();
    graph80.name = "[graph]";
    graph80.name = "[graph]";
    node10.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test132"); }


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
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = node18.getDegree();

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test133"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node13.getDegree();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test134"); }


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
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    graph31.setName("");
    graph31.init();
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    node30.setOwner(graph31);
    node30.setOwnerNameDirectly("hi!");
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
    graph41.addNode(node55);
    graph41.init();
    graph41.init();
    graph41.name = "[graph]";
    node30.setOwner(graph41);
    node30.setOwnerName("");
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node30);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test135"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.init();
    graph2.setName("[graph]");
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
    node21.setOwnerName("hi!");
    node21.setOwnerNameDirectly("");
    node21.setOwnerNameDirectly("hi!");
    Graph graph45 = Graph.generateGraph();
    graph45.setName("[graph]");
    node21.setOwner(graph45);
    node21.setOwnerName("[graph]");
    graph2.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = node21.getDegree();

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test136"); }


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
    graph49.name = "hi!";
    java.lang.String str63 = graph49.name;
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
    node74.setOwnerNameDirectly("[graph]");
    node74.setOwnerName("hi!");
    node74.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph49.getDegree(node74);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test137"); }


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
    node31.thisIsNotCalled();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test138"); }


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
    graph16.setName("hi!");
    java.lang.String str21 = graph16.name;
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    graph34.setName("");
    graph34.setName("");
    node23.setOwner(graph34);
    graph34.name = "[graph]";
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("");
    graph34.addNode(node47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph16.addNode(node47);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test139"); }


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
    node22.thisIsNotCalled();

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test140"); }


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
    node25.setOwnerName("[graph]");
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node25.getDegree();

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test141"); }


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
    java.lang.String str34 = graph21.name;
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerNameDirectly("");
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    graph47.setName("");
    node36.setOwner(graph47);
    node36.setOwnerName("");
    node36.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph21.getDegree(node36);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test142"); }


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
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = node10.getDegree();

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test143"); }


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
    node36.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node36.thisIsNotCalled();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test144"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test145"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node10.getDegree();

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test146"); }


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
    node44.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test147"); }


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
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    graph61.init();
    graph61.init();
    node50.setOwner(graph61);
    node50.setOwnerNameDirectly("hi!");
    Node node73 = new Node("hi!");
    Graph graph74 = Graph.generateGraph();
    graph74.setName("");
    graph74.init();
    java.lang.String str78 = graph74.name;
    node73.setOwner(graph74);
    java.lang.String str80 = graph74.name;
    graph74.name = "";
    node50.setOwner(graph74);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node50);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test148"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    graph0.init();
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    Graph graph22 = Graph.generateGraph();
    graph22.setName("");
    graph22.name = "hi!";
    graph22.setName("hi!");
    Graph graph29 = Graph.generateGraph();
    graph29.setName("");
    graph29.init();
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
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node43.setOwner(graph73);
    node43.setOwnerNameDirectly("[graph]");
    graph29.addNode(node43);
    graph22.addNode(node43);
    node15.setOwner(graph22);
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph0.getDegree(node15);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test149"); }


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
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test150"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node19.thisIsNotCalled();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test151"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = node30.getDegree();

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test152"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node1.getDegree();

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test153"); }


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
    graph29.init();
    graph29.name = "hi!";
    graph29.name = "hi!";
    graph29.name = "";
    Graph graph45 = Graph.generateGraph();
    graph45.init();
    java.lang.String str47 = graph45.name;
    java.lang.String str48 = graph45.name;
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
    graph45.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph29.getDegree(node56);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test154"); }


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
    node47.setOwnerName("");
    Graph graph58 = Graph.generateGraph();
    graph58.init();
    node47.setOwner(graph58);
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
    graph58.addNode(node71);
    graph58.setName("");
    graph58.name = "hi!";
    java.lang.String str93 = graph58.name;
    graph58.setName("[graph]");
    node27.setOwner(graph58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test155"); }


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
    graph52.init();
    graph52.setName("hi!");
    graph52.name = "";
    graph52.name = "[graph]";
    graph52.name = "[graph]";
    java.lang.String str68 = graph52.name;
    graph52.name = "";
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node72.setOwnerNameDirectly("hi!");
    node72.setOwnerName("");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    graph83.setName("hi!");
    node72.setOwner(graph83);
    node72.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph52.getDegree(node72);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test156"); }


    Graph graph0 = new Graph();
    java.lang.String str1 = graph0.name;
    graph0.setName("[graph]");
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
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    graph53.name = "hi!";
    java.lang.String str61 = graph53.name;
    graph53.name = "hi!";
    node14.setOwner(graph53);
    node14.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node14);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test157"); }


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
    node68.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node68.thisIsNotCalled();

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test158"); }


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
    graph44.init();
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    Graph graph62 = Graph.generateGraph();
    graph62.setName("");
    graph62.init();
    graph62.setName("hi!");
    node51.setOwner(graph62);
    graph44.addNode(node51);
    node51.setOwnerName("hi!");
    node51.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node51);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test159"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test160"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test161"); }


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
    int i76 = node74.getDegree();

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test162"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test163"); }


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
    Graph graph68 = Graph.generateGraph();
    graph68.setName("[graph]");
    Graph graph71 = Graph.generateGraph();
    graph71.setName("");
    graph71.init();
    graph71.setName("hi!");
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    node78.setOwnerNameDirectly("hi!");
    node78.setOwnerName("");
    Graph graph89 = Graph.generateGraph();
    graph89.init();
    node78.setOwner(graph89);
    node78.setOwnerName("hi!");
    graph71.addNode(node78);
    graph68.addNode(node78);
    node78.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node78);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test164"); }


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
    graph26.name = "";
    graph26.setName("");
    graph26.init();
    graph26.name = "hi!";
    graph26.setName("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("hi!");
    node64.setOwnerNameDirectly("[graph]");
    node64.setOwnerName("hi!");
    node64.setOwnerName("hi!");
    node64.setOwnerNameDirectly("hi!");
    graph26.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node64);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test165"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = node1.getDegree();

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test166"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node10.getDegree();

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test167"); }


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
    Graph graph34 = Graph.generateGraph();
    graph34.setName("[graph]");
    node10.setOwner(graph34);
    node10.setOwnerName("[graph]");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test168"); }


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
    Node node86 = new Node("hi!");
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    graph87.init();
    java.lang.String str91 = graph87.name;
    node86.setOwner(graph87);
    node57.setOwner(graph87);
    node57.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph29.getDegree(node57);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test169"); }


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
    int i82 = node38.getDegree();

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test170"); }


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
    node61.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node61.thisIsNotCalled();

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test171"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("");
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
    node26.setOwner(graph56);
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    graph63.setName("hi!");
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
    graph63.addNode(node70);
    node70.setOwnerName("[graph]");
    graph56.addNode(node70);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node70);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test172"); }


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
    node10.setOwnerName("[graph]");
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
    node33.setOwnerName("");
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
    node33.setOwner(graph68);
    node33.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node33);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test173"); }


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
    int i69 = node19.getDegree();

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test174"); }


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
    java.lang.String str65 = graph54.name;
    Node node67 = new Node("hi!");
    Graph graph68 = Graph.generateGraph();
    graph68.setName("");
    graph68.init();
    java.lang.String str72 = graph68.name;
    node67.setOwner(graph68);
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerName("");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    graph78.setName("hi!");
    node67.setOwner(graph78);
    Node node86 = new Node("hi!");
    Graph graph87 = Graph.generateGraph();
    graph87.setName("");
    graph87.init();
    java.lang.String str91 = graph87.name;
    node86.setOwner(graph87);
    node67.setOwner(graph87);
    node67.setOwnerNameDirectly("");
    node67.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph54.addNode(node67);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test175"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.thisIsNotCalled();

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test176"); }


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
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test177"); }


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
    node44.thisIsNotCalled();

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test178"); }


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
    java.lang.String str15 = graph2.name;
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
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerNameDirectly("");
    node54.setOwnerNameDirectly("");
    node54.setOwnerName("[graph]");
    Graph graph69 = Graph.generateGraph();
    graph69.setName("");
    graph69.init();
    graph69.setName("[graph]");
    graph69.name = "[graph]";
    java.lang.String str77 = graph69.name;
    java.lang.String str78 = graph69.name;
    graph69.name = "";
    graph69.setName("");
    java.lang.String str83 = graph69.name;
    java.lang.String str84 = graph69.name;
    node54.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node34, node54);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test179"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node1.getDegree();

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test180"); }


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
    node10.thisIsNotCalled();

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test181"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test182"); }


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
    node10.setOwnerName("");
    Graph graph19 = new Graph();
    java.lang.String str20 = graph19.name;
    node10.setOwner(graph19);
    graph19.init();
    graph19.name = "[graph]";
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
    node26.setOwnerNameDirectly("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = Graph.generateGraph();
    graph50.setName("");
    graph50.init();
    java.lang.String str54 = graph50.name;
    node49.setOwner(graph50);
    java.lang.String str56 = graph50.name;
    graph50.name = "";
    node26.setOwner(graph50);
    graph19.addNode(node26);
    node26.setOwnerNameDirectly("");
    node26.setOwnerNameDirectly("");
    node26.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = graph0.getDegree(node26);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test183"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = node10.getDegree();

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test184"); }


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
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = node1.getDegree();

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test185"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str10 = graph2.name;
    graph2.setName("");
    graph2.name = "[graph]";
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
    Node node33 = new Node("hi!");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    node33.setOwner(graph34);
    node33.setOwnerName("");
    Graph graph42 = new Graph();
    java.lang.String str43 = graph42.name;
    node33.setOwner(graph42);
    graph42.setName("");
    graph42.setName("");
    graph42.name = "";
    graph42.init();
    node16.setOwner(graph42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph2.getDegree(node16);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test186"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test187"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test188"); }


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
    graph39.name = "[graph]";
    node10.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = node10.getDegree();

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test189"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test190"); }


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
    node17.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.thisIsNotCalled();

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test191"); }


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
    graph10.setName("[graph]");
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
    node38.setOwnerName("hi!");
    graph10.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node38.getDegree();

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test192"); }


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
    node54.setOwnerName("");
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    graph78.setName("");
    graph78.init();
    graph78.setName("");
    node54.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node54.thisIsNotCalled();

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test193"); }


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
    int i81 = node1.getDegree();

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test194"); }


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
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    java.lang.String str52 = graph46.name;
    graph46.init();
    graph46.name = "hi!";
    graph46.name = "";
    node1.setOwner(graph46);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = node1.getDegree();

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test195"); }


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
    node10.setOwnerNameDirectly("");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test196"); }


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
    node44.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test197"); }


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
    node1.setOwnerNameDirectly("");
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
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerNameDirectly("");
    node37.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node37);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test198"); }


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
    node48.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node48.getDegree();

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test199"); }


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
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = node10.getDegree();

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test200"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.setName("");
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
    node22.setOwnerName("[graph]");
    node22.setOwnerName("hi!");
    node22.setOwnerName("");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    node47.setOwnerNameDirectly("hi!");
    Node node57 = new Node("hi!");
    Graph graph58 = Graph.generateGraph();
    graph58.setName("");
    graph58.init();
    java.lang.String str62 = graph58.name;
    node57.setOwner(graph58);
    graph58.init();
    graph58.init();
    node47.setOwner(graph58);
    node22.setOwner(graph58);
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerName("hi!");
    Graph graph72 = new Graph();
    graph72.name = "";
    graph72.name = "[graph]";
    node22.setOwner(graph72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph0.getDegree(node22);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test201"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node34.getDegree();

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test202"); }


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
    node57.setOwnerNameDirectly("");

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test203"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.name = "";
    graph0.setName("");
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("hi!");
    node15.setOwnerName("");
    Graph graph26 = Graph.generateGraph();
    graph26.setName("");
    graph26.init();
    graph26.setName("hi!");
    node15.setOwner(graph26);
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    node15.setOwner(graph35);
    graph35.name = "";
    Node node45 = new Node("hi!");
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    node45.setOwner(graph46);
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerName("");
    node45.setOwnerName("[graph]");
    graph35.addNode(node45);
    Graph graph59 = Graph.generateGraph();
    graph59.setName("[graph]");
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
    graph59.addNode(node69);
    graph59.name = "";
    graph59.name = "";
    node45.setOwner(graph59);
    node45.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph0.getDegree(node45);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test204"); }


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
    node14.setOwnerName("hi!");
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
    node45.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node45);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test205"); }


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
    node49.thisIsNotCalled();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test206"); }


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
    java.lang.String str38 = graph25.name;
    Node node40 = new Node("hi!");
    Graph graph41 = Graph.generateGraph();
    graph41.setName("");
    graph41.init();
    java.lang.String str45 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    node40.setOwner(graph51);
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
    graph68.name = "";
    graph68.init();
    graph68.name = "hi!";
    node40.setOwner(graph68);
    node40.setOwnerNameDirectly("");
    Graph graph85 = Graph.generateGraph();
    graph85.setName("");
    graph85.init();
    java.lang.String str89 = graph85.name;
    graph85.setName("");
    java.lang.String str92 = graph85.name;
    node40.setOwner(graph85);
    graph25.addNode(node40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = node40.getDegree();

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test207"); }


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
    int i96 = node1.getDegree();

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test208"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test209"); }


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
    node10.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test210"); }


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
    graph35.name = "[graph]";
    java.lang.String str64 = graph35.name;
    java.lang.String str65 = graph35.name;
    node1.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node1.getDegree();

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test211"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    graph0.name = "";
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.name = "hi!";
    graph11.setName("hi!");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
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
    graph18.addNode(node32);
    graph11.addNode(node32);
    node32.setOwnerNameDirectly("[graph]");
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
    node76.setOwner(graph87);
    graph87.setName("[graph]");
    node32.setOwner(graph87);
    node32.setOwnerName("");
    node32.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph0.getDegree(node32);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test212"); }


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
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    graph39.name = "hi!";
    java.lang.String str47 = graph39.name;
    graph39.name = "hi!";
    graph39.name = "";
    node17.setOwner(graph39);
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node17.addEdge(node63);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test213"); }


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
    graph29.setName("hi!");
    graph29.init();
    graph29.init();
    java.lang.String str44 = graph29.name;
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
    node64.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph29.getDegree(node64);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test214"); }


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
    graph21.name = "";
    graph21.setName("[graph]");
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
    java.lang.String str82 = graph73.name;
    graph73.name = "hi!";
    node44.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = graph21.getDegree(node44);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test215"); }


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
    node45.setOwnerNameDirectly("hi!");
    node45.setOwnerNameDirectly("");
    Graph graph70 = Graph.generateGraph();
    graph70.setName("");
    graph70.init();
    java.lang.String str74 = graph70.name;
    graph70.setName("");
    graph70.init();
    graph70.name = "[graph]";
    graph70.init();
    graph70.init();
    graph70.init();
    node45.setOwner(graph70);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node45.getDegree();

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test216"); }


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
    graph38.setName("hi!");
    java.lang.String str49 = graph38.name;
    Graph graph50 = new Graph();
    java.lang.String str51 = graph50.name;
    graph50.init();
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerNameDirectly("[graph]");
    graph50.addNode(node54);
    node54.setOwnerName("");
    node54.setOwnerName("[graph]");
    node54.setOwnerNameDirectly("");
    graph38.addNode(node54);
    graph0.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node54.thisIsNotCalled();

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test217"); }


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
    node10.setOwnerName("[graph]");
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
    graph75.name = "[graph]";
    node46.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node46);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test218"); }


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
    node54.setOwnerName("");
    Node node77 = new Node("hi!");
    Graph graph78 = Graph.generateGraph();
    graph78.setName("");
    graph78.init();
    java.lang.String str82 = graph78.name;
    node77.setOwner(graph78);
    graph78.setName("");
    graph78.init();
    graph78.setName("");
    node54.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node54.getDegree();

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test219"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.name = "hi!";
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
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
    node28.setOwnerName("[graph]");
    node28.setOwnerNameDirectly("");
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
    graph45.name = "[graph]";
    graph45.init();
    node28.setOwner(graph45);
    graph0.addNode(node28);
    node28.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test220"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("hi!");
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
    node22.setOwnerNameDirectly("hi!");
    node22.setOwnerNameDirectly("[graph]");
    Graph graph49 = Graph.generateGraph();
    graph49.setName("");
    graph49.init();
    java.lang.String str53 = graph49.name;
    graph49.setName("");
    graph49.setName("[graph]");
    graph49.name = "";
    java.lang.String str60 = graph49.name;
    graph49.setName("[graph]");
    graph49.name = "";
    graph49.init();
    graph49.name = "";
    graph49.init();
    node22.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test221"); }


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
    node8.thisIsNotCalled();

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test222"); }


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
    Graph graph46 = Graph.generateGraph();
    graph46.setName("");
    graph46.init();
    java.lang.String str50 = graph46.name;
    graph46.setName("");
    java.lang.String str53 = graph46.name;
    node1.setOwner(graph46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = node1.getDegree();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test223"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node35.getDegree();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test224"); }


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
    Node node51 = new Node("hi!");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    java.lang.String str56 = graph52.name;
    node51.setOwner(graph52);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    node51.setOwnerName("[graph]");
    graph21.addNode(node51);
    node51.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node51.getDegree();

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test225"); }


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
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    graph44.setName("");
    graph44.init();
    java.lang.String str48 = graph44.name;
    graph44.setName("");
    node43.setOwner(graph44);
    node43.setOwnerNameDirectly("hi!");
    node43.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node43);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test226"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.setName("hi!");
    graph0.name = "";
    graph0.name = "hi!";
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
    node23.setOwnerNameDirectly("");
    node23.setOwnerNameDirectly("[graph]");
    node23.setOwnerName("[graph]");
    graph0.addNode(node23);
    java.lang.String str53 = graph0.name;
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
    node64.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph0.getDegree(node64);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test227"); }


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
    int i19 = node1.getDegree();

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test228"); }


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
    graph0.init();
    Node node45 = new Node("");
    Node node47 = new Node("hi!");
    Graph graph48 = Graph.generateGraph();
    graph48.setName("");
    graph48.init();
    java.lang.String str52 = graph48.name;
    node47.setOwner(graph48);
    java.lang.String str54 = graph48.name;
    graph48.init();
    node45.setOwner(graph48);
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
    node45.setOwner(graph57);
    node45.setOwnerName("");
    node45.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph0.getDegree(node45);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test229"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.name = "";
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
    node11.setOwnerName("hi!");
    node11.setOwnerNameDirectly("");
    node11.setOwnerName("");
    node11.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = graph0.getDegree(node11);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test230"); }


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
    node21.setOwnerName("");
    node21.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = node21.getDegree();

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test231"); }


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
    Graph graph73 = Graph.generateGraph();
    graph73.name = "hi!";
    java.lang.String str76 = graph73.name;
    Node node78 = new Node("hi!");
    Graph graph79 = Graph.generateGraph();
    graph79.setName("");
    graph79.init();
    java.lang.String str83 = graph79.name;
    node78.setOwner(graph79);
    node78.setOwnerNameDirectly("hi!");
    node78.setOwnerName("");
    Graph graph89 = Graph.generateGraph();
    graph89.init();
    node78.setOwner(graph89);
    graph73.addNode(node78);
    node78.setOwnerNameDirectly("[graph]");
    node78.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node78);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test232"); }


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
    Node node64 = new Node("hi!");
    Graph graph65 = Graph.generateGraph();
    graph65.setName("");
    graph65.init();
    java.lang.String str69 = graph65.name;
    node64.setOwner(graph65);
    node45.setOwner(graph65);
    java.lang.String str72 = graph65.name;
    node10.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node10.getDegree();

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test233"); }


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
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    graph24.setName("");
    graph24.name = "[graph]";
    graph24.setName("[graph]");
    node8.setOwner(graph24);
    node8.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test234"); }


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
    node75.setOwnerName("[graph]");
    graph61.addNode(node75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph10.getDegree(node75);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test235"); }


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
    node35.setOwnerNameDirectly("[graph]");
    node35.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = node35.getDegree();

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test236"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.name = "hi!";
    java.lang.String str12 = graph0.name;
    graph0.setName("");
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
    node25.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = graph0.getDegree(node25);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test237"); }


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
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    java.lang.String str37 = graph33.name;
    graph33.setName("");
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node32);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test238"); }


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
    node43.thisIsNotCalled();

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test239"); }


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
    graph40.init();
    Graph graph50 = Graph.generateGraph();
    graph50.init();
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
    graph50.addNode(node62);
    node62.setOwnerName("");
    graph40.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node62.getDegree();

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test240"); }


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
    node21.setOwnerName("");
    node21.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test241"); }


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
    graph10.init();
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
    node63.setOwnerNameDirectly("[graph]");
    Node node82 = new Node("hi!");
    Graph graph83 = Graph.generateGraph();
    graph83.setName("");
    graph83.init();
    java.lang.String str87 = graph83.name;
    node82.setOwner(graph83);
    graph83.setName("hi!");
    graph83.setName("[graph]");
    graph83.name = "[graph]";
    node63.setOwner(graph83);
    node63.setOwnerName("[graph]");
    graph10.addNode(node63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = node63.getDegree();

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test242"); }


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
    node79.setOwnerName("");
    Graph graph88 = new Graph();
    java.lang.String str89 = graph88.name;
    node79.setOwner(graph88);
    graph88.setName("");
    graph88.setName("");
    graph88.name = "";
    node25.setOwner(graph88);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = node25.getDegree();

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test243"); }


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
    Graph graph17 = Graph.generateGraph();
    graph17.setName("");
    graph17.init();
    java.lang.String str21 = graph17.name;
    graph17.setName("");
    graph17.setName("");
    graph17.init();
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test244"); }


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
    graph41.setName("[graph]");
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
    graph64.setName("hi!");
    node53.setOwner(graph64);
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    node53.setOwner(graph73);
    node53.setOwnerName("");
    Graph graph82 = Graph.generateGraph();
    graph82.setName("");
    graph82.init();
    java.lang.String str86 = graph82.name;
    graph82.setName("");
    graph82.init();
    graph82.init();
    graph82.setName("");
    node53.setOwner(graph82);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph41.getDegree(node53);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test245"); }


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
    graph21.name = "[graph]";
    Graph graph33 = Graph.generateGraph();
    graph33.setName("");
    graph33.init();
    graph33.setName("hi!");
    graph33.name = "";
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
    node50.setOwnerName("[graph]");
    graph33.addNode(node50);
    node50.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i72 = graph21.getDegree(node50);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test246"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test247"); }


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
    graph10.init();
    graph10.init();
    Graph graph23 = Graph.generateGraph();
    graph23.name = "hi!";
    java.lang.String str26 = graph23.name;
    graph23.name = "";
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
    Graph graph57 = Graph.generateGraph();
    graph57.init();
    java.lang.String str59 = graph57.name;
    java.lang.String str60 = graph57.name;
    node39.setOwner(graph57);
    node39.setOwnerName("hi!");
    Graph graph64 = Graph.generateGraph();
    graph64.setName("");
    graph64.init();
    java.lang.String str68 = graph64.name;
    graph64.setName("");
    graph64.setName("[graph]");
    graph64.name = "";
    graph64.name = "";
    node39.setOwner(graph64);
    node39.setOwnerName("[graph]");
    graph23.addNode(node39);
    graph10.addNode(node39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node39.thisIsNotCalled();

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test248"); }


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
    node10.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test249"); }


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
    Node node76 = new Node("hi!");
    Graph graph77 = Graph.generateGraph();
    graph77.setName("");
    graph77.init();
    java.lang.String str81 = graph77.name;
    node76.setOwner(graph77);
    node76.setOwnerNameDirectly("hi!");
    node76.setOwnerNameDirectly("");
    graph21.addNode(node76);
    node76.setOwnerNameDirectly("[graph]");
    node76.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = graph10.getDegree(node76);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test250"); }


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
    graph16.init();
    java.lang.String str21 = graph16.name;
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
    node32.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i64 = graph16.getDegree(node32);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test251"); }


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
    int i23 = node1.getDegree();

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test252"); }


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
    java.lang.String str33 = graph0.name;
    java.lang.String str34 = graph0.name;
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
    graph78.init();
    node60.setOwner(graph78);
    node60.setOwnerName("hi!");
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerNameDirectly("[graph]");
    node60.setOwnerName("[graph]");
    node60.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph0.getDegree(node60);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test253"); }


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
    node37.setOwnerName("[graph]");
    node37.setOwnerName("hi!");
    graph2.addNode(node37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node37.thisIsNotCalled();

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test254"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node14.getDegree();

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test255"); }


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
    int i61 = node10.getDegree();

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test256"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test257"); }


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
    graph12.init();
    graph12.init();
    graph12.name = "[graph]";
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = Graph.generateGraph();
    graph32.setName("");
    graph32.init();
    java.lang.String str36 = graph32.name;
    node31.setOwner(graph32);
    java.lang.String str38 = graph32.name;
    graph32.init();
    node29.setOwner(graph32);
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
    node29.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = graph12.getDegree(node29);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test258"); }


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
    int i94 = node68.getDegree();

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test259"); }


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
    node37.setOwnerName("hi!");
    node37.setOwnerName("");
    node37.setOwnerName("hi!");
    node37.setOwnerNameDirectly("[graph]");
    node37.setOwnerNameDirectly("[graph]");
    node37.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph0.getDegree(node37);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test260"); }


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
    node1.setOwnerName("");
    Graph graph21 = Graph.generateGraph();
    graph21.setName("");
    node1.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = node1.getDegree();

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test261"); }


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
    graph28.setName("[graph]");
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
    node42.setOwnerNameDirectly("[graph]");
    node42.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph28.getDegree(node42);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test262"); }


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
    graph0.name = "hi!";
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    graph37.setName("");
    graph37.init();
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
    graph37.addNode(node46);
    node46.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph0.getDegree(node46);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test263"); }


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
    node55.thisIsNotCalled();

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test264"); }


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
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node31.getDegree();

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test265"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("");

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test266"); }


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
    int i17 = node1.getDegree();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test267"); }


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
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test268"); }


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
    graph33.setName("hi!");
    java.lang.String str58 = graph33.name;
    graph33.name = "";
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    graph61.setName("");
    graph61.init();
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
    graph61.addNode(node70);
    node70.setOwnerName("hi!");
    node70.setOwnerName("[graph]");
    graph33.addNode(node70);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node70.thisIsNotCalled();

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test269"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test270"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node44.thisIsNotCalled();

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test271"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    node1.setOwner(graph2);
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
    node12.setOwner(graph23);
    graph23.name = "hi!";
    graph23.name = "[graph]";
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
    graph85.init();
    node57.setOwner(graph85);
    graph23.addNode(node57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph2.getDegree(node57);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test272"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "hi!";
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
    node27.setOwnerName("[graph]");
    node27.setOwnerName("");
    node27.setOwnerNameDirectly("[graph]");
    node27.setOwnerName("[graph]");
    graph0.addNode(node27);
    Node node50 = new Node("hi!");
    Graph graph51 = Graph.generateGraph();
    graph51.setName("");
    graph51.init();
    java.lang.String str55 = graph51.name;
    node50.setOwner(graph51);
    node50.setOwnerNameDirectly("hi!");
    node50.setOwnerName("");
    node50.setOwnerName("[graph]");
    node50.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph0.getDegree(node50);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test273"); }


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
    node1.setOwnerName("");
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
    node31.setOwnerNameDirectly("");
    node31.setOwnerName("");
    node31.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node31);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test274"); }


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
    int i71 = node55.getDegree();

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test275"); }


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
    node24.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = node24.getDegree();

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test276"); }


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
    node48.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node48.getDegree();

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test277"); }


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
    node58.setOwnerName("");
    node58.setOwnerNameDirectly("[graph]");
    graph21.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node58.getDegree();

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test278"); }


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
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    java.lang.String str41 = graph35.name;
    graph35.init();
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
    graph35.addNode(node51);
    graph35.init();
    java.lang.String str65 = graph35.name;
    node17.setOwner(graph35);
    graph35.name = "[graph]";
    graph35.init();
    graph35.setName("");
    node1.setOwner(graph35);
    java.lang.String str73 = graph35.name;
    Node node75 = new Node("hi!");
    Graph graph76 = Graph.generateGraph();
    graph76.setName("");
    graph76.init();
    java.lang.String str80 = graph76.name;
    node75.setOwner(graph76);
    node75.setOwnerNameDirectly("hi!");
    node75.setOwnerName("hi!");
    node75.setOwnerName("");
    node75.setOwnerName("hi!");
    node75.setOwnerName("[graph]");
    node75.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph35.getDegree(node75);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test279"); }


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
    graph29.name = "hi!";
    Graph graph47 = Graph.generateGraph();
    graph47.init();
    java.lang.String str49 = graph47.name;
    java.lang.String str50 = graph47.name;
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
    graph47.addNode(node61);
    node61.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph29.getDegree(node61);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test280"); }


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
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = node1.getDegree();

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test281"); }


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
    graph10.init();
    graph10.name = "hi!";
    graph10.name = "[graph]";
    Node node27 = new Node("hi!");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    node27.setOwner(graph28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = graph10.getDegree(node27);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test282"); }


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
    int i92 = node55.getDegree();

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test283"); }


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
    Node node65 = new Node("hi!");
    Graph graph66 = Graph.generateGraph();
    graph66.setName("");
    graph66.init();
    java.lang.String str70 = graph66.name;
    node65.setOwner(graph66);
    graph66.setName("hi!");
    graph66.setName("[graph]");
    graph66.name = "[graph]";
    graph66.name = "";
    node25.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i81 = node25.getDegree();

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test284"); }


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
    graph38.setName("hi!");
    java.lang.String str49 = graph38.name;
    Graph graph50 = new Graph();
    java.lang.String str51 = graph50.name;
    graph50.init();
    Node node54 = new Node("hi!");
    Graph graph55 = Graph.generateGraph();
    graph55.setName("");
    graph55.init();
    java.lang.String str59 = graph55.name;
    node54.setOwner(graph55);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerNameDirectly("[graph]");
    graph50.addNode(node54);
    node54.setOwnerName("");
    node54.setOwnerName("[graph]");
    node54.setOwnerNameDirectly("");
    graph38.addNode(node54);
    graph0.addNode(node54);
    node54.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = node54.getDegree();

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test285"); }


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
    Node node62 = new Node("");
    Graph graph63 = Graph.generateGraph();
    graph63.setName("");
    graph63.init();
    java.lang.String str67 = graph63.name;
    graph63.setName("");
    node62.setOwner(graph63);
    node62.setOwnerNameDirectly("[graph]");
    node62.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node31.addEdge(node62);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test286"); }


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
    graph10.setName("");
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph10.getDegree(node39);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test287"); }


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
    java.lang.String str54 = graph47.name;
    graph47.init();
    graph47.setName("[graph]");
    graph47.init();
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerNameDirectly("hi!");
    node60.setOwnerName("hi!");
    node60.setOwnerName("");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    graph73.setName("[graph]");
    graph73.name = "[graph]";
    java.lang.String str81 = graph73.name;
    java.lang.String str82 = graph73.name;
    graph73.setName("[graph]");
    node60.setOwner(graph73);
    graph47.addNode(node60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = node60.getDegree();

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test288"); }


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
    node13.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test289"); }


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
    int i85 = node50.getDegree();

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test290"); }


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
    int i63 = node10.getDegree();

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test291"); }


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
    node12.setOwnerName("");
    node12.setOwnerNameDirectly("hi!");
    Node node41 = new Node("hi!");
    Graph graph42 = Graph.generateGraph();
    graph42.setName("");
    graph42.init();
    java.lang.String str46 = graph42.name;
    node41.setOwner(graph42);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerName("");
    Graph graph52 = Graph.generateGraph();
    graph52.setName("");
    graph52.init();
    graph52.setName("hi!");
    node41.setOwner(graph52);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node41.setOwner(graph61);
    graph61.setName("hi!");
    graph61.name = "hi!";
    node12.setOwner(graph61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node12.getDegree();

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test292"); }


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
    Node node20 = new Node("");
    graph12.addNode(node20);
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("");
    Graph graph34 = Graph.generateGraph();
    graph34.setName("");
    graph34.init();
    java.lang.String str38 = graph34.name;
    graph34.setName("");
    graph34.setName("");
    node23.setOwner(graph34);
    node23.setOwnerName("");
    node23.setOwnerName("");
    node23.setOwnerNameDirectly("[graph]");
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph12.getDegree(node23);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test293"); }


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
    node10.setOwnerNameDirectly("");
    Node node35 = new Node("hi!");
    Graph graph36 = Graph.generateGraph();
    graph36.setName("");
    graph36.init();
    java.lang.String str40 = graph36.name;
    node35.setOwner(graph36);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerName("hi!");
    node35.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.addEdge(node35);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test294"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.setName("");
    graph0.name = "[graph]";
    Node node15 = new Node("hi!");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    java.lang.String str20 = graph16.name;
    node15.setOwner(graph16);
    Node node23 = new Node("hi!");
    Graph graph24 = Graph.generateGraph();
    graph24.setName("");
    graph24.init();
    java.lang.String str28 = graph24.name;
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("[graph]");
    node23.setOwnerName("hi!");
    graph16.addNode(node23);
    Node node38 = new Node("hi!");
    Graph graph39 = Graph.generateGraph();
    graph39.setName("");
    graph39.init();
    java.lang.String str43 = graph39.name;
    node38.setOwner(graph39);
    java.lang.String str45 = graph39.name;
    graph39.init();
    Graph graph47 = Graph.generateGraph();
    graph47.setName("");
    graph47.init();
    java.lang.String str51 = graph47.name;
    graph47.setName("");
    Node node55 = new Node("hi!");
    Graph graph56 = Graph.generateGraph();
    graph56.setName("");
    graph56.init();
    java.lang.String str60 = graph56.name;
    node55.setOwner(graph56);
    node55.setOwnerNameDirectly("hi!");
    node55.setOwnerName("");
    graph47.addNode(node55);
    graph39.addNode(node55);
    graph39.init();
    java.lang.String str69 = graph39.name;
    graph39.init();
    Node node72 = new Node("hi!");
    Graph graph73 = Graph.generateGraph();
    graph73.setName("");
    graph73.init();
    java.lang.String str77 = graph73.name;
    node72.setOwner(graph73);
    Node node80 = new Node("hi!");
    Graph graph81 = Graph.generateGraph();
    graph81.setName("");
    graph81.init();
    java.lang.String str85 = graph81.name;
    node80.setOwner(graph81);
    node80.setOwnerNameDirectly("hi!");
    node80.setOwnerName("[graph]");
    node80.setOwnerName("hi!");
    graph73.addNode(node80);
    graph39.addNode(node80);
    node80.setOwnerName("hi!");
    graph16.addNode(node80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node80);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test295"); }


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
    Node node34 = new Node("hi!");
    Graph graph35 = Graph.generateGraph();
    graph35.setName("");
    graph35.init();
    java.lang.String str39 = graph35.name;
    node34.setOwner(graph35);
    Node node42 = new Node("hi!");
    Graph graph43 = Graph.generateGraph();
    graph43.setName("");
    graph43.init();
    java.lang.String str47 = graph43.name;
    node42.setOwner(graph43);
    node42.setOwnerNameDirectly("hi!");
    node42.setOwnerName("[graph]");
    node42.setOwnerName("hi!");
    graph35.addNode(node42);
    graph35.init();
    node10.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test296"); }


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
    node25.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = node25.getDegree();

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test297"); }


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
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = node25.getDegree();

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test298"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.name = "[graph]";
    graph0.name = "hi!";
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
    node12.setOwner(graph23);
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
    graph40.name = "";
    graph40.init();
    graph40.name = "hi!";
    node12.setOwner(graph40);
    node12.setOwnerNameDirectly("");
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph0.getDegree(node12);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test299"); }


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
    graph12.init();
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
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    graph53.setName("");
    node34.setOwner(graph53);
    node34.setOwnerNameDirectly("[graph]");
    node34.setOwnerNameDirectly("[graph]");
    graph12.addNode(node34);
    node34.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node34.thisIsNotCalled();

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test300"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph2.getDegree(node60);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test301"); }


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
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    graph23.setName("[graph]");
    graph23.name = "[graph]";
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
    node41.setOwnerNameDirectly("[graph]");
    node41.setOwnerNameDirectly("");
    graph23.addNode(node41);
    graph23.init();
    node1.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = node1.getDegree();

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test302"); }


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
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test303"); }


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
    node1.thisIsNotCalled();

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test304"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    java.lang.String str8 = graph0.name;
    java.lang.String str9 = graph0.name;
    graph0.setName("[graph]");
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
    node22.setOwnerName("[graph]");
    node22.setOwnerName("hi!");
    node22.setOwnerName("");
    node22.setOwnerName("");
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
    java.lang.String str68 = graph48.name;
    graph48.name = "";
    node22.setOwner(graph48);
    node22.setOwnerNameDirectly("");
    graph0.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test305"); }


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
    graph49.init();
    graph49.setName("hi!");
    java.lang.String str55 = graph49.name;
    node10.setOwner(graph49);
    node10.setOwnerName("");
    node10.setOwnerName("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.init();
    java.lang.String str63 = graph61.name;
    graph61.init();
    graph61.setName("");
    graph61.setName("hi!");
    graph61.init();
    node10.setOwner(graph61);
    node10.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = node10.getDegree();

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test306"); }


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
    node24.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node24.getDegree();

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test307"); }


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
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node1.getDegree();

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test308"); }


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
    node10.setOwnerName("");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node10.getDegree();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test309"); }


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
    node1.setOwnerName("");
    Node node19 = new Node("hi!");
    Graph graph20 = Graph.generateGraph();
    graph20.setName("");
    graph20.init();
    java.lang.String str24 = graph20.name;
    node19.setOwner(graph20);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerName("");
    Graph graph30 = Graph.generateGraph();
    graph30.setName("");
    graph30.init();
    graph30.setName("hi!");
    node19.setOwner(graph30);
    node19.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test310"); }


    Node node1 = new Node("hi!");
    Graph graph2 = Graph.generateGraph();
    graph2.setName("");
    graph2.init();
    java.lang.String str6 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    Graph graph16 = Graph.generateGraph();
    graph16.setName("");
    graph16.init();
    graph16.setName("[graph]");
    graph16.name = "[graph]";
    java.lang.String str24 = graph16.name;
    java.lang.String str25 = graph16.name;
    graph16.name = "";
    graph16.setName("");
    java.lang.String str30 = graph16.name;
    java.lang.String str31 = graph16.name;
    node1.setOwner(graph16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node1.getDegree();

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test311"); }


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
    graph78.setName("");
    graph78.setName("");
    graph78.name = "";
    node56.setOwner(graph78);
    graph78.init();
    node1.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test312"); }


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
    graph17.setName("");
    graph17.init();
    graph17.setName("");
    Graph graph28 = Graph.generateGraph();
    graph28.setName("");
    graph28.init();
    java.lang.String str32 = graph28.name;
    graph28.setName("");
    Node node36 = new Node("hi!");
    Graph graph37 = Graph.generateGraph();
    graph37.setName("");
    graph37.init();
    java.lang.String str41 = graph37.name;
    node36.setOwner(graph37);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("");
    graph28.addNode(node36);
    node36.setOwnerNameDirectly("hi!");
    graph17.addNode(node36);
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
    graph17.addNode(node59);
    node59.setOwnerName("[graph]");
    graph0.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node59.thisIsNotCalled();

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test313"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test314"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    java.lang.String str4 = graph0.name;
    graph0.setName("");
    graph0.init();
    graph0.init();
    graph0.setName("");
    Node node12 = new Node("hi!");
    Graph graph13 = Graph.generateGraph();
    graph13.setName("");
    graph13.init();
    java.lang.String str17 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("");
    Graph graph23 = Graph.generateGraph();
    graph23.setName("");
    graph23.init();
    java.lang.String str27 = graph23.name;
    graph23.setName("");
    graph23.setName("");
    node12.setOwner(graph23);
    Graph graph33 = Graph.generateGraph();
    graph33.name = "hi!";
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
    graph33.addNode(node61);
    node12.setOwner(graph33);
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph0.getDegree(node12);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test315"); }


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
    node1.setOwnerNameDirectly("");
    Graph graph18 = Graph.generateGraph();
    graph18.setName("");
    graph18.init();
    graph18.name = "hi!";
    graph18.name = "";
    java.lang.String str26 = graph18.name;
    graph18.init();
    graph18.name = "";
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
    graph30.init();
    Node node52 = new Node("hi!");
    Graph graph53 = Graph.generateGraph();
    graph53.setName("");
    graph53.init();
    java.lang.String str57 = graph53.name;
    node52.setOwner(graph53);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("");
    node52.setOwnerName("[graph]");
    node52.setOwnerName("");
    graph30.addNode(node52);
    node52.setOwnerNameDirectly("");
    graph18.addNode(node52);
    node52.setOwnerName("[graph]");
    node52.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node52);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test316"); }


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
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test317"); }


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
    graph40.init();
    graph40.init();
    graph40.init();
    node10.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test318"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test319"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.thisIsNotCalled();

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test320"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    graph0.init();
    graph0.setName("hi!");
    graph0.name = "";
    java.lang.String str8 = graph0.name;
    graph0.name = "";
    Graph graph11 = Graph.generateGraph();
    graph11.setName("");
    graph11.init();
    java.lang.String str15 = graph11.name;
    graph11.setName("");
    graph11.setName("");
    graph11.init();
    graph11.name = "";
    Node node24 = new Node("");
    Node node26 = new Node("hi!");
    Graph graph27 = Graph.generateGraph();
    graph27.setName("");
    graph27.init();
    java.lang.String str31 = graph27.name;
    node26.setOwner(graph27);
    java.lang.String str33 = graph27.name;
    graph27.init();
    node24.setOwner(graph27);
    graph11.addNode(node24);
    node24.setOwnerName("[graph]");
    node24.setOwnerNameDirectly("[graph]");
    node24.setOwnerNameDirectly("");
    node24.setOwnerName("hi!");
    graph0.addNode(node24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = node24.getDegree();

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test321"); }


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
    node4.setOwnerNameDirectly("[graph]");
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
    graph71.name = "[graph]";
    java.lang.String str80 = graph71.name;
    graph71.name = "[graph]";
    node4.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node4.getDegree();

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test322"); }


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
    node34.setOwnerNameDirectly("[graph]");
    node34.setOwnerName("");
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
    node55.setOwnerNameDirectly("");
    node55.setOwnerName("hi!");
    node55.setOwnerNameDirectly("[graph]");
    node55.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node34, node55);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test323"); }


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
    graph45.name = "";
    graph45.name = "hi!";
    node25.setOwner(graph45);
    Node node60 = new Node("hi!");
    Graph graph61 = Graph.generateGraph();
    graph61.setName("");
    graph61.init();
    java.lang.String str65 = graph61.name;
    node60.setOwner(graph61);
    node60.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node60);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test324"); }


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
    node35.setOwnerNameDirectly("");
    node35.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node35.thisIsNotCalled();

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest4.test325"); }


    Graph graph0 = Graph.generateGraph();
    graph0.setName("");
    java.lang.String str3 = graph0.name;
    graph0.name = "";
    graph0.setName("[graph]");
    graph0.setName("[graph]");
    graph0.name = "[graph]";
    Graph graph12 = Graph.generateGraph();
    graph12.setName("");
    graph12.init();
    graph12.setName("[graph]");
    java.lang.String str18 = graph12.name;
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
    Graph graph35 = new Graph();
    java.lang.String str36 = graph35.name;
    node20.setOwner(graph35);
    graph12.addNode(node20);
    node20.setOwnerName("hi!");
    node20.setOwnerName("[graph]");
    node20.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph0.getDegree(node20);

  }

}
