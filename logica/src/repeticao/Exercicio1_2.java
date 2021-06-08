package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1_2 {

	public static void main(String[] args) {

		do {

			int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número que deseja ver os resultado"));
			int mult = 0;


			while(mult<=100) {
				System.out.println(tabuada + " X " + mult +" = " + (tabuada * mult));
                mult++;
			}

		} while(JOptionPane.showConfirmDialog
				(null, "Fazer novo calculo?", "Tabuada", JOptionPane.YES_NO_OPTION)==0);
	}	


}


/*
 * Exercicio 1
 * Peça para o usuário digitar o valor da tabuada que ele deseja visualizar.
 * Monte o laço para que apresente o resultado da tabuada, da seguinte forma:
 * 
 * numero x 0 = resultado
 * numero x 1 = resultado
 * (...)  x 100 = resultado
 */
