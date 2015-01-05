package com.cgi.org.DTCollabrationTool.dbclasses;

// Generated Jan 2, 2015 7:14:22 PM by Hibernate Tools 3.4.0.CR1

public class Ideas implements java.io.Serializable {

	private String ideaid;
	private Sessionmaster sessionmaster;
	private Phasemaster phasemaster;
	private Userdetails userdetails;
	private Boolean isvalid;
	private String description;

	public Ideas() {
	}

	public Ideas(String ideaid, Sessionmaster sessionmaster,
			Phasemaster phasemaster, Userdetails userdetails) {
		this.ideaid = ideaid;
		this.sessionmaster = sessionmaster;
		this.phasemaster = phasemaster;
		this.userdetails = userdetails;
	}

	public Ideas(String ideaid, Sessionmaster sessionmaster,
			Phasemaster phasemaster, Userdetails userdetails, Boolean isvalid,
			String description) {
		this.ideaid = ideaid;
		this.sessionmaster = sessionmaster;
		this.phasemaster = phasemaster;
		this.userdetails = userdetails;
		this.isvalid = isvalid;
		this.description = description;
	}

	public String getIdeaid() {
		return this.ideaid;
	}

	public void setIdeaid(String ideaid) {
		this.ideaid = ideaid;
	}

	public Sessionmaster getSessionmaster() {
		return this.sessionmaster;
	}

	public void setSessionmaster(Sessionmaster sessionmaster) {
		this.sessionmaster = sessionmaster;
	}

	public Phasemaster getPhasemaster() {
		return this.phasemaster;
	}

	public void setPhasemaster(Phasemaster phasemaster) {
		this.phasemaster = phasemaster;
	}

	public Userdetails getUserdetails() {
		return this.userdetails;
	}

	public void setUserdetails(Userdetails userdetails) {
		this.userdetails = userdetails;
	}

	public Boolean getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
