package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email =JOptionPane.showInputDialog("Digite o seu e-mail");
		//String email ="RodrigoFasano@Hotmail.Com";
		System.out.println("Original..........................: " + email);
		System.out.println("Minuscula.........................: " + email.toLowerCase());
		System.out.println("Maiusculo.........................: " + email.toUpperCase());
     	System.out.println("Tem arroba?........................ " + email.contains("@"));
     	System.out.println("Em qual posição numerica esta o @?: " + email.indexOf("@"));
     	System.out.println("Quantos caracteres tem o e-mail?..: " + email.length());
       	System.out.println("Do 2º até o 5º Caracter:..........: " + email.substring(1,5));
       	System.out.println("1º Metadade do e-mail.............: " + email.substring(0, email.length()/2));
       	System.out.println("usuário...........................: " + email.substring(0, email.indexOf("@")));
     	System.out.println("Servidor..........................: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
     	System.out.println("Primeiro Caracter.................: " + email.toUpperCase().charAt(0));
   
       	/*
       	 * Indentificadores (nomes dos elementos que criamos: variaveis, classes, pacotes etc.
       	 * - Regras:
       	 *     1º Não começarás com número. ex: 1berto (ERRADO) h1berto (CORRETO)
       	 *     2º Não utilizarás palavras reservadas. ex: int, double, class, void  
       	 *     3º Não farás uso de caracteres especiais. ex: +, @, #, %, , &, N@ME, TRE&S, NOME CLIENTE.... 
       	 *     
       	 * - Padrões:
       	 *     1º CamlCase: Da segunda palavra em diante (em uma composição) deve começar com letra maiuscula.
       	 *              EX: 
       	 *                certo => dataNascimento
       	 *                errado => datanacimento
       	 *                certo => data_nascimento
       	 *                errado => data_Nascimento
       	 *                
       	 *      2º UML: é responsavel por padronizar elementos da orientação a objetos
       	 *                - Toda classe deve começar com letra maiuscula
       	 *                - Toda varivel/pacote deve começar com letra minuscula
       	 *                - Todo método deve começar com letra minuscula e deveser seguido de parenteses.
       	 *                           
       	 *                
       	 */
       	
       	
       	
    		}
}
