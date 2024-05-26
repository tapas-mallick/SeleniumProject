package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:\\Wings1_Selenium\\Drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://www.google.com");

	}

}
