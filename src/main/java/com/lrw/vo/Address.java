package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable{
	private Integer aid;
	private Integer mid;
	private String address;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
