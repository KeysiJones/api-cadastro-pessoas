package com.keysijones.cadastros.controller;

import com.keysijones.cadastros.model.Pessoa;
import com.keysijones.cadastros.service.PessoaService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CadastrosController {

    private final PessoaService pessoaService;

    public CadastrosController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping("/cadastrar")
    public Pessoa cadastrarPessoa(@RequestBody @Validated Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @GetMapping("/consultar-cadastros")
    public List<Pessoa> consultarPessoas() {
        return pessoaService.findAll();
    }

    @GetMapping("/pessoa/{id}")
    public Optional<Pessoa> findPessoa(@PathVariable(name = "id") Long id) {
        return Optional.ofNullable(pessoaService.findById(id)).orElse(null);
    }

    @GetMapping("/pessoa")
    public List<Pessoa> findPessoaByName(@RequestParam(name = "nome") String nome) {
        return Optional.ofNullable(pessoaService.findPessoaWithThisName(nome)).orElse(null);
    }
}
