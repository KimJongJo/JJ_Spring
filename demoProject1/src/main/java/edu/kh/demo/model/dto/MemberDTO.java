package edu.kh.demo.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Lombok : 자주 사용하는 코드를 컴파일 시 자동 완성 해주는 라이브러리
// -> DTO(기본생성자, getter/setter, toString), + Log

@Getter	// getter 자동완성
@Setter	// setter 자동완성
@NoArgsConstructor	// 기본 생성자
@ToString	// toString
public class MemberDTO {

	// name의 속성값과 같은 이름의 매개변수 만들기
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
}
