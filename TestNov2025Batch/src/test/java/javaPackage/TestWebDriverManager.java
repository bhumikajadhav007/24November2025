package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {
	@Test
	public void a () {
		System.out.println("First Change");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
     // Pull Request Practice
	}

}
