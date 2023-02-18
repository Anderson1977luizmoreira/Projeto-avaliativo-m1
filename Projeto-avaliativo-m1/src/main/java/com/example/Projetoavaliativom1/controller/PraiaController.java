package com.example.Projetoavaliativom1.controller;

import com.example.Projetoavaliativom1.repositories.Praia;
import com.example.Projetoavaliativom1.services.PraiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Praia")
public class PraiaController {

    @Autowired
    PraiaService service;

    @PostMapping
    public void cadastrar(@RequestBody Praia praia) {
        service.salvar(praia);
    }

    }





