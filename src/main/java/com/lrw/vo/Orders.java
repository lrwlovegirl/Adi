package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Orders implements Serializable {
  private Integer oid;//订单编号
  private Integer mid;//购买人
  private Double allpay;//支付金额
  private Integer aid;//收货地址
  private String username;//收货人名称
  private String address;
public Integer getOid() {
	return oid;
}
public void setOid(Integer oid) {
	this.oid = oid;
}
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}
public Double getAllpay() {
	return allpay;
}
public void setAllpay(Double allpay) {
	this.allpay = allpay;
}
public Integer getAid() {
	return aid;
}
public void setAid(Integer aid) {
	this.aid = aid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  
}
