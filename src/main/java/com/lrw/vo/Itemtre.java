package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Itemtre implements Serializable {
  
	 private Integer itid;//二级标题编号
	 private Integer irid;//三级标题编号
	 private String title;//三级标题名称
	public Integer getItid() {
		return itid;
	}
	public void setItid(Integer itid) {
		this.itid = itid;
	}
	public Integer getIrid() {
		return irid;
	}
	public void setIrid(Integer irid) {
		this.irid = irid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	 
}
