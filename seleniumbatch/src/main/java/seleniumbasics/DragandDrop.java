package seleniumbasics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://selenium.qabible.in/drag-drop.php"); 
	     driver.manage().window().maximize();
	     
	     WebElement sourceElement=driver.findElement(By.xpath("//div[@id='todrag']//span[1]"));  //drag and drop draggable n 1
	     WebElement targetElement=driver.findElement(By.id("mydropzone"));
	     Actions actionobj=new Actions(driver); //creating action cls
	     actionobj.dragAndDrop(sourceElement, targetElement).perform();
	     
	     WebElement sourceElement2=driver.findElement(By.xpath("//div[@id='todrag']//span[1]"));  //drag and drop draggable n 2
	     WebElement targetElement2=driver.findElement(By.id("mydropzone"));
	     actionobj.dragAndDrop(sourceElement2, targetElement2).perform();
	     
	     WebElement sourceElement3=driver.findElement(By.xpath("//div[@id='todrag']//span[1]"));  //drag and drop draggable n 3
	     WebElement targetElement3=driver.findElement(By.id("mydropzone"));
	     actionobj.dragAndDrop(sourceElement3, targetElement3).perform();
	     
	     WebElement sourceElement4=driver.findElement(By.xpath("//div[@id='todrag']//span[1]"));  //drag and drop draggable n 4
	     WebElement targetElement4=driver.findElement(By.id("mydropzone"));
	     actionobj.dragAndDrop(sourceElement4, targetElement4).perform();
	     
	     WebElement sourceElement5=driver.findElement(By.xpath("//div[@id='todrag']//span[1]"));  //drag and drop draggable n 4
	     WebElement targetElement5=driver.findElement(By.id("mydropzone"));
	     actionobj.dragAndDrop(sourceElement5, targetElement5).perform();





	}

}
