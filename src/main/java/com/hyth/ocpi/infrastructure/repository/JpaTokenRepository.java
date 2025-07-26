package com.hyth.ocpi.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyth.ocpi.domain.model.Token;

public interface JpaTokenRepository extends JpaRepository<Token, String> {}
