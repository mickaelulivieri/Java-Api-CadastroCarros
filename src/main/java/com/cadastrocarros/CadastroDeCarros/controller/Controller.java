package com.cadastrocarros.CadastroDeCarros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Primeira rota";
    }
}
