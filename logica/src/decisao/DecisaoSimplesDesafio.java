package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {

		/*
		 * Capture o nome de uma pessoa e a idade.
		 * De acordo com as leis eleitorais e apresente uma das mensagens abaixo:
		 * "Seu voto �obrigatorio"
		 * "Seu voto � facultativo" + 60
		 * "voc� n�o pode votar" -16 
		 */

		String nome =JOptionPane.showInputDialog("Digite seu nome: ");
		float idade = Float.parseFloat(JOptionPane.showInputDialog("Digite sua idade: "));	
        
		System.out.println("Ol� " + nome);


		if (idade>=18 && idade<=70) {
			System.out.println("Seu voto � obrigatorio!");
		}

		if (idade==16 || idade==17 || idade>=70) {
			System.out.println("Seu voto � Facultativo!");
		}

		if (idade<16) {
			System.out.println("Voc� ainda n�o pode votar!");
		}


	}
}
