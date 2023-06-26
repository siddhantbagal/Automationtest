package pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?bbn=1380374031&rh=n%3A1380374031%2Cp_n_format_browse-bin%3A19560799031&pf_rd_r=G2G966TFZ76WK0EZHNGA&pf_rd_p=470da19c-6361-4f5b-b71b-7d5b37b91c83&pd_rd_r=33288231-af48-4a74-ba9e-b537c7f5ffe6&pd_rd_w=ypGn9&pd_rd_wg=XBxdd&ref_=pd_gw_unk");
        driver.manage().window().maximize();

        JavascriptExecutor js=driver;
        js.executeScript("window.scrollBy(0,1800)", "");
        Thread.sleep(3000);
        
        js.executeScript("window.scrollBy(0,-1800)", "");
        Thread.sleep(3000);
        WebElement img=driver.findElement(By.xpath("(//img[@class='s-image'])[20]"));
        js.executeScript("arguments[0].scrollIntoView()", img);
        img.click();
        WebElement addtokart=driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
      
        js.executeScript("arguments[0].scrollIntoView()", addtokart);
        addtokart.click();
        
	}
	

}
