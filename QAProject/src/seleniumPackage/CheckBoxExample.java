package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\driver\\geckodriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
	    	// 5. Locate the bike checkbox button using xpath and store the value in  reference created that is checkboxBike. 
	          WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
	        	// 6. Locate the car checkbox button using xpath and store the value in  reference created that is checkboxCar.
	          WebElement checkboxCar = browserObject.findElement(By.xpath("//input[@value='car']")); // selected by-default
	          // 7. Locate the horse checkbox button using xpath and store the value in  reference created that is checkboxHorse.
	          WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
	          
	          WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
	          // selecting all options except car- selected by-default .The car element is clicked by default and value .So no need to perform click on the car element
	         // 9. Perform click on boat button 
	          checkboxBoat.click();
	          Thread.sleep(5000);
	          // 10. Perform click on bike button
	          checkboxBike.click();
	          Thread.sleep(5000);
	          // 11. Perform click on horse button 
	          checkboxHorse.click();
	          Thread.sleep(5000);
	          System.out.println("wait 3 seconds and submit and close");
	          // 12. Perform click on send button
	          submitButton.click();
	}


	}


