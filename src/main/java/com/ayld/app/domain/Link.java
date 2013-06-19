package com.ayld.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import net.ayld.core.domain.BaseEntity;

@Entity
@Table(name = "links")
public class Link extends BaseEntity<Integer>{

	private User owner;
	private String url;

	@Column(name = "url")
	public String getUrl() {
		return url;
	}

	@Column(name = "owner")
	@JoinColumn(name = "user", nullable = false)
	public User getOwner() {
		return owner;
	}

	@Id
	@Override
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return super.getId();
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	private static final long serialVersionUID = -7554442772190774236L;
}
