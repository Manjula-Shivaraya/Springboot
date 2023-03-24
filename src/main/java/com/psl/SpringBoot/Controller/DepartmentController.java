package com.psl.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.SpringBoot.Entity.Department;
import com.psl.SpringBoot.Service.DepartmentService;

@RestController // To create rest API's we use restController else we can use ONly @Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;

	@PostMapping("/add_department")
	public Department addDept(@RequestBody Department department) {
		return departmentservice.addDept(department);
	}
	@GetMapping("/List_Department")
	public List<Department> fetchDept(){
		return departmentservice.fetchDept();
	}
	@GetMapping("/getbyid/{id}")
	public Department fetchbyid(@PathVariable("id") int id) {
		return departmentservice.fetchbyid(id);
	}
	@GetMapping("/getbyname/{Name}")
	public Department fetchbyname(@PathVariable("Name") String departmentName) {
		return departmentservice.fetchbyname(departmentName);
	}
	@DeleteMapping("/deletebyid/{id}")
	public String deletebyid(@PathVariable("id") int departmentId) {
		departmentservice.deletebyid(departmentId);
		return "Successfully deleted";
	}
	@PutMapping("/updatebyid/{id}")
	public Department updatebyid(@PathVariable("id") int departmentId,@RequestBody Department department) {
		return departmentservice.updatebyid(departmentId,department);
		
	}
}
