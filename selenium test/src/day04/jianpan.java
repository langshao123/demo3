package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jianpan {
	WebDriver driver;
	String url="file:///D:/ceshi/selenium/%E9%A1%B5%E9%9D%A2/index.html";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }
    @Test
    public void mai() throws InterruptedException, AWTException {
    	driver.get(url);
    	//ctrl+aȫѡ
/*    	WebElement input1=driver.findElement(By.id("user"));
			input1.sendKeys("¬��ΰ");
			Thread.sleep(1000);
			input1.sendKeys(Keys.CONTROL,"a");
			
			//��λ������
		  	WebElement dri=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	    	Actions a=new Actions(driver);
	    	List<WebElement> op=dri.findElements(By.tagName("option"));
	    	//a.keyDown(Keys.SHIFT)
	    	a.keyDown(Keys.CONTROL)
	    	.click(op.get(0))
	    	.click(op.get(1))
	    	.click(op.get(2))
	    	.click(op.get(3))
	    	.perform();*/
	    	
	    	//actions�ṩ��keydown
	    	/*
	    	 * ����ҳ
	    	 * ���ctrl+s
	    	 * ȡ����ȷ��
	    	 */
	    	Robot r=new Robot();
	    	/*r.keyPress(KeyEvent.VK_CONTROL);
	    	r.keyPress(KeyEvent.VK_S);
	    	Thread.sleep(2000);
	    	r.keyRelease(KeyEvent.VK_S);
	    	r.keyRelease(KeyEvent.VK_CONTROL);
	    	
	    	//r.keyPress(KeyEvent.VK_ESCAPE);
	    	//Thread.sleep(2000);
	    	//r.keyRelease(KeyEvent.VK_ESCAPE);
	    	
	    	r.keyPress(KeyEvent.VK_ENTER);
	    	Thread.sleep(2000);
	    	r.keyRelease(KeyEvent.VK_ENTER);
	    	
	    	r.keyPress(KeyEvent.VK_ALT);
	    	r.keyPress(KeyEvent.VK_F4);
	    	
	    	r.keyRelease(KeyEvent.VK_ALT);
	    	r.keyRelease(KeyEvent.VK_F4);*/
	    	
	    	
	    	
	    	
    
    }
	

}
