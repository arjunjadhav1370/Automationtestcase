package day42;

import org.testng.annotations.Test;

public class myfirsttestcase {

	// demo of testNG first test cases // 
	//import.org.testng.annotations.Test;//
	 
	
	
	/*
	 ex TC1
	 @Test------ Annotation 
	  
	   1)openapp
	   2)loging 
	   3)logout 
	  or 
	 
 Login ---@before method 
 search --@test 
 logout--@aftremethod  
 login 
 adv search --@test 
 logout    

*/
	
	@Test(priority=1)
	void openapp() {
		
		System.out.println("open the app .............");
		
	}
	@Test(priority=2)
	void Login()
	{
		System.out.println("login the application...............");
		
	}
	
	@Test(priority=3)
	void Logout()
	{
		System.out.println("logout the application............");
		
	}
	
	
	
	
	
	
	
	
	
	
}
