package day44;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test(priority=1,groups= {"sanity","regression","functional"})
	
	void paymentinrupese()
	{
		System.out.println("this is Rupese ");
	
	}
	
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentinDoller()
	{
	    System.out.println("this is Doller ..");
	}
	
	}
	






/*2) grouping
--------------------
in every class is an methods 
class1--m1,m2,m3....
class--m2,m4,m5...
class---m3.....
-------------

sanity 
regression 
functional 
*/