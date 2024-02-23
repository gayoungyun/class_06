package my_lombok;

public class MainClass {
	public static void main(String[] args) {
		MainDTO d = new MainDTO();
		d.setName("홍길동");
		d.setAge(20);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d);
	}

}
