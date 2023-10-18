package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare webdriver interface reference
				WebDriver browserObject;
				// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
			        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				// 2. Initialize Webdriver object through ChromeDriver class.
			        browserObject = new ChromeDriver();
				// 3. Open login page of https://admin-demo.nopcommerce.com/login
			        browserObject.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			        browserObject.findElement(By.id("Email")).clear();
			        browserObject.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
			        browserObject.findElement(By.id("Password")).clear();
			        browserObject.findElement(By.id("Password")).sendKeys("admin");
				
			        
			        
			        browserObject.findElement(By.className("button-1")).submit();
			        
			       
		
		
		
		
	}

}
