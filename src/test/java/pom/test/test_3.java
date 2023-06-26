package pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("siddhant@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("abcdefgh");
		
		WebElement button=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		button.click();
		
		WebElement forget=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		//forget.click();
			
		

	}

}
