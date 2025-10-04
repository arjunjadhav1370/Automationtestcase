package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstropdropdown {

	public static void main(String[] args) {
		
		
		
		//hidden dropdown 
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		 	
			// Login steps
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//cliking on PIM 
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();//pim
		
		driver.findElement(By.xpath("//div[contains(text(),'Automation Tester')]")).click();
		
		//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1")).sendKeys("automation tester");
		
		
		
		
		  

	}

}
