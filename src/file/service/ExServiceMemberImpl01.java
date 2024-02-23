package file.service;

import java.util.Scanner;

import file.dao.ExDAO01;
import file.dto.ExDTO01;

public class ExServiceMemberImpl01 implements ExServiceMember01{
	private ExDAO01 dao;
	public ExServiceMemberImpl01() {
		dao = new ExDAO01();
	}
	public void register() {
		ExDTO01 dto = new ExDTO01();
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		dto.setId(sc.next());
		System.out.println("주소 입력");
		dto.setAddr(sc.next());

		dao.register(dto);
	}
	public void list() {
		String[] listFile = dao.getList();
		if(listFile.length == 0) {
			System.out.println("존재하지 않는 이름입니다!");
		}else {
			for(int i = 0; i<listFile.length; i++) {
				System.out.println(i+1+"."+listFile[i]);
			}
		}
	}
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("삭제할 id 입력");
		id = sc.next();
		dao.delete(id);
	}
	public void search(){
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("검색할 이름 입력");
		id = sc.next();
		ExDTO01 d= dao.search(id);
		if(d != null) {
			System.out.println("이름 입력 : "+d.getId());
			System.out.println("주소 입력 : "+d.getAddr());
		}
	}
}






