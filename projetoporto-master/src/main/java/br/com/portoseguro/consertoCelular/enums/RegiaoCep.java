package br.com.portoseguro.consertoCelular.enums;

public enum RegiaoCep {
	
	NORTE("Norte"),
	SUL("Sul"),
	LESTE("Leste"),
	OESTE("Oeste"),
	CENTRO("Centro");
	
	String getCep;

	public String getCep() {
		return getCep;
	}
	
	RegiaoCep(String getCep) {
		this.getCep = getCep;
	}

}
