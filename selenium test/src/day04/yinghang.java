package day04;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yinghang {
	WebDriver driver;
	String url="http://localhost:8080/Banksys_ssh/";
    @BeforeGroups(groups="login")
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
    }
  //��¼
    @Test(groups="login")
    public void Alogin() throws InterruptedException, IOException {
    	driver.get(url);
  	    WebElement input1=driver.findElement(By.id("loginValidate_userNO"));
    	input1.sendKeys("1545286109804");
    	WebElement input2=driver.findElement(By.id("loginValidate_password"));
    	input2.sendKeys("123456");
    	WebElement bot=driver.findElement(By.id("loginValidate_0"));
    	bot.click();
    }
    //�鿴������Ϣ
    @Test(groups="chakan")
    public void chakan1() throws InterruptedException, IOException {
    	driver.switchTo().frame("leftFrame");
    	WebElement cha=driver.findElement(By.xpath("/html/body/p[4]/a/img"));
    	cha.click();

    }
    @AfterGroups(groups="chakan")
    public void after() {
    	//�˳������
    	driver.quit();
}
    }
		
 /*   @Test
    public void Blogin() throws InterruptedException, IOException {
    	//���
    	driver.switchTo().frame("leftFrame");//������߿��
    	WebElement cq=driver.findElement(By.xpath("/html/body/p[2]/a/img"));
    	cq.click();
    	driver.switchTo().defaultContent();//�˳���ܵ�������
    	driver.switchTo().frame("mainFrame");//�������ǱߵĿ��
    	WebElement cun=driver.findElement(By.id("smoneyValidate_money"));
    	cun.sendKeys("1000");
    	WebElement chong=driver.findElement(By.xpath("//*[@id=\"smoneyValidate\"]/table/tbody/tr[3]/td/div/input"));
    	chong.click();
    	WebElement cun2=driver.findElement(By.id("smoneyValidate_money"));
    	cun.sendKeys("1000");
    	WebElement bot1=driver.findElement(By.id("smoneyValidate_0"));
    	bot1.click();
    	driver.switchTo().defaultContent();
    }*/

		
    	//��¼
 /*   	WebElement input1=driver.findElement(By.id("loginValidate_userNO"));
    	input1.sendKeys("1545286109804");
    	WebElement input2=driver.findElement(By.id("loginValidate_password"));
    	input2.sendKeys("123456");
    	WebElement bot=driver.findElement(By.id("loginValidate_0"));
    	bot.click();
    }
    @Test
    public void Bqukuan() throws InterruptedException, IOException {
    	//ȡ��
    	driver.switchTo().frame("leftFrame");
    	WebElement qu=driver.findElement(By.xpath("/html/body/p[3]/a/img"));
    	qu.click();
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("mainFrame");
    	WebElement input=driver.findElement(By.id("fmoneyValidate_money"));
    	input.sendKeys("3000");
    	WebElement bot1=driver.findElement(By.id("fmoneyValidate_money"));
    	bot1.click();
    	driver.switchTo().defaultContent();
    	}
    	
    @Test
    public void Cdayin() throws InterruptedException, IOException {
    	//��ӡ������Ϣ
    	driver.switchTo().frame("leftFrame");
    	WebElement jiaoyi=driver.findElement(By.xpath("/html/body/p[4]/a/img"));
    	jiaoyi.click();
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("mainFrame");
    	WebElement jiaoyi2=driver.findElement(By.xpath("/html/body/center/table/tbody"));
    	System.out.println(jiaoyi2.getText());
    	driver.switchTo().defaultContent();
    }
    	
    @Test
    public void Dqukuan2() throws InterruptedException, IOException {
    	//�ٴ�ȡ��
    	driver.switchTo().frame("leftFrame");
    	WebElement qu1=driver.findElement(By.xpath("/html/body/p[3]/a/img"));
    	qu1.click();
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("mainFrame");
    	WebElement input3=driver.findElement(By.id("fmoneyValidate_money"));
    	input3.sendKeys("10000");
    	WebElement bot2=driver.findElement(By.id("fmoneyValidate_0"));
    	bot2.click();
    	driver.switchTo().defaultContent();
    }
    	
    @Test
    public void Edayin2() throws InterruptedException, IOException {
    	//��ӡ������Ϣ
    	driver.switchTo().frame("mainFrame");
    	WebElement cuowu=driver.findElement(By.xpath("/html/body/center"));
    	System.out.println(cuowu.getText());
 	
    }*/

