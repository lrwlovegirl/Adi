package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Itemtwo implements Serializable {
  
	 private Integer ioid;//һ��������
	 private Integer itid;//����������
	 private String title;//������������
	public Integer getIoid() {
		return ioid;
	}
	public void setIoid(Integer ioid) {
		this.ioid = ioid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getItid() {
		return itid;
	}
	public void setItid(Integer itid) {
		this.itid = itid;
	}
	
	 
}
