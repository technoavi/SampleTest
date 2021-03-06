package com.techsource.mycheck.domain;
// Generated 9 Sep, 2016 6:31:52 PM by Hibernate Tools 5.1.0.Beta1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", catalog = "mycheck")
public class Department implements java.io.Serializable {

	private Integer id;
	private String name;
	private String status;
	private Date created;
	private Date modified;
	private Date deleted;
	private Set<EmployeeDepartment> employeeDepartments = new HashSet<EmployeeDepartment>(0);
	private Set<Surveydetails> surveydetailses = new HashSet<Surveydetails>(0);
	private Set<GroupDepartment> groupDepartments = new HashSet<GroupDepartment>(0);
	private Set<DepartmentDivision> departmentDivisions = new HashSet<DepartmentDivision>(0);
	private Set<EmailRelation> emailRelations = new HashSet<EmailRelation>(0);
	public Department() {
	}

	public Department(String name, String status, Date created, Date modified, Date deleted,
			Set<EmployeeDepartment> employeeDepartments, Set<Surveydetails> surveydetailses,
			Set<GroupDepartment> groupDepartments, Set<EmailRelation> emailRelations,
			Set<DepartmentDivision> departmentDivisions) {
		this.name = name;
		this.status = status;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
		this.employeeDepartments = employeeDepartments;
		this.surveydetailses = surveydetailses;
		this.groupDepartments = groupDepartments;
		this.emailRelations = emailRelations;
		this.departmentDivisions = departmentDivisions;
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

	@Column(name = "status", length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "department",cascade=CascadeType.ALL)

	public Set<EmployeeDepartment> getEmployeeDepartments() {
		return this.employeeDepartments;
	}

	public void setEmployeeDepartments(Set<EmployeeDepartment> employeeDepartments) {
		this.employeeDepartments = employeeDepartments;
	}

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "department",cascade=CascadeType.ALL)

	public Set<Surveydetails> getSurveydetailses() {
		return this.surveydetailses;
	}

	public void setSurveydetailses(Set<Surveydetails> surveydetailses) {
		this.surveydetailses = surveydetailses;
	}

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "department",cascade=CascadeType.ALL)

	public Set<GroupDepartment> getGroupDepartments() {
		return this.groupDepartments;
	}

	public void setGroupDepartments(Set<GroupDepartment> groupDepartments) {
		this.groupDepartments = groupDepartments;
	}

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "department",cascade=CascadeType.ALL)

	public Set<DepartmentDivision> getDepartmentDivisions() {
		return this.departmentDivisions;
	}

	public void setDepartmentDivisions(Set<DepartmentDivision> departmentDivisions) {
		this.departmentDivisions = departmentDivisions;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department",cascade=CascadeType.ALL)
	public Set<EmailRelation> getEmailRelations() {
		return this.emailRelations;
	}

	public void setEmailRelations(Set<EmailRelation> emailRelations) {
		this.emailRelations = emailRelations;
	}

}
