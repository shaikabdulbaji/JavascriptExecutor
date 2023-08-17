package fPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.id("email"));
	
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');", username);
		
		/*
		 * arguments[0] --> It is related to 1st argument i write username in that end of line
		 * arguments[1] --> It is related to 2nd argument if we write it will applicable.
		 */
	}

}
