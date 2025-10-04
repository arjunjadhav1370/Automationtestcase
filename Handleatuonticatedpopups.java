package day29;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handleatuonticatedpopups {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		
		//syntax 
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		//https://username:password@the-internet.herokuapp.com/basic_auth
		
		
		//driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");
		
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}


//assigment 

//https://testautomationpractice.blogspot.com/
//click on login then handle alert 
//https://mypage.rediff.com/login/dologin


