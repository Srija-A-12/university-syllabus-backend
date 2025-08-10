package com.srija.syllabusproject.service;

import java.util.List;

import com.srija.syllabusproject.entity.Syllabus;

public interface SyllabusService {

    Syllabus addSyllabus(Syllabus syllabus);

    List<Syllabus> getAllSyllabi();

    Syllabus getSyllabusById(Long id);

    Syllabus updateSyllabus(Long id, Syllabus syllabus);

    void deleteSyllabus(Long id);
}
