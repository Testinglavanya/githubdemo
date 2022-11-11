package Demoprogm;

import org.testng.annotations.Test;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

import org.testng.annotations.BeforeTest;

import org.apache.tools.ant.types.resources.comparators.Date;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshort {
	WebDriver driver;
	
  @Test
  public void Screenshot() {
	  driver.get("https://www.meesho.com/");
	  DateFormat DateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
	  Date date = new Date();
	  String time = dateFormat.format(date);
	  Copyfile f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Lib\\Screenshots\\TimeScreenshot_" + time + ".png"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lavan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
  }

  

}
