package interactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk");

		driver.findElement(By.linkText("DROPDOWN CHECKBOX RADIO")).click();
		Thread.sleep(1000);

		System.out.print(driver.findElement(By.cssSelector("input#cb_red")).isSelected());
		System.out.print(driver.findElement(By.cssSelector("input#cb_green")).isSelected());

		if (driver.findElement(By.cssSelector("input#cb_red")).isSelected()) {
			driver.findElement(By.cssSelector("[for='cb_green']")).click();
		}

	}

}
