package br.edu.fapi.heranca.faculdade;

import java.util.Date;

//Notem que Professor é uma subclasse de Funcionario.
//Afinal, um Professor É UM Funcionário da faculdade.
public class Professor extends Funcionario {

	private String area;
	private String especialidade;

	//Se a superclasse redefiniu o construtor padrão para um construtor de 3 argumentos,
	//logo sua subclasse deve definir o mesmo construtor.
	public Professor(String nome, String cpf, Date dataNascimento) {
		//A palavra super serve para dizer que estamos passando esses valores ao construtor da super classe
		//que por sua vez atribui os valores passados as propriedades da classe.
		super(nome, cpf, dataNascimento);
	}
	
	//Se uma subclasse possuí atributos do tipo private e precisam ser configurados ou recuperados
	//essa classe precisa definir getters e setters. (Sempre pensando se existe sentido em utilizar esse recurso)
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	//Todas as pessoas da faculdade podem tirar fotocópias, mas o valor
	//cobrado de cada uma é diferente, portanto eu posso SOBRESCREVER o método padrão
	//da superclasse. Quando tirarFotocopia for chamado em um objeto do tipo professor o preço
	//cobrado por cópia será de 5 centavos de real diferentemente do Funcionario que é 7 e dos alunos e demais pessoas
	//que pagam 10 centavos de real.
	public float tirarFotocopia(int quantidadeFolhas) {
		return quantidadeFolhas * 0.05f;
	}

}
