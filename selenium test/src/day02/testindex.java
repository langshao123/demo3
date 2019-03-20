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

public class testindex {
	WebDriver driver;
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		String url="file:///D:/ceshi/selenium/index/index.1.html";
		driver.get(url);
    }
  		@Test
 		public void shouji1() throws InterruptedException {
        //��λ�����
  			WebElement input1=driver.findElement(By.id("user"));
  			input1.sendKeys("��������");
  			
  			//��λ������
  			WebElement s1=driver.findElement(By.id("moreSelect"));
  			Select s=new Select(s1);
  			//���ַ�ʽѡ�񣬲���������
  			s.selectByIndex(3);  //index����������0��ʼ�������򣬵�һ�ַ�ʽ
  			Thread.sleep(1000);
  			s.selectByValue("iphone");  //ֱ������ֵѡ�񣬵ڶ��ַ�ʽ
  			Thread.sleep(1000);
  			s.selectByVisibleText("huawei");//�ɼ��ı��������ַ�ʽ
  			
  			//��λ��ѡ��ť����ѡ��
  			WebElement r1=driver.findElement(By.className("Saab"));
  			System.out.println(r1.isSelected());//���û�б�ѡ��false����֮true
  			r1.click();
  			System.out.println(r1.isSelected());//���û�б�ѡ��false����֮true
  			
  			//��ѡ��ť����ѡ��
  			WebElement r2=driver.findElement(By.name("checkbox3"));
  			r2.click();
  			System.out.println(r2.isSelected());
  			WebElement r3=driver.findElement(By.name("checkbox4"));
  			r3.click();
  			System.out.println(r3.isSelected());
  			
  			//�жϰ�ť�Ƿ����
  			WebElement b1=driver.findElement(By.name("buttonhtml"));
  			System.out.println(b1.isEnabled());//��ť�Ƿ����
  			
  			//���水ť
  			WebElement b2=driver.findElement(By.className("alert"));
  			b2.click();
  			Thread.sleep(1000);
  			Alert bb=driver.switchTo().alert();//��ת���������Ŀ�
  			bb.accept();//����������ȷ��
  			
  			//����ȷ�Ͽ�
  			WebElement com1=driver.findElement(By.className("confirm"));
  			com1.click();
  			Alert com=driver.switchTo().alert();
  			com.dismiss();//ȡ��
  			Thread.sleep(1000);
  			com.accept();//ȷ��       
  			
  			
  			//���������ʾ��
  			WebElement pr1=driver.findElement(By.className("prompt"));
  			pr1.click();
  			Alert prm=driver.switchTo().alert();
  			Thread.sleep(2000);
  			prm.sendKeys("¬��ΰţ��");
  			prm.accept();
  			Thread.sleep(2000);
  			System.out.println(prm.getText());
  			prm.accept();
  			Thread.sleep(1000);
  			
  			//�ϴ��ļ�
  			String lujin="E:\\����Ӣ�۱�����.jpg";
  			WebElement up=driver.findElement(By.id("load"));
  			up.sendKeys(lujin);
  			
/*			//���������
  			WebElement link=driver.findElement(By.linkText("Open new window"));
  			link.click();
  			//��ȡҳ�����о��
  			Set<String> windowHandles=driver.getWindowHandles();//��ȡҳ�����еľ��
  			//�Ҿ��
  			for(String handler:windowHandles) {
  				//��ӡ��ǰҳ����
  				System.out.println(handler);
  				//��ת����ǰ���ҳ����
  				driver.switchTo().window(handler);
  				//��ȡ��ǰҳ�����
  				String title=driver.getTitle();
  				//�Աȱ��⣬������������Ҫ��һ����ִ�����²���
  				if("UIAutomation iFrame".equals(title)) {
  					WebElement user=driver.findElement(By.id("user"));
  		  			user.sendKeys("¬��ΰ");         
  				}
  			}   */        
  			//driver.switchTo().frame("aa");//ֱ��дframe��id����name,һ����ת����һ�ַ�ʽ
  			driver.switchTo().frame(0);//�ڶ��ַ�ʽ
  			driver.findElement(By.id("user")).sendKeys("����˹");
  		    //������һ��һ��������
  			//driver.switchTo().parentFrame();
  			//������ֱ���л��������
  			driver.switchTo().defaultContent();
  			WebElement link=driver.findElement(By.linkText("Open new window"));
  			link.click();
  			
  	    
  		}
	}

