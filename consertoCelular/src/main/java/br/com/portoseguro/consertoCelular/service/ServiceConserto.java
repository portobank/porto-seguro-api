package br.com.portoseguro.consertoCelular.service;

import org.springframework.stereotype.Service;

import br.com.portoseguro.consertoCelular.enums.Defeito;
import br.com.portoseguro.consertoCelular.enums.RegiaoCep;
import br.com.portoseguro.consertoCelular.model.Celular;
import br.com.portoseguro.consertoCelular.model.Cliente;
import br.com.portoseguro.consertoCelular.model.Endereco;

@Service
public class ServiceConserto {
	
	public static final String CEPOK= "CEP Aprovado";
	public static final String CEPN= "Atendimento não realizado para região de São Paulo";


	public String validaCEP() {
		
		Cliente cli = new Cliente();
		
		cli.setNome("Victor");
		cli.setCelular(new Celular(null, "a", "a", Defeito.BATERIA));
		cli.setEmail("alo");
		cli.setCpf("32342342342342");
		cli.setEndereco(new Endereco(null, "Ruaa", RegiaoCep.LESTE));
		
		if (cli.getEndereco().getCep().equals(RegiaoCep.CENTRO)) {
			
			return CEPOK;
		} else {
			return CEPN ; 
		}
		
	}
}