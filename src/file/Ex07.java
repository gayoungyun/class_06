package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) throws Exception{
		String path = "D:\\핀테크\\윤가영\\eclipse.java\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(char ch= '0'; ch<='9'; ch++) {
			Thread.sleep(1);
			//fos.write(ch);
			bos.write(ch);//파일전송 명령어로 따로 써야한다
		}
		bos.flush();// 저장값을 파일로 보내는것, 데이터를 한번에 보낸다
		bos.write('a');// 위에 연결통로가 유지되고있어서
		bos.close();// 연결통로 끊고 데이터도 전송
		bos.write('b');// 더이상 작동x
		bos.close();
		
		fos.close();
	}

}
