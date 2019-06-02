package br.edu.fapi.polimorfismo.main;

import br.edu.fapi.polimorfismo.operacao.Operacao;
import br.edu.fapi.polimorfismo.operacao.operacoes.Multiplicacao;
import br.edu.fapi.polimorfismo.operacao.operacoes.Soma;

public class Main {

	public static void main(String[] args) {
		//Utilizando apenas uma variável do tipo Operacao eu consigo atribuir a ela
		//diferentes operacões e chamar seu método sobrescrito "executaOperacao" de acordo
		//com cada operação que eu quero.
		Operacao operacao = new Soma();
		float resultado  = operacao.executaOperacao(10, 15);
		
		operacao = new Multiplicacao();
		resultado = operacao.executaOperacao(resultado, 4);
		
		System.out.println("O resultado de (10 + 15) * 4 é: " + resultado);
	}
	
}
