package br.com.alura.loja;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;


public class CalculadoraDeDescontos {
public BigDecimal efetuarCalculo(Orcamento orcamento) {
	Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
			new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
					new SemDesconto()));

			return cadeiaDeDescontos.calcular(orcamento);
}
}
