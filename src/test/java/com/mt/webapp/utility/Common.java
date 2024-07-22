package com.mt.webapp.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mt.webapp.model.DTO;
import com.mt.webapp.stepdef.Mt_StepDef;

public class Common 
{
  public static WebDriver driver;
  public static Logger log = Logger.getLogger(Mt_StepDef.class);
  
  public static FileInputStream fis;
  public static XSSFWorkbook wb;
  public static XSSFSheet sh;
  
  public static DTO dt = new DTO();
  
  public static void dtPojo()
  {
	dt.setUsername("Prerana");
	dt.setPassword("Mane@2002");
  }
  
  public static Properties pro = new Properties();
  public static void proFile() 
  {
	  try 
	  {
		  fis = new FileInputStream("src//test//resources//PropertiesFile//Mt.properties");
		  pro.load(fis);
	  } 
	  catch (IOException e)
	  {
          e.printStackTrace();
	  }
  }
   
  public static String addr;
  public static String city;
  public static String state;
  public static String pcode;
  
  static List<String> al = new ArrayList<String>();
  
  public static void regxlsx()
  {
	  try 
	  {
		  fis = new FileInputStream("src//test//resources//ExcelFile//MT.xlsx");
		  wb = new XSSFWorkbook(fis);
	  } 
	  catch (IOException e) 
	  {
			e.printStackTrace();
	  }
	  sh = wb.getSheet("Sheet1");
	  int rowCount = sh.getLastRowNum();
	  
	  for(int i=2;i<rowCount+1;i++)
	  {
		  for(int j=0;j<=3;j++)
		  {
			  String field = sh.getRow(i).getCell(j).getStringCellValue();
			  al.add(field);
		  }
	  }
	 
	  addr=al.get(0);
	  city=al.get(1);
	  state=al.get(2);
	  pcode=al.get(3);  
  }
  
  public static void screenshot() throws IOException
  {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File("src//test//resources//screenshot"));
  }
}
