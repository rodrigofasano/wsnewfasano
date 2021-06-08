// Definição da Classe para DataTypes - Em uma classe encontramos: Métodos e Atributos
/*
 * JVM é o interpretador do JAVA
 * JRE é o ambiente de execução
 * JDK é o ambiente para desenvolvimento Java
 * 
 * "public static void main(String[] args) {" O main() é a o start point de uma aplicação JAVA, é a chave de ingnição como de um carro
 * 
 */


package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		// Sintaxe: <tipo de dado> <nome da variavel> = <dado>;
		
		//Declaração de Variaveis
        String nome="";
		int idade = 0;

		float altura = 0;
		float peso = 0;
		float imc = 0;
				
		do {

			//Entrada de Dados
			nome =JOptionPane.showInputDialog("Digite o seu nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura"));
			peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso"));
			imc = peso / (altura * altura);

            //Saida de Dados
			System.out.println("Nome................: "+ nome);
			System.out.println("Idade...............: "+ idade);
			System.out.println("Altura..............: "+ altura);
			System.out.println("Classificação do IMC: "+ imc);

			// Decisões sobre a validação do IMC - UTILIZE ENTRADA DE ALTURA COM PONTO EX: 1.80

			if (imc<18.5) {
				System.out.println("Ops Peso Baixo! Muito cuidado, você esta abaixo do peso Normal! Procure um médico, nutrólogo ou nutricionista urgente!");

			} else if (imc>=18.5 && imc<=24.9) {
				System.out.println("Parabéns Peso Normal! Continue assim cuidando de sua saúde!");

			} else if (imc>=25.0 && imc<=29.9) {
				System.out.println("Ops Sobrepeso! Muito cuidado, você esta sobrepeso acima do normal! Procure um médico, nutrólogo ou nutricionista para um acompnhamento!");

			} else if (imc>=30.0 && imc<=34.9) {
				System.out.println("Ops Obsidade (GRAUS I)! Muito cuidado, você esta começando a ficar obeso! Procure um médico, nutrólogo ou nutricionista para um acompnhamento!");

			} else if (imc>=35.0 && imc<=39.9) {
				System.out.println("Ops Obesidade Servera (GRAUS II)! Muito cuidado, você esta Obesidade Severa, muito Cuidado! Procure um médico, nutrólogo ou nutricionista para um acompnhamento com urgência!");

			} else if (imc>=40.0) {
				System.out.println("Ops Obesidade Mórbida (GRAUS III)! Ferrou, você esta Obesidade Mórbida! Já trocou a cama? Procure ajuda especializada com urgência de um médico, nutrólogo ou nutricionista para melhorar sua condição de vida!");

			} 
		}while(JOptionPane.showConfirmDialog (null, "Continuar?", "Calculo IMC", JOptionPane.YES_NO_OPTION)==0);



		}	

	}	
	/* Representado no JAVA como: String (Texto)
	 * Dado Alfanumérico: é um texto, parte de um texto ou um número que não será utilizado em operações matemáticas.
	 * 
	 * 
	 * Dado Númerico: repesenta um  dado que pode ser utilizado em expressões matemáticas.
	 * Representado no JAVA como: INT (Números inteiros) e DOUBLE (Casas decimais)
	 * 
	 */

