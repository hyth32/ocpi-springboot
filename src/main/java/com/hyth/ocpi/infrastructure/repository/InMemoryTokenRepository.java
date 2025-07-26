package com.hyth.ocpi.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.hyth.ocpi.domain.model.Token;
import com.hyth.ocpi.domain.repository.TokenRepository;

public class InMemoryTokenRepository implements TokenRepository {

    private final Map<String, Token> storage = new ConcurrentHashMap<>();

    @Override
    public Optional<Token> findByUid(String uid) {
        return Optional.ofNullable(storage.get(uid));
    }

    @Override
    public void save(Token token) {
        storage.put(token.getUid(), token);
    }

    @Override
    public List<Token> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String uid) {
        storage.remove(uid);
    }
    
}
