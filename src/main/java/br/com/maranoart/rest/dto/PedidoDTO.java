package br.com.maranoart.rest.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import br.com.maranoart.validation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// {
//     "cliente" : 1,
//     "total" : 100,
//     "itens" : [
//         "produto" : 1,
//         "quantidade" : 10
//     ]
// }
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
    
    @NotNull(message = "{campo.codigo-cliente.obrigatorio}")
    private Integer cliente;
    @NotNull(message = "{campo.total-pedido.obrigatorio}")
    private BigDecimal total;
    @NotEmptyList(message = "{campo.items-pedido.obrigatorio}")
    private List<ItemsPedidoDTO> items;
    
}
