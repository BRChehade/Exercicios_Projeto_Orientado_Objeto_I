package Redacao;

public class RedacaoAleatoria extends ModeloRedacao {

	@Override
	public void preencheConteudo(Redacao redacao) {
		redacao.setConteudo("Redacao aleatoria sendo escrita");

	}
	
	protected void preencheRodape(Redacao redacao) {
		redacao.setRodape("FAPI - Redacao Aleatoria");
	}

}
