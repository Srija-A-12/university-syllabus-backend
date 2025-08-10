package com.srija.syllabusproject.service;

import java.util.List;

import com.srija.syllabusproject.entity.Department;

public interface DepartmentService{
	 List<Department> getAllDepartments();
	 Department saveDepartment(Department department);
 }
