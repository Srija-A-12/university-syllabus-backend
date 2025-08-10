package com.srija.syllabusproject.service;

import java.util.List;

import com.srija.syllabusproject.entity.Subject;

public interface SubjectService {

	Subject addSubject(Subject subject);
	List<Subject> getAllSubjects();
	Subject getSubjectById(Long id);
	Subject updateSubject(Long id,Subject subject);
	
	void deleteSubject(Long id);
	
}
