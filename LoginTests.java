package day44;

import org.testng.annotations.Test;

public class LoginTests {
	
    @Test(priority=1,groups= {"sanity"})
   void LoginByEmail()
{
System.out.println("this is login by email....");
}
@Test(priority=2,groups= {"sanity"})
void loginbyfeacbook()
{
System.out.println("this is feacbook ....");
}
@Test(priority=3,groups= {"sanity"})
void Loginbytwitter()
{
System.out.println("this is twitter .....");

} 

	

}
