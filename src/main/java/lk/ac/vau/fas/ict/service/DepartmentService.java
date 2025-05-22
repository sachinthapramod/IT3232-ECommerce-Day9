package lk.ac.vau.fas.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.fas.ict.repo.DepartmentRepo;
import lk.ac.vau.fas.ict.model.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDepts(){
		return repo.findAll();
	}
	
	public Department getDept(int id) {
		if(repo.findById(id).isEmpty()) {
			return null;
		}
		return repo.findById(id).get();
	}
}
