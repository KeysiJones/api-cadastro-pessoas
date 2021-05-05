package com.keysijones.cadastros.controller;

import com.keysijones.cadastros.model.Pessoa;
import com.keysijones.cadastros.repository.PessoaRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CadastrosController {

    private PessoaRepository repository;

    public CadastrosController(PessoaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/cadastrar")
    public void cadastraPessoa(@RequestBody @Validated Pessoa pessoa) {
        try {
            repository.save(pessoa);
        } catch (Exception e) {
            System.out.println("********** Erro: " + e.getMessage() + " **********");
        }
    }

    @GetMapping("/consultar-cadastros")
    public List<Pessoa> consultaPessoa() {
        return repository.findAll();
    }
}
