package day01;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class testBaidu {
	@Test
	public void openfirefox() throws InterruptedException {
		//火狐浏览器
/*		System.setProperty("webdriver.firefox.bin", "D:\\firefox.exe");
		WebDriver driver=new FirefoxDriver();       */
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url ="https://www.baidu.com";
		driver.get(url);
		//driver.get("https://www.taobao.com");
		//driver.navigate().back();//回退
		//driver.navigate().forward();//向前
/*		driver.navigate().refresh();//刷新
		driver.manage().window().maximize();//最大化
		Dimension dimension = new Dimension(900, 800);//设置窗口大小
		driver.manage().window().setSize(dimension);
		String c=driver.getCurrentUrl();//获取当前URL
		String d=driver.getTitle();//获取标题
		System.out.println(c);
		System.out.println(d);                         */
		
		//定位元素第一种方式；
/*		WebElement inputbox=driver.findElement(By.id("kw"));
		//暂停
		Thread.sleep(1000);
		//给框中输入内容
		inputbox.sendKeys("漆凯鹏");
		//定位百度一下按钮
		WebElement buton=driver.findElement(By.id("su"));
		buton.click();//点击按钮

		//定位元素第二种方式；
		WebElement inputbox1=driver.findElement(By.name(""));
		
		//定位元素第三种方式；
		WebElement buton1=driver.findElement(By.className("mnav"));
		buton1.click();
		
		//第四种；
		driver.findElement(By.linkText("新闻")).click();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("国内")).click();
		driver.findElement(By.partialLinkText("2019年放假安排出炉")).click();*/
		
		//第五种；
		
/*		int sum=driver.findElements(By.tagName("a")).size();
		System.out.println("总a标签数为:"+sum);         */
/*		driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("hello");          */
		driver.findElement(By.cssSelector("#kw")).sendKeys("hello");
		
	
	}

}
