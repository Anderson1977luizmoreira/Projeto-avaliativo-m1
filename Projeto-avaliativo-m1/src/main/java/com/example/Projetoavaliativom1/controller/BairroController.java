package com.example.Projetoavaliativom1.controller;

import com.example.Projetoavaliativom1.repositories.Bairro;
import com.example.Projetoavaliativom1.services.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bairro")
public class BairroController {

    @Autowired
    BairroService service;

    @PostMapping
    public void cadastrar(@RequestBody Bairro bairro) {
        service.salvar(bairro);
    }
}










