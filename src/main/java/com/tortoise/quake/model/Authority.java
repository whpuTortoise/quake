package com.tortoise.quake.model;

import java.io.Serializable;

public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 角色ID
     **/
    private String roleCode;

    /**
     * 菜单ID
     **/
    private String menuCode;

    
    public Authority() {
    }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRoleCode() {
		return roleCode;
	}


	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}


	public String getMenuCode() {
		return menuCode;
	}


	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
   

}