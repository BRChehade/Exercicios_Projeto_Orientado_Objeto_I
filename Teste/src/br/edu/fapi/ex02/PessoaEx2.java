package br.edu.fapi.ex02;

public class PessoaEx2 {

	
	private String nome;
	private int idade;
	private String ra�a;
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

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
		return "PessoaEx2 [nome=" + nome + ", idade=" + idade + ", ra�a=" + ra�a + ", naturalidade=" + naturalidade
				+ ", altura=" + altura + "]";
	}

	

}
