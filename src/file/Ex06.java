package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String path = "D:\\핀테크\\윤가영\\eclipse.java\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path, true);
		//true : 현재 파일이 없으면 새롭게 만든가
		// 파일이 있으면 기존내용 유지하면서 추가
		fos.write('c');
		fos.close();// 메모리 효율
		fos = new FileOutputStream(path, true);// close이후에 하려면 객체 추가
		fos.write('d');
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		int re =fis.read();//값을 가져온다
		System.out.println((char)re);// char안하면 b를 숫자로 가져옴
		//마지막이 음수라면 저장값이 없을때
		while (true) {
			re= fis.read();
			if(re<0) {
				System.out.println("내용이 없습니다 : "+re);
				break;
			}
			System.out.println((char)re);
		}
		fis.close();
	}

}
