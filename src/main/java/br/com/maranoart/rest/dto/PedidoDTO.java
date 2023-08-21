package br.com.maranoart.rest.dto;

import java.math.BigDecimal;
import java.util.List;

// {
//     "cliente" : 1,
//     "total" : 100,
//     "itens" : [
//         "produto" : 1,
//         "quantidade" : 10
//     ]
// }
public class PedidoDTO {
    
    private Integer cliente;
    private BigDecimal total;
    private List<itemPedidoDTO> items;
    
    public PedidoDTO() {
    }

    public PedidoDTO(Integer cliente, BigDecimal total, List<itemPedidoDTO> items) {
        this.cliente = cliente;
        this.total = total;
        this.items = items;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<itemPedidoDTO> getItems() {
        return items;
    }

}
