package com.abdoulayediallo.StagiaireService.repositories;
import com.abdoulayediallo.StagiaireService.models.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire, Long> {
    // Additional query methods can be defined here if needed
}

