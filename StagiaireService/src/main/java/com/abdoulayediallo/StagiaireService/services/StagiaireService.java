package com.abdoulayediallo.StagiaireService.services;
import com.abdoulayediallo.StagiaireService.models.Stagiaire;
import com.abdoulayediallo.StagiaireService.repositories.StagiaireRepository;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class StagiaireService {
    @Autowired
    StagiaireRepository stagiaireRepository;

    public Stagiaire create(Stagiaire stagiaire) {
        try {
            return stagiaireRepository.save(stagiaire);
        } catch (Exception e) {
            return null;
        }
    }
    public Stagiaire getById(Long id) {
        try {
            return Optional.ofNullable(id)
                .flatMap(stagiaireRepository::findById)
                .orElse(null);
        } catch (Exception e) {
            return  null;
        }
    }
    public Stagiaire update(Long id, Stagiaire stagiaire) {
        return stagiaireRepository.findById(id)
                .map(existing -> {
                    Stagiaire updated = Stagiaire.builder()
                            .id(existing.getId())
                            .nom(stagiaire.getNom())
                            .prenom(stagiaire.getPrenom())
                            .email(stagiaire.getEmail())
                            .dateDebut(stagiaire.getDateDebut())
                            .dateFin(stagiaire.getDateFin())
                            .encadreurId(stagiaire.getEncadreurId())
                            .build();
                    return stagiaireRepository.saveAndFlush(updated);
                })
                .orElseThrow(() -> new EntityNotFoundException("Stagiaire not found with id " + id));
    }
    public String delete(Long id) {
        try {
            Optional<Stagiaire> stagiaire = stagiaireRepository.findById(id);
            if (stagiaire.isPresent()) {
                stagiaireRepository.deleteById(id);
                return "success";
            } else {
                return "error";
            }
        } catch (Exception e) {
            return "error";
        }
    }
    public List<Stagiaire> getAll() {
        return stagiaireRepository.findAll();
    }
} 
