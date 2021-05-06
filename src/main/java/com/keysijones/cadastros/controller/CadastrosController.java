package com.keysijones.cadastros.controller;

import com.keysijones.cadastros.model.Pessoa;
import com.keysijones.cadastros.repository.PessoaRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CadastrosController {

    private final PessoaRepository repository;

    public CadastrosController(PessoaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/cadastrar")
    public Pessoa cadastrarPessoa(@RequestBody @Validated Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @GetMapping("/consultar-cadastros")
    public List<Pessoa> consultaPessoa() {
        return repository.findAll();
    }
}
