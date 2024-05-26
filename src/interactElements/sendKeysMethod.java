package interactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");
		
		driver.findElement(By.linkText("CONTACT US FORM TEST")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Tapas Ranjan");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Mallick");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("tapasmallick022@gmail.com");
		driver.findElement(By.cssSelector(" textarea[name='message']")).sendKeys("This is an amazing automation testing website");
	}

}
