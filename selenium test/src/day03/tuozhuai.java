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
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }
    /*
     * 1,����ק����ַ
     * 2���Ѻ�ɫ�ķ���
     * 3���ϵ���ɫ����λ��
     */
    @Test
    public void drag() {
    	driver.get(url);
 /*   	//��λ��ɫ����
    	WebElement dr=driver.findElement(By.id("drag"));
    	//��λ��ɫ����
    	WebElement blank=driver.findElement(By.xpath("/html/body/h1"));
    	//ʵ����Actions
    	Actions a=new Actions(driver);
    	a.clickAndHold(dr)
    	.moveToElement(blank)
    	.release(dr)
    	.perform();*/
    	 /*
         * 1,����ק����ַ
         * 2���Ѻ�ɫ�ķ���
         * 3���ϵ���ɫ����λ��
         */
     	//��λ��ɫ����
    	WebElement dr=driver.findElement(By.id("drag"));
    	//ʵ����Actions
    	Actions a=new Actions(driver);
    	a.dragAndDropBy(dr,200, 300).perform();
    	
    }
    

}
