package br.edu.fapi.heranca.main.fotocopia;

public class EmpresaFotocopiadora {

	public double tirarFotocopias(int quantidadePaginas) {
		System.out.println("O valor total para " + quantidadePaginas + " é" + (0.2 * quantidadePaginas));
		return (0.2 * quantidadePaginas);
	};
	
}
