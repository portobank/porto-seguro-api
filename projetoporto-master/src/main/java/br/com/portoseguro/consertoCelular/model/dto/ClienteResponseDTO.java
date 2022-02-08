package br.com.portoseguro.consertoCelular.model.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.portoseguro.consertoCelular.enums.RegiaoCep;
import br.com.portoseguro.consertoCelular.model.Cliente;
import br.com.portoseguro.consertoCelular.model.Endereco;
import lombok.Getter;

@Getter
public class ClienteResponseDTO {
	
	private String nome;
	private String cep;
	
	public ClienteResponseDTO(Cliente end) {
		this.nome = end.getNome();
		this.cep = end.getEndereco().getCep().toString();
	}

	public static List<ClienteResponseDTO> converter(List<Cliente> clientes) {
		return clientes.stream().map(ClienteResponseDTO::new).collect(Collectors.toList());
	}
	
	

}
