package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocatingByLinkText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk");
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".close-cookie-warning>span")).click();
		//driver.findElement(By.linkText("ACTIONS")).click();
		
		driver.findElement(By.linkText("LOADER")).click();

	}

}
