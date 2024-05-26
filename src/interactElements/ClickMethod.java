package interactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Chrome;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk");
		
		driver.findElement(By.linkText("BUTTONS")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("button#btn_three")).click();

	}

}
