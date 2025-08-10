package com.srija.syllabusproject.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.srija.syllabusproject.entity.Semester;
import com.srija.syllabusproject.repository.SemesterRepository;
import com.srija.syllabusproject.service.SemesterService;

@Service
public class SemesterServiceImpl implements SemesterService {

    private final SemesterRepository semesterRepository;

    public SemesterServiceImpl(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    @Override
    public Semester addSemester(Semester semester) {
        return semesterRepository.save(semester);
    }

    @Override
    public List<Semester> getAllSemesters() {
        return semesterRepository.findAll();
    }

    @Override
    public Semester getSemesterById(Long id) {
        return semesterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Semester not found with id: " + id));
    }

    @Override
    public Semester updateSemester(Long id, Semester semester) {
        Semester existingSemester = getSemesterById(id);

        if (semester.getName() != null) {
            existingSemester.setName(semester.getName());
        }
        if (semester.getStartDate() != null) {
            existingSemester.setStartDate(semester.getStartDate());
        }
        if (semester.getNumber() != 0) {
            existingSemester.setNumber(semester.getNumber());
        }
        if (semester.getDepartment() != null) {
            existingSemester.setDepartment(semester.getDepartment());
        }

        return semesterRepository.save(existingSemester);
    }

    @Override
    public void deleteSemester(Long id) {
        semesterRepository.deleteById(id);
    }
}