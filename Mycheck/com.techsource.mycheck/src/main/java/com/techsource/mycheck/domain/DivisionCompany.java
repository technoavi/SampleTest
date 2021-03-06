package com.techsource.mycheck.domain;
// Generated 9 Sep, 2016 6:31:52 PM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DivisionCompany generated by hbm2java
 */
@Entity
@Table(name = "division_company", catalog = "mycheck")
public class DivisionCompany implements java.io.Serializable {

	private Integer id;
	private Company company;
	private Division division;
	private Date created;
	private Date modified;
	private Date deleted;

	public DivisionCompany() {
	}

	public DivisionCompany(Company company, Division division, Date created, Date modified, Date deleted) {
		this.company = company;
		this.division = division;
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
	@JoinColumn(name = "cmp_id")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "div_id")
	public Division getDivision() {
		return this.division;
	}

	public void setDivision(Division division) {
		this.division = division;
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
