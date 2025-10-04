package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handleframes {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//freame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);//passed frame as a webelement // switch to frame 1
		
		driver.findElement(By.xpath("input[name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();//go back to  page 
		
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytest2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		// frame 3 
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath(" input[name='mytext3']")).sendKeys("java");
		
		
		
		// inner iframe- part of the  frame 3 
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@id='18']//div[@class=AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
	}

}
