package com.abdoulayediallo.EncadreurService.clients;

import com.abdoulayediallo.EncadreurService.dto.StagiaireDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STAGIAIRE-SERVICE")
public interface StagiaireClient {
    @GetMapping("/api/stagiares/{id}")
    StagiaireDTO findStagiareById(@PathVariable Long id);
}
