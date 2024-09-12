package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://selenium.qabible.in/select-input.php"); 
	     driver.manage().window().maximize();
	     
	     WebElement dropDown=driver.findElement(By.id("single-input-field"));
	     Select selectObject=new Select(dropDown);
	     
	     selectObject.selectByIndex(1); //select by using index value
	     
	     selectObject.selectByValue("Yellow"); //select by value ,attibute value.
	     
	     selectObject.selectByVisibleText("Green"); //select by visible text.
	     
	     WebElement selectedElement=selectObject.getFirstSelectedOption();//currently selected value in dropdown.
	     String elementString=selectedElement.getText();
	     System.out.println(elementString);
	     
	     WebElement multiDropDown=driver.findElement(By.id("multi-select-field"));
	     Select multiSelectObject=new Select(multiDropDown);
	     for(int i=0;i<3;i++)
	     {
	    	 multiSelectObject.selectByIndex(i); 
	     }
	     List<WebElement> selectedValue=multiSelectObject.getAllSelectedOptions();
	     for(int j=0;j<selectedValue.size();j++)
	     {
	    	// System.out.println(selectValue.get(j).getText());  or
	    	 String selecteditem=selectedValue.get(j).getText();
	    	 System.out.println(selecteditem);
	     }
	     }

}
