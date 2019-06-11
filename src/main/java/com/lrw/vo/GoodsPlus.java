package com.lrw.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
public class GoodsPlus implements Serializable {
	private Integer gid;//商品编号
	private String ioid;//所属一级菜单
	private String itid;//所属二级菜单
	private String irid;//所属三级菜单
	private String title;//商品名称
	private String note;//商品描述
	private Date regdate;//上架日期
	private Double price;//商品价格
	private Integer count;//商品库存量
	private String photo;//商品的照片
	private Integer status;//商品的状态，0表示正常售卖，1表示下架，无法做到将商品删除
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
