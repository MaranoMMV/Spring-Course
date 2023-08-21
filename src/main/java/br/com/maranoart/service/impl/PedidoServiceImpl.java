package br.com.maranoart.service.impl;

import org.springframework.stereotype.Service;

import br.com.maranoart.domain.repository.Pedidos;
import br.com.maranoart.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{
    
    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }

    
}
