package my_lombok;//dto의 메소드를 편하게 만듦
class Ex01DTO{
	String name;
	int age;
	public Ex01DTO() {}
	public Ex01DTO(String name, int ate) {
		this.name = name; this.age = age;
		
	}
	@Override
	public String toString() {
		return "Ex01ETO = [name : "+name+"]";
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Ex01DTO dto = new Ex01DTO("홍길동", 20);
		System.out.println(dto);
		
	}

}
