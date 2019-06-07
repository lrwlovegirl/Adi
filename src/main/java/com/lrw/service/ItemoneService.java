package com.lrw.service;



import java.util.List;

import com.lrw.vo.Itemone;


public interface ItemoneService {
  public boolean addItemone(Itemone vo) throws Exception;
  
  public boolean deleteItemone(int ioid) throws Exception;
  
  public boolean updateItemone(Itemone vo) throws Exception;
  
  public List<Itemone> list() throws Exception;
  
  public Itemone findById(int ioid) throws Exception;
}
