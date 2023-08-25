package br.com.maranoart.service;

import java.util.Optional;

import br.com.maranoart.domain.entity.Pedido;
import br.com.maranoart.domain.entity.enums.StatusPedido;
import br.com.maranoart.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar( PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido valueOf);
}
