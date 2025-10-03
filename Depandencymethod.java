package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depandencymethod {

	//public static void main(String[] args) {	

		
		//}
	@Test(priority=1)
	void openapp()
	{
		//Assert.asserttrue(false);
		Assert.assertTrue(true);
	}
		
		@Test(priority=2,dependsOnMethods= {"openapp"})
		void Login() 
		{
		System.out.println("logout the web ..............");
		Assert.assertTrue(true);
		}
		@Test(priority=3,dependsOnMethods= {"Login"})
		void Serach()                                           //   \\dependsOnMethods={"method name1","method name2",........}  //

		{
			
			Assert.assertTrue(false);
		}
		@Test(priority=4,dependsOnMethods= {"Login","Serach"})//adding a vlaue of two dependacy parameters to add 
		void advancesearch() 
		{
			Assert.assertTrue(true);
		System.out.println("serach advance products ...........");	
		}
		
		@Test(priority=5,dependsOnMethods= {"Login","Serach"})
		void logout() {
			Assert.assertTrue(true);
			  
			System.out.println("logout ..............");
			

			
			//Total tests run: 5, Passes: 3, Failures: 1, Skips: 1
	}

}
