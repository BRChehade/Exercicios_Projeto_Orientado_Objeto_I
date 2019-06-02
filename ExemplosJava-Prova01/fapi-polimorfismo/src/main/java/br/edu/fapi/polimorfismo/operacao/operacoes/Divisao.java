package br.edu.fapi.polimorfismo.operacao.operacoes;

import br.edu.fapi.polimorfismo.operacao.Operacao;

public class Divisao extends Operacao{
	public float executaOperacao(float numero1, float numero2) {
		if (numero2 == 0.0f) {
			return 0.0f;
		} else {
			return numero1 / numero2;
		}
	}
}
