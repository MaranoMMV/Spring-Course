package br.com.maranoart.rest;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class ApiErrors {

    private List<String> errors;

    public ApiErrors(String mensagemErro){
        this.errors = Arrays.asList(mensagemErro);
    }


}
