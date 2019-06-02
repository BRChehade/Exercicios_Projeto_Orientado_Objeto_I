package br.edu.fapi.heranca.main.fotocopia;

public class AlexFotocopias extends EmpresaFotocopiadora{

	public double tirarFotocopias(EmpresaFotocopiadora empresaFotocopiadora, int quantidadePaginas) {
		System.out.println("Dentro do método tirarFotocopias do Alex");
		double custo = empresaFotocopiadora.tirarFotocopias(quantidadePaginas);
		System.out.println("Adicionando custo alex");
		double total = custo + 5.0;
		return total;
	};
	
}
