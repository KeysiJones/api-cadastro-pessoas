package com.keysijones.cadastros.repository;

import com.keysijones.cadastros.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
