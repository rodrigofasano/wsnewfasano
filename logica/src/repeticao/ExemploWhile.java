package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	 public static void main(String[] args) {
		
		 
		 String email =JOptionPane.showInputDialog("digite o email").toLowerCase();
		 
		 // Essa função do While é a looping da execução, enquanto o o usuário não incluir o email completo ele vai ficar repetindo ou esquecer de colocar o @
		 while (email.contains("@")==false || email.indexOf("@")<2) {
			 email = JOptionPane.showInputDialog("Digite o email novamente").toLowerCase();
		 }
		 System.out.println("usuário:  " + email.substring(0, email.indexOf("@")));
		 
		 // O nome não pode ter menos que3 caracteres e mais que 20 caracteres
		 String nome = JOptionPane.showInputDialog("Digite o nome:  ").toUpperCase();
		 while (nome.length()<3 || nome.length() >20) {
			 nome = JOptionPane.showInputDialog("Digite o Nome novamente").toLowerCase();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
