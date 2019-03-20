package day04;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.Zip;

public class wenjian {
	
	@Test
	public void youji1() throws IOException {
		//用selenium创建目录
		//FileHandler.createDir(new File("e:\\seleniumtest"));
		
		//某个文件夹内的东西全部复制到另外一个文件夹中
		//FileHandler.copy(new File("E:\\test"),new File("E:\\test1"),"s.jpg");
		
		//用selenium删除目录
		//FileHandler.delete(new File("E:\\test"));
		
		//用selenium查看文件
		
		//String a=FileHandler.readAsString(new File("E:\\test\\sb.txt"));
		//System.out.println(a);
		
		//压缩文件
		String zip1="e:\\test.zip";
		
		//声明一个zip对象
		Zip z=new Zip();
		
		//把某一个目录文件放到压缩包里去
		//z.zip(new File("e:\\test"),new File (zip1));
		
		//判断是否为压缩包
		System.out.println(FileHandler.isZipped(zip1));
		z.unzip(new File(zip1), new File("e:\\test1"));
		
		
		
		
		
	}

}
