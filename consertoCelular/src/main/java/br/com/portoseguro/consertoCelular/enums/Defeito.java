package br.com.portoseguro.consertoCelular.enums;

public enum Defeito {
	
	TELA("Tela"),
	TOUCH("Touch Screan"),
	BATERIA("Bateria"),
	CABO("Cabo"),
	VOLUME("Volume"),
	BOTAOLIGAR("Botão Ligar"),
	BOTAOVOLUME("Botão Volume"),
	CAMERA("Camera");
	
	String getDescription;

	public String getDescription() {
		return getDescription;
	}
	
	Defeito(String getDescription) {
		this.getDescription = getDescription;
	}

}
