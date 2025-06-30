package com.abdoulayediallo.EncadreurService.repositories;
import com.abdoulayediallo.EncadreurService.models.Encadreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EncadreurRepository extends JpaRepository<Encadreur, Long> {
    // Additional query methods can be defined here if needed
}

