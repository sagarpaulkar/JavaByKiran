package TestNGWork;

import org.testng.annotations.Test;

public class NewTest {

	@Test(enabled = false)
	public void b() { 
		System.out.println("b");
	}
	
	@Test(alwaysRun=true, dependsOnMethods = "b")
	public void a(){
		int a= 'a';
		System.out.println("a"+a);
	}
	
//
//	private Object alwaysRun() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Test
//	public void c() {
//		System.out.println("c");
//	}
//	
//	@Test
//	public void A() {
//		int A='A';
//		System.out.println("A"+A);
//	}
//	@Test
//	public void B() {
//		System.out.println("B");
//	}
//	@Test
//	public void C() {
//		System.out.println("C");
//	}
	
	
}
