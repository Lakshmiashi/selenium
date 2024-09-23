package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html"); 
	     driver.manage().window().maximize();
	     
	     Actions actionobj=new Actions(driver);
	     
	 
	     
	     WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	     actionobj.doubleClick(element).perform();
	     driver.switchTo().alert().accept();//accept alert 
	     
	     WebElement rightElement=driver.findElement(By.xpath("//span[text()='right click me']"));
	     actionobj.contextClick(rightElement).perform();//right click called contextclick
	     
	     //mouse hovering
	     actionobj.moveToElement(element).perform();
	     
	     //keybord events
	     actionobj.sendKeys(Keys.ARROW_DOWN).perform();
	     actionobj.sendKeys(Keys.ARROW_UP).perform();
	     
	    

	}

}
