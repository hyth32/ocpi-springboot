package com.hyth.ocpi.interfaces.rest;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyth.ocpi.application.service.CredentialsService;
import com.hyth.ocpi.domain.model.Credentials;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("ocpi/2.2.1/credentials")
public class CredentialsController {
    
    private final CredentialsService service;

    public CredentialsController(CredentialsService credentialsService) {
        this.service = credentialsService;
    }

    @GetMapping
    public Optional<Credentials> get() {
        return service.get();
    }

    @PostMapping
    public void post(@RequestBody Credentials credentials) {
        service.save(credentials);
    }

    @DeleteMapping
    public void delete() {
        service.delete();
    }
}
