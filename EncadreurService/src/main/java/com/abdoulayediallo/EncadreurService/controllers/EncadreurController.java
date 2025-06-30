package com.abdoulayediallo.EncadreurService.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdoulayediallo.EncadreurService.models.Encadreur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abdoulayediallo.EncadreurService.services.EncadreurService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/encadreurs")
public class EncadreurController {
    @Autowired
    private EncadreurService encadreurService; 

    @GetMapping
    public List<Encadreur> getAllEncadreurs() {
        return encadreurService.getAll();
    }

    @GetMapping("/{id}")
    public Encadreur getEncadreurById(@PathVariable Long id) {
        return encadreurService.getById(id);
    }

    @PostMapping
    public Encadreur createEncadreur(@RequestBody Encadreur encadreur) {
        return encadreurService.create(encadreur);
    }

    @PutMapping("/{id}")
    public Encadreur updateEncadreur(@PathVariable Long id,@RequestBody Encadreur encadreur) {
        return encadreurService.update(id, encadreur);
    }

    @DeleteMapping("/{id}")
    public String deleteEncadreur(@PathVariable Long id) {
        return encadreurService.delete(id);
    }

}
