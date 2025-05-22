package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
	@Id
	@Column(name = "dept_id")
	private int id;
	@Column(nullable = false)
	private String name;
	private Date established;
	@OneToMany(mappedBy = "department")
	private List<employee>employees;
	
	public Department() {
		
	}

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

	public Date getEstablished() {
		return established;
	}

	public void setEstablished(Date established) {
		this.established = established;
	}

	public List<employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<employee> employees) {
		this.employees = employees;
	}
	
}
