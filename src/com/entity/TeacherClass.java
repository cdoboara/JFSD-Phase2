package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_class")
public class TeacherClass {
	@Id
	@Column(name="teacher_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto_increment 
	private int tid;
	@Column(name="class_id")
	private int cid;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", cid=" + cid + "]";
	}


	}
