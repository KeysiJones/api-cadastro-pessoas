package com.keysijones.cadastros.controller;

import com.keysijones.cadastros.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CadastrosController {

    @GetMapping("/consultar-cadastros")
    public List<Pessoa> consultarCadastros() {
        Pessoa pessoa = new Pessoa("Keysi Jones", 24, "Developer");

        List<Pessoa> list = new ArrayList<Pessoa>();
        list.add(pessoa);

        return list;
    }
}
