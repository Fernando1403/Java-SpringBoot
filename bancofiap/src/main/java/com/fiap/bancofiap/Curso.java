package com.fiap.bancofiap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Curso {

    @Autowired
    private Professor professor;

    public String getDescricao(){
        return "Curso de engenharia de software. Professor: " + professor.getNome();
    }
}
