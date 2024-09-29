package com.slm.librarysystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slm.librarysystem.model.Info;

@Controller
public class IndexController {

	@GetMapping("/")
	public String indexPage(Model model) {
		List<String> list = new ArrayList<>();
		list.add("中央図書館 ガラスケース展示「夢みる女性誌展（6～7月）」");
		list.add("推し活企画】「店主の本棚」6月は、カレー屋の「インディアンラソイ」さん");
		list.add("文庫本ぷちリサイクル」を実施します");
		model.addAttribute("list",list);
		return "index";
	}

	
	@GetMapping("/showCategory")
	public String showCategory() {
		return "category";
	}
	
	@GetMapping("/logout")
	public String loginPage() {
		return "login";
	}
}
