package br.edu.fapi.aluno;

public class Aluno {

	String nome;
	int idade;
	private int matricula;
	public float nota1;
	public float nota2;
	
	public float getNota1() {
		return nota1;
	}


	public float getNota2() {
		return nota2;
	}

	private float creditoParaUsarNaFaculdade;

	void falarNome() {
		System.out.println("Meu nome é " + nome + " e minha matricula é " + matricula + ""+creditoParaUsarNaFaculdade);
	}
	
	
	public float getCreditoParaUsarNaFaculdade(String nome) {
		if ("Savio".equalsIgnoreCase(nome)) {
			return 0.00f;
		} else if ("Bruno".equalsIgnoreCase(nome)) {
			return 1.00f;
		} else if ("Erica".equalsIgnoreCase(nome)) {
			return creditoParaUsarNaFaculdade / 2;
		} else {
			System.out.println("Nao te conhece meu irmao vaza.");
		}
		return 0.0f;
	}

	public void setCreditoParaUsarNaFaculdade(float creditoParaUsarNaFaculdade) {
		this.creditoParaUsarNaFaculdade = creditoParaUsarNaFaculdade;
	}

}
