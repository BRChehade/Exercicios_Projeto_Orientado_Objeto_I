package br.edu.fapi.pacote2;

import br.edu.fapi.pacote1.SuperClasseExemplo;

public class SubClasseExemploEmOutroPacote extends SuperClasseExemplo{

	public void acessandoAtributosDiretamente(){
		SuperClasseExemplo superClasseExemplo = new SuperClasseExemplo();
	
		//Os atributos public podem ser acessados diretamente a partir de qualquer classe do projeto.
		superClasseExemplo.atributoPublic = "Consegui acessar diretamente";
	
		//Os atributos protected podem ser acessados diretamente a partir de qualquer subclasse, em qualquer pacote.
		//Quando tentamos acessar um atributo protected diretamente mas fora do pacote onde está sua superclasse é 
		//necessário utilizar a palavra reservada "this".
		this.atributoProtected = "Consegui acessar diretamente em uma classe fora do pacote da superclasse.";
		
		//O atributo "atributoDefault" não é acessível diretamente fora do pacote "pacote1".
		//O atributo "atributoPrivate" não é acessível diretamente fora da classe "SuperClasseExemplo".
	}
	
}
