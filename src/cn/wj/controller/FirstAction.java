package cn.wj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstAction {

	//去系统首页
	@RequestMapping("/first")
	public String first(Model model){
		return "/first";
	}
	//欢迎页
	@RequestMapping("/welcome")
	public String welcome(Model model){
		return "/welcome";
	}
}
