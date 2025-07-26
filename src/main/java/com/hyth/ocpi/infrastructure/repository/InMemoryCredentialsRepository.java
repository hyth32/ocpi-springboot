package com.hyth.ocpi.infrastructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.hyth.ocpi.domain.model.Credentials;
import com.hyth.ocpi.domain.repository.CredentialsRepository;

@Repository
public class InMemoryCredentialsRepository implements CredentialsRepository {
    
    private Credentials credentials;

    @Override
    public Optional<Credentials> get() {
        return Optional.ofNullable(credentials);
    }

    @Override
    public void save(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public void delete() {
        this.credentials = null;
    }
}
