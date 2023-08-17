package eScrolling_Operation;

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
		driver.get("https://www.hyrtutorials.com/");
		
		/*
		 * This scroll operation can be do in three types, they are :
		 		1. scroll / scrollTo
		 		2. ScrollBy
		 		3. ScrollintoView
		 
		 
		 * scrollTo :
		 	vaka sari scrollTo echi execute cheasamu anuko javascript tho adi kastha kindaki scroll iedi
		 	danea mali 100 times echina pedaga asal use undadu.
			
		 * ScrollBy : 
		    vaka sari scrollBy echi execute cheasamu anuko javascript tho adi kastha kindaki scroll iedi
		 	danea mali 100 times estea pages end daka scroll iedi.
		 	
		 	scrollTo more than 1 time adi execute kadu ani sarlu echina
		 	ScrollBy more than 1 time adi execute itadi and ani sarlu estea ani sarlu kindaki scroll iedi.
		    
		 * ScrollintoView
		 	edi kasth different ga untundi dinki manam webelement find cheasi echi dani tarvata 
		 	scrollintoview ani estea adi aa webelement daka scroll iedi. adi ala evali antea like below
		 	
		 */
		
	
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		jsExecutor.executeScript("document.getElementsByClassName('ty_footer_copyright')[0].scrollIntoView();");
		
	}
	

}
