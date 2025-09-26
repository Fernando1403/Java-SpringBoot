package com.fiap.bancofiap;

import com.fiap.bancofiap.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

    @Autowired
    private Curso curso;

    @GetMapping("/curso")
    public String exibirCurso(){
        return curso.getDescricao();
    }
}
