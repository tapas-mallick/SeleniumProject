package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class assertion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk");
		
		Assert.assertEquals("Homepage", driver.getTitle());
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("TEST STORE")).click();
		driver.findElement(By.cssSelector("img[alt='Brown bear printed sweater']")).click();
		driver.findElement(By.cssSelector("[data-button-action]")).click();
		Thread.sleep(3000);
		
		String text= driver.findElement(By.cssSelector(".product-total > .value")).getText();
		
		Assert.assertEquals("$35.72", text);
		
		driver.quit();
		
		

	}

}
