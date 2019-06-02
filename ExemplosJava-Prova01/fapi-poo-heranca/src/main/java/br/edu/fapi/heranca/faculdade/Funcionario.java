package br.edu.fapi.heranca.faculdade;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String codigoInstitucional;	

	public Funcionario(String nome, String cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
	}

	//Todas as pessoas da faculdade podem tirar fotocópias, mas o valor
	//cobrado de cada uma é diferente, portanto eu posso SOBRESCREVER o método padrão
	//da superclasse. Quando tirarFotocopia for chamado em um objeto do tipo professor o preço
	//cobrado por cópia será de 7 centavos de real, diferentemente do professor que é 5 e dos alunos e demais pessoas
	//que pagam 10 centavos de real.
	public float tirarFotocopia(int quantidadeFolhas){
		return quantidadeFolhas * 0.07f;
	}

	//Se uma subclasse possuí atributos do tipo private e precisam ser configurados ou recuperados
	//essa classe precisa definir getters e setters. (Sempre pensando se existe sentido em utilizar esse recurso)
	public String getCodigoInstitucional() {
		return codigoInstitucional;
	}

	public void setCodigoInstitucional(String codigoInstitucional) {
		this.codigoInstitucional = codigoInstitucional;
	}


}


