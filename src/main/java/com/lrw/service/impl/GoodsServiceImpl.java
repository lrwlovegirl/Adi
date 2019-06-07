package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IGoodsDAO;
import com.lrw.service.GoodsService;
import com.lrw.vo.Goods;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private IGoodsDAO goodsdao;
	
	public boolean addGoods(Goods vo) throws Exception {
		return this.goodsdao.doCreateGood(vo);
	}

	public boolean updateGoods(Goods vo) throws Exception {
        return this.goodsdao.updateGoods(vo);
	}

	public List<Goods> list() throws Exception {
        return this.goodsdao.findAllGoods();
	 }

	public List<Goods> listAllAllowGoods() throws Exception {
        return this.goodsdao.findAllAllowGoods();
	 
	}

	public List<Goods> listAllBanGoods() throws Exception {
        return this.goodsdao.findAllBanGoods();
	}

	public Goods findById(int gid) throws Exception {
		return this.goodsdao.findById(gid);
	}

	public boolean changeStatusToBan(int gid) throws Exception {
		return this.goodsdao.changeStatusToBan(gid);
	}

	public boolean changeStatusToAllow(int gid) throws Exception {
		return this.goodsdao.changeStatusToAllow(gid);
	}

	public boolean changeGoosCount(int gid, int count) throws Exception {
		return this.goodsdao.changeCount(gid, count);
	}

}
