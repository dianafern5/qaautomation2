package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Fill {

	public static void main(String[] args) throws InterruptedException {
WebDriver browserObject; 
		//1.Setup the property TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					
// 2. Initialize WebDriver object through ChromeDriver class.
browserObject = new ChromeDriver();
				   
 // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
				    
// sending text to the input box in the web form----
//4.Locate Name section using name locator and send values using sendkeys
browserObject.findElement(By.name("name")).sendKeys("");
				    
//5. Locate email section using name locator and send values using sendkeys
browserObject.findElement(By.name("email")).sendKeys("");     

//6.Locate Website section using name locator and send values using sendkeys
browserObject.findElement(By.name("email")).sendKeys("ITLearn360");     
				    
//7. Locate a comment section using name locator and send values using sendkeys				    
browserObject.findElement(By.name("comment")).sendKeys("This is a good website");
				    
//8. Locate the submit button and perform click
browserObject.findElement(By.name("submit")).click();;
			
System.out.println("wait 2 seconds and submit");
Thread.sleep(2000);



//9. close the browser 
//browserObject.close();
	}
		
		
		
	}


