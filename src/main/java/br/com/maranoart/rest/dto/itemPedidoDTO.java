package br.com.maranoart.rest.dto;

public class itemPedidoDTO {
    private Integer produto;
    private Integer quantidade;

    public itemPedidoDTO(){
    }

    public itemPedidoDTO(Integer produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    

}
