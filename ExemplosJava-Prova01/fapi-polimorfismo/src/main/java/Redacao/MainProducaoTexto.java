package Redacao;

public class MainProducaoTexto {

	public static void main(String[] args) {
		ModeloRedacao redacaoAleatoria = new RedacaoAleatoria();
		ModeloRedacao redacaocritica = new RedacaoCritica();

		Redacao pAleatoria = redacaoAleatoria.produzRedacao();
		Redacao pCritica = redacaocritica.produzRedacao();

		System.out.println("Redacao Aleatoria");
		System.out.println(pAleatoria.getCabecalho());
		System.out.println(pAleatoria.getConteudo());
		System.out.println(pAleatoria.getRodape());

		System.out.println("-----------------------------");
		
		System.out.println("Redacao critica");
		System.out.println(pCritica.getCabecalho());
		System.out.println(pCritica.getConteudo());
		System.out.println(pCritica.getRodape());

	}

}
