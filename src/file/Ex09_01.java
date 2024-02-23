package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception{
		String path = "D:\\핀테크\\윤가영\\eclipse.java\\test\\test.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
	
		Ex09DTO dto = (Ex09DTO)ois.readObject();//객체를 가져온다 역직렬화()는 형전환
		// new연산대신 위에처럼 쓴다
		System.out.println("name : "+dto.getName());
		System.out.println("addr : "+dto.getAddr());
	}

}
