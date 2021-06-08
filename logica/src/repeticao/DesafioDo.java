package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	public static void main(String[] args) {


		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 entre com um número:"));
		int jogador2 =0;
		float contador =0;

		do {	
			do {
				jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 adivinhe o número?:"));
				contador=contador+1;

				if (jogador2>jogador1) {
					JOptionPane.showInputDialog(null, "Dica: O número é menor, tente novamente!");
				}else if (jogador2<jogador1) {
					JOptionPane.showInputDialog(null, "Dica: O número é maior, tente novamente!");
				}

			}while(jogador1!=jogador2);
			JOptionPane.showMessageDialog(null,"Parabéns, você acertou com " + contador + " tentativa(s)");	


		} while(JOptionPane.showConfirmDialog (null, "Quer jogar novamene?", "Advinhe o número", JOptionPane.YES_NO_OPTION)==0);

	} 
}

/* Missão 1
 * O jogador 1 digita um número inteiro.
 * A partir dai o jogador 2 deve advinhar o número, somente quando ele acertar deverá aparecer a mensagem "parabéns, você acertou"
 * 
 * Missão 2:
 * Acrescente dicas para o jogador2, informando se o número que ele tem que advinhar se é maior ou menor que o número que ele esta digitando. 
 * 
 * 
 * Missão 3:
 * Acrescente em contador de tentativas, que será exibido quando o Jogador 2 acertar, a mensagem devera ser: "Parabéns, vocêacertou com X tentativas(s)"
 * dica: terão que criar um variavel para contar
 * 
 * != => não é igual
 * 
 */
