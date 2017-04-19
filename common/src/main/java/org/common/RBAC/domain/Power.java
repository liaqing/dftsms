package org.common.RBAC.domain;

import javax.persistence.*;

/**
 * 
 * @author fxb fanxiaobin.fxb@qq.com
 * @creation 2017年4月15日
 */
@Entity
public class Power {

	public Power() {
	}

	private String id;
	String power_describe;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPower_describe() {
		return power_describe;
	}

	public void setPower_describe(String power_describe) {
		this.power_describe = power_describe;
	}
}
