package com.psl.SpringBoot.Service;

import java.util.List;

import com.psl.SpringBoot.Entity.Department;

public interface DepartmentService {

	public Department addDept(Department department);

	public List<Department> fetchDept();

	public Department fetchbyid(int id);

	public Department fetchbyname(String departmentName);

	public void deletebyid(int departmentId);

	public Department updatebyid(int departmentId, Department department);

}
