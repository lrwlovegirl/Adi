package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IAddressDAO;
import com.lrw.service.AddressService;
import com.lrw.vo.Address;
@Service
public class AddressServiceImpl implements AddressService {
    @Resource
	private IAddressDAO addressdao;
	public boolean addAddress(Address vo) throws Exception {
		
		return addressdao.doCreateAddress(vo);
	}

	public boolean deleteAddress(int aid) throws Exception {
          return addressdao.doRemoveAddress(aid);
	}

	public List<Address> list(int mid) throws Exception {
		return addressdao.findAll(mid);
	}

	public boolean updateAddress(Address vo) throws Exception {
		return addressdao.updateAddress(vo);
	}

	public Address findByAid(int aid) throws Exception {
		return addressdao.findByAid(aid);
	}

}
