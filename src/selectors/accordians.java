package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class accordians {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk/accordion.html");
		
		for(int i=0;i<2;i++) {
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		}

	}

}
