package edu.kh.project.member.model.service;

import java.util.List;

import edu.kh.project.member.model.dto.Member;

public interface MemberService {

	/** 로그인 서비스
	 * @param inputMember
	 * @return loginMember
	 */
	Member login(Member inputMember);

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

	/** 회원 가입 서비스
	 * @param inputMember
	 * @param memberAddress
	 * @return result
	 */
	int signup(Member inputMember, String[] memberAddress);

	/** 전체 회원 빠른 로그인 만들기
	 * @return memberList
	 */
	List<String> selectAll();

	
	/** 이메일로 빠른 로그인
	 * @param loginEmail
	 * @return result
	 */
	Member selectOne(String loginEmail);

	/** 빠른 로그인
	 * @param memberEmail
	 * @return loginMember
	 */
	Member quickLogin(String memberEmail);

	/** 전체 회원 정보 조회
	 * @return memberList
	 */
	List<Member> memberList();

	/** 비밀번호 변경 버튼
	 * @param memberNo
	 * @return result
	 */
	int resetPassword(int memberNo);

	/** 회원 탈퇴 복구
	 * @param memberNo
	 * @return result
	 */
	int restoration(int memberNo);

	
	/** 비밀번호 초기화
	 * @param inputNo
	 * @return result
	 */
	int resetPw(int inputNo);
	
}

