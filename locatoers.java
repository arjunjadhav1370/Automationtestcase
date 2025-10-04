package day20;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locatoers {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://youtub.com/");//opencart.com/second url to use 
		driver.manage().window().maximize();
		
		
		//  name 
		driver.findElement(By.name("search")).sendKeys("mac");
		
		//boolan logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		
		//System.out.println(logoDisplaystatus);
		
      
	//	linktext 
		
		//driver.findElement(By.linkText("tablets")).click();
		
		
		//partiallink text 
		
		//driver.findElement(By.partialLinkText("tab")).click();
		
	}

}
