package br.com.maranoart.exception;

public class PedidoNaoEncontradoException extends RuntimeException{
    public PedidoNaoEncontradoException(String message){
        super(message);
    }
}
