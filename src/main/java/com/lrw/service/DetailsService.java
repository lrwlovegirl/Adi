package com.lrw.service;

import com.lrw.vo.Details;

public interface DetailsService {
  public boolean addDetails(Details vo) throws Exception;
  
  public Details findByOdid(int odid) throws Exception;
}
