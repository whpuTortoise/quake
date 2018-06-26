package com.tortoise.quake.model;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public Menu() {
    
    }

    private Integer id;

    /**
     * 菜单名称
     **/
    private String menuName;

    /**
     * 菜单编码
     **/
    private String menuCode;

    /**
     * 菜单图标
     **/
    private String menuIcon;

    /**
     * 跳转url
     **/
    private String targetUrl;

    /**
     * 菜单层级
     **/
    private Integer menuLevel;

    /**
     * 父级菜单ID
     **/
    private Integer menuPid;

    /**
     * 创建人
     **/
    private String createId;

    /**
     * 创建时间
     **/
    private Date createTime;

    /**
     * 更新人
     **/
    private String updateId;

    /**
     * 更新时间
     **/
    private Date updateTime;

    /**
     * 是否删除
     **/
    private Integer isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public Integer getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(Integer menuLevel) {
		this.menuLevel = menuLevel;
	}

	public Integer getMenuPid() {
		return menuPid;
	}

	public void setMenuPid(Integer menuPid) {
		this.menuPid = menuPid;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
  
    
    
}