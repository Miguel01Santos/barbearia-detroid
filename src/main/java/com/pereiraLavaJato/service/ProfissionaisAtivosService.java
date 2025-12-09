package com.pereiraLavaJato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereiraLavaJato.model.ProfissionaisAtivos;
import com.pereiraLavaJato.repository.ProfissionaisAtivosRepository;

import java.util.List;

@Service
public class ProfissionaisAtivosService {

    @Autowired
    private ProfissionaisAtivosRepository repository;

    public List<ProfissionaisAtivos> listarProfissionaisAtivos() {
        return repository.findAll();
    }
}
