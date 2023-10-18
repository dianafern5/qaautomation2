package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
		// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
	     // 3. Open form page of http://www.admin-demo.nopcommerce.com/login
	        browserObject.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	       
	        WebElement email= browserObject.findElement(By.name("Email"));
	        email.clear();
	        email.sendKeys("admin@yourstore.com");
	        
	        WebElement pass=browserObject.findElement(By.name("Password"));
	        pass.clear();
	        pass.sendKeys("admin");
	        
	        browserObject.findElement(By.className("button-1")).click();
	}
	        
	}


