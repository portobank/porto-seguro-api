package br.com.portoseguro.consertoCelular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portoseguro.consertoCelular.service.ServiceConserto;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {

	@Autowired
	ServiceConserto service;

	public static final String CEPOK = "CEP Aprovado";
	public static final String CEPN = "Atendimento não realizado para região de São Paulo";

	@GetMapping("/cep")
	public String getClientes() {
		
		return service.validaCEP();
	}
	

}
