package br.edu.fapi.pacote2;

public class Super {

	protected double preco;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double tirarFotocopias(int quantidadePaginas) {
		System.out.println("O valor total para " + quantidadePaginas + " é" + (0.2 * preco));
		return (quantidadePaginas * preco);
	};
}
