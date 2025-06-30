package com.abdoulayediallo.StagiaireService.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abdoulayediallo.StagiaireService.models.Stagiaire;
import com.abdoulayediallo.StagiaireService.services.StagiaireService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/stagiaires")
public class StagiaireController {
    @Autowired
    private StagiaireService stagiaireService; 

    @GetMapping
    public List<Stagiaire> getAllStagiaires() {
        return stagiaireService.getAll();
    }

    @GetMapping("/{id}")
    public Stagiaire getStagiaireById(@PathVariable Long id) {
        return stagiaireService.getById(id);
    }

    @PostMapping
    public Stagiaire createStagiaire(@RequestBody Stagiaire stagiaire) {
        return stagiaireService.create(stagiaire);
    }

    @PutMapping("/{id}")
    public Stagiaire updateStagiaire(@PathVariable Long id,@RequestBody Stagiaire stagiaire) {
        return stagiaireService.update(id, stagiaire);
    }

    @DeleteMapping("/{id}")
    public String deleteStagiaire(@PathVariable Long id) {
        return stagiaireService.delete(id);
    }

}
