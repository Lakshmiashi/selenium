package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://demoqa.com/frames"); 
	     driver.manage().window().maximize();
	     //-----------Switch by webElement---------------
	     //Step1: Switch to frame
	    /* WebElement frameElement=driver.findElement(By.id("frame1"));
	     driver.switchTo().frame(frameElement); //step1 switch to the frame*/
	     //Switch by name or ID
	     driver.switchTo().frame("frame1");//here no need to declare webelement switch by webelement or id/namewe can use
	     
	     //step2:action inside frame
	     WebElement frameText=driver.findElement(By.id("sampleHeading"));
	     System.out.println(frameText.getText()); 
	     
	     //step:3 Back to main frame
	     driver.switchTo().parentFrame();//back to main frameie.1st html
	     driver.switchTo().defaultContent();
	     
	      
	}

}
