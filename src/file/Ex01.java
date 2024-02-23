package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		File path = new File("D:\\핀테크\\윤가영\\eclipse.java\\test\\test.txt");
		FileOutputStream fos= new FileOutputStream(path);//출력개체
		fos.write(97);
		fos.write('a');//문자하나 저장기능
		fos.write("test".getBytes());// 문자를 받기위해 getbyte, stream 연결통로 
	}

}
