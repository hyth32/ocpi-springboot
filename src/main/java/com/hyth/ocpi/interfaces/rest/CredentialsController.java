package com.hyth.ocpi.interfaces.rest;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyth.ocpi.application.service.CredentialsService;
import com.hyth.ocpi.domain.model.Credentials;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("ocpi/2.2.1/credentials")
@Tag(name = "Credentials", description = "Credentials")
public class CredentialsController {
    
    private final CredentialsService service;

    @GetMapping
    @Operation(summary = "Получить credentials")
    public Optional<Credentials> get() {
        return service.get();
    }

    @PostMapping
    @Operation(summary = "Добавить credentials")
    public void post(@RequestBody Credentials credentials) {
        service.save(credentials);
    }

    @DeleteMapping
    @Operation(summary = "Удалить credentials")
    public void delete() {
        service.delete();
    }
}
