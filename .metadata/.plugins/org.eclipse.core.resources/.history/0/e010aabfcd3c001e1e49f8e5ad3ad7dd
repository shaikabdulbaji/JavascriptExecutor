package cClick_Operation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendingText {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		/*
		 * JavascriptExecutor is an interface we can't create objects for interfaces but how can i use 
		   the JavascriptExecutor.
		   
		 * manam JavascriptExecutor ni use chaiyali antea driver ni typecaste chaiyali JavascriptExecutor
		   tho. apudu manam JavascriptExecutor use chaeasuko vachu.
		   
		 * jsExecutor.executeScript(null, args); 
		   second parameter is optional parameter.
		   
		 * return document.getElementById('email'); 
		   without returning that we can't any action on that element.
		  
		 * document.getElementsByName('login')[0].click();
		   click() --> It will click that element.
		 */
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		
		jsExecutor.executeScript("document.getElementsByName('login')[0].click();");
		
		
	}
	

}
