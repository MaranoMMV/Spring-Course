package br.com.maranoart.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maranoart.domain.entity.ItemPedido;

public interface ItemPedidos extends JpaRepository<ItemPedido, Integer>{
    
}
