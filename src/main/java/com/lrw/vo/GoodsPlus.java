package com.lrw.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
public class GoodsPlus implements Serializable {
	private Integer gid;//��Ʒ���
	private String ioid;//����һ���˵�
	private String itid;//���������˵�
	private String irid;//���������˵�
	private String title;//��Ʒ����
	private String note;//��Ʒ����
	private Date regdate;//�ϼ�����
	private Double price;//��Ʒ�۸�
	private Integer count;//��Ʒ�����
	private String photo;//��Ʒ����Ƭ
	private Integer status;//��Ʒ��״̬��0��ʾ����������1��ʾ�¼ܣ��޷���������Ʒɾ��
	private MultipartFile file;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	
	public String getIoid() {
		return ioid;
	}
	public void setIoid(String ioid) {
		this.ioid = ioid;
	}
	public String getItid() {
		return itid;
	}
	public void setItid(String itid) {
		this.itid = itid;
	}
	public String getIrid() {
		return irid;
	}
	public void setIrid(String irid) {
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
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}


}
