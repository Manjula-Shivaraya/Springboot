package com.psl.SpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psl.SpringBoot.DAO.DepartmentDAO;
import com.psl.SpringBoot.Entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDAO departmentdao;

	@Override
	public Department addDept(Department department) {

		return departmentdao.addDept(department);
	}

	@Override
	public List<Department> fetchDept() {
		return departmentdao.fetchDept();
	}

	@Override
	public Department fetchbyid(int id) {
		return departmentdao.fetchbyid(id);
	}

	@Override
	public Department fetchbyname(String departmentName) {
		return departmentdao.fetchbyname(departmentName);
	}

	@Override
	public void deletebyid(int departmentId) {
		 departmentdao.deletebyid(departmentId);
		
	}

	@Override
	public Department updatebyid(int departmentId, Department department) {
		return departmentdao.updatebyid(departmentId,department);
	}

}
