package cn.wj.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wj.bean.ActiveUser;

@Controller
public class FirstAction {

	@RequestMapping("/first")
	public String first(Model model){
		//从shiro中取activeUser
		Subject subject=SecurityUtils.getSubject();
		//取出身份信息
		ActiveUser activeUser=(ActiveUser) subject.getPrincipal();
		model.addAttribute("activeUser",activeUser);
		return "/first";
	}
	@RequestMapping("/welcome")
	public String welcome(Model model){
		return "/welcome";
	}
}
