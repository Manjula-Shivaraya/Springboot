package com.psl.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.psl.SpringBoot.Entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	public Department findByDepartmentName(String departmentName); //the findBy keyword can be followed by any of the field name in the entity and call this method from the DepartmentDAO java class.
	
	public Department findByDepartmentNameIgnoreCase(String departmentName); //You can also add the constraints like ignorecase and so on to the method name.
	
}
