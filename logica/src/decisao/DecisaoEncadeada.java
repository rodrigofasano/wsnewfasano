package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();

		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		if (faltas>20) {
			System.out.println("Ops! Você reprovado por falta!");
		} else {        
     		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
			float media = (nota1+nota2)/2;
			if (media>=6) {
				System.out.println("Parabéns você foi aprovado!");
			} else if (media<4) {
				System.out.println("Ops! Você foi reprovado!");
			}

			//else if (media<6 && media>=4) {
			//	System.out.println("Ops! Você ficou de exame! Ainda tem chance");

			else { 
				System.out.println("Ops! Você ficou de exame! Ainda tem chance");	
			}

			System.out.println("Sua média na disciplina: " + disciplina + " foi: " + media);


		}
	}
}
