
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTestMinimized {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {
    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }
    Line line2 = new Line(null, null);
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

}
