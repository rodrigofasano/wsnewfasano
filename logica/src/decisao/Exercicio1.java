/*
		 * Exercicio 1:
		 * Solicite dois valores e um operador matem�tico 
		 * (+, -, / ou *)
		 * Dependendendo do operador que foi digitado realize o calculo
		 * e exiba o resultado
		 * Dica.: Se utilizar String a compara��o de String deve ser:
		 * if (variavel.equals("valorasercomparado")){
		 * 
		 */

package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		int operacao_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1� valor: "));
		int operacao_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2� valor: "));
		char operador = JOptionPane.showInputDialog("Digite um dos operadores matematicos +, -, *, ou /: ").charAt(0);
		  
		if (operador=='+') {
		   System.out.println("Valor calculado: " + (operacao_1 + operacao_2));
		} else if (operador=='-') {
			      System.out.println("Valor calculado: " + (operacao_1 - operacao_2));
		} else if (operador=='*') {
		      System.out.println("Valor calculado: " + (operacao_1 * operacao_2));
		} else if (operador=='/') {
		      System.out.println("Valor calculado: " + (operacao_1 / operacao_2));
		} else  {
		      System.out.println("Operador inv�lido");    
			
	}
	
}
}