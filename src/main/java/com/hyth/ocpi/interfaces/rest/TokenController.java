package com.hyth.ocpi.interfaces.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.hyth.ocpi.application.service.TokenService;
import com.hyth.ocpi.domain.model.Token;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ocpi/2.2.1/tokens")
@Tag(name = "Tokens", description = "Управление токенами")
public class TokenController {

    private final TokenService service;

    @GetMapping
    @Operation(summary = "Получить все токены")
    public List<Token> getAll() {
        return service.getAll();
    }

    @GetMapping("/{uid}")
    @Operation(summary = "Получить токен по uid")
    public Optional<Token> getByUid(@PathVariable String uid) {
        return service.getByUid(uid);
    }

    @PostMapping
    @Operation(summary = "Сохранить токен")
    public void save(@RequestBody Token token) {
        service.save(token);
    }

    @DeleteMapping("/{uid}")
    @Operation(summary = "Удалить токен по uid")
    public void delete(@PathVariable String uid) {
        service.delete(uid);
    }
}
