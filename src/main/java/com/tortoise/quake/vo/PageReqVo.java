package com.tortoise.quake.vo;

/**
 * datatable分页查询入参
 * @author wangzhi
 *
 */
public class PageReqVo {
	
		// 每页多少条数据
		private Integer limit;
		//起始
		private Integer offset; 
		
		private String name;
		public Integer getLimit() {
			return limit;
		}
		public void setLimit(Integer limit) {
			this.limit = limit;
		}
		
		public Integer getOffset() {
			return offset;
		}
		public void setOffset(Integer offset) {
			this.offset = offset;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		
		
	
	
	
	
}
