package br.edu.fapi.heranca.main;

import br.edu.fapi.heranca.main.fotocopia.AlexFotocopias;
import br.edu.fapi.heranca.main.fotocopia.EmpresaFotocopiadora;
import br.edu.fapi.heranca.main.fotocopia.TatyFotocopias;

public class MainPolimorfismo {

	public static void main(String[] args) {
		EmpresaFotocopiadora empresaFotocopiadora = new AlexFotocopias();
		
	
		double total = ((AlexFotocopias)empresaFotocopiadora)
		.tirarFotocopias(new TatyFotocopias(), 100);
		
		System.out.println("Total a ser pago: " + total);
		
	}

}
