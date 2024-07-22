package com.dws.webapp.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import com.dws.webapp.model.DT;
import com.dws.webapp.stepdef.Dw_Test;

public class Common 
{
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(Dw_Test.class);

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;

	public static Properties pro = new Properties();

	public static void proFile() throws IOException 
	{
		fis = new FileInputStream("src//test//resources//PropertiesFile//Dw.properties");
		pro.load(fis);
	}

	public static DT dt = new DT();

	public static void userData() 
	{
		dt.setEmail("Maneprerana30@gmail.com");
		dt.setPassword("Mane@2002");
	}

	public static String companyName;
	public static String cityName;
	public static String add1;
	public static String add2;
	public static String zipcode;
	public static String phoneNum;
	public static String faxNum;

	static List<String> al = new ArrayList<String>();

	public static void addressDetails() throws IOException 
	{
		fis = new FileInputStream("src//test//resources//ExcelFile//DW.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum();

		for (int i = 2; i < rowCount + 1; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				String field = sh.getRow(i).getCell(j).getStringCellValue();
				al.add(field);
			}

			companyName = al.get(0);
			cityName = al.get(1);
			add1 = al.get(2);
			add2 = al.get(3);
			zipcode = al.get(4);
			phoneNum = al.get(5);
			faxNum = al.get(6);
		}
	}
}
