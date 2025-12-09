package com.pereiraLavaJato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pereiraLavaJato.model.ProfissionaisAtivos;

@Repository
public interface ProfissionaisAtivosRepository extends JpaRepository<ProfissionaisAtivos, Integer> {
}

