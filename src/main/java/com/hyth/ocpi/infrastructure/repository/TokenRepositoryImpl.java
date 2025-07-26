package com.hyth.ocpi.infrastructure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.hyth.ocpi.domain.model.Token;
import com.hyth.ocpi.domain.repository.TokenRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TokenRepositoryImpl implements TokenRepository {
    
    private final JpaTokenRepository jpa;

    @Override
    public Optional<Token> findByUid(String uid) {
        return jpa.findById(uid);
    }

    @Override
    public void save(Token token) {
        jpa.save(token);
    }

    @Override
    public List<Token> findAll() {
        return jpa.findAll();
    }

    @Override
    public void delete(String uid) {
        jpa.deleteById(uid);
    }
}
