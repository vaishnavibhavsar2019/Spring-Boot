package com.anudip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Page {
	@RequestMapping("/link")
	public String link()
	{
		return "<body bgcolor='black'><h1><center><a href='https://aln.anudip.org/' style='color:red'>https://aln.anudip.org/</a></center></h1><body>";
	}

}
