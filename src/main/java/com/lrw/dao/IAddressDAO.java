package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Address;

public interface IAddressDAO {
  /**
   * 进行地址的增加操作
   * @param vo
   * @return
   * @throws Exception
   */
   public boolean doCreateAddress(Address vo) throws Exception;
   /**
    * 删除地址
    * @param aid 地址的编号
    * @return
    * @throws Exception
    */
   public boolean doRemoveAddress(int aid) throws Exception;
   /**
    * 更新地址，需要address，和aid
    * @param vo
    * @return
    * @throws Exception
    */
   public boolean updateAddress(Address vo) throws Exception;
   /**
    * 查询出某个用户下的所有地址
    * @return
    * @throws Exception
    */
   public List<Address> findAll(int mid) throws Exception;
   /**
    * 根据编号查询出某个地址
    * @param aid
    * @return
    * @throws Exception
    */
   public Address findByAid(int aid) throws Exception;
   
}
