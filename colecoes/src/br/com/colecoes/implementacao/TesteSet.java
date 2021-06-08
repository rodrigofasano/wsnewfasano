package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		
		lista.add("DBA");
		lista.add("ESTAG");
	    lista.add("ANL");
	    lista.add("DEV");
	    lista.add("DBA");
	    lista.add("ANL");
	    System.out.println(lista);
	    
	    //foreach
	    // obs: Cire uma String chamada "cargo" para cada elemento da "lista"
	    for (String cargo : lista) {
	    	System.out.println("Cargo: " + cargo);
	    }
	}

}
