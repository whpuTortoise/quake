package com.tortoise.quake.model;

import java.io.Serializable;
import java.util.Date;

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 部门名称
     **/
    private String departmentName;

    /**
     * 部门编码
     **/
    private String departmentCode;
    /**
     * 部门等级
     */
    private Integer departmentLevel;
    /**
     * 部门父ID
     */
    private Integer departmentPid;

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
    
    public Department() {
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Integer getDepartmentLevel() {
		return departmentLevel;
	}

	public void setDepartmentLevel(Integer departmentLevel) {
		this.departmentLevel = departmentLevel;
	}

	public Integer getDepartmentPid() {
		return departmentPid;
	}

	public void setDepartmentPid(Integer departmentPid) {
		this.departmentPid = departmentPid;
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