package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Graduacao;
import br.com.unixyz.modelo.Pos;
import util.Magica;

public class TesteCurso {

	public static void main(String[] args) {
		
		int opcao = Magica.i("Digite 1 para Graduação ou 2 para Pós");
		while (opcao!=1 && opcao!=2) {
			 opcao = Magica.i("Digite 1 para Graduação ou 2 para Pós");
		}
	    Curso curso = new Curso();
	    
	    
	    if (opcao==1) {
	    	curso = new Graduacao(
	    			Magica.s("Nome"),
	    			Magica.s("Titulacao"),
	    			Magica.d("Valor"),
	    			Magica.i("Carga Horária"),
	    			Magica.s("ProjetoConclusao"),
	    			Magica.i("Carga Horária Estagio")
	    			);
	    }else {
	    	curso = new Pos(
	    			
	    			Magica.s("nome"),
	    			Magica.s("Titulação"),
	    			Magica.d("Valor"),
	    			Magica.i("Carga Horária"),
	    			Magica.b("Tem intercambio?"),
	    			Magica.s("Nível")
	    			);
	    }

	    System.out.println(curso.toString());
	
	    
	    
	    
	}

}
