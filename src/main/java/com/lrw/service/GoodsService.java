package com.lrw.service;

import java.util.List;

import com.lrw.vo.Goods;

public interface GoodsService {
  public boolean addGoods(Goods vo) throws Exception;
  
  public boolean updateGoods(Goods vo) throws Exception;
  
  public List<Goods> list() throws Exception;
  
  public List<Goods> listAllAllowGoods() throws Exception;
  
  public List<Goods> listAllBanGoods() throws Exception;
  
  public Goods findById(int gid) throws Exception;
  
  public boolean changeStatusToBan(int gid) throws Exception;
  
  public boolean changeStatusToAllow(int gid) throws Exception;
  
  public boolean changeGoosCount(int gid,int count) throws Exception;
  
  
  
}
