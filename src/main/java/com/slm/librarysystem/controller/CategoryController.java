package com.slm.librarysystem.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CategoryController {

	@GetMapping("/showCategory")
	public String showCategory() {
		return "category";
	}

}
