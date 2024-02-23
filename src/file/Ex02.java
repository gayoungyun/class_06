package file;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		String path= "D:\\핀테크\\윤가영\\eclipse.java\\test\\test2.txt";
		System.out.println(path);
		
		FileOutputStream fos = new FileOutputStream(path);//클래스이름이다름(기능다름)
		
		System.out.println("출력할 내용입력");
		String name = input.next();
		
		fos.write(name.getBytes());
		System.out.println("저장되었습니다");
	}

}
