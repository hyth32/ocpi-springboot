package com.hyth.ocpi.domain.repository;

import java.util.Optional;

import com.hyth.ocpi.domain.model.Credentials;

public interface CredentialsRepository {
    Optional<Credentials> get();
    void save(Credentials credentials);
    void delete();
}
