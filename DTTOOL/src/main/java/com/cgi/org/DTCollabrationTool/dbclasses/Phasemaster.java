package com.cgi.org.DTCollabrationTool.dbclasses;

// Generated Jan 2, 2015 7:14:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

public class Phasemaster implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer phaseid;
	private String phasename;
	private Set<Ideas> ideases = new HashSet<Ideas>(0);

	public Phasemaster() {
	}

	public Phasemaster(String phasename, Set<Ideas> ideases) {
		this.phasename = phasename;
		this.ideases = ideases;
	}

	public Integer getPhaseid() {
		return this.phaseid;
	}

	public void setPhaseid(Integer phaseid) {
		this.phaseid = phaseid;
	}

	public String getPhasename() {
		return this.phasename;
	}

	public void setPhasename(String phasename) {
		this.phasename = phasename;
	}

	public Set<Ideas> getIdeases() {
		return this.ideases;
	}

	public void setIdeases(Set<Ideas> ideases) {
		this.ideases = ideases;
	}

}
