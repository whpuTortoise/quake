package com.tortoise.quake.vo;

import java.util.List;

public class PageRespVo<T> {
	private Integer sEcho;
	//数据总条数 
	private Integer iTotalRecords;
	//显示的条数 
	private Integer iTotalDisplayRecords;
	//数据
	private List<T> aaData;
	public Integer getsEcho() {
		return sEcho;
	}
	public void setsEcho(Integer sEcho) {
		this.sEcho = sEcho;
	}
	public Integer getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(Integer iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public Integer getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
	public List<T> getAaData() {
		return aaData;
	}
	public void setAaData(List<T> aaData) {
		this.aaData = aaData;
	}
	
	
	
	
}
