package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	public static void main(String[] args) {


		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 entre com um n�mero:"));
		int jogador2 =0;
		float contador =0;

		do {	
			do {
				jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 adivinhe o n�mero?:"));
				contador=contador+1;

				if (jogador2>jogador1) {
					JOptionPane.showInputDialog(null, "Dica: O n�mero � menor, tente novamente!");
				}else if (jogador2<jogador1) {
					JOptionPane.showInputDialog(null, "Dica: O n�mero � maior, tente novamente!");
				}

			}while(jogador1!=jogador2);
			JOptionPane.showMessageDialog(null,"Parab�ns, voc� acertou com " + contador + " tentativa(s)");	


		} while(JOptionPane.showConfirmDialog (null, "Quer jogar novamene?", "Advinhe o n�mero", JOptionPane.YES_NO_OPTION)==0);

	} 
}

/* Miss�o 1
 * O jogador 1 digita um n�mero inteiro.
 * A partir dai o jogador 2 deve advinhar o n�mero, somente quando ele acertar dever� aparecer a mensagem "parab�ns, voc� acertou"
 * 
 * Miss�o 2:
 * Acrescente dicas para o jogador2, informando se o n�mero que ele tem que advinhar se � maior ou menor que o n�mero que ele esta digitando. 
 * 
 * 
 * Miss�o 3:
 * Acrescente em contador de tentativas, que ser� exibido quando o Jogador 2 acertar, a mensagem devera ser: "Parab�ns, voc�acertou com X tentativas(s)"
 * dica: ter�o que criar um variavel para contar
 * 
 * != => n�o � igual
 * 
 */
