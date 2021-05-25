package com.keysijones.cadastros.service;

import com.keysijones.cadastros.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PessoaService {
    List<Pessoa> findPessoaWithThisName(String nome);

    List<Pessoa> findAll();

    Optional<Pessoa> findById(Long id);

    Pessoa save(Pessoa pessoa);
}
