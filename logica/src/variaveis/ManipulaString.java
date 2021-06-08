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
     	System.out.println("Em qual posi��o numerica esta o @?: " + email.indexOf("@"));
     	System.out.println("Quantos caracteres tem o e-mail?..: " + email.length());
       	System.out.println("Do 2� at� o 5� Caracter:..........: " + email.substring(1,5));
       	System.out.println("1� Metadade do e-mail.............: " + email.substring(0, email.length()/2));
       	System.out.println("usu�rio...........................: " + email.substring(0, email.indexOf("@")));
     	System.out.println("Servidor..........................: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
     	System.out.println("Primeiro Caracter.................: " + email.toUpperCase().charAt(0));
   
       	/*
       	 * Indentificadores (nomes dos elementos que criamos: variaveis, classes, pacotes etc.
       	 * - Regras:
       	 *     1� N�o come�ar�s com n�mero. ex: 1berto (ERRADO) h1berto (CORRETO)
       	 *     2� N�o utilizar�s palavras reservadas. ex: int, double, class, void  
       	 *     3� N�o far�s uso de caracteres especiais. ex: +, @, #, %, , &, N@ME, TRE&S, NOME CLIENTE.... 
       	 *     
       	 * - Padr�es:
       	 *     1� CamlCase: Da segunda palavra em diante (em uma composi��o) deve come�ar com letra maiuscula.
       	 *              EX: 
       	 *                certo => dataNascimento
       	 *                errado => datanacimento
       	 *                certo => data_nascimento
       	 *                errado => data_Nascimento
       	 *                
       	 *      2� UML: � responsavel por padronizar elementos da orienta��o a objetos
       	 *                - Toda classe deve come�ar com letra maiuscula
       	 *                - Toda varivel/pacote deve come�ar com letra minuscula
       	 *                - Todo m�todo deve come�ar com letra minuscula e deveser seguido de parenteses.
       	 *                           
       	 *                
       	 */
       	
       	
       	
    		}
}
