package edu.kh.project.member.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MemberMapper {

	/** 로그인 SQL 실행
	 * @param memberEmail
	 * @return loginMember
	 */
	Member login(String memberEmail);


	/** 이메일 중복검사
	 * @param memberEmail
	 * @return count
	 */
	int checkEmail(String memberEmail);

	/** 닉네임 중복검사
	 * @param inputNickname
	 * @return result
	 */
	int checkNickname(String inputNickname);


	/** 회원 가입 SQL 실행
	 * @param inputMember
	 * @return result
	 */
	int signup(Member inputMember);


	/** 전체 회원 빠른 로그인 만들기
	 * @return memberlist
	 */
	List<String> selectAll();


	/** 전체 회원 조회
	 * @return memberList
	 */
	List<Member> memberList();


	/** 비밀번호 버튼 변경
	 * @param memberNo
	 * @return result
	 */
	int resetPassword(Member member);


	/** 회원 탈퇴 변경
	 * @param memberNo
	 * @return result
	 */
	int restoration(int memberNo);


	/** 비밀번호 초기화
	 * @param map
	 * @return result
	 */
	int resetPw(Map<String, Object> map);


}
