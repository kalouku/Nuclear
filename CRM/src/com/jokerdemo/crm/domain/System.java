package com.jokerdemo.crm.domain;
// Generated 2017-10-12 17:23:36 by Hibernate Tools 3.5.0.Final

/**
 * System generated by hbm2java
 */
public class System implements java.io.Serializable {

	private Integer columeid;
	private String columename;
	private String columevalue;

	public System() {
	}

	public System(String columename, String columevalue) {
		this.columename = columename;
		this.columevalue = columevalue;
	}

	public Integer getColumeid() {
		return this.columeid;
	}

	public void setColumeid(Integer columeid) {
		this.columeid = columeid;
	}

	public String getColumename() {
		return this.columename;
	}

	public void setColumename(String columename) {
		this.columename = columename;
	}

	public String getColumevalue() {
		return this.columevalue;
	}

	public void setColumevalue(String columevalue) {
		this.columevalue = columevalue;
	}

}
