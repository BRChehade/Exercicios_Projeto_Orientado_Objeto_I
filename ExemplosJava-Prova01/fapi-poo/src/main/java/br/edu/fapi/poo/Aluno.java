package br.edu.fapi.poo;

public class Aluno {

	String nome;
	private String matricula;
	private double nota1;
	private double nota2;
	private double media;
	Endereco endereco;
	private Sobrenome sobrenome;

	
	public Aluno(){
		System.out.println("Objeto Aluno pronto para uso =]");
	}
	
	public Aluno(Endereco endereco) {
		System.out.println("Novo aluno criado com Endereço");
		this.endereco = endereco;
	}
	
	String falarNome() {
		System.out.println("Meu nome é: " + nome);
		return nome;
	}
	
	public void definirSobrenome(Sobrenome sobrenome){
		this.sobrenome = sobrenome;
	}
	
	void falarMatricula() {
		System.out.println("Minha matrícula é " + matricula);
	}
	
	void falarNota1() {
		System.out.println("Minha primeira nota foi: " + nota1);
	}
	
	void falarNota2() {
		System.out.println("Minha segunda nota foi: " + nota2);
	}
	
	public double calcularMedia() {
		return (this.nota1 + this.nota2) / 2;
	}
	
	public double calcularMedia(double nota1, double nota2){
		return (nota1 + nota2) / 2;
	}
	
	public void mostrarDadosAluno() {
		falarNome();
		falarMatricula();
		falarNota1();
		falarNota2();
		calcularMedia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		if(this.media != 0){
			System.out.println("Média já calculada.");
		}else{
			this.media = media;	
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
/*	public String toString() {
		return "Nome: " + this.nome;
	}
	*/
}