package br.com.portoseguro.consertoCelular.model.dto;

import br.com.portoseguro.consertoCelular.enums.TpPagamento;
import br.com.portoseguro.consertoCelular.model.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {

	private String nome;
	private String email;
	private String cpf;
	private Endereco endereco;
	private TpPagamento pagamento;
	static int historico ;
	
	public ClienteDTO() {
	}
	
	public ClienteDTO(String nome, String email, String cpf, Endereco endereco, TpPagamento pagamento ) {
		ClienteDTO.historico ++;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.pagamento = pagamento;
	}

	public static int getHistorico() {
		return historico ++;
	}

	
}
