package com.jokerdemo.crm.domain;
// Generated 2017-10-12 17:23:36 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Status generated by hbm2java
 */
public class Status implements java.io.Serializable {

	private StatusId id;
	private String statusvalue;
	private Set chances = new HashSet(0);
	private Set services = new HashSet(0);
	private Set offers = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set churnses = new HashSet(0);
	private Set plans = new HashSet(0);

	public Status() {
	}

	public Status(StatusId id, String statusvalue) {
		this.id = id;
		this.statusvalue = statusvalue;
	}

	public Status(StatusId id, String statusvalue, Set chances, Set services, Set offers, Set orders, Set churnses,
			Set plans) {
		this.id = id;
		this.statusvalue = statusvalue;
		this.chances = chances;
		this.services = services;
		this.offers = offers;
		this.orders = orders;
		this.churnses = churnses;
		this.plans = plans;
	}

	public StatusId getId() {
		return this.id;
	}

	public void setId(StatusId id) {
		this.id = id;
	}

	public String getStatusvalue() {
		return this.statusvalue;
	}

	public void setStatusvalue(String statusvalue) {
		this.statusvalue = statusvalue;
	}

	public Set getChances() {
		return this.chances;
	}

	public void setChances(Set chances) {
		this.chances = chances;
	}

	public Set getServices() {
		return this.services;
	}

	public void setServices(Set services) {
		this.services = services;
	}

	public Set getOffers() {
		return this.offers;
	}

	public void setOffers(Set offers) {
		this.offers = offers;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getChurnses() {
		return this.churnses;
	}

	public void setChurnses(Set churnses) {
		this.churnses = churnses;
	}

	public Set getPlans() {
		return this.plans;
	}

	public void setPlans(Set plans) {
		this.plans = plans;
	}

}