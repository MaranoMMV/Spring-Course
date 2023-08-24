package br.com.maranoart.rest.dto;

import java.math.BigDecimal;
import java.util.List;

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
    
    private Integer cliente;
    private BigDecimal total;
    private List<ItemsPedidoDTO> items;
}
