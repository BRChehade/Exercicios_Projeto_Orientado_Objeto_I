package br.edu.fapi.aluno.calculo;

import br.edu.fapi.aluno.Aluno;

public class CalculadoraMedia {

	public float calcularMedia(Aluno aluno) {
		return (aluno.getNota1() + aluno.getNota2()) / 2;
	}
	
}
