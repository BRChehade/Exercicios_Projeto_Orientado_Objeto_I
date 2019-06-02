package br.edu.fapi.produtos;

import br.edu.fapi.excecao.DescontoInvalidoException;

public interface Promocao {

	double aplicarDesconto(double d) throws DescontoInvalidoException;

	default double aplicarDescontoDe10Porcento() throws DescontoInvalidoException {
		return aplicarDesconto(0.9);
	}

	default double aplicarDescontoDe20Porcento() {
		try {
			return aplicarDesconto(0.8);
		} catch (DescontoInvalidoException e) {
			System.out.println(e.getMessage() + " O desconto desejado era de " + e.getDesconto());
			return 0.00;
		}
	}

	default double aplicarDescontoDe30Porcento() {
		try {
			return aplicarDesconto(0.7);
		} catch (DescontoInvalidoException e) {
			System.out.println(e.getMessage() + " O desconto desejado era de " + e.getDesconto());
			return 0.00;
		}
	}

	default double aplicarDescontoDe40Porcento() {
		try {
			return aplicarDesconto(0.6);
		} catch (DescontoInvalidoException e) {
			System.out.println(e.getMessage() + " O desconto desejado era de " + e.getDesconto());
			return 0.00;
		}
	}

	default double aplicarDescontoDe50Porcento() {
		try {
			return aplicarDesconto(0.5);
		} catch (DescontoInvalidoException e) {
			System.out.println(e.getMessage() + " O desconto desejado era de " + e.getDesconto());
			return 0.00;
		}
	}

}
