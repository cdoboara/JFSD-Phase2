package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_class")
public class TeacherSubject {
	@Id
	@Column(name="teacher_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto_increment 
	private int tid;
	@Column(name="subject_id")
	private int sid;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", sid=" + sid + "]";
	}


	}
