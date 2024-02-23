package file;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		int num;
		while(true) {
			try {// 에러가 나도 실행 되게 하기위해서
				System.out.println("수 입력");
				num = input.nextInt();
				System.out.println("입력값 : "+num);
			}catch(Exception e) {
				s1 = input.nextLine();// return값 필요하면 s1 = 써줌
				System.err.println(s1+"수 입력하세요");
			}
		}
		/*
		System.out.println("1. 문자열 입력");
		s1 = input.next();
		System.out.println("2. 문자열 입력");
		input.nextLine();// enter값을 입력받기 위해서
		s2 = input.nextLine();
		System.out.println("s1 : "+s1+"sss111");
		System.out.println("s2 : "+s2+"sss222");
		 */
	}

}
