package day44;

import org.testng.annotations.Test;

public class SingupTest {

	@Test(priority=1,groups= {"regression"})
	void signupByemail1()
	{
	System.out.println("this signuopby ermail");
	}

	@Test(priority=2,groups= {"regression"})
	void signupByfeacbook()
	{
	System.out.println("this signupby feacbook");
	}

	@Test(priority=3,groups= {"regression"})
	void signupBytwitter()
	{
	System.out.println("this signupby twitter...");
	}

	
	/*

to create a xml file 
and name also is grouping 


syntax :

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="groupingsiute">
<test name="groupingtests">
<classes>
<class name="day44.loginTests/>
<class name="day44.SingupTest/>
<class name="day44.PaymentTests/>
</classes>
</test>
</suite>
	
	
	anotherb tag are spsify the xml file 
	
	under the <test> 
	to spsify the the as a groups!!!!!!!!!!
	syntax::
	<groups>
	<run>
	<include name="sanity"/>
	<exclude name="sanity"/>
	</run>
	</groups>
	
	
	1)only sanity but not regression 
	=>
	<exclude name="sanity"/>
------------------------------------------
 1)only sanity but not regression 	
 2)all regression tests 
 3)all sanity tests 
 4)all regression but not sanity 
 5)all methods which are belongs to both sanity & regression 
 => you want to add a sanity , regression, and functional to the program / code 	<include name="functional"/>

	
xml file comments are <!--....code
.....-->
	*/
}
