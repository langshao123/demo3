package day02;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lianxi1 {
	WebDriver driver;
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		String url="file:///D:/ceshi/selenium/%E9%A1%B5%E9%9D%A2/pop.html";
		driver.get(url);
    }
    @Test
    public void shouji() throws InterruptedException {
/*        //�����
    	WebElement input11=driver.findElement(By.id("accountID"));
    	input11.sendKeys("2544045623");
    	WebElement input12=driver.findElement(By.id("passwordID"));
    	input12.sendKeys("123456");
    	//������
      	WebElement la=driver.findElement(By.id("areaID"));
    	Select s=new Select(la);
    	s.deselectByIndex(1);
    	Thread.sleep(1000);
    	s.deselectByValue("beijing");
    	Thread.sleep(1000);
    	s.deselectByVisibleText("�����");
    	//��ѡ��
    	WebElement r11=driver.findElement(By.id("sexID1"));
    	r11.click();
    	System.out.println(r11.isSelected());
    	Thread.sleep(1000);
    	//��ѡ��
     	WebElement r21=driver.findElement(By.id("u2"));
    	r21.click();
    	System.out.println(r21.isSelected());
    	Thread.sleep(1000);
    	WebElement r31=driver.findElement(By.id("u3"));
    	r31.click();
    	System.out.println(r31.isSelected());
    	Thread.sleep(1000);
    	WebElement r41=driver.findElement(By.id("u4"));
    	r41.click();
    	System.out.println(r41.isSelected());
    	Thread.sleep(1000);
    	//���ļ�
    	String lujin1="E:\\����Ӣ�۱�����.jpg";
    	WebElement wenjian=driver.findElement(By.name("file"));
    	wenjian.sendKeys(lujin1);
    	Thread.sleep(1000);
    	//ȷ�Ͽ�
    	WebElement bot=driver.findElement(By.id("buttonID"));
    	bot.click();
		Alert com1=driver.switchTo().alert();
		System.out.println(com1.getText());
		Thread.sleep(1000);
		com1.accept();*/
    	
    	
    	//��ϰһ
/*  	WebElement bot=driver.findElement(By.id("alert"));
    	bot.click();
    	Alert com1=driver.switchTo().alert();
    	System.out.println(com1.getText());
    	com1.accept();
    	
    	WebElement bot1=driver.findElement(By.id("confirm"));
    	bot1.click();
    	Alert com2=driver.switchTo().alert();
    	System.out.println(com2.getText());
    	com2.accept();
    	
    	WebElement bot3=driver.findElement(By.id("prompt"));
    	bot3.click();
    	Alert com3=driver.switchTo().alert();
    	com3.sendKeys("¬��ΰ");
    	com3.accept();
    	WebElement a=driver.findElement(By.xpath("/html/body"));
    	System.out.println(a.getText());*/
    	
    	//��ϰ��
 /*   	driver.switchTo().frame("frame");
    	WebElement a=driver.findElement(By.id("input1"));
    	a.sendKeys("���ش���:baba");*/
    	
    	//��ϰ��
    	WebElement c=driver.findElement(By.linkText("click me"));
    	c.click();
			Set<String> windowHandles=driver.getWindowHandles();//��ȡҳ�����о��
			for(String handler:windowHandles) {       //�Ҿ��
				System.out.println(handler);         //��ӡ��ǰҳ����
				driver.switchTo().window(handler);  //��ת����ǰ���ҳ����
				String title=driver.getTitle();     //��ȡ��ǰҳ�����
				if("test".equals(title)) {          //�Աȱ��⣬������������Ҫ��һ����ִ�����²���
					WebElement user=driver.findElement(By.id("accountID"));
		  			user.sendKeys("¬��ΰ");         
				}
			}           
    	
    	
    	
    	
    	
    	
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }


