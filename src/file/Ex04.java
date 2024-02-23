package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		Scanner input= new Scanner(System.in);
		String path = "D:\\핀테크\\윤가영\\eclipse.java\\test\\";
		
		System.out.println("파일명 입력");
		String fileName = input.next();
		
		File filePath = new File(path+fileName+".txt");
		
		if(filePath.exists()) {
			System.out.println("이미 존재하는 파일입니다");
		}else {
			FileOutputStream fos = new FileOutputStream(filePath);
			String msg;
			System.out.println("내용을 입력하세요");
			input.nextLine();// 위에 input.next();로해서 한번더 써줘야함
			msg = input.nextLine();// 라인은 공백까지 저장
			fos.write(msg.getBytes());// 문자 다른것으로 입력시 변경됨(다시 만드는, 기존내용 사라지고 새로운 내용)
			System.out.println("저장 되었습니다");
		}
		
	}

}
