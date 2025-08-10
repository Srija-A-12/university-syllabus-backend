package com.srija.syllabusproject.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.srija.syllabusproject.entity.Syllabus;
import com.srija.syllabusproject.repository.SyllabusSectionRepository;
import com.srija.syllabusproject.service.SyllabusService;

@Service
public class SyllabusServiceImpl implements SyllabusService {

    private final SyllabusSectionRepository syllabusSectionRepository;

    public SyllabusServiceImpl(SyllabusSectionRepository syllabusRepository) {
        this.syllabusSectionRepository = syllabusRepository;
    }

    @Override
    public Syllabus addSyllabus(Syllabus syllabus) {
        return syllabusSectionRepository.save(syllabus);
    }

    @Override
    public List<Syllabus> getAllSyllabi() {
        return syllabusSectionRepository.findAll();
    }

    @Override
    public Syllabus getSyllabusById(Long id) {
        return syllabusSectionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Syllabus not found with id " + id));
    }

    @Override
    public Syllabus updateSyllabus(Long id, Syllabus syllabus) {
        Syllabus existingSyllabus = getSyllabusById(id);
        existingSyllabus.setTitle(syllabus.getTitle());
        existingSyllabus.setDescription(syllabus.getDescription());
        existingSyllabus.setPhoto(syllabus.getPhoto());
        return syllabusSectionRepository.save(existingSyllabus);
    }

    @Override
    public void deleteSyllabus(Long id) {
        syllabusSectionRepository.deleteById(id);
    }
}
