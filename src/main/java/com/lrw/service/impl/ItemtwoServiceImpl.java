package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IItemtwoDAO;
import com.lrw.service.ItemtwoService;
import com.lrw.vo.Itemtwo;
@Service
public class ItemtwoServiceImpl implements ItemtwoService {
   @Resource
	private IItemtwoDAO iitemtwodao;
	
	public boolean addItemtwo(Itemtwo vo) throws Exception {
		return this.iitemtwodao.doCreateItemtwo(vo);
	}

	public boolean deleteItemtwo(int itid) throws Exception {
		return this.iitemtwodao.doRemoveItemtwo(itid);
	}

	public boolean updateItemtwo(Itemtwo vo) throws Exception {
		return this.iitemtwodao.updateItemtwo(vo);
	}

	public List<Itemtwo> list() throws Exception {
        return this.iitemtwodao.findAllItemtwo();
	 }

	public Itemtwo findByItid(int itid) throws Exception {
           return this.iitemtwodao.findItemtwoByItid(itid);
	 }

	public List<Itemtwo> listByIoid(int ioid) throws Exception {
		return this.iitemtwodao.findItemtwoByIoid(ioid);
	}
	

}
