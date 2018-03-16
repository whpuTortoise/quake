package com.tortoise.quake.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tortoise.framework.service.BaseService;
import com.tortoise.quake.dao.MenuMapper;
import com.tortoise.quake.model.Menu;
import com.tortoise.quake.vo.MenuVo;

@Service
public class MenuService extends BaseService<Menu, MenuMapper> {

	@Autowired
	public void setMapper(MenuMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<MenuVo> getMenuTree(){
		List<Menu> menus = queryAll();
		
		List<MenuVo> menuVos = new ArrayList<MenuVo>();
		for(Menu menu : menus){
			if(menu.getPid() == 0){
				MenuVo menuVo = new MenuVo();
				BeanUtils.copyProperties(menu, menuVo);
				menuVo.setChildren(getChildren(menus, menuVo.getId()));
				menuVos.add(menuVo);
			}
		}
		
		return menuVos;
	}
	
	private List<MenuVo> getChildren(List<Menu> menus, Long pId){
		List<MenuVo> menuVos = new ArrayList<MenuVo>();
		for(Menu menu : menus){
			if(menu.getPid() == pId){
				MenuVo menuVo = new MenuVo();
				BeanUtils.copyProperties(menu, menuVo);
				menuVo.setChildren(getChildren(menus, menuVo.getId()));
				menuVos.add(menuVo);
			}
		}
		return menuVos;
	}
	

}
