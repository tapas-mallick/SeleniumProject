package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://automationtesting.co.uk/buttons.html");
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//button[@id='btn_one']")).click();

	}

}
