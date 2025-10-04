package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
 Test case 
 -----------------
 1)launch browser (Chrome)
 2)open url https://demo.opencart.com/
 3)validate title should be "your store "
 4)close browser 
  
 */


public class firsttestcase {

	public static void main(String[] args) {
		//---System.out.println("testing ......");-----//
        //  1) Launch browser (chrome)//
		//ChromeDriver driver=new ChromeDriver();//
		
		 WebDriver driver=new ChromeDriver();
		
		// 2)open url https://demo.opencart.com/ //
	    driver.get("https://demo.opencart.com/"); 
		 
		 
		 // another example by side ///
	     // driver.get("https://trainings.internshala.com/blog/category/programming/"); 
		 
		 
	     // validate title should be "Programming "//
	      // driver.get("https://trainings.internshala.com/blog/category/programming/");
	      String act_title=driver.getTitle(); 
	      if(act_title.equals("Your Store"))
	    		  {
	    	      System.out.println("test pass ");
	    		  }
	      else {
	    	  System.out.println ("failed ");
	      }
	      
	}

}
