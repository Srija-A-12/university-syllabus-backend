package com.srija.syllabusproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srija.syllabusproject.entity.Semester;

public interface SemesterRepository extends JpaRepository<Semester, Long> {}
