package br.edu.fapi.produtos.hq;

import br.edu.fapi.excecao.DescontoInvalidoException;
import br.edu.fapi.produtos.Promocao;

public class HQFisica extends HQ implements Promocao {

	protected String isbn;
	protected String capa;

	public HQFisica(String titulo, String autor, String editora, int paginas, String idioma, String isbn,
			double preco) {
		super(titulo, autor, editora, paginas, idioma, preco);
		this.isbn = isbn;
	}

	@Override
	public double aplicarDesconto(double d) throws DescontoInvalidoException {
		double desconto = 1.00 - (d / 100);
		if (desconto < 1.00 && desconto >= 0.50) {
			System.out.println("A HQ edição capa dura possuí um desconto de " + d + "%");
			this.precoHQ = this.precoHQ * desconto;
			return this.precoHQ;
		} else if (desconto < 0.50 && desconto <= 0.00) {
			return this.precoHQ;
		} else {
			throw new DescontoInvalidoException("Desconto não permitido.", d);
		}
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getIsbn() {
		return isbn;
	}

}
