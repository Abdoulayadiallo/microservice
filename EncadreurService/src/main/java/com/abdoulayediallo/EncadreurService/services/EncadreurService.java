package com.abdoulayediallo.EncadreurService.services;
import com.abdoulayediallo.EncadreurService.models.Encadreur;

import com.abdoulayediallo.EncadreurService.repositories.EncadreurRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EncadreurService {
    @Autowired
    EncadreurRepository encadreurRepository;

    public Encadreur create(Encadreur encadreur) {
        try {
            return encadreurRepository.save(encadreur);
        } catch (Exception e) {
            return null;
        }
    }
    public Encadreur getById(Long id) {
        try {
            return Optional.ofNullable(id)
                    .flatMap(encadreurRepository::findById)
                    .orElse(null);
        } catch (Exception e) {
            return null;
        }
    }
    public Encadreur update(Long id, Encadreur encadreur) {
        return encadreurRepository.findById(id)
                .map(existing -> {
                    Encadreur updated = Encadreur.builder()
                            .id(existing.getId())
                            .nom(encadreur.getNom())
                            .prenom(encadreur.getPrenom())
                            .email(encadreur.getEmail())
                            .telephone(encadreur.getTelephone())
                            .build();
                    return encadreurRepository.saveAndFlush(updated);
                })
                .orElseThrow(() -> new EntityNotFoundException("Stagiaire not found with id " + id));

    }
    public String delete(Long id) {
        try {
            Optional<Encadreur> stagiaire = encadreurRepository.findById(id);
            if (stagiaire.isPresent()) {
                encadreurRepository.deleteById(id);
                return "success";
            } else {
                return "error";
            }
        } catch (Exception e) {
            return "error";
        }
    }
    public List<Encadreur> getAll() {
        return encadreurRepository.findAll();
    }
} 
