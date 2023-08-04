package TestNGGrouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {

	@Test(groups="regression")	
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test (groups="sanity")		
	public void test2() {
		System.out.println("Test2"); 
	}

	@Test (groups="regression")		
	public void test3() {
		System.out.println("Test3");
		Assert.fail();
	}
	
	@Test(groups="smoke",dependsOnGroups="regression",alwaysRun=true)		
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test (groups="regression")		
	public void test5() {
		System.out.println("Test5");
	}

}
