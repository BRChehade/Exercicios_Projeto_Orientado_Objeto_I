package br.edu.fapi.poo;

public class GerenciadorAcademicoDeAlunos {

	public void calcularMediaAluno(Aluno aluno){
		aluno.setMedia(aluno.getNota1() + aluno.getNota2() / 2);
	}

	public boolean fazerRecuperacao(Aluno aluno){
		if(aluno.getMedia() <7.0) {
			return true;
		}
		return false;
	}

	//Outras Operações Desejadas.
	
}


