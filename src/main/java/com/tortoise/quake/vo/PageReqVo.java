package com.tortoise.quake.vo;

/**
 * datatable分页查询入参
 * @author wangzhi
 *
 */
public class PageReqVo {
	// 记录操作的次数 每次加1 
	private Integer sEcho;
	//起始
	private Integer iDisplayStart; 
	//长度
	private Integer iDisplayLength;
	
	public Integer getsEcho() {
		return sEcho;
	}
	public void setsEcho(Integer sEcho) {
		this.sEcho = sEcho;
	}
	public Integer getiDisplayStart() {
		return iDisplayStart;
	}
	public void setiDisplayStart(Integer iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}
	public Integer getiDisplayLength() {
		return iDisplayLength;
	}
	public void setiDisplayLength(Integer iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}
	
	
	
}
