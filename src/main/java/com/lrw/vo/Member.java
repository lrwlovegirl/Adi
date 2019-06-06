package com.lrw.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Member implements Serializable{
	private Integer mid;//用户编号
	private String username;//用户名
	private String password;//密码
	private String telephone;//电话
	private String email;//邮箱
	private Date birthday;//注册日期
	private Integer level;//会员等级
	private Integer IsAdmin;//是否是管理员
	private Integer intgral;//积分
	private Integer status;//用户状态，0表示正常登陆，1表示锁定，不能登录

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
