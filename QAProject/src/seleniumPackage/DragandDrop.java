package seleniumPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://jqueryui.com/droppable/");
		browserObject.switchTo().frame(0);
		WebElement source  = browserObject.findElement(By.xpath("//div[@id='draggable']"));
		List<WebElement> target = browserObject.findElements(By.xpath("//div[@id=droppable']"));
		
		Thread.sleep(8000);
		Actions act = new Actions(browserObject);
		act.dragAndDrop(source, (WebElement) target).build().perform();
		
		Thread.sleep(8000);
		
				
	}

}
