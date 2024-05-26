package waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaits {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk/loadertwo.html");

		/*
		 * Wait<WebDriver> fluent = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10L))
		 * .pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);
		 * 
		 * WebElement para = fluent.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.cssSelector("#appears")); } });
		 */
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//*[@id=\"appears\"]"));
			     }
			   });


	}

}
