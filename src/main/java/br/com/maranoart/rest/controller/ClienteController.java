package br.com.maranoart.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.maranoart.domain.entity.Cliente;

@Controller
// @RequestMapping("/api/clientes")
public class ClienteController {
    
    @RequestMapping(
        value = {"/ api/clientes/hello/{nome}", "/api/hello"},
        method = RequestMethod.POST,
        consumes = { "application/json", "application/xml" },
        produces = { "application/json", "application/xml"}
    )
    @ResponseBody
    public String helloCliente(@PathVariable("nome") String nomeCliente, @RequestBody Cliente cllente){
        return String.format("Hello %s", nomeCliente);
    }

}
