package org.common.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author fxb fanxiaobin.fxb@qq.com
 * @creation 2017年4月15日
 */
@Entity
@Table(name="t_customer")
public class Account {
	/**
	 * 账号ID
	 */
	@Id
	@Column(name="pk_cus_id")
	// 该主键生成器名为uuid，使用Hibernate的uuid策略，  
    @GenericGenerator(name="uuid" , strategy="uuid")  
    // 指定使用fk_hilo主键生成器  
    @GeneratedValue(generator="uuid")  
	String id;
	/**
	 * 账号名称
	 */
	@Column(name="cus_name")
	String name;
	/**
	 * 账号密码
	 */
	@Column(name="cus_pass")
	String pass;
	/**
	 * 性别
	 */
	@Column(name="cus_sex")
	String sex;
	/**
	 * 账号绑定邮箱
	 */
	@Column(name="cus_email")
	String email;
	/**
	 * 账号绑定手机号
	 */
	@Column(name="cus_phone")
	String phone;
	/**
	 * 账号注册时间
	 */
	@Column(name="time")
	@Temporal(TemporalType.TIMESTAMP)
	Date registTime;
	/**
	 * 账号状态
	 */
	@Column(name="cus_status")
	boolean status;
	/**
	 * 保存与图片的关联，这部分暂时还未设计好
	 */
	Pictures picture;
	// TODO 账号持久化类与图片管理还没有完成
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Pictures getPicture() {
		return picture;
	}
	public void setPicture(Pictures picture) {
		this.picture = picture;
	}
}
