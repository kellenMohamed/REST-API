package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	//Criar endpoint API
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Joao Soares");
		cliente1.setTelefone("1559632145");
		cliente1.setEmail("joao.jose@email.com");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("99999999");
		cliente2.setEmail("maria.joao@email.com");
		
		return Arrays.asList(cliente1,cliente2);
		
	}
}
