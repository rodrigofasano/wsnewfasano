package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		
       List<String> lista = new ArrayList<String>();
       lista.add("DBA");
       lista.add("DEV");
       lista.add("DBA");
       lista.add("INFRA");
       System.out.println(lista);
	   System.out.println("Primeiro elemento " + lista.get(0));
	   lista.remove(1);
	   System.out.println("Depois de remover; " + lista);
	   Collections.sort(lista);
	   System.out.println("Ordenar: " + lista);
	   
	    
	for (int posicao=0; posicao<lista.size();posicao++) {
		System.out.println("Cargo: " +lista.get(posicao));
		}
	}

}
