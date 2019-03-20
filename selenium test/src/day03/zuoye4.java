package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class zuoye4 {
	WebDriver driver;
	String url="http://localhost:8080/shop1/admin/admin_login.jsp";
    @BeforeClass
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);	 
    }
    /*
     * 1�����һ����Ʒ����
            2��ɾ������
         3����������
     */
    @Test
    //���һ����Ʒ����
    public void Aadd() throws InterruptedException {
    	driver.findElement(By.name("a_name")).sendKeys("admin");//��λ���û��������
    	driver.findElement(By.name("a_pass")).sendKeys("admin");//��λ�����������
    	driver.findElement(By.name("submit2")).click();//�����¼�������̨��ҳ
    	//��һ����������xpathֵ
    	WebElement s=driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe"));
    	driver.switchTo().frame(s);//ʹ��s�������������
    	driver.switchTo().frame("Left");//������߿��
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();//��λ���������
    	driver.switchTo().defaultContent();//�˳���ܵ�������
    	driver.switchTo().frame(s);//ʹ��s�������������
    	driver.switchTo().frame("Rigth");//�����ұ߿��
    	driver.findElement(By.name("t_name")).sendKeys("����Уξ");//��λ��������������
    	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();//������
    	Thread.sleep(2000);//�ȴ�2��
    	driver.switchTo().defaultContent();//�˳���ܵ�������
    }
    @Test
    //ɾ������
    public void Bdel() throws InterruptedException {
    	WebElement s=driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe"));
    	driver.switchTo().frame(s);//ʹ��s�������������
    	driver.switchTo().frame("Left");//������߿��
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();//��λ���鿴�༭���ж���
    	driver.switchTo().defaultContent();//�˳���ܵ�������
    	driver.switchTo().frame(s);//ʹ��s�������������
    	driver.switchTo().frame("Rigth");//�����ұ߿��
    	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td[6]/span/a")).click();//���ɾ��
    	Thread.sleep(2000);//�ȴ�2��
    	driver.switchTo().defaultContent();	//�˳���ܵ�������
    }
    @Test
    //��������
    public void Carry() throws InterruptedException {
    	WebElement s=driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe"));
    	driver.switchTo().frame(s);//ʹ��s�������������
    	driver.switchTo().frame("Left");//������߿��
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();//��λ����������
    	driver.switchTo().defaultContent();//�˳���ܵ�������
    	driver.switchTo().frame(s);//ʹ��s�������������
    	driver.switchTo().frame("Rigth");//�����ұ߿��
    	driver.findElement(By.name("n_message")).sendKeys("����Уξ_�ż��ľ��úܺ�");//��λ���û��������
    	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();//����������
    	Thread.sleep(2000);//�ȴ�2��
    	driver.switchTo().defaultContent();	//�˳���ܵ�������
    }
    
    @AfterClass
    public void after() {
    	//�˳������
    	driver.quit();
  }

}
