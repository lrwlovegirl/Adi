package com.lrw.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Details implements Serializable {
  private Integer odid;//��������ı�ţ�
  private Integer oid;//��Ӧ�Ķ����ı��
  private Integer gid;//����Ļ���ı��
  private String title;//������Ʒ������
  private Double price;//���򱾼���Ʒ�ļ۸�
  private Integer count;//������Ʒ����
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
