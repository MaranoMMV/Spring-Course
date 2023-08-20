package br.com.maranoart.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maranoart.domain.entity.Cliente;
import br.com.maranoart.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer>{
    
    List<Pedido> findByCliente(Cliente cliente);
    
}
