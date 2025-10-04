package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class conditionalmethods {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.nopCommerce.com/register");
		 driver.manage().window().maximize();
		 
		//isdisplayed();--> we can check display status of the element
		 
//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//System.out.println("Display status of logo :"+logo.isDisplayed());
//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//System.out.println("display status:"+status);



//isEnabled();--->we can check enable /disable status of the element/ operational element 

//boolean status=driver.findElement(By.xpath("//input[@id='firstName']")).isEnabled();
//System.out.println("Enable status:"+status);

//isSelected() ----->we can check the element is selected or not 

WebElement Male_rd=driver.findElement(By.xpath("//*[@id=\"gender-male\"] "));
WebElement Female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));

System.out.println("Before selection ");
System.out.println(Male_rd.isSelected());
System.out.println(Female_rd.isSelected());

System.out.println("After selection male..............");
Male_rd.click();// select radio button 

System.out.println(Male_rd.isSelected());//true 
System.out.println(Female_rd.isSelected());// false 


System.out.println("After selection female..............");
Female_rd.click();// select radio button 
System.out.println(Male_rd.isSelected());//false  
System.out.println(Female_rd.isSelected());//true   








//output
//Before selection 
//false
//false
//After selection male..............
//true
//false
//After selection female..............
//false
//true



 

	}

}
