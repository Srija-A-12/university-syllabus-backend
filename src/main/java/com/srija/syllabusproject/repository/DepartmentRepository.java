package com.srija.syllabusproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srija.syllabusproject.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
