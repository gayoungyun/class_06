package my_lombok;

import lombok.*;
/*
@Setter
@Getter
@ToSring
@NoArgsConstructor
@AllArgsConstructor
*/
@Data
@AllArgsConstructor// 모든값을 받아주는 생성자
@NoArgsConstructor//기본생성자를 위해
public class MainDTO {
	private String name;
	private int age;
}
