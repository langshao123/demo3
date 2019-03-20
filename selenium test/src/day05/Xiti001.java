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
	//登录
	public void login(String name,String pwd) {
    	driver.get("http://localhost:8080/Exam_ssh/admin.do");
    	//输入用户名
    	driver.findElement(By.id("name")).sendKeys(name);
    	//输入密码
    	driver.findElement(By.id("pass")).sendKeys(pwd);
    	//登录
    	driver.findElement(By.name("B1")).click();
	}
	//添加考试科目
	public void addType(String type,String time) {
    	driver.findElement(By.linkText("添加考试类型")).click();
    	//输入科目
    	driver.findElement(By.id("testName")).sendKeys(type);
    	//输入考试时间
    	driver.findElement(By.id("testTime")).sendKeys(time);
    	//提交
    	driver.findElement(By.name("submit")).click();
	}
	//下拉框
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
    	//打开网页，并输入账号密码
    	login("admin","admin");
    	//添加考试类型
    	addType("算数","90");
    	//点击添加试题
    	driver.findElement(By.linkText("添加试题")).click();
    	//添加题目内容
    	String ti="2+3=?";
    	driver.findElement(By.id("title")).sendKeys(ti);
    	//选择科目
    	WebElement examType=driver.findElement(By.name("examType"));
    	Select s1=new Select(examType);
    	s1.selectByIndex(1);
    	//选择类型
    	select("note",0);
    	//选择分数
    	select("score",1);
    	//选择难度
    	select("level",0);
    	//输入选项
    	driver.findElement(By.id("choices")).sendKeys("1:2:3:4");
    	//输入答案
    	driver.findElement(By.id("standardAnswer")).sendKeys("A:B:C:D");
    	//提交
    	driver.findElement(By.name("submit")).click();
    	//打印试题
    	String txt=driver.findElement(By.className("Xsmall")).getText();
    	System.out.println(txt);
    	//添加考生数据
    	driver.findElement(By.linkText("添加考生数据")).click();
    	driver.findElement(By.id("id")).sendKeys("362511199811111111");
    	driver.findElement(By.id("realname")).sendKeys("日天");
    	driver.findElement(By.id("stuNumber")).sendKeys("170811");
    	driver.findElement(By.id("className")).sendKeys("1708");
    	driver.findElement(By.id("address")).sendKeys("江西南昌");
    	driver.findElement(By.id("phone")).sendKeys("13967892345");
    	driver.findElement(By.id("humanId")).sendKeys("362511199811111111");
    	driver.findElement(By.id("email")).sendKeys("13967892345@163.com");
    	driver.findElement(By.name("submit")).click();
    	String stu=driver.findElement(By.className("Xsmall")).getText();
    	System.out.println(stu);
    	
    }
}
