package day43;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationdemo { 
	
	
	// Annotation to use @BeforMethod & @AfterMethod Annotations use   

	@BeforeMethod 
	
	void Login()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		System.out.println("open this HRM Web..............!  ");
		
		
	}
	@Test(priority=2)
	void Serach() 
	{
		
		System.out.println("search the elements ");
	}
	@AfterMethod
	void Logout() 
	{
	System.out.println("logout the web ..............");	
	}
	@Test(priority=4)
	void advancesearch() 
	{
	System.out.println("serach advance products ...........");	
	}
	@Test(priority=5)
	void logout() {
		  
		System.out.println("logout ..............");
		
	}
}
