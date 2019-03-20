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
    //登录--进入意见反馈--发表意见
    public void buy() throws InterruptedException {
    	driver.findElement(By.name("c_name")).sendKeys("aaaaaa");//定位到用户名输入框
    	driver.findElement(By.name("c_pass")).sendKeys("aaa");//定位到密码输入框
    	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]"))
    	.click();//点击确定
    	driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/a"))
    	.click();//定位并点击进入意见反馈
    	driver.findElement(By.name("c_message")).sendKeys("摸金校尉觉得很ok");//定位到发表意见框并输入
    	driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]"))
    	.click();//定位并点击发表意见按钮
    	Thread.sleep(2000);
    }
    @AfterClass
    public void after() {
    	//退出浏览器
    	driver.quit();
  }

}
