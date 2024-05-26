package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk/popups.html");
		
		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		}

}
