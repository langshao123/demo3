package day04;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.Zip;

public class wenjian {
	
	@Test
	public void youji1() throws IOException {
		//��selenium����Ŀ¼
		//FileHandler.createDir(new File("e:\\seleniumtest"));
		
		//ĳ���ļ����ڵĶ���ȫ�����Ƶ�����һ���ļ�����
		//FileHandler.copy(new File("E:\\test"),new File("E:\\test1"),"s.jpg");
		
		//��seleniumɾ��Ŀ¼
		//FileHandler.delete(new File("E:\\test"));
		
		//��selenium�鿴�ļ�
		
		//String a=FileHandler.readAsString(new File("E:\\test\\sb.txt"));
		//System.out.println(a);
		
		//ѹ���ļ�
		String zip1="e:\\test.zip";
		
		//����һ��zip����
		Zip z=new Zip();
		
		//��ĳһ��Ŀ¼�ļ��ŵ�ѹ������ȥ
		//z.zip(new File("e:\\test"),new File (zip1));
		
		//�ж��Ƿ�Ϊѹ����
		System.out.println(FileHandler.isZipped(zip1));
		z.unzip(new File(zip1), new File("e:\\test1"));
		
		
		
		
		
	}

}
