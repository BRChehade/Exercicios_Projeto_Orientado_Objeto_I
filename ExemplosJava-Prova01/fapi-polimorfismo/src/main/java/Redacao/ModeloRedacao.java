package Redacao;

public abstract class ModeloRedacao {

	protected Redacao produzRedacao() {
		Redacao redacao = new Redacao();
		preencheCabecalho(redacao);
		preencheConteudo(redacao);
		preencheRodape(redacao);
		return redacao;
	}
	
	private void preencheCabecalho(Redacao redacao) {
		redacao.setCabecalho("FAPI");
		
	}
	
	public abstract void preencheConteudo(Redacao redacao);
	
	protected void preencheRodape(Redacao redacao) {
		redacao.setRodape("FAPI - Faculdade de Pinhais");
		
	}

	
	
	
}
