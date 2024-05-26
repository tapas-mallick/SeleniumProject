package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk/dropdown.html");
		
		driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
		driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
		driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();

	}

}
