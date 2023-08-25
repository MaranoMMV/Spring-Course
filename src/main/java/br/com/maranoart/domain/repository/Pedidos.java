package br.com.maranoart.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.maranoart.domain.entity.Cliente;
import br.com.maranoart.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer>{
    
    List<Pedido> findByCliente(Cliente cliente);
    
    @Query("SELECT p FROM Pedido p LEFT JOIN FETCH p.itens WHERE p.id = :id")
    Optional<Pedido> findByIdFetchItens(@Param("id") Integer id);
    
}
