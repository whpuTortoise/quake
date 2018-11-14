package com.tortoise.quake.model;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 角色名称
     **/
    private String roleName;

    /**
     * 角色编码
     **/
    private String roleCode;

    /**
     * 角色描述
     **/
    private String description;

    /**
     * 创建者
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

    
    public Role() {
    }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getRoleCode() {
		return roleCode;
	}


	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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