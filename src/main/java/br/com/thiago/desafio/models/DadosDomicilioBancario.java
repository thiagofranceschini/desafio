
package br.com.thiago.desafio.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "codigoBanco", "numeroAgencia", "numeroContaCorrente" })
public class DadosDomicilioBancario {

	@JsonProperty("codigoBanco") 
	private Integer codigoBanco;
	@JsonProperty("numeroAgencia")
	private Integer numeroAgencia;
	@JsonProperty("numeroContaCorrente")
	private String numeroContaCorrente;

	public DadosDomicilioBancario() {
		super();
	}

	public DadosDomicilioBancario(Integer codigoBanco, Integer numeroAgencia, String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}

	@JsonProperty("codigoBanco")
	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	@JsonProperty("codigoBanco")
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	@JsonProperty("numeroAgencia")
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	@JsonProperty("numeroAgencia")
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@JsonProperty("numeroContaCorrente")
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	@JsonProperty("numeroContaCorrente")
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

}
