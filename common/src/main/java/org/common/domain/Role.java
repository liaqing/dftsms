package org.common.domain;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Role {
	
	@Id
	@Column(name="pk_role_id")
	// 该主键生成器名为uuid，使用Hibernate的uuid策略，  
    @GenericGenerator(name="uuid" , strategy="uuid")  
    // 指定使用fk_hilo主键生成器  
    @GeneratedValue(generator="uuid")  
	private String id;
	String rol_describe;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRol_describe() {
		return rol_describe;
	}
	public void setRol_describe(String rol_describe) {
		this.rol_describe = rol_describe;
	}
}
