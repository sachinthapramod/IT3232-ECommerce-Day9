package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Insurance {
	
	@Id
	private int id;
	private String type;
	
	@OneToOne
	private employee employee;
}
