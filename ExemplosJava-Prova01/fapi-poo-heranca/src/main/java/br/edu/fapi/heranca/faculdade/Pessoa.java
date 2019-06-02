package br.edu.fapi.heranca.faculdade;

import java.util.Date;

public class Pessoa {
	
	//Todo atributo do tipo protected é herdado pelas sub-classes
	//e podem ser acessados diretamente na sub-classe.
	protected String nome;
	protected String cpf;
	protected Date dataNascimento;
		
	//Construtor com 3 argumentos.
	public Pessoa(String nome, String cpf, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	//Todas as pessoas da faculdade podem tirar fotocópias, e o vlaor padrao é 10 centavos de real.
	public float tirarFotocopia(int quantidadeFolhas){
		return quantidadeFolhas * 0.10f;
	}
	
	//Na classe pessoa, como estou passando seu nome, cpf e dataNascimento através do construtor,
	//e esses atributos não mudarão posteriormente, não há razão para definir um método get, entretanto
	//como eu desejo recuperar o valor desses atributos no futuro, preciso do get.
	//Automáticamente as sub-classes também herdam os métodos get aqui definidos.
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

}


