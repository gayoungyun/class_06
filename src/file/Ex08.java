package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) throws Exception{
		String path = "D:\\핀테크\\윤가영\\eclipse.java\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("안녕하세요");// 한글 직접적으로처리
		dos.writeInt(100);
		dos.writeDouble(1.111);
		dos.close();
		bos.close();
		fos.close();// 역순으로 닫아준다
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String msg= dis.readUTF();
		int num = dis.readInt();
		double dou = dis.readDouble();
		System.out.println(msg);
		System.out.println(num);
		System.out.println(dou);
				
	}

}
