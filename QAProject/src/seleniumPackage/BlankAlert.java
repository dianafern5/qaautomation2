package seleniumPackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver browserObject;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//setup property chromedriver to perform blank alert through chrome web browser.
		
		browserObject = new ChromeDriver();
		//formpage website https://mail.rediff.com/cgi-bin/login.cgi
		browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//locate the sign-in button
		browserObject.findElement(By.name("proceed")).click();
		Alert alert = browserObject.switchTo().alert();
		
		Thread.sleep(7000);
		System.out.println(alert.getText());
		alert.accept();
		browserObject.close();
	}

}
