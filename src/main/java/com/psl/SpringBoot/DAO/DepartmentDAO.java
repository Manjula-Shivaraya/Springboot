package com.psl.SpringBoot.DAO;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psl.SpringBoot.Entity.Department;
import com.psl.SpringBoot.Repository.DepartmentRepository;

@Repository
public class DepartmentDAO {

	@Autowired
	DepartmentRepository departmentrepository;

	public Department addDept(Department department) {

		return departmentrepository.save(department);
	}

	public List<Department> fetchDept() {
		return departmentrepository.findAll();
	}

	public Department fetchbyid(int id) {
		return departmentrepository.findById(id).orElse(null);
	}

	public Department fetchbyname(String departmentName) {
		return departmentrepository.findByDepartmentName(departmentName);
	}

	public void deletebyid(int departmentId) {
		departmentrepository.deleteById(departmentId);
	}

	public Department updatebyid(int departmentId, Department department) {
		Department updatedepartment = departmentrepository.findById(departmentId).get();
		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			updatedepartment.setDepartmentName(department.getDepartmentName());
		}
		if (Objects.nonNull(department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			updatedepartment.setDepartmentAddress(department.getDepartmentAddress());
		}
		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			updatedepartment.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentrepository.save(updatedepartment);
	}

}
