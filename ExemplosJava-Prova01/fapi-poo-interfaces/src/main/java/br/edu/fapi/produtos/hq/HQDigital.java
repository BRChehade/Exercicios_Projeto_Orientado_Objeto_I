package br.edu.fapi.produtos.hq;

import br.edu.fapi.excecao.DescontoInvalidoException;
import br.edu.fapi.produtos.Promocao;

public class HQDigital extends HQ implements Promocao{
	
	private String formato;
	private int tamanho;
	private boolean dicasDeVocabulario;
	private boolean configuracaoDeFonte;
	
	public HQDigital(String titulo, String autor, String editora, int paginas, String idioma, String formato, double preco) {
		super(titulo, autor, editora, paginas, idioma, preco);
		this.formato = formato;
	}
	
	public double getPreco() {
		return this.precoHQ;
	}
	
	@Override
	public double aplicarDesconto(double d) throws DescontoInvalidoException{
		System.out.println("A HQ edição digital possuí um desconto de 50%");
		this.precoHQ = this.precoHQ  * d;
		return this.precoHQ;
	}
	
	public String getFormato() {
		return formato;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isDicasDeVocabulario() {
		return dicasDeVocabulario;
	}

	public void setDicasDeVocabulario(boolean dicasDeVocabulario) {
		this.dicasDeVocabulario = dicasDeVocabulario;
	}

	public boolean isConfiguracaoDeFonte() {
		return configuracaoDeFonte;
	}

	public void setConfiguracaoDeFonte(boolean configuracaoDeFonte) {
		this.configuracaoDeFonte = configuracaoDeFonte;
	}



	
}
