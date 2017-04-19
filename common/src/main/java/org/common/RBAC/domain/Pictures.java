package org.common.RBAC.domain;

import javax.persistence.*;

/**
 * 
 * @author fxb fanxiaobin.fxb@qq.com
 * @creation 2017年4月15日
 */
@Entity
@Table(name="t_pictures")
public class Pictures {
	public Pictures() {
	}
	@Id
	@Column(name="pk_pic_id")
	private String id;
	String pic_url;
	String pic_es;
	String pic_attr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public String getPic_es() {
		return pic_es;
	}
	public void setPic_es(String pic_es) {
		this.pic_es = pic_es;
	}
	public String getPic_attr() {
		return pic_attr;
	}
	public void setPic_attr(String pic_attr) {
		this.pic_attr = pic_attr;
	}
}
