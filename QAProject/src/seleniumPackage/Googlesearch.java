package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			// 2. Initialize WebDriver object through ChromeDriver class.
		      ChromeDriver browserObject = new ChromeDriver();
			// 3. Open the web page https://www.google.com/
		        browserObject.get("https://www.google.com/");
		        
		        browserObject.findElement((By.name("q"))).sendKeys("Selenium Python");
		        browserObject.findElement((By.name("btnK"))).submit();
	}

}
