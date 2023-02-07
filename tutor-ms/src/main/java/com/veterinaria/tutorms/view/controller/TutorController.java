package com.veterinaria.tutorms.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.tutorms.model.Tutor;

@RestController
@RequestMapping("/tutors")
public class TutorController {
    
    @GetMapping(value = "/status")
    public String statusServico(@Value("${local.server.port}") String porta) {
        return String.format("Serviço em funcionamento na porta %s", porta);
    }

    // @GetMapping(value = "/{id}")
    // public 

    @GetMapping()
    public List<Tutor> listarTutores() {
        return List.of(
            new Tutor("1", "Gustavo", "gustavo@gmail.com", "qwerty", "21912345678"),
            new Tutor("2", "Yasmim", "yasmim@gmail.com", "qwerty", "21912345678")
            );
    }

}
