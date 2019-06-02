package br.edu.fapi.produtos.hq;

import br.edu.fapi.produtos.Produto;

public abstract class HQ implements Produto{

	protected String titulo;
	protected String autor;
	protected String editora;
	protected int paginas;
	protected String idioma;
	protected double precoHQ;
	
	public HQ(String titulo, String autor, String editora, int paginas, String idioma, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
		this.idioma = idioma;
		this.precoHQ = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public String getIdioma() {
		return idioma;
	}

	public double getPreco() {
		return precoHQ;
	}

	public void setPreco(double preco) {
		this.precoHQ = preco;
	}
	

}
