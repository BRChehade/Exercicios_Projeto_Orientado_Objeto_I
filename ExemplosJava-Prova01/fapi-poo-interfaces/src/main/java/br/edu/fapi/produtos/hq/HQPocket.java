package br.edu.fapi.produtos.hq;

import br.edu.fapi.produtos.Promocao;

public class HQPocket extends HQFisica implements Promocao {

	public HQPocket(String titulo, String autor, String editora, int paginas, String idioma, String isbn, double preco) {
		super(titulo, autor, editora, paginas, idioma, isbn, preco);
	}

	@Override
	public double aplicarDesconto(double d) {
		System.out.println("A HQ edição pocket possuí um desconto de 20%");
		this.precoHQ = this.precoHQ * d;
		return this.precoHQ;
	}

}
