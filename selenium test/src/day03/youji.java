package day03;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youji {
	WebDriver driver;
	String url="https://www.baidu.com/";
    @Before
    public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }
    /*
     * 1��ҳ��
     * 2��λ�������
     * 3����Ҽ�
     */
    @Test
    public void youjian() throws InterruptedException {
    	
    	driver.get(url);
    	//Thread.sleep(5000);
    	// 	WebElement input=driver.findElement(By.id("user"));
    	Actions a=new Actions(driver);
    	//a.contextClick(input).perform();
    	
    	/*WebElement input1=driver.findElement(By.className("wait"));
    	a.doubleClick(input1).perform();
    	Thread.sleep(5000);
    	
    	String b=driver.findElement(By.className("red")).getText();
			System.out.println("���ҳ���:"+b);*/
    	
/*    	//�ƶ����
    	WebElement yi=driver.findElement(By.className("over"));
        a.moveToElement(yi).perform();
        String aa=driver.findElement(By.id("over")).getText();
        System.out.println("վ���:"+aa);*/
/*    	WebElement yi1=driver.findElement(By.name("tj_briicon"));
    	a.moveToElement(yi1).perform();
    	driver.findElement(By.className("bdbriimgitem_1")).click();*/

    }

}
