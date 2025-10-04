package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxes {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// https://testautomationpractice.blogspot.com/
		//select multiple / all the  check box 
			List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
			       
			
			      //first method to define 
		     /*   for(int i=0;i<Checkboxes.size();i++) 
			 {
				
		        Checkboxes.get(i).click();    
	         }
	         */
			
			//second method 

		/*for(WebElement checkbox:Checkboxes)	
		{
			checkbox.click();
		}
		*/
			
			// third method define 
			///3) select last 3 check boxes  
			
			/*for(int i=4;i<Checkboxes.size();i++)
			{
		           Checkboxes.get(i).click();
			}
			*/
			
			//fourth method select first 3 checkboxes 
			/*for(int i=0;i<3;i++)
			{
				Checkboxes.get(i).click();
			}
			*/
			
			//5) unselect checkboxes if they are selected 
			for(int i=0;i<3;i++)
			{
				Checkboxes.get(i).click();
			}
			
			Thread.sleep(500);
			for(int i=0;i<Checkboxes.size();i++)
			{
				Checkboxes.get(i).click();
			}
			
			
}


}

