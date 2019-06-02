package br.edu.fapi.pacote1;

public class SuperClasseExemplo {

	//Visivel em qualquer lugar, verifique a classe "SubClasseExemplo"
	public String atributoPublic;
	
	//Vis�vel diretamente em qualquer classe em qualquer pacote que extenda a SuperClasseExemplo (precisa utilizar a palavra this).
	//Visivel diretamente em qualquer classe do mesmo pacote da SuperClasseExemplo.
	protected String atributoProtected;
	
	//Vis�vel diretamente em qualquer classe que esteja no mesmo pacote da SuperClasseExemplo.
	String atributoDefault;
	
	//Vis�vel apenas dentro da SuperClasseExemplo.
	//Pode ser vis�vel se for criado um m�todo get para esse atributo, como pode ser visto abaixo.
	private String atributoPrivate;
	
	public String getAtributoPrivate() {
		return this.atributoPrivate;
	}
	
}
