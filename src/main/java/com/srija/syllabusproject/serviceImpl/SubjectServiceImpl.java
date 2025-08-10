package com.srija.syllabusproject.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.srija.syllabusproject.entity.Subject;
import com.srija.syllabusproject.repository.SubjectRepository;
import com.srija.syllabusproject.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	private final SubjectRepository subjectRepository;
	
	 public SubjectServiceImpl(SubjectRepository subjectRepository) {
	        this.subjectRepository = subjectRepository;
	        
	 }
	        @Override
	        public Subject addSubject(Subject subject) {
	        	return subjectRepository.save(subject);
	        }
	        
	        @Override 
	        public List<Subject> getAllSubjects(){
	        	return subjectRepository.findAll();
	        	
	        }
	        
	        @Override
	        public Subject getSubjectById(Long id) {
	        	return subjectRepository.findById(id).orElseThrow(()-> new RuntimeException("Subject not found with id "+id));
	        }
	        
	        @Override 
	        public Subject updateSubject(Long id,Subject subject) {
	        	Subject existingSubject=getSubjectById(id);
	        	existingSubject.setName(subject.getName());
	        	return subjectRepository.save(existingSubject);
	        }
	        
	        @Override
	        public void deleteSubject(Long id) {
	            subjectRepository.deleteById(id);
	        }
	    }
	    
	       
