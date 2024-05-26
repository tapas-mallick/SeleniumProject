package selectors;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pupUps {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Wings1_Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk/popups.html");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		
		Thread.sleep(1000);
		
		String mainWindow= driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		Thread.sleep(1000);
		
		Iterator<String> iterate = windows.iterator();
		
		while(iterate.hasNext()) {
			
			String child=iterate.next();
			
			if(!mainWindow.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				driver.close();
			}
		}
		Thread.sleep(1000);
		driver.switchTo().window(mainWindow);
		driver.close();

	}

}
