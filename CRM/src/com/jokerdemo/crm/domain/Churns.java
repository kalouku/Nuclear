package com.jokerdemo.crm.domain;
// Generated 2017-10-12 17:23:36 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Churns generated by hbm2java
 */
public class Churns implements java.io.Serializable {

	private Integer churnid;
	private Status status;
	private Customer customer;
	private Set defers = new HashSet(0);
	private String company;
	private String statusvalue;
	public Churns() {
	}
	
	public Churns(Integer churnid, String company, String statusvalue) {
		super();
		this.churnid = churnid;
		this.company = company;
		this.statusvalue = statusvalue;
	}

	public Churns(Status status, Customer customer, Set defers) {
		this.status = status;
		this.customer = customer;
		this.defers = defers;
	}

	public Integer getChurnid() {
		return this.churnid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatusvalue() {
		return statusvalue;
	}

	public void setStatusvalue(String statusvalue) {
		this.statusvalue = statusvalue;
	}

	public void setChurnid(Integer churnid) {
		this.churnid = churnid;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set getDefers() {
		return this.defers;
	}

	public void setDefers(Set defers) {
		this.defers = defers;
	}

}