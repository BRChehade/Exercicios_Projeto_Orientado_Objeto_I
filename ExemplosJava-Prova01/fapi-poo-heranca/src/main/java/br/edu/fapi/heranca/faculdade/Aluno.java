package br.edu.fapi.heranca.faculdade;

import java.util.Date;

public class Aluno extends Pessoa{

	private String matricula;
	
	public Aluno(String nome, String cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
	}
	
	//Se uma subclasse possuí atributos do tipo private e precisam ser configurados ou recuperados
	//essa classe precisa definir getters e setters. (Sempre pensando se existe sentido em utilizar esse recurso)
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}




