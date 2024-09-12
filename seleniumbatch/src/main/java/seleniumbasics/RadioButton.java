package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click(); //for click radiobuttonDemo link
	     
		 WebElement radioButtonMale=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	     radioButtonMale.click();
	     boolean clickradio=radioButtonMale.isSelected();
	     System.out.println(clickradio);
	     
	     WebElement radioButtonFemale=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	     radioButtonFemale.click();
	     boolean clickradio2=radioButtonFemale.isSelected();
	     System.out.println(clickradio2);
	     
	     WebElement button=driver.findElement(By.id("button-one"));
	     button.click();
	     
	     WebElement message1=driver.findElement(By.xpath("//div[@id='message-one']"));
	     String message=message1.getText();
	     System.out.println(message);
	     //driver.quit();

	}

}
