package com.ayld.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.ayld.core.domain.BaseEntity;

@Entity
@Table(name = "users")
public class User extends BaseEntity<Integer>{

	private String name;
	
	@Column(name = "name")
	public String getName() {
		return name;
	}

	@Id
	@Override
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return super.getId();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private static final long serialVersionUID = -2892015727635309231L;
}
