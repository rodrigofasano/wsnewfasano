package br.com.caicaielavator.implementacao;

import br.com.caicaielavator.modelo.Elevador;

public class TesteElevador {

	 public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.preencherNome("Elevador1");
		elevador.inicializar(10, 0, 5);
		System.out.println(elevador.retornarResumo());
		
		//System.out.println(elevador.subir());
		elevador.subir();
		elevador.subir();
		elevador.entrar(1);
		System.out.println(elevador.retornarResumo());
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
