package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Itemtre;

public interface IItemtreDAO {
	/**
	 * 进行三级标题的添加
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public boolean doCreateItemtre(Itemtre vo) throws Exception;
	/**
	 * 进行三级菜单的删除
	 * @param irid 传过来的三级菜单的编号
	 * @return
	 * @throws Exception
	 */
	public boolean doRemoveItemtre(int irid) throws Exception;
	/**
	 * 进行三级菜单的更新
	 * @param vo 包含了irid,itid,title
	 * @return
	 * @throws Exception
	 */
	public boolean updateItemtre(Itemtre vo) throws Exception;
	/**
	 * 查询出所有的三级菜单
	 * @return
	 * @throws Exception
	 */
	public List<Itemtre> findAllItemtre() throws Exception;
	/**
	 * 根据编号查询出某个具体三级菜单
	 * @param irid
	 * @return
	 * @throws Exception
	 */
	public Itemtre findItemtreByIrid(int irid) throws Exception;
	/**
	 * 根据三级标题的编号查询出所有对应的三级标题
	 * @param itid
	 * @return
	 * @throws Exception
	 */
	public List<Itemtre> findItemtreByItid(int itid) throws Exception;
}
