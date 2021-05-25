package com.keysijones.cadastros.service.impl;

import com.keysijones.cadastros.model.Pessoa;
import com.keysijones.cadastros.repository.PessoaRepository;
import com.keysijones.cadastros.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> findPessoaWithThisName(String nome) {
        return pessoaRepository.findByNomeContainingIgnoreCase(nome);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
