package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page http://jqueryui.com/droppable/	
		browserObject.get("http://jqueryui.com/droppable/");
	
	browserObject.switchto().frame(0);
	WebElement source = browserObject.findElement(By.xpath"//div id="droppable)"
	}

}
