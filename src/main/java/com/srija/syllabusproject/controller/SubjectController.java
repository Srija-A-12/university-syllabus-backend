package com.srija.syllabusproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srija.syllabusproject.entity.Subject;
import com.srija.syllabusproject.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
private final SubjectService subjectService;

public SubjectController (SubjectService subjectService) {
	this.subjectService=subjectService;
}

@PostMapping
public Subject addSubject(@RequestBody Subject subject) {
	return subjectService.addSubject(subject);
}

@GetMapping("/{id}")
public List<Subject> getAllSubjects(){
	return subjectService .getAllSubjects();
}

@PutMapping("/{id}")
public Subject updateSubject(@PathVariable Long id,@RequestBody Subject subject) {
	return subjectService.updateSubject(id, subject);
}

@DeleteMapping("/{id}")
public void deleteSubject(@PathVariable  Long id) {
	subjectService.deleteSubject(id);
}
}
