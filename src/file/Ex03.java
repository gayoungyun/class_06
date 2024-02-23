package file;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		String sPath = "c:/test/";
		File fPath = new File("D:\\핀테크\\윤가영\\eclipse.java\\abcd");
		fPath.mkdir();// 위 위치에 폴더생성
		fPath.delete();
		
		fPath = new File("D:\\핀테크\\윤가영\\eclipse.java");
		String[] s = fPath.list();
		
		System.out.println(s.length);// 개수
		for(String ss : s) {
			System.out.println(ss);
		}
		System.out.println(fPath.exists());// 해당위치존재 유무
		
				
	}
}
