package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	 public static void main(String[] args) {
		
		 
		 String email =JOptionPane.showInputDialog("digite o email").toLowerCase();
		 
		 // Essa fun��o do While � a looping da execu��o, enquanto o o usu�rio n�o incluir o email completo ele vai ficar repetindo ou esquecer de colocar o @
		 while (email.contains("@")==false || email.indexOf("@")<2) {
			 email = JOptionPane.showInputDialog("Digite o email novamente").toLowerCase();
		 }
		 System.out.println("usu�rio:  " + email.substring(0, email.indexOf("@")));
		 
		 // O nome n�o pode ter menos que3 caracteres e mais que 20 caracteres
		 String nome = JOptionPane.showInputDialog("Digite o nome:  ").toUpperCase();
		 while (nome.length()<3 || nome.length() >20) {
			 nome = JOptionPane.showInputDialog("Digite o Nome novamente").toLowerCase();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
