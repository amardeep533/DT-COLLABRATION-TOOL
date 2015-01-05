package com.cgi.org.DTCollabrationTool.dbclasses;

// Generated Jan 2, 2015 7:14:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

public class Sessionmaster implements java.io.Serializable {

	private Integer sessionid;
	private String sessionname;
	private String presenterid;
	private Set<Ideas> ideases = new HashSet<Ideas>(0);

	public Sessionmaster() {
	}

	public Sessionmaster(String sessionname, String presenterid,
			Set<Ideas> ideases) {
		this.sessionname = sessionname;
		this.presenterid = presenterid;
		this.ideases = ideases;
	}

	public Integer getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(Integer sessionid) {
		this.sessionid = sessionid;
	}

	public String getSessionname() {
		return this.sessionname;
	}

	public void setSessionname(String sessionname) {
		this.sessionname = sessionname;
	}

	public String getPresenterid() {
		return this.presenterid;
	}

	public void setPresenterid(String presenterid) {
		this.presenterid = presenterid;
	}

	public Set<Ideas> getIdeases() {
		return this.ideases;
	}

	public void setIdeases(Set<Ideas> ideases) {
		this.ideases = ideases;
	}

}
