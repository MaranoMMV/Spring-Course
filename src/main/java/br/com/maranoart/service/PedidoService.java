package br.com.maranoart.service;

import br.com.maranoart.domain.entity.Pedido;
import br.com.maranoart.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar( PedidoDTO dto);
}
