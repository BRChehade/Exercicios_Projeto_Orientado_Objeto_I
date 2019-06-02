package br.edu.fapi.pacote1;

public class ClasseExemploMesmoPacote {
	public void acessandoAtributosDiretamente(){
		
		SuperClasseExemplo classeExemplo = new SuperClasseExemplo();
		
		//Os atributos public podem ser acessados diretamente a partir de qualquer classe do projeto.
		classeExemplo.atributoPublic = "Consegui acessar diretamente";
	
		//Os atributos protected podem ser acessados diretamente a partir de qualquer subclasse, em qualquer pacote.
		//Também pode ser acessado por uma classe que não extende a classe onde o atributo protected esta definido, 
		//desde que esteja no mesmo pacote da classe destino.
		classeExemplo.atributoProtected = "Consegui acessar diretamente em uma classe dentro do mesmo pacote da classe destino.";
		
		//O atributo "atributoDefault" pode ser acessível diretamente de qualquer classe que esteja dentro do mesmo pacote 
		//da classe que define esse atributo.
		classeExemplo.atributoDefault = "Consegui acessar diretamente o atributo default da classe que o define. ";
		
		//O atributo "atributoPrivate" não é acessível diretamente fora da classe "SuperClasseExemplo".
	}
}
