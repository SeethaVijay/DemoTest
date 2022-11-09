package org.sam;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Demojsl  extends BaseClass{
		
		@DataProvider(name="LoginData")
		public Object[][] getData(){
			return new Object[][] {{"jsl.ece1992@gmail.com","asdf"},{"seetha1992&gmail.com","gfrtyj"},{"sderftg56","sertgjf"}};
			
		}
	@Test(dataProvider="LoginData")
		private void tc01(String user, String pass) throws IOException, InterruptedException {
			getDriver();
			enterApplnUrl("https://www.facebook.com/");
			maximizeWindow();
		   //4.pass username
			WebElement txtUserName = findElementById("email");
			//String user1 = getDataFromCell("Sheet1", 1, 0);
			elementSendKeys(txtUserName, user);
			//5.pass passwords
			WebElement txtPassword = findElementById("pass");
			//String pass1 = getDataFromCell("Sheet1", 1, 1);
			elementSendKeys(txtPassword, pass);
			//6.clickLogin
			WebElement btnLogin = findElementByName("login");
			elementClick(btnLogin);
			Thread.sleep(6000);
	        TakesScreenshot ts =(TakesScreenshot)driver;	    
		    File screenshotAs = ts.getScreenshotAs(OutputType.FILE); 
		    System.out.println(screenshotAs);
		    File file = new File("C:\\Users\\DELL\\Desktop");
		    FileUtils.copyFileToDirectory(screenshotAs, file);
	}
		

	}
