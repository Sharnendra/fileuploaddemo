package com.example.filedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FileController {
	
	@GetMapping("/filing")
	public ModelAndView hi()
	{
		return new ModelAndView("index");
	}  

}
