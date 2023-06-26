package pom.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class importtestdata {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\siddhant\\eclipse-workspace\\MAVEN\\testdata\\test1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data_0_0=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String data_1_0=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String data_2_0=wb.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
		String data_3_0=wb.getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
        String data_4_0=wb.getSheet("sheet1").getRow(4).getCell(0).getStringCellValue();
		String data_5_0=wb.getSheet("sheet1").getRow(5).getCell(0).getStringCellValue();
		String data_6_0=wb.getSheet("sheet1").getRow(6).getCell(0).getStringCellValue();
		String data_7_0=wb.getSheet("sheet1").getRow(7).getCell(0).getStringCellValue();
		String data_8_0=wb.getSheet("sheet1").getRow(8).getCell(0).getStringCellValue();
		String data_9_0=wb.getSheet("sheet1").getRow(9).getCell(0).getStringCellValue();
		String data_10_0=wb.getSheet("sheet1").getRow(10).getCell(0).getStringCellValue();
		String data_11_0=wb.getSheet("sheet1").getRow(11).getCell(0).getStringCellValue();
		
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
	    name.sendKeys(data_0_0);
	    WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	    lastname.sendKeys(data_1_0);
	    WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
	    phone.sendKeys(data_2_0);
	    WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
	    username.sendKeys(data_3_0);
	    WebElement address1=driver.findElement(By.xpath("//input[@name='address1']"));
	    address1.sendKeys(data_4_0);
	    WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	    city.sendKeys(data_5_0);
	    WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
	    state.sendKeys(data_6_0);
	    WebElement postalCode=driver.findElement(By.xpath("//input[@name='postalCode']"));
	    postalCode.sendKeys(data_7_0);
	    //WebElement country=driver.findElement(By.xpath("//input[@name='country']"));
	    //country.sendKeys(data_8_0);
	    WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	    email.sendKeys(data_9_0);
	    WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys(data_10_0);
	    WebElement confirmPassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	    confirmPassword.sendKeys(data_11_0);
	    
	}
}
