package br.com.portoseguro.consertoCelular.model.dto;

import br.com.portoseguro.consertoCelular.enums.Defeito;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrcamentoRequestDTO {

	private String marca;
	private String modelo;
	private Defeito defeito;
	
	
}
