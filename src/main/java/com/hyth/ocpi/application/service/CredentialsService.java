package com.hyth.ocpi.application.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hyth.ocpi.domain.model.Credentials;
import com.hyth.ocpi.domain.repository.CredentialsRepository;

@Service
public class CredentialsService {
    
    private final CredentialsRepository repository;

    public CredentialsService(CredentialsRepository repository) {
        this.repository = repository;
    }

    public Optional<Credentials> get() {
        return repository.get();
    }

    public void save(Credentials credentials) {
        repository.save(credentials);
    }

    public void delete() {
        repository.delete();
    }
}
