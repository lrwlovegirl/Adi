package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IItemoneDAO;
import com.lrw.service.ItemoneService;
import com.lrw.vo.Itemone;
@Service
public class ItemoneServiceImpl implements ItemoneService {
     @Resource
	private IItemoneDAO itemdao;
	
	public boolean addItemone(Itemone vo) throws Exception {
		return this.itemdao.doCreateItemone(vo);
	}

	public boolean deleteItemone(int ioid) throws Exception {
		return this.itemdao.doRemoveItemone(ioid);
				
	}

	public boolean updateItemone(Itemone vo) throws Exception {
		return this.itemdao.updateItemone(vo);
	}

	public List<Itemone> list() throws Exception {
		return this.itemdao.findAllItemone();
	}

	public Itemone findById(int ioid) throws Exception {
		
		return this.itemdao.findItemoneById(ioid);
	}

}
