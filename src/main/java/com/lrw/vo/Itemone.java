package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Itemone implements Serializable {
  
	 private Integer ioid;
	 private String title;
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
	 
}
