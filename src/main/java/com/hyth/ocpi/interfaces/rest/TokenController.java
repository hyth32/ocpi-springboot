package com.hyth.ocpi.interfaces.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.hyth.ocpi.application.service.TokenService;
import com.hyth.ocpi.domain.model.Token;

@RestController
@RequestMapping("/ocpi/2.2.1/tokens")
public class TokenController {

    private final TokenService service;

    public TokenController(TokenService tokenService) {
        this.service = tokenService;
    }

    @GetMapping
    public List<Token> getAll() {
        return service.getAll();
    }

    @GetMapping("/{uid}")
    public Optional<Token> getByUid(@PathVariable String uid) {
        return service.getByUid(uid);
    }

    @PostMapping
    public void save(@RequestBody Token token) {
        service.save(token);
    }

    @DeleteMapping("/{uid}")
    public void delete(@PathVariable String uid) {
        service.delete(uid);
    }
}
