/*
 * Exercicio 4:
 * Receba três números inteiros e coloque-os em ordem numérica
 * crescente. Garanta que os três números sejam diferentes.
 * 
 */

package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um intervalo inteiro 1"));	
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um intervalo inteiro 2"));	
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um intervalo inteiro 3"));


		if (num1!=num2 && num2!=num3 && num3!=num1) {
			if (num1<num2 && num1<num3) {
				System.out.println(num1);
				//2 ou 3
				if (num2<num3) {
					System.out.println(num2);
					System.out.println(num3);
				}else {
					System.out.println(num3);
					System.out.println(num2);
				}

			}else if (num2<num1 && num2<num3) {
				System.out.println(num2);
				// 1 ou 3
				if (num1<num3) {
					System.out.println(num1);
					System.out.println(num3);
				}else {
					System.out.println(num3);
			    	System.out.println(num1);
			}

		}else {
			System.out.println(num3);
			// 1 ou 2
			if (num1<num2) {
				System.out.println(num1);
				System.out.println(num2);
			}else {
				System.out.println(num2);
				System.out.println(num1);
			}
		}	
	
	}else {
		System.out.println("Os valores estão igaus");	   
	}



	}
}

