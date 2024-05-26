package interactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownMenu {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk");
		
		driver.findElement(By.linkText("DROPDOWN CHECKBOX RADIO")).click();
		Thread.sleep(1000);
		
		Select carSelection= new Select(driver.findElement(By.id("cars")));
		
		carSelection.selectByVisibleText("Mercedes");
		//carSelection.selectByIndex(1);
		//carSelection.selectByValue("mercedes");

	}

}
