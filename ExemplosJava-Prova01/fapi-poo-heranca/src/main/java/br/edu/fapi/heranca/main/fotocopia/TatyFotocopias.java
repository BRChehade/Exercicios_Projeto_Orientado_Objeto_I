package br.edu.fapi.heranca.main.fotocopia;

public class TatyFotocopias extends EmpresaFotocopiadora {

	public double tirarFotocopias(int quantidadePaginas) {
		System.out.println("Dentro do método tirarFotocopias da taty");
		System.out.println("O valor total para " + quantidadePaginas + " é " + (0.15 * quantidadePaginas));
		return (0.15 * quantidadePaginas);
	};
	
}
