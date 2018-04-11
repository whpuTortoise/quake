package com.tortoise.quake.vo;

import java.util.List;

public class PageRespVo<T> {
	//数据总条数 
	private Integer total;
	//数据
	private List<T> aoData;
	
	public List<T> getAoData() {
		return aoData;
	}
	public void setAoData(List<T> aoData) {
		this.aoData = aoData;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	
	
	
}
