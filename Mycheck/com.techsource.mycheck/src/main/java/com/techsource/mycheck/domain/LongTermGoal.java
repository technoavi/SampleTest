package com.techsource.mycheck.domain;
// Generated 20 Oct, 2016 3:35:33 PM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LongTermGoal generated by hbm2java
 */
@Entity
@Table(name = "longTermGoal", catalog = "mycheck")
public class LongTermGoal implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private Date modified;
	private Date created;
	private Date deleted;
	private Set<LongTermGoalEmp> longTermGoalEmps = new HashSet<LongTermGoalEmp>(0);

	public LongTermGoal() {
	}

	public LongTermGoal(String name, String description, Date startDate, Date endDate, Date modified, Date created,
			Date deleted, Set<LongTermGoalEmp> longTermGoalEmps) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modified = modified;
		this.created = created;
		this.deleted = deleted;
		this.longTermGoalEmps = longTermGoalEmps;
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

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 120)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "startDate", length = 0)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "endDate", length = 0)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	@Column(name = "created", length = 0)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted", length = 0)
	public Date getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "longTermGoal", cascade=CascadeType.ALL)
	public Set<LongTermGoalEmp> getLongTermGoalEmps() {
		return this.longTermGoalEmps;
	}

	public void setLongTermGoalEmps(Set<LongTermGoalEmp> longTermGoalEmps) {
		this.longTermGoalEmps = longTermGoalEmps;
	}

}
