package com.lrw.dao;

import com.lrw.vo.Details;

public interface IDetailsDAO {
	/**
	 * 当创建订单时，应该自动创建订单详情
	 * @param vo
	 * @return
	 * @throws Exception
	 */
  public boolean doCreateDetaisl(Details vo) throws Exception;
  /**
   * 用户点击某个订单时，查询出对应的订单详情
   * @param odid
   * @return
   * @throws Exception
   */
  public Details findByOdid(int odid) throws Exception;
}
