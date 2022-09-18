package br.com.alura.loja;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;


public class CalculadoraDeDescontos {
public BigDecimal calcular(Orcamento orcamento) {
	Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
			new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
					new SemDesconto()));

			return desconto.calcular(orcamento);
}
}
