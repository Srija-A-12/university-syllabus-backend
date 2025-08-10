package com.srija.syllabusproject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.srija.syllabusproject.entity.Syllabus;
import com.srija.syllabusproject.repository.SyllabusSectionRepository;
import com.srija.syllabusproject.service.SyllabusService;

@RestController
@RequestMapping("/api/syllabi")
public class SyllabusController {

    private final SyllabusService syllabusService;
    private final SyllabusSectionRepository syllabusSectionRepository; 

    public SyllabusController(SyllabusService syllabusService, SyllabusSectionRepository syllabusSectionRepository) {
        this.syllabusService = syllabusService;
        this.syllabusSectionRepository = syllabusSectionRepository;
    }
    

    @PostMapping("/upload")
    public ResponseEntity<Syllabus> uploadSyllabus(
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("file") MultipartFile file) throws IOException {

        Syllabus syllabus = new Syllabus();
        syllabus.setTitle(title);
        syllabus.setDescription(description);
        syllabus.setPhoto(file.getBytes()); // store image bytes

        return ResponseEntity.ok(syllabusSectionRepository.save(syllabus)); 
    }

    @GetMapping
    public List<Syllabus> getAllSyllabi() {
        return syllabusService.getAllSyllabi();
    }

    @GetMapping("/{id}")
    public Syllabus getSyllabusById(@PathVariable Long id) {
        return syllabusService.getSyllabusById(id);
    }

    @PutMapping("/{id}")
    public Syllabus updateSyllabus(@PathVariable Long id, @RequestBody Syllabus syllabus) {
        return syllabusService.updateSyllabus(id, syllabus);
    }

    @DeleteMapping("/{id}")
    public void deleteSyllabus(@PathVariable Long id) {
        syllabusService.deleteSyllabus(id);
    }
}
