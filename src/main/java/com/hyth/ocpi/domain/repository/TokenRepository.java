package com.hyth.ocpi.domain.repository;

import java.util.List;
import java.util.Optional;

import com.hyth.ocpi.domain.model.Token;

public interface TokenRepository {
    Optional<Token> findByUid(String uid);
    void save(Token token);
    List<Token> findAll();
    void delete(String uid);
}
