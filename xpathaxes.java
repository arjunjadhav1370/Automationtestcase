package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();
        
        
        //self --- selector the  current node 
String text=driver.findElement(By.xpath("//a[contains(text(),'L&T')])/self::a")).getText();        
System.out.println("self:"+text);
   
// parent --- selector the parent of the current node (always one )
text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/parent::td")).getText();
System.out.println("parentt:"+text);

//child -- selector all children of the current node (one or many )
//list<WebElement>childs=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/child::td"));
 //System.out.println("number of child elements:"+childs.size());       
      
 
 
 
	}

}
