package br.com.maranoart.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maranoart.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer>{
    
}
