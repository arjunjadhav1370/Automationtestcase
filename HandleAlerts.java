package day29;
//https://the-internet.herokuapp.com/javascript_alerts//
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//noraml alerts with ok button 
 /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
 Thread.sleep(5000);
 Alert myalert=driver.switchTo().alert();
 System.out.println(myalert.getText());
 myalert.accept();
 
 */
		
		//2) conformation alert - ok & concel 
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();//close alert using button 
		//driver.switchTo().alert().dismiss();//close alert using cancel button 
		
		 */
		
		//3) promet alert - input box 
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Arjunjadhav ");
		myalert.accept();
		
		
		
	}

}
