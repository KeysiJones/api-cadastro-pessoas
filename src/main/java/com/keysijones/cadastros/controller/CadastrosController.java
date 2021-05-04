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
        Pessoa pessoa1 = new Pessoa("Lauren Viana", 32, "PO");
        Pessoa pessoa2 = new Pessoa("Eduardo Prado", 27, "QA");
        Pessoa pessoa3 = new Pessoa("Lucas Silveira", 25, "Tester");
        Pessoa pessoa4 = new Pessoa("Jonathan James", 29, "BO");
        Pessoa pessoa5 = new Pessoa("J.K Rowling", 18, "CEO");
        Pessoa pessoa6 = new Pessoa("Harry Estilos", 34, "Escritor");
        Pessoa pessoa7 = new Pessoa("Dan Bon Jams", 37, "Frontend Especialist");
        Pessoa pessoa8 = new Pessoa("Mickey Jaggy", 35, "Backend Developer");
        Pessoa pessoa9 = new Pessoa("Jon Bones James", 42, "Scrum Master");
        Pessoa pessoa10 = new Pessoa("Mano Brownie", 19, "Agilista");

        List<Pessoa> list = new ArrayList<>();

        list.add(pessoa);
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        list.add(pessoa5);
        list.add(pessoa6);
        list.add(pessoa7);
        list.add(pessoa8);
        list.add(pessoa9);
        list.add(pessoa10);

        return list;
    }
}
