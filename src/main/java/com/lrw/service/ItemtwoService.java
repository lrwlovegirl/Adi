package com.lrw.service;



import java.util.List;
import com.lrw.vo.Itemtwo;


public interface ItemtwoService {
  public boolean addItemtwo(Itemtwo vo) throws Exception;
  
  public boolean deleteItemtwo(int itid) throws Exception;
  
  public boolean updateItemtwo(Itemtwo vo) throws Exception;
  
  public List<Itemtwo> list() throws Exception;
  
  public Itemtwo findByItid(int itid) throws Exception;
  
  public List<Itemtwo> listByIoid(int ioid) throws Exception;
}
