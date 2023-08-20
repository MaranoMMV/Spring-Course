package br.com.maranoart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.maranoart.domain.entity.Cliente;
import br.com.maranoart.domain.repository.Clientes;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner commandLineRunner(@Autowired Clientes cliente){
        return args ->{
            Cliente c = new Cliente(null, "fulano");
            cliente.save(c);
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
