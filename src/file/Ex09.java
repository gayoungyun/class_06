package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		Ex09DTO dto = new Ex09DTO();
		dto.setName("홍길동");
		dto.setAddr("산골자기");//바이트형식 저장
		
		String path = "D:\\핀테크\\윤가영\\eclipse.java\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(dto);
		
		oos.close();
		bos.close();
		fos.close();
		
	}
}
