package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Controller {
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("req() *******");
		log.info("****요청 & 응답****");
		for(int i=1; i<=10; i++) {
			System.out.println("data " + i);
		}
		return "응답요청 성공";
	}
}
