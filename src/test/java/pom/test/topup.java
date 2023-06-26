package pom.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class topup {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement abc=driver.findElement(By.xpath("//input[@name='cusid']"));
		abc.sendKeys("1234567");
		
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
		button.click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//Thread.sleep(2000);
		alt.accept();
		//Thread.sleep(2000);
		System.out.println(alt.getText());
		//Thread.sleep(2000);
		alt.accept();
		
		

	}

}
