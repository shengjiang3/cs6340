
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    Point point0 = null;
    Point point1 = null;
    Line line2 = new Line(point0, point1);
    
    // Checks the contract:  line2.equals(line2)
    org.junit.Assert.assertTrue("Contract failed: line2.equals(line2)", line2.equals(line2));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


    Point point2 = new Point(1, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


    Point point2 = new Point(1, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


    Point point2 = new Point(10, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    Point point2 = new Point((-1), 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    Point point2 = new Point(0, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


    Point point2 = new Point(100, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


    Point point2 = new Point(100, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    Point point2 = new Point(0, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


    Point point2 = new Point((-1), (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }


    Point point2 = new Point(10, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }


    Point point2 = new Point((-1), 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }


    Point point2 = new Point((-1), 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }


    Point point2 = new Point(1, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }


    Point point2 = new Point(10, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }


    Point point2 = new Point(1, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }


    Point point2 = new Point(100, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }


    Point point2 = new Point(1, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }


    Point point2 = new Point(100, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }


    Point point2 = new Point(0, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }


    Point point2 = new Point((-1), 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }


    Point point2 = new Point(10, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }


    Point point2 = new Point(0, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }


    Point point2 = new Point(10, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }


    Point point2 = new Point(100, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }


    Point point2 = new Point(0, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

}
