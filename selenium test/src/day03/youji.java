package day03;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youji {
	WebDriver driver;
	String url="https://www.baidu.com/";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//全局等待
    }
    /*
     * 1打开页面
     * 2定位到输入框
     * 3点击右键
     */
    @Test
    public void youjian() throws InterruptedException {
    	
    	driver.get(url);
    	//Thread.sleep(5000);
    	// 	WebElement input=driver.findElement(By.id("user"));
    	Actions a=new Actions(driver);
    	//a.contextClick(input).perform();
    	
    	/*WebElement input1=driver.findElement(By.className("wait"));
    	a.doubleClick(input1).perform();
    	Thread.sleep(5000);
    	
    	String b=driver.findElement(By.className("red")).getText();
			System.out.println("给我出来:"+b);*/
    	
/*    	//移动鼠标
    	WebElement yi=driver.findElement(By.className("over"));
        a.moveToElement(yi).perform();
        String aa=driver.findElement(By.id("over")).getText();
        System.out.println("站大街:"+aa);*/
/*    	WebElement yi1=driver.findElement(By.name("tj_briicon"));
    	a.moveToElement(yi1).perform();
    	driver.findElement(By.className("bdbriimgitem_1")).click();*/

    }

}
