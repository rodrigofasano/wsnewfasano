package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		//1� instancia um objeto
		Veiculo objeto = new Veiculo(); 
		
		//2� Preencher os atributos do objeto
		objeto.preencherModelo("camaro");
		objeto.preencherValor(2000000);
		
		//3� Exibir os resultado
		System.out.println(objeto.retornarTudo());
		System.out.println(objeto.ligar());
		objeto.ligar();
		objeto.acelerar(5);
		objeto.acelerar(20);
		objeto.desacelerar(10);
		System.out.println("Depois de ligar: \n" + objeto.retornarTudo());
		objeto.desligar();
		System.out.println("Depois de desligar: \n" + objeto.retornarTudo());
		
		
		
		
		
		
	}
	
	
	
	
}
