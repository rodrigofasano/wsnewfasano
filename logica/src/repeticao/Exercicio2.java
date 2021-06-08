package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {

		
		String nome =JOptionPane.showInputDialog("Digite o seu nome").toUpperCase();
		String email =JOptionPane.showInputDialog("Digite o seu e-mail").toLowerCase();
		String nome_prod ="";
		int qtd_prod =0;
		float valor_prod =0;
	    float total_global =0;
		float total_prod =0;
		
				
		do {
			nome_prod = JOptionPane.showInputDialog("Digite o produto").toUpperCase();
			qtd_prod = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
			valor_prod = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor"));
			total_prod = valor_prod*qtd_prod;
			System.out.println("Nome do Produto: " + nome_prod);
			System.out.println("Total do Produto " + total_prod);
			total_global=total_global + (qtd_prod*valor_prod);
			
		
		}while (JOptionPane.showConfirmDialog(null,  "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Olá " + nome + " com e-mail " + email + ", o total das suas compras é de: R$" + total_global);
		
		
			
		
	}
}


/* 
* Exercicio 2
* Solicite o nome do cliente e o email, pergunte a ele se deseja adicionar
* itens para sua compra, e enquanto ele responder que sim, peça:
* nome do produto, valor e qtde. 
* Exiba para cada produto o total de cada um.
* Quando terminar de adicionar produtos exiba no final o total da conta.
*/
