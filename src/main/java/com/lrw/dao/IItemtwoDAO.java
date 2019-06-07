package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Itemone;
import com.lrw.vo.Itemtwo;

public interface IItemtwoDAO {
	/**
	 * 进行二级标题的添加
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public boolean doCreateItemtwo(Itemtwo vo) throws Exception;
	/**
	 * 进行二级菜单的删除
	 * @param ioid 传过来的一级菜单的编号
	 * @return
	 * @throws Exception
	 */
	public boolean doRemoveItemtwo(int itid) throws Exception;
	/**
	 * 进行二级菜单的更新
	 * @param vo 包含ioid 和 title
	 * @return
	 * @throws Exception
	 */
	public boolean updateItemtwo(Itemtwo vo) throws Exception;
	/**
	 * 查询出所有的二级菜单
	 * @return
	 * @throws Exception
	 */
	public List<Itemtwo> findAllItemtwo() throws Exception;
	/**
	 * 根据编号查询出某个具体二级菜单
	 * @param ioid
	 * @return
	 * @throws Exception
	 */
	public Itemtwo findItemtwoByItid(int itid) throws Exception;
	/**
	 * 根据一级标题的编号查询出所有对应的二级标题
	 * @param ioid
	 * @return
	 * @throws Exception
	 */
	public List<Itemtwo> findItemtwoByIoid(int ioid) throws Exception;
}
