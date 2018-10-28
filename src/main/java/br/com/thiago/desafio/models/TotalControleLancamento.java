
package br.com.thiago.desafio.models;

import java.math.BigDecimal;

public class TotalControleLancamento {

	private Integer quantidadeLancamentos;
	private Integer quantidadeRemessas;
	private BigDecimal valorLancamentos;
 
	public TotalControleLancamento() {
		super();
	}

	public TotalControleLancamento(Integer quantidadeLancamentos, Integer quantidadeRemessas, BigDecimal valorLancamentos) {
		super();
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
	}

	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public BigDecimal getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(BigDecimal valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

}
