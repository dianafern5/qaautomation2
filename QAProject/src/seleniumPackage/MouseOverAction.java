package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://Program Files\\chromedriver.exe");

//initialize Webdriver object through ChromeDriver class
ChromeDriver browserObject = new ChromeDriver();
//Open the web page https:\\www.amazon.com/
browserObject.get ("https:\\www.amazon.com/");
	Thread.sleep(3000);
	//Locate the element using the xpath and store in the reference
	WebElement element = browserObject.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")) ;
	 Actions action = new Actions(browserObject);
     System.out.println("Mouse is over the - HELLO, SIGN IN - option");
     action.moveToElement(element).build().perform();
     browserObject.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
		// 9. Close the browser
	
	}

}
