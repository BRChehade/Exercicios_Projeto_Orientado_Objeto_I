package br.edu.fapi.ex04;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profissional profissional = new Carteiro();
		profissional.saudar("Diego");
		
		profissional = new Eletrecista();
		profissional.saudar("Karam");
		
		profissional = new Mecanico();
		profissional.saudar("Alex");
		
	}

}
