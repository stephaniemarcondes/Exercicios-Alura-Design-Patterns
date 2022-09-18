package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {
private String cliente;
private LocalDateTime data;
private Orcamento orcamento;

public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
	super();
	this.cliente = cliente;
	this.data = data;
	this.orcamento = orcamento;
}

public String getCliente() {
	return cliente;
}
public Orcamento getOrcamento() {
	return orcamento;
}
public LocalDateTime getData() {
	return data;
}

}
