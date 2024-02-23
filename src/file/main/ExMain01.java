package file.main;

import java.util.Scanner;

import file.service.ExServiceMember01;
import file.service.ExServiceMemberImpl01;

public class ExMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		ExServiceMember01 member = new ExServiceMemberImpl01();
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 검색");
			System.out.println("3. 회원 목록 보기");
			System.out.println("4. 탙퇴");
			System.out.println("5. 종료");
			System.out.println("==>> : ");
			num= sc.nextInt();
			switch(num) {
			case 1 : 
				member.register();
				break;
			case 2 :
				member.search();
				break;
			case 3 : 
				member.list();
				break;
			case 4 : 
				member.delete();
				break;
			case 5 : 
				System.out.println("종료합니다");
				return;
			}
					
		}
	}

}
