package com.lrw.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IDetailsDAO;
import com.lrw.service.DetailsService;
import com.lrw.vo.Details;
@Service
public class DetailsServiceImpl implements DetailsService {
    @Resource
	private IDetailsDAO idetalsdao;
	public boolean addDetails(Details vo) throws Exception {
		return this.idetalsdao.doCreateDetaisl(vo);
	}

	public Details findByOdid(int odid) throws Exception {
		return this.idetalsdao.findByOdid(odid);
	}

}
