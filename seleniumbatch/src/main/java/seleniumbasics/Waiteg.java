package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://www.qabible.in/payrollapp/site/login"); 
	     driver.manage().window().maximize();
	     
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); //throughout pgm applicable.
	     WebElement element=driver.findElement(By.xpath("//button[@name='login-button']"));
	     //Explicit wait
	     WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(5));
	     //expWait.until(ExpectedConditions.alertIsPresent());
	    // expWait.until(ExpectedConditions.attributeContains(element, "name", "login-button"));
	     expWait.until(ExpectedConditions.textToBePresentInElement(element, "Login"));
	     
	     //fluentwait
	     Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofSeconds(2))
		            .ignoring(NoSuchElementException.class);
	     fluentWait.until(ExpectedConditions.alertIsPresent());
	     
	     
	     

	}

}
