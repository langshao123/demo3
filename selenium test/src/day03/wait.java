package day03;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	WebDriver driver;
	String url="file:///D:/ceshi/selenium/index/index.1.html";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }
 /* 		@Test
 		public void shouji1() throws InterruptedException {
  			
  			Thread.sleep(5000);
  			WebElement shuchu=driver.findElement(By.className("wait"));
  			shuchu.click();
  			//��ʾ�ȴ�
  			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("red")));
  			//Thread.sleep(5000);
  			String a=driver.findElement(By.className("red")).getText();
  			System.out.println("���ҳ���:"+a);
  		}*/
  			
  
    
		@Test
			public void shoot() throws IOException {
			/*
  			 * 1,��ҳ��
  			 * 2����ͼ
  			 */
			driver.get(url);
				File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f,new File("D:\\t1.png"));
				
			}
  			
  			
}
