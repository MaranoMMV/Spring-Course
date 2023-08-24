package br.com.maranoart.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.maranoart.domain.entity.Pedido;
import br.com.maranoart.rest.dto.InformacoesPedidoDTO;
import br.com.maranoart.rest.dto.PedidoDTO;
import br.com.maranoart.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save( @RequestBody PedidoDTO dto ){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }
    
    @GetMapping("{id}")
    public InformacoesPedidoDTO getById(@PathVariable Integer id){
        return service.oberPedidoCompleto(id)
                        .map(p -> {

                        })
                        .orElseThrow(() ->
                            new ResponseStatusException(HttpStatus.NOT_FOUND, "Pedido não encontrado"));
    }
    private InformacoesPedidoDTO converter( Pedido pedido){

    }
}
