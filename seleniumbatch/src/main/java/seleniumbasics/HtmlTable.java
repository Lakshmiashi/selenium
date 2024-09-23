package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        
	     driver.get("https://selenium.qabible.in/table-pagination.php"); 
	     driver.manage().window().maximize();
	      
	     WebElement tableHeadelement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[2]"));
	     System.out.println(tableHeadelement.getText()); //print one webelement.
	      
	      List<WebElement> tableHead=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
	      //print list of webelement.
	      for(int i=0;i<tableHead.size();i++)
	      {
	    	  System.out.print(tableHead.get(i).getText()+"  "); //+ is concatenation symbol for concat two string
	      }
	      System.out.println();
	      
	      
	      
	      //---------------------first row element printing--------
	      
	      List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
	       for(int i=0;i<tableRows.size();i++)
	       {
	    	   System.out.print(tableRows.get(i).getText()+"  ");
	       }
	       
	       
	        //------------1st coloumn detailes print.-------------
	       
	       System.out.println();
	       List<WebElement> tableColoumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	       for(int i=0;i<tableColoumn.size();i++)
	       {
	    	   System.out.print(tableColoumn.get(i).getText()+"  ");
	       } 
	       
	       System.out.println();
	       WebElement singleElement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));
	       System.out.println(singleElement.getText());
	       
	       
	       
	       //-------------print detailes of table------------------
	       
	       System.out.println();
	       List<WebElement> tableRows1=driver.findElements(By.tagName("tr"));// get all rows of the table.
	      
	     /*  for(int a=0;a<tableRows1.size();a++)
	       {
	    	  WebElement row=tableRows1.get(a); //get the current row
	    	  
	    	  List<WebElement> tableColoumn1=row.findElements(By.tagName("td")); //get all cells in the current row.
	    	   for(int b=0;b<tableColoumn1.size();b++)
	    	   {
	    	     System.out.print(tableColoumn1.get(b).getText()+"\t");	   
	    	   }
	    	   System.out.println("  ");
	       }*/
	       List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	       List<WebElement> Coloumns=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
	       
	       for(int i=0;i<Rows.size();i++)
	       {
	    	   for(int j=0;j<Coloumns.size();j++)
	    	   {
	    		   String path="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td["+(j+1)+"]";
	    		   WebElement tableElements1=driver.findElement(By.xpath(path));
	    		   System.out.print(tableElements1.getText()+"  ");
	    	   }
	    	   System.out.println();
	       }
	      /* WebElement tableDetailes=driver.findElement(By.id("dtBasicExample")); //complete table detailes using table id
	       System.out.println(tableDetailes.getText());*/
	       
	       
	       
	       //-----------dynamic table handle-------------------------------
	       
	       List<WebElement> tableRowSize=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	       for(int i=0;i<tableRowSize.size();i++)
	       {
	       if(tableRowSize.get(i).getText().equals("Cedric Kelly"))
	       {
	    	   WebElement age=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]"));
	    	   System.out.println(age.getText());
	       }
	       }
	       
	      
	       //driver.quit();
	}
}

	


