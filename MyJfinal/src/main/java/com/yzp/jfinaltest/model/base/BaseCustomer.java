package com.yzp.jfinaltest.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomer<M extends BaseCustomer<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setAccount(java.lang.String account) {
		set("account", account);
	}
	
	public java.lang.String getAccount() {
		return getStr("account");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}
	
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	public void setSex(java.lang.String sex) {
		set("sex", sex);
	}
	
	public java.lang.String getSex() {
		return getStr("sex");
	}

	public void setAge(java.lang.String age) {
		set("age", age);
	}
	
	public java.lang.String getAge() {
		return getStr("age");
	}

	public void setMail(java.lang.String mail) {
		set("mail", mail);
	}
	
	public java.lang.String getMail() {
		return getStr("mail");
	}

	public void setPhotoaddress(java.lang.String photoaddress) {
		set("photoaddress", photoaddress);
	}
	
	public java.lang.String getPhotoaddress() {
		return getStr("photoaddress");
	}

	public void setBy(java.lang.String by) {
		set("by", by);
	}
	
	public java.lang.String getBy() {
		return getStr("by");
	}

}