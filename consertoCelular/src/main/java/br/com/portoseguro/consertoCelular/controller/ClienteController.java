package br.com.portoseguro.consertoCelular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.portoseguro.consertoCelular.enums.Defeito;
import br.com.portoseguro.consertoCelular.enums.RegiaoCep;
import br.com.portoseguro.consertoCelular.enums.TpPagamento;
import br.com.portoseguro.consertoCelular.model.Celular;
import br.com.portoseguro.consertoCelular.model.Endereco;
import br.com.portoseguro.consertoCelular.model.Orcamento;
import br.com.portoseguro.consertoCelular.model.dto.ClienteDTO;
import br.com.portoseguro.consertoCelular.model.dto.OrcamentoRequestDTO;
import br.com.portoseguro.consertoCelular.model.dto.OrcamentoResponceDTO;
import br.com.portoseguro.consertoCelular.repository.OrcamentoRepository;
import br.com.portoseguro.consertoCelular.service.ConsertoService;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {

	@Autowired
	ConsertoService service;
	
	@Autowired
	private OrcamentoRepository orcRepository;

	public static final String CEPOK = "CEP Aprovado";
	public static final String CEPN = "Atendimento não realizado para região de São Paulo";

	@GetMapping("/cep")
	public String getClientes() {
		
		return service.validaCEP();
	}
	
	@PostMapping("/orcamento")
	@ResponseStatus(HttpStatus.CREATED)
	public Orcamento getOrcamento(@RequestBody Orcamento requestDTO) {
		Orcamento orc = requestDTO;
		requestDTO.setCustos(67.5);
		requestDTO.setFrete(22.5);
		requestDTO.setTotal(240 + orc.getCustos() + orc.getFrete());
		
		return orcRepository.save(orc);
	}
	
	@GetMapping("/historico")
	public ClienteDTO getHistorico() {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNome("Victor");
		cliente.setEmail("hotts_victor@hot.com");
		cliente.setCpf("32342342342342");
		cliente.setEndereco(new Endereco(null, "Ruaa", RegiaoCep.LESTE));
		cliente.setPagamento(TpPagamento.CREDITO);
		ClienteDTO.getHistorico();
		
		return cliente;
	}
	
}
