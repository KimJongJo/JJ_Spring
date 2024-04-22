package edu.kh.project.board.controller;

import org.springframework.stereotype.Controller;

import edu.kh.project.board.model.service.BoardService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;
	
}
