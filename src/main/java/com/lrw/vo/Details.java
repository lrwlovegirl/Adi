package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Details implements Serializable {
  private Integer odid;//订单详情的编号；
  private Integer oid;//对应的订单的编号
  private Integer gid;//购买的货物的编号
  private String title;//购买商品的名称
  private Double price;//购买本件商品的价格
  private Integer count;//购买商品数量
public Integer getOdid() {
	return odid;
}
public void setOdid(Integer odid) {
	this.odid = odid;
}
public Integer getOid() {
	return oid;
}
public void setOid(Integer oid) {
	this.oid = oid;
}
public Integer getGid() {
	return gid;
}
public void setGid(Integer gid) {
	this.gid = gid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
  
  
  
}
