package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Goods;

public interface IGoodsDAO {
	/**
	 * 进行商品的增加
	 * @param vo，包括一级菜单，二级菜单，三级菜单，商品名称，具体描述，创建日期，价格，库存，照片
	 * @return
	 * @throws Exception
	 */
   public boolean doCreateGood(Goods vo) throws Exception;
  
    /**
     * 根据编号更新某件商品的信息   
     * @param vo
     * @return
     * @throws Exception
     */
   public boolean updateGoods(Goods vo) throws Exception;
   /**
    * 查询出所有的商品信息，包括商品编号，一级菜单，二级菜单，三级菜单，商品名称，具体描述，创建日期，价格，库存，照片
    * ，上架状态
    * @return
    * @throws Exception
    */
   public List<Goods> findAllGoods() throws Exception;
   /**
    * 查询出所有的上架商品信息
    * @return
    * @throws Exception
    */
   public List<Goods> findAllAllowGoods() throws Exception;
   /**
    * 查询出所有的下架商品信息
    * @return
    * @throws Exception
    */
   public List<Goods> findAllBanGoods()throws Exception;
   
   /**
    * 根据编号查询出某件商品
    * @param gid 
    * @return 包含商品编号，一级菜单，二级菜单，三级菜单，商品名称，具体描述，创建日期，价格，库存，照片
    * ，上架状态
    * @throws Exception
    */
   public Goods findById(int gid) throws Exception;
   /**
    * 根据id，将某件商品下架，就是将status改为1
    * @param gid
    * @return
    * @throws Exception
    */
   public boolean changeStatusToBan(int gid) throws Exception;
   /**
    * 根据id，将某件商品上架
    * @param gid
    * @return
    * @throws Exception
    */
   public boolean changeStatusToAllow(int gid) throws Exception;
   /**
    * 根据id，修改商品的库存量
    * @param gid
    * @param count 减少以后的库存
    * @return
    * @throws Exception
    */
   public boolean changeCount(int gid,int count) throws Exception;
}
