package com.jokerdemo.crm.domain;
// Generated 2017-10-12 17:23:36 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userid;
	private Job job;
	private String username;
	private String usersex;
	private String phone;
	private String email;
	private String birthday;
	private String password;
	private Date entrytime;
	private Set chancesForAssignuserid = new HashSet(0);
	private Set slideshows = new HashSet(0);
	private Set offers = new HashSet(0);
	private Set servicesForCreateuserid = new HashSet(0);
	private Set servicesForAssignuserid = new HashSet(0);
	private Set servicesForDisposeuserid = new HashSet(0);
	private Set chancesForCreateuserid = new HashSet(0);
	private Set customers = new HashSet(0);
	private Set newses = new HashSet(0);
	private String jobname;
	private Integer jobno;
	private String privs;
	

	public User(Integer userid, String username, String jobname, Integer jobno, Date entrytime) {
		this.userid = userid;
		this.username = username;
		this.jobname = jobname;
		this.jobno = jobno;
		this.entrytime = entrytime;
	}


	public Integer getJobno() {
		return jobno;
	}


	public void setJobno(Integer jobno) {
		this.jobno = jobno;
	}


	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	
	
	public String getPrivs() {
		return privs;
	}


	public void setPrivs(String privs) {
		this.privs = privs;
	}


	public User() {
	}

	public User(Integer userid) {
		super();
		this.userid = userid;
	}

	public User(Job job, String username, String usersex, String phone, String email, String birthday, String password,
			Date entrytime, Set chancesForAssignuserid, Set slideshows, Set offers, Set servicesForCreateuserid,
			Set servicesForAssignuserid, Set servicesForDisposeuserid, Set chancesForCreateuserid, Set customers,
			Set newses) {
		this.job = job;
		this.username = username;
		this.usersex = usersex;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
		this.password = password;
		this.entrytime = entrytime;
		this.chancesForAssignuserid = chancesForAssignuserid;
		this.slideshows = slideshows;
		this.offers = offers;
		this.servicesForCreateuserid = servicesForCreateuserid;
		this.servicesForAssignuserid = servicesForAssignuserid;
		this.servicesForDisposeuserid = servicesForDisposeuserid;
		this.chancesForCreateuserid = chancesForCreateuserid;
		this.customers = customers;
		this.newses = newses;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsersex() {
		return this.usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getEntrytime() {
		return this.entrytime;
	}

	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}

	public Set getChancesForAssignuserid() {
		return this.chancesForAssignuserid;
	}

	public void setChancesForAssignuserid(Set chancesForAssignuserid) {
		this.chancesForAssignuserid = chancesForAssignuserid;
	}

	public Set getSlideshows() {
		return this.slideshows;
	}

	public void setSlideshows(Set slideshows) {
		this.slideshows = slideshows;
	}

	public Set getOffers() {
		return this.offers;
	}

	public void setOffers(Set offers) {
		this.offers = offers;
	}

	public Set getServicesForCreateuserid() {
		return this.servicesForCreateuserid;
	}

	public void setServicesForCreateuserid(Set servicesForCreateuserid) {
		this.servicesForCreateuserid = servicesForCreateuserid;
	}

	public Set getServicesForAssignuserid() {
		return this.servicesForAssignuserid;
	}

	public void setServicesForAssignuserid(Set servicesForAssignuserid) {
		this.servicesForAssignuserid = servicesForAssignuserid;
	}

	public Set getServicesForDisposeuserid() {
		return this.servicesForDisposeuserid;
	}

	public void setServicesForDisposeuserid(Set servicesForDisposeuserid) {
		this.servicesForDisposeuserid = servicesForDisposeuserid;
	}

	public Set getChancesForCreateuserid() {
		return this.chancesForCreateuserid;
	}

	public void setChancesForCreateuserid(Set chancesForCreateuserid) {
		this.chancesForCreateuserid = chancesForCreateuserid;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

	public Set getNewses() {
		return this.newses;
	}

	public void setNewses(Set newses) {
		this.newses = newses;
	}

}