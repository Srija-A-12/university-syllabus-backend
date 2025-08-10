package com.srija.syllabusproject.service;

import java.util.List;

import com.srija.syllabusproject.entity.Semester;

public interface SemesterService {
    Semester addSemester(Semester semester);
    List<Semester> getAllSemesters();
    Semester getSemesterById(Long id);
    Semester updateSemester(Long id, Semester semester);
    void deleteSemester(Long id);
}

