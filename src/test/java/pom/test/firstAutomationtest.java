package pom.test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstAutomationtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
      
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(2000);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		
	}

}
