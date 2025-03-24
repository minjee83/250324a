package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("fisa1")
public String reqRes() {
	System.out.println("req() *******");
	return "응답요청 성공";
}
}
