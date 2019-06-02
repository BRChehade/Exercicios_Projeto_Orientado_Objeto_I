package br.edu.fapi.ex05;

public class Padrao implements ServicoDeDesconto {
	
	@Override
	public double calcularDesconto(double preco) {
		return preco * 0.95;
	}

}
