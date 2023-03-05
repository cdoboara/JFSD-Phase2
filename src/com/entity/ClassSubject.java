package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class_subject")
public class ClassSubject {
	@Id
	@Column(name="class_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto_increment 
	private int cid;
	@Column(name="subject_id")
	private int sid;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Override
	public String toString() {
		return "Teacher [cid=" + cid + ", sid=" + sid + "]";
	}


	}
