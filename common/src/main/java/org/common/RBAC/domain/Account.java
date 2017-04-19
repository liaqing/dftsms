package org.common.RBAC.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author fxb fanxiaobin.fxb@qq.com
 * @creation 2017年4月15日
 */
@Entity
@Table(name = "t_customer")
public class Account {
	
	public Account() {
	}
	/**
	 * 账号ID
	 */
	@Id
	@Column(name = "pk_cus_id")
	// 该主键生成器名为uuid，使用Hibernate的uuid策略，
	@GenericGenerator(name = "uuid", strategy = "uuid")
	// 指定使用fk_hilo主键生成器
	@GeneratedValue(generator = "uuid")
	private String id;
	/**
	 * 账号名称
	 */
	@Column(name = "cus_name")
	String name;
	/**
	 * 账号密码
	 */
	@Column(name = "cus_pass")
	String pass;
	/**
	 * 性别
	 */
	@Column(name = "cus_sex")
	int sex;
	/**
	 * 账号绑定邮箱
	 */
	@Column(name = "cus_email")
	String email;
	/**
	 * 账号绑定手机号
	 */
	@Column(name = "cus_phone")
	String phone;
	/**
	 * 账号注册时间
	 */
	@Column(name = "time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	/**
	 * 账号状态
	 */
	@Column(name = "cus_status")
	private boolean status;
	/**
	 * 保存与图片的关联，这部分暂时还未设计好
	 * 级联操作为All，如果账户删除则图片也相应应该移除
	 */
	@OneToOne(targetEntity=Pictures.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fk_ picture")
	Pictures picture;
	// TODO 账号持久化类与图片管理还没有完成

	// 定义该Account实体所有关联的Role实体
	@ManyToMany(targetEntity = Role.class)
	// 映射连接表为t_customer_role
	@JoinTable(name = "t_customer_role",
			// 定义连接表中名为fk_customer的外键列，该外键列参照当前实体对应表的主键列
			joinColumns = @JoinColumn(name = "fk_customer", referencedColumnName = "pk_cus_id"),
			// 定义连接表中名为fk_role的外键列，
			// 该外键列参照当前实体的关联实体对应表的主键列
			inverseJoinColumns = @JoinColumn(name = "fk_role", referencedColumnName = "pk_role_id"))
	private Set<Role> roles = new HashSet<>();

	/********************** setter&getter方法 ************************/

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

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

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
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
