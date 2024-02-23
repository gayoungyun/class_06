package file;

import java.io.Serializable;

import lombok.Data;

@Data
public class Ex09DTO implements Serializable{//직렬화
	private String name, addr;

}
