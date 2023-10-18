package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
	       //1. setup the property of chromedriver to fetch the webpage link through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//2. Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
		//3. Open website link https://www.Google.com/.
	     	 
	       browserObject.get("https://www.google.com/");
	       browserObject.findElement((By.name("q"))).sendKeys("Selenium Python");
	       browserObject.findElement((By.name("btnK"))).submit();
           browserObject.findElement((By.name("role"))).sendKeys("I'm Feeling Hungry");
           browserObject.findElement((By.name("presentation"))).submit();
	
	}

}
