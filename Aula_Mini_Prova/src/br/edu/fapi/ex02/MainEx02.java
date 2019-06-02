package br.edu.fapi.ex02;

import java.security.GeneralSecurityException;

public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaEx2 karam = new PessoaEx2();
		PessoaEx2 diego = new PessoaEx2();
		PessoaEx2 matheus = new PessoaEx2();
		PessoaEx2 jorge = new PessoaEx2();
		PessoaEx2 jackson = new PessoaEx2();
	
		karam.setNome("Karam");
		karam.setIdade(20);
		karam.setRaça("Arabe");
		karam.setNaturalidade("Brasil");
		karam.setAltura(198);
		
		diego.setNome("Diego");
		diego.setIdade(19);
		diego.setRaça("Alemão");
		diego.setNaturalidade("Brasil");
		diego.setAltura(199);
		
		matheus.setNome("Matheus");
		matheus.setIdade(22);
		matheus.setRaça("Brasil");
		matheus.setNaturalidade("Brasil");
		matheus.setAltura(180);
		
		jorge.setNome("Jorge");
		jorge.setIdade(40);
		jorge.setRaça("Japones");
		jorge.setNaturalidade("Brasil");
		jorge.setAltura(210);
		
		jackson.setNome("Jackson");
		jackson.setIdade(29);
		jackson.setRaça("China");
		jackson.setNaturalidade("Brasil");
		jackson.setAltura(160);
		
		System.out.println(karam.toString());
		System.out.println(diego.toString());
		System.out.println(matheus.toString());
		System.out.println(jorge.toString());
		System.out.println(jackson.toString());
		
		
	}


}
