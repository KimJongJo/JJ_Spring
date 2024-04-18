package edu.kh.project.main.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.member.model.service.MemberService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@SessionAttributes({"loginMember"})
public class MainController {
	
	private final MemberService service;
	
	@RequestMapping("/")//   "/" 요청 매핑(method 가리지 않음)
	public String mainPage(Model model) {
		
		List<String> memberList = service.selectAll();
		
		model.addAttribute("memberList", memberList);

		// 접두사/접미사 제외
		return "common/main";
	}

	
	// LoginFilter -> loginError 리다이렉트
	// -> message 만들어서 메인 페이지로 리다이렉트
	@GetMapping("loginError")
	public String loginError(RedirectAttributes ra) {
		
		ra.addFlashAttribute("message", "로그인 후 이용해 주세요!");
		
		return "redirect:/";
	}


	
	
	
	

	
	
}
