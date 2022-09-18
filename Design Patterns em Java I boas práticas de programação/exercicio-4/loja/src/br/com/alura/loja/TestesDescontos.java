package br.com.alura.loja;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;




public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal ("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal ("1000"), 1);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.efetuarCalculo(primeiro));
		System.out.println(calculadora.efetuarCalculo(segundo));
	}

}
