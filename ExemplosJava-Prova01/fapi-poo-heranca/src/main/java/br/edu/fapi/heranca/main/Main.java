package br.edu.fapi.heranca.main;

import java.util.Date;

import br.edu.fapi.heranca.faculdade.Aluno;
import br.edu.fapi.heranca.faculdade.Funcionario;
import br.edu.fapi.heranca.faculdade.Pessoa;
import br.edu.fapi.heranca.faculdade.Professor;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ana", "00000000000", new Date());
		System.out.println("Uma pessoa tirou 10 fotocópias e pagou: " + pessoa.tirarFotocopia(10));
		
		Aluno aluno = new Aluno("Marcos", "00000000000", new Date());
		aluno.setMatricula("ma123987");
		System.out.println("Um aluno tirou 10 fotocópias e pagou: " + aluno.tirarFotocopia(10));
		
		Funcionario funcioario= new Funcionario("Andre", "00000000000", new Date());
		funcioario.setCodigoInstitucional("f983412");
		System.out.println("Um funcionário tirou 10 fotocópias e pagou: " + funcioario.tirarFotocopia(10));
		
		Professor professor = new Professor("Paulo", "00000000000", new Date());
		professor.setCodigoInstitucional("p123851");
		professor.setArea("Computação");
		professor.setEspecialidade("Programação");
		System.out.println("Um professor tirou 10 fotocópias e pagou: " + professor.tirarFotocopia(10));
		
	}
	
}
