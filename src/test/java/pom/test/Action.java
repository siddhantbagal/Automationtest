package pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        
        // MouseMovement and Keyboard --> Actions 
        //Element --> mouseHover 
   
       Actions act=new Actions(driver);
        
      //Element --> mouseHover 
        //WebElement Bank=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        //act.moveToElement(Bank).build().perform();
        
      //Right click --> contextClick 
        WebElement RightClickEle=driver.findElement(By.xpath("//span[text()='right click me']"));
        
        WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
        
        act.contextClick(RightClickEle).click(quit).build().perform();
        //Handle Alert 
       // driver.switchTo().alert().accept();
        
        //Double click --Element 
        
       // WebElement DoubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        
        //act.doubleClick(DoubleClick).build().perform();
        //driver.switchTo().alert().accept(); //OK 
        

	}

}
