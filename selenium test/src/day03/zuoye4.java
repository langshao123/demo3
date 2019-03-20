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
     * 1，添加一个商品主类
            2，删除订单
         3，发布公告
     */
    @Test
    //添加一个商品主类
    public void Aadd() throws InterruptedException {
    	driver.findElement(By.name("a_name")).sendKeys("admin");//定位到用户名输入框
    	driver.findElement(By.name("a_pass")).sendKeys("admin");//定位到密码输入框
    	driver.findElement(By.name("submit2")).click();//点击登录，进入后台首页
    	//建一个变量接收xpath值
    	WebElement s=driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe"));
    	driver.switchTo().frame(s);//使用s变量进入主框架
    	driver.switchTo().frame("Left");//进入左边框架
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();//定位到添加主类
    	driver.switchTo().defaultContent();//退出框架的最外面
    	driver.switchTo().frame(s);//使用s变量进入主框架
    	driver.switchTo().frame("Rigth");//进入右边框架
    	driver.findElement(By.name("t_name")).sendKeys("摸金校尉");//定位到添加主类输入框
    	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();//点击添加
    	Thread.sleep(2000);//等待2秒
    	driver.switchTo().defaultContent();//退出框架的最外面
    }
    @Test
    //删除订单
    public void Bdel() throws InterruptedException {
    	WebElement s=driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe"));
    	driver.switchTo().frame(s);//使用s变量进入主框架
    	driver.switchTo().frame("Left");//进入左边框架
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();//定位到查看编辑所有订单
    	driver.switchTo().defaultContent();//退出框架的最外面
    	driver.switchTo().frame(s);//使用s变量进入主框架
    	driver.switchTo().frame("Rigth");//进入右边框架
    	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td[6]/span/a")).click();//点击删除
    	Thread.sleep(2000);//等待2秒
    	driver.switchTo().defaultContent();	//退出框架的最外面
    }
    @Test
    //发布公告
    public void Carry() throws InterruptedException {
    	WebElement s=driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe"));
    	driver.switchTo().frame(s);//使用s变量进入主框架
    	driver.switchTo().frame("Left");//进入左边框架
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();//定位到发布公告
    	driver.switchTo().defaultContent();//退出框架的最外面
    	driver.switchTo().frame(s);//使用s变量进入主框架
    	driver.switchTo().frame("Rigth");//进入右边框架
    	driver.findElement(By.name("n_message")).sendKeys("摸金校尉_张嘉文觉得很好");//定位到用户名输入框
    	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();//点击发表意见
    	Thread.sleep(2000);//等待2秒
    	driver.switchTo().defaultContent();	//退出框架的最外面
    }
    
    @AfterClass
    public void after() {
    	//退出浏览器
    	driver.quit();
  }

}
