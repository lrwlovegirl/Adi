package com.lrw.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Goods implements Serializable {
	private Integer gid;//��Ʒ���
	private Integer ioid;//����һ���˵�
	private Integer itid;//���������˵�
	private Integer irid;//���������˵�
	private String title;//��Ʒ����
	private String note;//��Ʒ����
	private Date regdate;//�ϼ�����
	private Double price;//��Ʒ�۸�
	private Integer count;//��Ʒ�����
	private String photo;//��Ʒ����Ƭ
	private Integer status;//��Ʒ��״̬��0��ʾ����������1��ʾ�¼ܣ��޷���������Ʒɾ��
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getIoid() {
		return ioid;
	}
	public void setIoid(Integer ioid) {
		this.ioid = ioid;
	}
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}


}
