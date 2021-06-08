package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;
import util.Magica;

public class TesteTurma {


	
	public static void main(String[] args) {
	   
		Turma turma = new Turma(
				Magica.s("T19C"),
				Magica.s("INTEGRAL"),
				Magica.s("ZOOM"),
				new Professor(
						
						),
				new Curso(
						
						),
				new Aluno(
						Magica.i("RM"),
						new Endereco()
						)
				);
		
		System.out.println(turma.toString());

		
	}

}
