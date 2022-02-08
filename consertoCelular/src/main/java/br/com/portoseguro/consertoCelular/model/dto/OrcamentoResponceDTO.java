package br.com.portoseguro.consertoCelular.model.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.portoseguro.consertoCelular.enums.Defeito;
import br.com.portoseguro.consertoCelular.model.Cliente;
import br.com.portoseguro.consertoCelular.model.Orcamento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrcamentoResponceDTO {
	

	private String marca;
	private String modelo;
	private Defeito defeito;
	private Double total;
	private Double frete;
	private Double custos;
	
	public OrcamentoResponceDTO(Orcamento orc) {
		super();
		this.marca = orc.getMarca();
		this.modelo = orc.getModelo();
		this.defeito = orc.getDefeito();
		this.total = orc.getTotal();
		this.frete = orc.getFrete();
		this.custos = orc.getCustos();
	}
	

	
}
