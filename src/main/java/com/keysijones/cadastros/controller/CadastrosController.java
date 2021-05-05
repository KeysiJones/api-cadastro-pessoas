package com.keysijones.cadastros.controller;

import com.keysijones.cadastros.model.Pessoa;
import com.keysijones.cadastros.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CadastrosController {

    private PessoaRepository repository;

    public CadastrosController(PessoaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cadastrar")
    public Pessoa cadastraPessoa() {
        Pessoa pessoa8 = new Pessoa();
        pessoa8.setIdade(12);
        pessoa8.setNome("Keysi");
        pessoa8.setProfissao("Developer");

        return repository.save(pessoa8);
    }

    @GetMapping("/consultar")
    public Iterable<Pessoa> consultaPessoa() {
        return repository.findAll();
    }
}
