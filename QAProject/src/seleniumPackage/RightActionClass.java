package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	WebDriver browserObject = new ChromeDriver();
			
	browserObject.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	//use Actions class.Create object instead of RightClick
	Actions action = new Actions(browserObject);
	
	WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	action.contextClick(rightClickElement).build().perform();
	}

}
