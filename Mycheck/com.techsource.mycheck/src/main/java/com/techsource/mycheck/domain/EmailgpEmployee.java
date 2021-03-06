package com.techsource.mycheck.domain;
// Generated 19 Sep, 2016 11:57:55 AM by Hibernate Tools 5.1.0.Beta1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.techsource.mycheck.domain.EmailGroup;

/**
 * EmailgpEmployee generated by hbm2java
 */
@Entity
@Table(name = "emailgp_employee", catalog = "mycheck")
public class EmailgpEmployee implements java.io.Serializable {

	private Integer id;
	private EmailGroup emailGroup;
	private Employee employee;
	private String state;
	private Date created;
	private Date modified;
	private Date deleted;

	public EmailgpEmployee() {
	}

	public EmailgpEmployee(EmailGroup emailGroup, Employee employee, String state, Date created, Date modified,
			Date deleted) {
		this.emailGroup = emailGroup;
		this.employee = employee;
		this.state = state;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emailgpId")
	public EmailGroup getEmailGroup() {
		return this.emailGroup;
	}

	public void setEmailGroup(EmailGroup emailGroup) {
		this.emailGroup = emailGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empId")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "state", length = 45)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", length = 0)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified", length = 0)
	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted", length = 0)
	public Date getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

}
