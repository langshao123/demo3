package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class zuoye3 {
	WebDriver driver;
	String url="http://localhost:8080/shop1/index.jsp";
    @BeforeClass
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
    }
    @Test
    //��¼--�����������--�������
    public void buy() throws InterruptedException {
    	driver.findElement(By.name("c_name")).sendKeys("aaaaaa");//��λ���û��������
    	driver.findElement(By.name("c_pass")).sendKeys("aaa");//��λ�����������
    	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]"))
    	.click();//���ȷ��
    	driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/a"))
    	.click();//��λ����������������
    	driver.findElement(By.name("c_message")).sendKeys("����Уξ���ú�ok");//��λ���������������
    	driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]"))
    	.click();//��λ��������������ť
    	Thread.sleep(2000);
    }
    @AfterClass
    public void after() {
    	//�˳������
    	driver.quit();
  }

}
