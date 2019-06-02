package br.edu.fapi.ex02;

public class PessoaEx2 {

	
	private String nome;
	private int idade;
	private String raça;
	private String naturalidade;
	private int altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "PessoaEx2 [nome=" + nome + ", idade=" + idade + ", raça=" + raça + ", naturalidade=" + naturalidade
				+ ", altura=" + altura + "]";
	}

	

}
