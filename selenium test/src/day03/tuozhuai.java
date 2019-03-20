package day03;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tuozhuai {
	WebDriver driver;
	String url="file:///D:/ceshi/selenium/%E9%A1%B5%E9%9D%A2/dragAndDrop.html";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//全局等待
    }
    /*
     * 1,打开拖拽的网址
     * 2，把红色的方块
     * 3，拖到黑色的字位置
     */
    @Test
    public void drag() {
    	driver.get(url);
 /*   	//定位红色方块
    	WebElement dr=driver.findElement(By.id("drag"));
    	//定位黑色的字
    	WebElement blank=driver.findElement(By.xpath("/html/body/h1"));
    	//实例化Actions
    	Actions a=new Actions(driver);
    	a.clickAndHold(dr)
    	.moveToElement(blank)
    	.release(dr)
    	.perform();*/
    	 /*
         * 1,打开拖拽的网址
         * 2，把红色的方块
         * 3，拖到黑色的字位置
         */
     	//定位红色方块
    	WebElement dr=driver.findElement(By.id("drag"));
    	//实例化Actions
    	Actions a=new Actions(driver);
    	a.dragAndDropBy(dr,200, 300).perform();
    	
    }
    

}
