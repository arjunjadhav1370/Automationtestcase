package cssselecters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class cssselecters1 {

	public static void main(String[] args) {
		
		
		// opning time in any browesr 
		 WebDriver driver=new ChromeDriver();	
		 driver.get("https://demo.nopcommerce.com/");
		 // maximize the browser window 
		 driver.manage().window().maximize();
		   
		 //1) Tag and ID ---tag#id
		 //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		 // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		 
		 
		 //2)Tag and class ------tag.class name 
		 //driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("T-shirts");
		 //driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("T-shirts");
		 
		//3) Tag attribute ------tag[attribute="value"]
		 //driver.findElement(By.cssSelector("input[placeholder=\'Search store']")).sendKeys("T-Shirts");
		 //driver.findElement(By.cssSelector("[placeholder=\'Search store']")).sendKeys("T-Shirts");
		 
		 //4)TagClassattribute----------tag.classname[attribute="values"]
		 //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
		 //driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-Shirts");
		 
	}

}
 