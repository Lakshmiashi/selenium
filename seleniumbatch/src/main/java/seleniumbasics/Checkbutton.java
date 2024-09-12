package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
     driver.get("https://selenium.qabible.in/check-box-demo.php"); 
     driver.manage().window().maximize();
     
    WebElement gridCheckbox=driver.findElement(By.id("gridCheck"));//webelement declaring,here id is used instead of xpath.
    // boolean selected1=gridCheckbox.isSelected();
     gridCheckbox.click();
     boolean selected=gridCheckbox.isSelected();
     //System.out.println(selected1);
     System.out.println(selected);
     
     WebElement selectAllButton=driver.findElement(By.id("button-two"));
     boolean isDisplayed=selectAllButton.isDisplayed();
     System.out.println(isDisplayed);
     boolean isEnabled=selectAllButton.isEnabled();
     System.out.println(isEnabled);
     
     //driver.quit();
     
     
     
     
     
     

	}

}
