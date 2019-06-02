package br.edu.fapi.pacote2;

import br.edu.fapi.pacote1.SuperClasseExemplo;

public class SubClasseExemploEmOutroPacote extends SuperClasseExemplo{

	public void acessandoAtributosDiretamente(){
		SuperClasseExemplo superClasseExemplo = new SuperClasseExemplo();
	
		//Os atributos public podem ser acessados diretamente a partir de qualquer classe do projeto.
		superClasseExemplo.atributoPublic = "Consegui acessar diretamente";
	
		//Os atributos protected podem ser acessados diretamente a partir de qualquer subclasse, em qualquer pacote.
		//Quando tentamos acessar um atributo protected diretamente mas fora do pacote onde est� sua superclasse � 
		//necess�rio utilizar a palavra reservada "this".
		this.atributoProtected = "Consegui acessar diretamente em uma classe fora do pacote da superclasse.";
		
		//O atributo "atributoDefault" n�o � acess�vel diretamente fora do pacote "pacote1".
		//O atributo "atributoPrivate" n�o � acess�vel diretamente fora da classe "SuperClasseExemplo".
	}
	
}
