package day31;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 
		 
		WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		
	Select drcountry=new Select(dropCountryEle);
	
	// ----select option from the 	drop down 
		//drcountry.selectByContainsVisibleText("France");
		//drcountry.selectByValue("japan");
	    // ----manualiy check the dropdown box 
		//drcountry.selectByIndex(2);
		
	
	//capture the options form the dropdown 
	List<WebElement>options=drcountry.getOptions();
	System.out.println("Number of options in dropdown list :"+options.size());//Number of options in dropdown list :10

		//printing the options 
	/*for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
		
	}
		*/
	
	// same opretion using enchanced for loop
	
	for(WebElement op:options)
	{
		System.out.println(op.getText());
	}
		
		
		
		
		
		
		

	}

}
