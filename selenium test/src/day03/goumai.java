package day03;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goumai {
	WebDriver driver;
	String url="http://localhost:8080/mobile_mysql/index.jsp";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }
    @Test
    public void mai() throws InterruptedException {
    	driver.get(url);
    	WebElement user=driver.findElement(By.name("name"));
    	user.sendKeys("aaa");
    	WebElement psd=driver.findElement(By.name("password"));
    	psd.sendKeys("123456");
    	WebElement login=driver.findElement(By.className("input1"));
    	login.click();
    	
    	WebElement gg=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[2]/table[3]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td/a"));
    	gg.click();
    	Thread.sleep(2000);
			//��ȡҳ�����о��
			Set<String> windowHandles=driver.getWindowHandles();//��ȡҳ�����еľ��
			//�Ҿ��
			for(String handler:windowHandles) {
				//��ӡ��ǰҳ����
				System.out.println(handler);
				//��ת����ǰ���ҳ����
				driver.switchTo().window(handler);
				//��ȡ��ǰҳ�����
				String te=driver.getCurrentUrl();
				//�Աȱ��⣬������������Ҫ��һ����ִ�����²���
				if("http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=8".equals(te)) {
					Thread.sleep(2000);
					WebElement g2=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td/input"));
		  			g2.click(); 
		  			
				}
			} 
			Thread.sleep(2000);
			Alert prm=driver.switchTo().alert();
  			Thread.sleep(2000);
  			driver.close();
  			
  			Thread.sleep(3000);
  			WebElement bot=driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[6]/a"));
  			bot.click();
  			//��ȡҳ�����о��
			Set<String> windowHandle=driver.getWindowHandles();//��ȡҳ�����еľ��
			//�Ҿ��
			for(String handler:windowHandle) {
				//��ӡ��ǰҳ����
				System.out.println(handler);
				//��ת����ǰ���ҳ����
				driver.switchTo().window(handler);
				//��ȡ��ǰҳ�����
				String t=driver.getCurrentUrl();
				//�Աȱ��⣬������������Ҫ��һ����ִ�����²���
				if("http://localhost:8080/mobile_mysql/cart_see.jsp".equals(t)) {
					Thread.sleep(2000);
					WebElement g=driver.findElement(By.linkText("ȥ����̨����"));
		  			g.click(); 
		  			
				}
			} 
    	
    	
    }

}
