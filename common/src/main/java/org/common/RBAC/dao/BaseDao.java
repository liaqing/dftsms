package org.common.RBAC.dao;

import java.util.List;
import java.io.Serializable;

/**
 * 定义了所有基本操作，具体的DAO组件继承该接口即可
 * @author fxb fanxiaobin.fxb@qq.com
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 根据ID加载实体
	 * 
	 * @param entityClazz
	 *            PO实体类型
	 * @param id
	 *            加载ID
	 * @return
	 */
	T get(Class<T> entityClazz, Serializable id);

	/**
	 * 保存实体
	 * 
	 * @param entity
	 *            PO实体
	 * @return
	 */
	Serializable save(T entity);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 *            PO实体
	 */
	void update(T entity);

	/**
	 * 删除实体
	 * 
	 * @param entity
	 *            PO实体
	 */
	void delete(T entity);

	/**
	 * 根据ID删除实体
	 * 
	 * @param entityClazz
	 *            PO实体类型
	 * @param id
	 */
	void delete(Class<T> entityClazz, Serializable id);

	/**
	 * 获取所有实体
	 * 
	 * @param entityClazz
	 *            PO实体类型
	 * @return
	 */
	List<T> findAll(Class<T> entityClazz);

	/**
	 * 获取实体总数
	 * 
	 * @param entityClazz
	 *            PO实体类型
	 * @return
	 */
	long findCount(Class<T> entityClazz);
}