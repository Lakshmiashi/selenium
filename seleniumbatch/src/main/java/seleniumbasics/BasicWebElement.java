package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	        
         driver.get("https://www.qabible.in/payrollapp/site/login"); 
         driver.manage().window().maximize();
         
         //xpath  1) //tagName[@attribute='value']
         
         WebElement userNameField=driver.findElement(By.xpath("//input[@id='loginform-username']"));//webelement declaring
         userNameField.sendKeys("admin");
         
         WebElement passwordField=driver.findElement(By.xpath("//input[@id='loginform-password']"));
 		passwordField.sendKeys("password@1");
 		
 		/*WebElement loginButton=driver.findElement(By.xpath("//button[@name='login-button']"));
 		loginButton.click();*/
 		
 		
 		//        2) //tagname[text()='text']
 		
 		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
 		loginButton.click();
 		
 		userNameField.clear();
 		
 		String fontsize=loginButton.getCssValue("font-size");
 		System.out.println(fontsize);
 		
 		String bgColor=loginButton.getCssValue("background-color");
 		System.out.println(bgColor);
 		
 		String attributeValue=loginButton.getAttribute("class");
 		System.out.println(attributeValue);
 		
 		String getTagName=loginButton.getTagName();
 		System.out.println(getTagName);
 		
 		String getLoginText=loginButton.getText();
 		System.out.println(getLoginText);
 		
 		
 		
 		
	}
	}
