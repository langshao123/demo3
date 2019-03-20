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
        //定位输入框
  			WebElement input1=driver.findElement(By.id("user"));
  			input1.sendKeys("测试用例");
  			
  			//定位下拉框
  			WebElement s1=driver.findElement(By.id("moreSelect"));
  			Select s=new Select(s1);
  			//三种方式选择，操作下拉框
  			s.selectByIndex(3);  //index是索引，从0开始进行排序，第一种方式
  			Thread.sleep(1000);
  			s.selectByValue("iphone");  //直接输入值选择，第二种方式
  			Thread.sleep(1000);
  			s.selectByVisibleText("huawei");//可见文本，第三种方式
  			
  			//定位单选按钮，单选框
  			WebElement r1=driver.findElement(By.className("Saab"));
  			System.out.println(r1.isSelected());//如果没有被选择false，反之true
  			r1.click();
  			System.out.println(r1.isSelected());//如果没有被选择false，反之true
  			
  			//多选按钮，多选框
  			WebElement r2=driver.findElement(By.name("checkbox3"));
  			r2.click();
  			System.out.println(r2.isSelected());
  			WebElement r3=driver.findElement(By.name("checkbox4"));
  			r3.click();
  			System.out.println(r3.isSelected());
  			
  			//判断按钮是否可用
  			WebElement b1=driver.findElement(By.name("buttonhtml"));
  			System.out.println(b1.isEnabled());//按钮是否可用
  			
  			//警告按钮
  			WebElement b2=driver.findElement(By.className("alert"));
  			b2.click();
  			Thread.sleep(1000);
  			Alert bb=driver.switchTo().alert();//跳转到弹出来的框
  			bb.accept();//点击弹出框的确定
  			
  			//二次确认框
  			WebElement com1=driver.findElement(By.className("confirm"));
  			com1.click();
  			Alert com=driver.switchTo().alert();
  			com.dismiss();//取消
  			Thread.sleep(1000);
  			com.accept();//确定       
  			
  			
  			//需输入的提示框
  			WebElement pr1=driver.findElement(By.className("prompt"));
  			pr1.click();
  			Alert prm=driver.switchTo().alert();
  			Thread.sleep(2000);
  			prm.sendKeys("卢本伟牛逼");
  			prm.accept();
  			Thread.sleep(2000);
  			System.out.println(prm.getText());
  			prm.accept();
  			Thread.sleep(1000);
  			
  			//上传文件
  			String lujin="E:\\航运英雄鲍海清.jpg";
  			WebElement up=driver.findElement(By.id("load"));
  			up.sendKeys(lujin);
  			
/*			//点击新链接
  			WebElement link=driver.findElement(By.linkText("Open new window"));
  			link.click();
  			//获取页面所有句柄
  			Set<String> windowHandles=driver.getWindowHandles();//获取页面所有的句柄
  			//找句柄
  			for(String handler:windowHandles) {
  				//打印当前页面句柄
  				System.out.println(handler);
  				//跳转至当前句柄页面中
  				driver.switchTo().window(handler);
  				//获取当前页面标题
  				String title=driver.getTitle();
  				//对比标题，如果标题和我想要的一样，执行以下操作
  				if("UIAutomation iFrame".equals(title)) {
  					WebElement user=driver.findElement(By.id("user"));
  		  			user.sendKeys("卢本伟");         
  				}
  			}   */        
  			//driver.switchTo().frame("aa");//直接写frame的id或者name,一个跳转，第一种方式
  			driver.switchTo().frame(0);//第二种方式
  			driver.findElement(By.id("user")).sendKeys("克里斯");
  		    //跳出，一层一层往外跳
  			//driver.switchTo().parentFrame();
  			//跳出，直接切换到最外层
  			driver.switchTo().defaultContent();
  			WebElement link=driver.findElement(By.linkText("Open new window"));
  			link.click();
  			
  	    
  		}
	}

