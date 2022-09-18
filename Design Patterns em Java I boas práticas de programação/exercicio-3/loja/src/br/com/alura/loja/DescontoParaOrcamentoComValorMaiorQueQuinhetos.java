package br.com.alura.loja;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;
public class DescontoParaOrcamentoComValorMaiorQueQuinhetos extends Desconto{
	
	public DescontoParaOrcamentoComValorMaiorQueQuinhetos(Desconto proximo) {
		super(proximo);
		
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	

	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
