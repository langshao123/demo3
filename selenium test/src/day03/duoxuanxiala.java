package day03;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class duoxuanxiala {
	WebDriver driver;
	String url="file:///D:/ceshi/selenium/%E9%A1%B5%E9%9D%A2/index.html";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }
    /*
     * 1,�򿪲���ҳ��
     * 2����λ����ѡ������
     * 3��ѡ��ѡ��
     */
    @Test
    public void duoxuan() {
    	driver.get(url);
    	WebElement dri=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
    	Actions a=new Actions(driver);
    	List<WebElement> op=dri.findElements(By.tagName("option"));
    	a.clickAndHold(op.get(1))
    	.clickAndHold(op.get(2))
    	.release()
    	.perform();
    		
    }
    @After
    public void after() {
    	//�رյ�ǰҳ��
    	driver.close();
    	//�˳������
    	driver.quit();
    }
    

}
