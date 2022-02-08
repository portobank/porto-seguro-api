package br.com.portoseguro.consertoCelular.enums;

public enum TpPagamento {
	
	CREDITO("Cartão de Crédito"),
	DEBITO("Cartão de Débito"),
	BOLETO("Boleto Bancário");
	
	String getDescription;

	public String getDescription() {
		return getDescription;
	}
	
	TpPagamento(String getDescription) {
		this.getDescription = getDescription;
	}

}
