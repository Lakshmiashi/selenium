package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://selenium.qabible.in/javascript-alert.php"); 
	     driver.manage().window().maximize();
	     
	     WebElement clickMeAlert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	     clickMeAlert.click();
	     String alerttext=driver.switchTo().alert().getText();
	     System.out.println(alerttext);
	     driver.switchTo().alert().accept();
	     
	     WebElement clickMeAlert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	     clickMeAlert2.click();
	     driver.switchTo().alert().dismiss();
	    // driver.quit();

	}

}
