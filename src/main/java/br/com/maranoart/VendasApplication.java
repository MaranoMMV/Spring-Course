package br.com.maranoart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maranoart.domain.entity.Cliente;
import br.com.maranoart.domain.repositorio.Clientes;

@SpringBootApplication
@Controller
@RestController
public class VendasApplication {

    @GetMapping("/")
	public String home(){
		return "index.html";
	}


	@Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
		return args -> {
			System.out.println("Salvando clientes");
			clientes.salvar(new Cliente("Matheus"));
			clientes.salvar(new Cliente("Outro Cliente"));

			System.out.println("Selecionando clientes");
			List<Cliente> todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

			System.out.println("Atualizando clientes");
			todosClientes.forEach(c ->{
				c.setNome(c.getNome() + " atualizado");
				clientes.atualizar(c);
			});



			todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

			clientes.buscarPorNome("Cli").forEach(System.out::println);;

			System.out.println("Deletando clientes");
			clientes.obterTodos().forEach(c ->{
				clientes.deletar(c);
			});
			todosClientes = clientes.obterTodos();
			if(todosClientes.isEmpty()){
				System.out.println("Nenhm cliente encontrado!");
			}else{
				todosClientes.forEach(System.out::println);
			}
			
			
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
