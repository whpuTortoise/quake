package com.tortoise.quake.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tortoise.framework.util.JsonUtil;
import com.tortoise.quake.model.User;
import com.tortoise.quake.service.UserService;
import com.tortoise.quake.vo.page.PageRespVo;
import com.tortoise.quake.vo.page.UserPageReqVo;

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
	@PostMapping("/getUserList")
	public String getUserListPost(HttpServletRequest request, HttpServletResponse response, UserPageReqVo pageReqVo) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		if(!StringUtils.isEmpty(pageReqVo.getSearchUserName())){
			queryMap.put("username", pageReqVo.getSearchUserName());
		}
		if(!StringUtils.isEmpty(pageReqVo.getSearchTel())){
			queryMap.put("tel", pageReqVo.getSearchTel());
		}
		List<User> users = mUserService.queryList(queryMap, pageReqVo.getOffset(), pageReqVo.getLimit());
		int count = mUserService.count(queryMap);
		   
		PageRespVo<User> pageRespVo = new PageRespVo<User>();
		pageRespVo.setTotal(count);
		pageRespVo.setRows(users);
		return JsonUtil.toJson(pageRespVo);
	}
	
}
