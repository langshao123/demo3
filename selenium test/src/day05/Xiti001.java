package day05;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xiti001 {
	WebDriver driver;
	//��¼
	public void login(String name,String pwd) {
    	driver.get("http://localhost:8080/Exam_ssh/admin.do");
    	//�����û���
    	driver.findElement(By.id("name")).sendKeys(name);
    	//��������
    	driver.findElement(By.id("pass")).sendKeys(pwd);
    	//��¼
    	driver.findElement(By.name("B1")).click();
	}
	//��ӿ��Կ�Ŀ
	public void addType(String type,String time) {
    	driver.findElement(By.linkText("��ӿ�������")).click();
    	//�����Ŀ
    	driver.findElement(By.id("testName")).sendKeys(type);
    	//���뿼��ʱ��
    	driver.findElement(By.id("testTime")).sendKeys(time);
    	//�ύ
    	driver.findElement(By.name("submit")).click();
	}
	//������
	public void select(String name,int index) {
    	WebElement se=driver.findElement(By.name(name));
    	Select s=new Select(se);
    	s.selectByIndex(index);
	}
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
    }
    @Test
    public void test1() {
    	//����ҳ���������˺�����
    	login("admin","admin");
    	//��ӿ�������
    	addType("����","90");
    	//����������
    	driver.findElement(By.linkText("�������")).click();
    	//�����Ŀ����
    	String ti="2+3=?";
    	driver.findElement(By.id("title")).sendKeys(ti);
    	//ѡ���Ŀ
    	WebElement examType=driver.findElement(By.name("examType"));
    	Select s1=new Select(examType);
    	s1.selectByIndex(1);
    	//ѡ������
    	select("note",0);
    	//ѡ�����
    	select("score",1);
    	//ѡ���Ѷ�
    	select("level",0);
    	//����ѡ��
    	driver.findElement(By.id("choices")).sendKeys("1:2:3:4");
    	//�����
    	driver.findElement(By.id("standardAnswer")).sendKeys("A:B:C:D");
    	//�ύ
    	driver.findElement(By.name("submit")).click();
    	//��ӡ����
    	String txt=driver.findElement(By.className("Xsmall")).getText();
    	System.out.println(txt);
    	//��ӿ�������
    	driver.findElement(By.linkText("��ӿ�������")).click();
    	driver.findElement(By.id("id")).sendKeys("362511199811111111");
    	driver.findElement(By.id("realname")).sendKeys("����");
    	driver.findElement(By.id("stuNumber")).sendKeys("170811");
    	driver.findElement(By.id("className")).sendKeys("1708");
    	driver.findElement(By.id("address")).sendKeys("�����ϲ�");
    	driver.findElement(By.id("phone")).sendKeys("13967892345");
    	driver.findElement(By.id("humanId")).sendKeys("362511199811111111");
    	driver.findElement(By.id("email")).sendKeys("13967892345@163.com");
    	driver.findElement(By.name("submit")).click();
    	String stu=driver.findElement(By.className("Xsmall")).getText();
    	System.out.println(stu);
    	
    }
}
