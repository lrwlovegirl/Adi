package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Itemtre implements Serializable {
  
	 private Integer itid;//����������
	 private Integer irid;//����������
	 private String title;//������������
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
