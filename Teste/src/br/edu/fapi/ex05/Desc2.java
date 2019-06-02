package br.edu.fapi.ex05;

public class Desc2 implements ServicoDeDesconto {
	
	@Override
	public double calcularDesconto(double preco) {
		return preco * 0.7;
	}

}
