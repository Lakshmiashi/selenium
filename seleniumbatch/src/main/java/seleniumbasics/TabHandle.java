package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php"); 
	    driver.manage().window().maximize();
	    
	    String parentWindow=driver.getWindowHandle();
	    System.out.println(parentWindow);//we get no that no used to handle window in pgm
	    
	    WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
	    newTab.click(); //go to new tab
	    Set<String> allWindows=driver.getWindowHandles();//here all window han
	    for(String childWindow:allWindows)
	    {
	    	if(!parentWindow.equals(childWindow))
	    	{
	    		driver.switchTo().window(childWindow);
	    		WebElement tabElement=driver.findElement(By.xpath("//div[@class='row d-flex justify-content-center logindiv bg-white rounded']"));
	    		System.out.println(tabElement.getText());
	    	}
	    }
	    driver.switchTo().window(parentWindow);//back to parent window from child
	    

	}

}
