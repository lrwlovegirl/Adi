package com.lrw.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Member implements Serializable{
	private Integer mid;//�û����
	private String username;//�û���
	private String password;//����
	private String telephone;//�绰
	private String email;//����
	private Date birthday;//ע������
	private Integer level;//��Ա�ȼ�
	private Integer IsAdmin;//�Ƿ��ǹ���Ա
	private Integer intgral;//����
	private Integer status;//�û�״̬��0��ʾ������½��1��ʾ���������ܵ�¼

	public Member() {
		super();
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getIsAdmin() {
		return IsAdmin;
	}
	public void setIsAdmin(Integer isAdmin) {
		IsAdmin = isAdmin;
	}
	public Integer getIntgral() {
		return intgral;
	}
	public void setIntgral(Integer intgral) {
		this.intgral = intgral;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}



}
