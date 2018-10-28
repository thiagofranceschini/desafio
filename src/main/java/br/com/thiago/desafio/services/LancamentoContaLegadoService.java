package br.com.thiago.desafio.services;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import br.com.thiago.desafio.models.DadosDomicilioBancario;
import br.com.thiago.desafio.models.LancamentoContaCorrenteCliente;
import br.com.thiago.desafio.models.LancamentoContaLegado;
import br.com.thiago.desafio.models.ListaControleLancamento;
import br.com.thiago.desafio.models.TotalControleLancamento;

/**
 * No service poderiamos buscar os dados injetando um repository , ou injetando um cliente com feign ou resttemplate, dessa forma...
 * a origem de nossos dados poderiam vir do próprio legado se o mesmo tivesse um endpoint, ou do banco de dados atual. 
 * Contudo para buscar do banco utilizando JPA, Hibernate e SpringData, precisaria entender a modelagem desse banco, o relacionamento entre as classes, 
 * sem o relacionamento poderia escrever o codigo injetando uma instancia de uma classe que extendensse de JPARepository(por exemplo), buscando nossos dados no banco
 */
@Service
public class LancamentoContaLegadoService {
	
	DecimalFormat decFormat = new DecimalFormat("#,###,##0.00");
	/**
	 * método poderia receber um repository injetado ou um cliente injetado para buscar os dados no databank ou em um cliente RestFull
	 * @return dados mockados
	 */
	public LancamentoContaLegado findAll() {
		return mockData();
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * metodo popula uma instancia "mockando" os dados que recebemos no json de modelo.
	 * O ideal seria uma busca ao banco legado atraves da chamada a um padrao repository ou a chamada de um cliente webservice que consumisse os dados
	 * mantive separado para manter a legibilidade do codigo acima, pois abaixo apenas temos uma populacao dos objetos com os dados semelhantes aos recebios no json
	 */
	private LancamentoContaLegado mockData() {
		DadosDomicilioBancario dadosDomicilioBancario = new DadosDomicilioBancario(123, 1, "00000000065470");

		TotalControleLancamento totalControleLancamento = new TotalControleLancamento(608, 39, new BigDecimal(473320.370).setScale(2, RoundingMode.HALF_EVEN ));

		LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente = new LancamentoContaCorrenteCliente(64320236054l,
																			"pago", dadosDomicilioBancario, "regular", null);

		ListaControleLancamento listaControleLancamento = new ListaControleLancamento(lancamentoContaCorrenteCliente,
							"03/06/2016", "03/06/2016", 42236790, "LA-56", "1", "BANCO ABCD S.A.             ", 22, "12996721",
																"1597", new BigDecimal(11499.10).setScale(2, RoundingMode.HALF_EVEN ), 1464922800000l, 1464922800000l);

		DadosDomicilioBancario dadosDomicilioBancario2 = new DadosDomicilioBancario(123, 1, "00000000065470");

		LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente2 = new LancamentoContaCorrenteCliente(
																	64320626054l, "Pago", dadosDomicilioBancario2, "regular", null);

		ListaControleLancamento listaControleLancamento2 = new ListaControleLancamento(lancamentoContaCorrenteCliente2,
									"02/06/2016", "02/06/2016", 42592397, "LA-56", "25", "BANCO ABCD S.A.             ", 2, "12996721",
																		"1597", new BigDecimal(1960.00).setScale(2, RoundingMode.HALF_EVEN ), 1464836400000l, 1464836400000l);

		return new LancamentoContaLegado(totalControleLancamento, Arrays.asList(listaControleLancamento, listaControleLancamento2), 1, 25, 39);
	}

}
