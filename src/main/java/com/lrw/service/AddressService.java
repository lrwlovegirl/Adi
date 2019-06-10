package com.lrw.service;

import java.util.List;

import com.lrw.vo.Address;

public interface AddressService {
   public boolean addAddress(Address vo) throws Exception;
   
   public boolean deleteAddress(int aid) throws Exception;
   
   public List<Address> list(int mid) throws Exception;
   
   public boolean updateAddress(Address vo) throws Exception;
   
   public Address findByAid(int aid) throws Exception;
}
