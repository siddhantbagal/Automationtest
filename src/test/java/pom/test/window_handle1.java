package pom.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handle1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone14");
	     
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
	    driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black']")).click();		
		
	    Set<String> ALLID=driver.getWindowHandles();
	    System.out.println(ALLID);
	    
	    List<String> list=new ArrayList(ALLID);
	    System.out.println(list.get(1));
	    driver.switchTo().window(list.get(1));
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    
	   // Iterator<String> IT=ALLID.iterator();
	    
	    //
		

	}

}
