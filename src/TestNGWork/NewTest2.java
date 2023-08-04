package TestNGWork;

import org.testng.annotations.Test;

public class NewTest2 {

	@Test
	public void login() {
		System.out.println("login");
	}
	
	
	@Test(dependsOnMethods="login")
	public void dashboard () {
		System.out.println("dashboard");
	}
	
	@Test(dependsOnMethods="dashboard")
	public void user() {
		System.out.println("user");
	}
	
	@Test(dependsOnMethods="user")
	public void logout() {
		System.out.println("logout");
	}
}
