package day24xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");  //  URL = demo.opencart.com/
	driver.manage().window().maximize();
	
//1) Absolute xpath 
//2)relative xpath 
	
	//single xpath with attribute
//driver.findElement(By.xpath("//input[@Placholder='serach']")).sendKeys("tshirt");
	
//driver.findElement(By.xpath("//input[@placholder='serach']")).sendKeys("t shirst");	
	
	// xpath with multiple attributes 
	//driver.findElement(By.xpath("//input[@name='serach'][@placholder='serach]")).sendKeys("t shirt ");
	

//xpath with "OR" and "AND" operator 
// or operator 
//driver.findElement(By.xpath("//input[@name='serach'OR @placholder='serach']")).sendKeys("demo");
//xpath and  operator 
//driver.findElement(By.xpath("//input[@name='serach' and placholder='serach']")).sendKeys("demo");


// Xpath with inner text()-----inner text();
//1)click() method
// string () method 
// Isdisplay() method 	
//driver.findElement(By.xpath("//*[text()='macbook']")).click();
//boolean isdisplaystatus= driver.findElement(By.xpath("//h3[text()='featured']")).isDisplayed();
//System.out.println(isdisplaystatus);
//String value=driver.findElement(By.xpath("//h3[text()='featured']")).getText();
//System.out.println(value);

	
	//xpath with contains()
//driver.findElement(By.xpath("//input[contains(@placholder ,sea')]")).sendKeys("demo");	

	
	//xpath with starts-with();
	
//driver.findElement(By.xpath("//input[Starts-with(@placholder,'sea')]")).sendKeys("demo");	
	
	
	//Handling dynamic attributes 
	
	// examples 
	
	
	
	}

}
