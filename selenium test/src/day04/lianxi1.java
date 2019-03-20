package day04;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lianxi1 {
	WebDriver driver;
	String url="file:///D:/ceshi/selenium/%E9%A1%B5%E9%9D%A2/1.html";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//全局等待
    }
    @Test
    public void mai() throws InterruptedException {
    	driver.get(url);
    	WebElement gg=driver.findElement(By.xpath("/html/body/input"));
    	gg.sendKeys("涛哥真滴丑");
    	
    	//定位黄色的圆块
    	WebElement dr=driver.findElement(By.id("drag"));
    	//定位输入框
    	WebElement input=driver.findElement(By.xpath("/html/body/input"));
    	//实例化Actions
    	Actions a=new Actions(driver);
    	a.clickAndHold(dr)
    	.moveToElement(input)
    	.release(dr)
    	.perform();
    
    }

}
