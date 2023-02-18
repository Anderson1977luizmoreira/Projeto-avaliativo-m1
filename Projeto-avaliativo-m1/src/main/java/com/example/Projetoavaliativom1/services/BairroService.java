package com.example.Projetoavaliativom1.services;


import com.example.Projetoavaliativom1.repositories.Bairro;
import org.springframework.stereotype.Service;

@Service
public class BairroService {


    private BairrorRepository repository;

    public BairroService(Bairro repository) {
        this.repository = repository;

    }

    public void salvar(Bairro bairro) {
        repository.save(bairro);
    }
}
