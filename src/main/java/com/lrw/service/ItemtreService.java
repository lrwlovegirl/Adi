package com.lrw.service;



import java.util.List;

import com.lrw.vo.Itemtre;



public interface ItemtreService {
  public boolean addItemtre(Itemtre vo) throws Exception;
  
  public boolean deleteItemtre(int irid) throws Exception;
  
  public boolean updateItemtre(Itemtre vo) throws Exception;
  
  public List<Itemtre> list() throws Exception;
  
  public Itemtre findByIrid(int irid) throws Exception;
  
  public List<Itemtre> listByItid(int itid) throws Exception;
}
