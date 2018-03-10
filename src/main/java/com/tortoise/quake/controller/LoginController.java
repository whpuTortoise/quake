package com.tortoise.quake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tortoise.quake.service.MenuService;
import com.tortoise.quake.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MenuService menuService;

	/**
	 * 登录跳转
	 * @param model
	 * @return
	 */
	@GetMapping("/login")
	public String toLogin(Model model) {
		return "sys/login";
	}
	
	/**
	 * 首页
	 * @param model
	 * @return
	 */
	@GetMapping("/index")
	public String toIndex(Model model) {
		model.addAttribute("menus", menuService.getMenuTree());
		return "sys/index";
	}

//	/**
//	 * 登录
//	 * 
//	 * @param admin
//	 * @param model
//	 * @param httpSession
//	 * @return
//	 */
//	@PostMapping("/login")
//	public String loginPost(User user, Model model, HttpSession httpSession) {
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("username", user.getUsername());
//		param.put("password", user.getPassword());
//		User currentUser = userService.selectOne(param);
//		if (currentUser != null) {
//			httpSession.setAttribute("currentUser", currentUser);
//			return "redirect:index";
//		} else {
//			model.addAttribute("error", "用户名或密码错误，请重新登录！");
//			return "login";
//		}
//	}

	
	
}
