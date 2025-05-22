package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int project_id;
	private String name;
	private long totalCost;
	
	@ManyToMany
	@JoinTable(name="project_assignment",
	joinColumns = @JoinColumn(name="pro_id"),
	inverseJoinColumns = @JoinColumn (name="emp_id"))
	private List<employee>employee;
	 
}
