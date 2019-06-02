package br.edu.fapi.produtos.revista;

import br.edu.fapi.produtos.Produto;

public class Revista implements Produto {

	protected String titulo;
	protected String editora;
	protected double preco;

	public Revista(String titulo, String editora, double preco) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

}

