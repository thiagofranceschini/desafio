package br.com.thiago.desafio.controllers;
/**
 * Utilizando a @RestController nao preciso determinar @ResponseBoby do springBoot ou utilizar outros frameworks para tratar a disponibilizacao do jSon
 * Utilizei o @GetMapping pela semantica da anotacao, mas poderia utilizar @RequestMapping(path="/lancamentos, method=RequestMethod.GET), mas essa definicao depende do time, do que o time achar mais legivel
 * Procurei nomear o metodo e o mapeamento do list com o nome do recurso no plural como entendo ser a boa pratica
 * 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiago.desafio.models.LancamentoContaLegado;
import br.com.thiago.desafio.services.LancamentoContaLegadoService;

@RestController
@RequestMapping(path = "/rest")
public class LancamentosController {

	@Autowired
	private LancamentoContaLegadoService service;

	@GetMapping(path = "/lancamentos")
	public ResponseEntity<?> list() {
		LancamentoContaLegado all = service.findAll();
		return ResponseEntity.ok().body(all);
	}

}
