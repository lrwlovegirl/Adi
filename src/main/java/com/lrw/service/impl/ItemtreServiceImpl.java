package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IItemtreDAO;
import com.lrw.dao.IItemtwoDAO;
import com.lrw.service.ItemtreService;
import com.lrw.service.ItemtwoService;
import com.lrw.vo.Itemtre;
import com.lrw.vo.Itemtwo;
@Service
public class ItemtreServiceImpl implements ItemtreService {
    @Resource
	private IItemtreDAO itemtredao;
	public boolean addItemtre(Itemtre vo) throws Exception {
		return this.itemtredao.doCreateItemtre(vo);
	}

	public boolean deleteItemtre(int irid) throws Exception {
		return this.itemtredao.doRemoveItemtre(irid);
	}

	public boolean updateItemtre(Itemtre vo) throws Exception {
		return this.itemtredao.updateItemtre(vo);
	}

	public List<Itemtre> list() throws Exception {
		return this.itemtredao.findAllItemtre();
	}

	public Itemtre findByIrid(int irid) throws Exception {
        return this.itemtredao.findItemtreByIrid(irid);
	 }

	public List<Itemtre> listByItid(int itid) throws Exception {
		return this.itemtredao.findItemtreByItid(itid);
	}
   
	

}
