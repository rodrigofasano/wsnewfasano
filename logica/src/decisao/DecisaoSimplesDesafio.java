package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {

		/*
		 * Capture o nome de uma pessoa e a idade.
		 * De acordo com as leis eleitorais e apresente uma das mensagens abaixo:
		 * "Seu voto éobrigatorio"
		 * "Seu voto é facultativo" + 60
		 * "você não pode votar" -16 
		 */

		String nome =JOptionPane.showInputDialog("Digite seu nome: ");
		float idade = Float.parseFloat(JOptionPane.showInputDialog("Digite sua idade: "));	
        
		System.out.println("Olá " + nome);


		if (idade>=18 && idade<=70) {
			System.out.println("Seu voto é obrigatorio!");
		}

		if (idade==16 || idade==17 || idade>=70) {
			System.out.println("Seu voto é Facultativo!");
		}

		if (idade<16) {
			System.out.println("Você ainda não pode votar!");
		}


	}
}
