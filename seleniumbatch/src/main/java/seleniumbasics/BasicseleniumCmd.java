package seleniumbasics;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class BasicseleniumCmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
         driver.get("https://www.google.co.in"); // for launch browser,wait until page load,not keeping history.
        //driver.navigate().to("https://amazone.net/en-in");//for launch browser,not wait until page load,keeping history.
	     driver.navigate().back();
	     driver.navigate().forward();
	     driver.navigate().refresh(); 
	     
	     String tittle=driver.getTitle();
	     System.out.println(tittle);
	     
	     String url=driver.getCurrentUrl();
	     System.out.println(url);
	     
	     String src=driver.getPageSource();
	     System.out.println(src);//to get page source
	     
	     driver.manage().window().minimize();
	     driver.manage().window().maximize();
	     //driver.close();//to close launch browser,close current tab.
	     driver.quit(); //to close launch browser,close browser fully.
	  
	}
	

}
