package br.edu.fapi.pacote1;

public class SubClasseExemploMesmoPacote extends SuperClasseExemplo{

	public void acessandoAtributosDiretamente(){
		SuperClasseExemplo superClasseExemplo = new SuperClasseExemplo();
		
		//Os atributos public podem ser acessados diretamente a partir de qualquer classe do projeto.
		superClasseExemplo.atributoPublic = "Consegui acessar diretamente";
	
		//Os atributos protected podem ser acessados diretamente a partir de qualquer subclasse, em qualquer pacote.
		atributoProtected = "Consegui acessar diretamente em uma classe dentro do pacote da superclasse.";
		
		//O atributo "atributoDefault" não é acessível diretamente fora do pacote "pacote1".
		atributoDefault = "Consegui acessar diretamente o atributo default da superclasse ";

		//O atributo "atributoPrivate" não é acessível diretamente fora da classe "SuperClasseExemplo".
	}
}
