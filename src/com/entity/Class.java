package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class")
public class Class {
	@Id
	@Column(name="class_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto_increment 
	private int cid;
	@Column(name="class_name")
	private String cname;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "Class [cid=" + cid + ", cname=" + cname + "]";
	}


	}
