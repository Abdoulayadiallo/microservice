package com.abdoulayediallo.StagiaireService.clients;

import com.abdoulayediallo.StagiaireService.dto.EncadreurDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ENCADREUR-SERVICE")
public interface EncadreurClient {
    @GetMapping("/api/encadreurs/{id}")
    EncadreurDTO findEncadreurById(@PathVariable Long id);
}
