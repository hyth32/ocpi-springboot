package com.hyth.ocpi.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hyth.ocpi.domain.model.Token;
import com.hyth.ocpi.domain.repository.TokenRepository;

@Service
public class TokenService {
    
    private final TokenRepository repository;

    public TokenService(TokenRepository repository) {
        this.repository = repository;
    }

    public List<Token> getAll() {
        return repository.findAll();
    }

    public Optional<Token> getByUid(String uid) {
        return repository.findByUid(uid);
    }
    
    public void save(Token token) {
        repository.save(token);
    }

    public void delete(String uid) {
        repository.delete(uid);
    }
}
