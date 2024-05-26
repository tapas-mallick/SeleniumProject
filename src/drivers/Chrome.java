package drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String[] args) {
		Chrome();
	}

	public static void Chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Tapas Mallick");

		driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
		driver.findElement(By.linkText("Prof Tapas Mallick | Renewable Energy - University of Exeter")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.close();
		}

}
