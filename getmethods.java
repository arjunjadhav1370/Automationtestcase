package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(500);
		
		//driver.manage().window().maximize();
		
		//getTilte -- return title of the page 
		System.out.println(driver.getTitle());

	    
	//get current URL of the page 
		
	System.out.println(driver.getCurrentUrl());	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	
	
	//getPagesource()-----return source code of the page 
	//System.out.println(driver.getPageSource());
	
	//getgetwindowHandle --- return ID of the single browser 
	//String windowid=driver.getWindowHandle();
	//System.out.println("window Id:"+windowid);//window Id:854D97CC6DD7E3C3153A2AEE382118A9
	 
	
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String>windowids=driver.getWindowHandles();
	System.out.println(windowids);
	
	
	}

}
