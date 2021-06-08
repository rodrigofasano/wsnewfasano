package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 4000));
		lista.add(new Cargo("DEV", "PL", 10000));
		lista.add(new Cargo("Estag", "PL", 2500));
		lista.add(new Cargo("ANL", "JR", 4500));
		
		System.out.println(lista);
		
		double total=0;
	    double totaljr=0;
		 
		for (Cargo objeto : lista) {
			System.out.println("Nome: " + objeto.getNome());
            System.out.println("Nivel: " + objeto.getNivel());
            System.out.println("Salário: " + objeto.getSalario());
            total+=objeto.getSalario();
            if (objeto.getNivel().equalsIgnoreCase("JR")) {
            	totaljr+=objeto.getSalario();
            	
            }
                       		
		}
			System.out.println("Total de salários: " + total);
			System.out.println("Média: " + (total/lista.size()));
			System.out.println("Total de Salários JR: " + totaljr);
			
			
					
			
			
			
			
		/*
		 * A Média dos salários.
		 * o total de slários dos cargosque possuem nivel "JR"
		 */
	}
	
}
