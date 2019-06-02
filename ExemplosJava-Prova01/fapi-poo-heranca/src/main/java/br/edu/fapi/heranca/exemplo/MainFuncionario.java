package br.edu.fapi.heranca.exemplo;

public class MainFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.falarProfissao();
		
		AssistenteTestes assistenteTestes = new AssistenteTestes();
		assistenteTestes.falarProfissao();
		
		TecnicoInformatica tecnicoInformatica = new TecnicoInformatica();
		tecnicoInformatica.falarProfissao();
	}

}
