package edu.kh.todo.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.todo.model.dto.Todo;

// @Mapper 어노테이션을 이용하기 위한 인터페이스

/* @Mapper
 * 
 * - 마이바티스 mapper와 연결된 인터페이스임을 명시
 * - mapper.xml파일의 namespace가 해당 인터페이스의 패키지명.클래스명으로 등록되어 있어야 한다.
 * 
 * - Mybatis 제공 어노테이션
 * - 해당 어노테이션이 작성된 인터페이스는
 *   namespace에 해당 인터페이스가 작성된
 *   mapper.xml 파일과 연결되어 SQL 호출/수행/결과
 *   반환 가능
 *   
 * - Mybatis에서 제공하는 Mapper 상속 객체 Bean으로 등록됨
 * 
 * */

@Mapper
public interface TodoMapper {

	/* Mapper의 메서드명 == mapper.xml 파일 내 태그의 id 와 같다
	 * 
	 * 메서드명과 id 가 같은 태그가 서로 연결됨
	 * 
	 * */
	
	
	/** 할 일 목록 조회
	 * @return todoList
	 */
	List<Todo> selectAll();

	
	/** 완료된 할 일 개수 조회
	 * @return completeCount
	 */
	int getCompleteCount();

	
	/** 할 일 추가
	 * @param todo
	 * @return result
	 */
	int addTodo(Todo todo);

	
	/** 할 일 상세 조회
	 * @param todo
	 * @return todo
	 */
	Todo todoDetail(int todoNo);

	
	/** 완료 여부 변경
	 * @param todo
	 * @return result
	 */
	int changeComplete(Todo todo);


	/** 할 일 수정
	 * @param todo
	 * @return result
	 */
	int todoUpdate(Todo todo);


	/** 할 일 삭제
	 * @param todoNo
	 * @return result
	 */
	int todoDelete(int todoNo);

}
