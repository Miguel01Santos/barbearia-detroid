package com.pereiraLavaJato.service;

import org.springframework.stereotype.Service;

import com.pereiraLavaJato.model.AgendamentosPorProfissional;
import com.pereiraLavaJato.repository.AgendamentosPorProfissionalRepository;

import java.util.List;

@Service
public class AgendamentosPorProfissionalService {

    private final AgendamentosPorProfissionalRepository repository;

    public AgendamentosPorProfissionalService(AgendamentosPorProfissionalRepository repository) {
        this.repository = repository;
    }

    public List<AgendamentosPorProfissional> listarTodos() {
        return repository.findAll();
    }
}
