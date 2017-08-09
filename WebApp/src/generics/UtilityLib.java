package generics;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class UtilityLib implements IAutoConst
{
	/**
	 * TakeSceernshot on test failure for page	
	*/
	
	public static void getScreenshot(WebDriver driver,String path)
	{
		
		try
		{
			
			TakesScreenshot t=(TakesScreenshot)driver;
			File srcfile= t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File(path));
		}
			catch(Exception e)
			{
				
			}
		}
		
	/**
	 * TakeSceernshot on test failure for desktop
	*/
			public static void getScreenShot(String path)
			{
				
				try
				{
					
					Robot r=new Robot();
					Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
					BufferedImage img=r.createScreenCapture(new Rectangle(d));
					ImageIO.write(img, "png", new File(path));
					
				}
				catch(Exception e)
				{
					
				}
			}
				public static String now()
				{
					
					SimpleDateFormat s=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
					 String dateformat = s.format(new Date());
					 return dateformat;
				}
				
				/**
				 * properties file 
				*/
				public static String getPropertyValue(String path,String key)
				{
					String v="";
					Properties p=new Properties();
					try {
						p.load(new FileInputStream(path));
						v=p.getProperty(key);
						}
					catch (Exception e) 
						{
							
						}
					return v;
					
				}
				
				/**
				 * readData from excelsheet
				 * @throws IOException 
				 * @throws InvalidFormatException 
				 * @throws EncryptedDocumentException 
				*/
				public static  String getCellValue(String path,String sheet,int row,int cell) 
				{
				FileInputStream fis;
				String str = null;
				try {
				fis = new FileInputStream(path);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet s = wb.getSheet(sheet);
				str = s.getRow(row).getCell(cell).getStringCellValue();
				}
				catch (Exception e) 
				{	
				}
				return str;
				}

	}



