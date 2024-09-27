package com.group.backend.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.backend.entity.ApiPublica;

@Repository
public interface ApiRepository extends JpaRepository<ApiPublica, Long> {
    
}
