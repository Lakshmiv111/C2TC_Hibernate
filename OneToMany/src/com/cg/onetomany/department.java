package com.cg.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_mentor")

public class department {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private Set<employee> employees = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<employee> employees) {
		this.employees = employees;
	}
	
	public void addemployee(employee employee) {
		employee.setDepartment(this);
		this.getEmployees().add(employee);
	}

}
