package interactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk");
		
		driver.findElement(By.linkText("BUTTONS")).click();
		
		System.out.print(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
		System.out.print(driver.findElement(By.cssSelector("button#btn_")).isEnabled());
	}

}
