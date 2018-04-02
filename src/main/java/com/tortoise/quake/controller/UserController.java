package com.tortoise.quake.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tortoise.framework.util.JsonUtil;
import com.tortoise.quake.model.User;
import com.tortoise.quake.service.UserService;
import com.tortoise.quake.vo.PageReqVo;
import com.tortoise.quake.vo.PageRespVo;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserService mUserService;
	
	/**
	 * 用户管理跳转
	 * @param model
	 * @return
	 */
	@GetMapping("/manager")
	public String manager(Model model) {
		return "sys/user/userManager";
	}
	
	/**
	 * 获取用户列表
	 * @param request
	 * @return
	 */
	@ResponseBody
	@GetMapping("/getUserList")
	public String getUserList(HttpServletRequest request, HttpServletResponse response, PageReqVo pageReqVo) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		
		List<User> users = mUserService.queryList(queryMap, pageReqVo.getiDisplayStart(), pageReqVo.getiDisplayLength());
		int count = mUserService.count(queryMap);
		// 为操作次数加1，必须这样做 
		int initEcho = pageReqVo.getsEcho() + 1;
		   
		PageRespVo<User> pageRespVo = new PageRespVo<User>();
		pageRespVo.setsEcho(initEcho);
		pageRespVo.setiTotalRecords(count);
		pageRespVo.setiTotalDisplayRecords(count);
		pageRespVo.setAaData(users);
		return JsonUtil.toJson(pageRespVo);
	}
	
	/**
	 * 获取用户列表
	 * @param request
	 * @return
	 */
	@ResponseBody
	@PostMapping("/getUserList")
	public String getUserListPost(HttpServletRequest request, HttpServletResponse response, PageReqVo pageReqVo) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		Object s_username = request.getAttribute("s_username");
		Object s_realname = request.getAttribute("s_realname");
		Object s_telephone = request.getAttribute("s_telephone");
		if(s_username != null){
			queryMap.put("username", s_username.toString());
		}
		if(s_realname != null){
			queryMap.put("realName", s_realname.toString());
		}
		if(s_telephone != null){
			queryMap.put("tel", s_telephone.toString());
		}
		
		List<User> users = mUserService.queryList(queryMap, pageReqVo.getiDisplayStart(), pageReqVo.getiDisplayLength());
		int count = mUserService.count(queryMap);
		// 为操作次数加1，必须这样做 
		int initEcho = pageReqVo.getsEcho() + 1;
		   
		PageRespVo<User> pageRespVo = new PageRespVo<User>();
		pageRespVo.setsEcho(initEcho);
		pageRespVo.setiTotalRecords(count);
		pageRespVo.setiTotalDisplayRecords(count);
		pageRespVo.setAaData(users);
		return JsonUtil.toJson(pageRespVo);
	}
	
}
