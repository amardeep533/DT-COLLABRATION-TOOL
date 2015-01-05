package com.cgi.org.DTCollabrationTool.dbclasses;

// Generated Jan 2, 2015 7:14:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

public class Userdetails implements java.io.Serializable {

	private Integer userid;
	private String username;
	private String userpassword;
	private String email;
	private String usertype;
	private Long employeeid;
	private String designation;
	private Set<Ideas> ideases = new HashSet<Ideas>(0);

	public Userdetails() {
	}

	public Userdetails(String username, String userpassword) {
		this.username = username;
		this.userpassword = userpassword;
	}

	public Userdetails(String username, String userpassword, String email,
			String usertype, Long employeeid, String designation,
			Set<Ideas> ideases) {
		this.username = username;
		this.userpassword = userpassword;
		this.email = email;
		this.usertype = usertype;
		this.employeeid = employeeid;
		this.designation = designation;
		this.ideases = ideases;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public Long getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Set<Ideas> getIdeases() {
		return this.ideases;
	}

	public void setIdeases(Set<Ideas> ideases) {
		this.ideases = ideases;
	}
}
