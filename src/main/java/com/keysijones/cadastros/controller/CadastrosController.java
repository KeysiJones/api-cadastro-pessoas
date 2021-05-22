package com.keysijones.cadastros.controller;

import com.keysijones.cadastros.model.Pessoa;
import com.keysijones.cadastros.repository.PessoaRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/pessoa/{id}")
    public Optional<Pessoa> findPessoa(@PathVariable(name = "id") Long id) {
        return Optional.ofNullable(repository.findById(id)).orElse(null);
    }

    @GetMapping("/pessoa")
    public List<Pessoa> findPessoaByName(@RequestParam(name = "nome") String nome) {
        return Optional.ofNullable(repository.findByNomeContainingIgnoreCase(nome)).orElse(null);
    }
}
