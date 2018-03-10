package com.tortoise.framework.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.tortoise.framework.paginter.domain.PageBounds;

/**
 * BaseMapper 基础接口
 * 
 * @param <T>
 *            Model对象
 * 
 * @author chensheng
 */
public interface BaseMapper<T> {

	/**
	 * 根据ID删除
	 */
	int deleteById(Long id);

	/**
	 * 新增
	 */
	int insertAllField(T record);

	/**
	 * 新增 (如果为空,插入默认值)
	 */
	int insert(T record);

	/**
	 * 数量查询
	 */
	@SuppressWarnings("rawtypes")
	int count(Map params);

	/**
	 * 列表查询
	 */
	@SuppressWarnings("rawtypes")
	List<T> select(Map params);

	/**
	 * 列表查询
	 */
	List<T> select(T params);

	/**
	 * 分页查询
	 */
	@SuppressWarnings("rawtypes")
	List select(Map params, PageBounds page);

	/**
	 * 分页查询
	 */
	@SuppressWarnings("rawtypes")
	List select(Object object, PageBounds page);

	/**
	 * 分页查询
	 */
	@SuppressWarnings("rawtypes")
	List select(Map params, RowBounds page);

	/**
	 * 根据主键查询
	 */
	T selectById(Long id);

	/**
	 * 更新(如果对象属性为空,不更新)
	 */
	int update(T record);

	/**
	 * 更新
	 */
	int updateAllField(T record);

	/**
	 * 批量插入
	 */
	int batchInsert(List<T> list);

	/**
	 * 批量插入或更新
	 */
	int batchInsertOrUpdate(List<T> list);

	/**
	 * 批量删除
	 */
	@SuppressWarnings("rawtypes")
	int batchDelete(List ids);
}
