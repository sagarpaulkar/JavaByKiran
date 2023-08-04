package TestNGEx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {

	  String A =null ;
	  System.out.println("1");
	  Assert.assertSame(1, 1);
	  System.out.println("2");
	  Assert.assertNotEquals(1, 2);
	  System.out.println("3");
	  Assert.assertEquals(1, 1, "Strings Matches");
	  System.out.println("4");
	  Assert.assertNotEquals(2, 1,"String Match");
	  System.out.println("5");
	  Assert.assertFalse(false);
	  System.out.println("6");
	  Assert.assertFalse(false, "Found");
	  System.out.println("7");
	  Assert.assertTrue(true);
	  System.out.println("8");
	  Assert.assertTrue(true, "Found");
	  System.out.println("9");
//	  Assert.assertNull(A);
	  System.out.println("10");
//      Assert.assertNull(A, "Found");
      System.out.println("11");
//	  Assert.assertNotNull(A);
	  System.out.println("12");
//	  Assert.assertNotNull(A, "Found");
	  System.out.println("13");
	 Assert.fail("Intentionally fail");
  }
}
