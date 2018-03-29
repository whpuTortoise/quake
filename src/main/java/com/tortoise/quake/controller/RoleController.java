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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tortoise.framework.util.JsonUtil;
import com.tortoise.quake.model.Role;
import com.tortoise.quake.service.RoleService;
import com.tortoise.quake.vo.PageReqVo;
import com.tortoise.quake.vo.PageRespVo;

@RequestMapping("/role")
@Controller
public class RoleController {
	@Autowired
	private RoleService mRoleService;
	
	/**
	 * 角色管理跳转
	 * @param model
	 * @return
	 */
	@GetMapping("/manager")
	public String manager(Model model) {
		return "sys/role/roleManager";
	}
	
	/**
	 * 获取角色列表
	 * @param request
	 * @return
	 */
	@ResponseBody
	@GetMapping("/getRoleList")
	public String getRoleList(HttpServletRequest request, HttpServletResponse response, PageReqVo pageReqVo) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		List<Role> roles = mRoleService.queryList(queryMap, pageReqVo.getiDisplayStart(), pageReqVo.getiDisplayLength());
		int count = mRoleService.count(queryMap);
		// 为操作次数加1，必须这样做 
		int initEcho = pageReqVo.getsEcho() + 1;
		   
		PageRespVo<Role> pageRespVo = new PageRespVo<Role>();
		pageRespVo.setsEcho(initEcho);
		pageRespVo.setiTotalRecords(count);
		pageRespVo.setiTotalDisplayRecords(count);
		pageRespVo.setAaData(roles);
		return JsonUtil.toJson(pageRespVo);
	}
	
	
}
