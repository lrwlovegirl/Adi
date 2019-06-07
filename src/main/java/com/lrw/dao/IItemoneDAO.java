package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Itemone;

public interface IItemoneDAO {
	/**
	 * 进行一级标题的添加
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public boolean doCreateItemone(Itemone vo) throws Exception;
	/**
	 * 进行一级菜单的删除
	 * @param ioid 传过来的一级菜单的编号
	 * @return
	 * @throws Exception
	 */
	public boolean doRemoveItemone(int ioid) throws Exception;
	/**
	 * 进行一级菜单的更新
	 * @param vo 包含ioid 和 title
	 * @return
	 * @throws Exception
	 */
	public boolean updateItemone(Itemone vo) throws Exception;
	/**
	 * 查询出所有的一级菜单
	 * @return
	 * @throws Exception
	 */
	public List<Itemone> findAllItemone() throws Exception;
	/**
	 * 根据编号查询出某个具体菜单
	 * @param ioid
	 * @return
	 * @throws Exception
	 */
	public Itemone findItemoneById(int ioid) throws Exception;
	
}
