package pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("siddhant");
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("bagal");
		
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9860111111");
		
		WebElement email=driver.findElement(By.name("userName"));
		email.sendKeys("siddhant@gmail.com");
		
		WebElement country=driver.findElement(By.name("country"));
	    country.sendKeys("india");
		
		WebElement button=driver.findElement(By.name("submit"));
		button.click();
		
		
	}

}
