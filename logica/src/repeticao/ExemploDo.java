package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String nome ="";
		float altura =0;
		float peso =0;
		float imc =0;
		
	do {
		nome =JOptionPane.showInputDialog("Digite o seu nome");
	    
	    //int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
	             
	    altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura"));
	    peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso"));
	    imc = peso / (altura * altura);
	    System.out.printf("%s seu IMC é: %.2f" , nome, imc);
	    } while(JOptionPane.showConfirmDialog
	    		(null, "Continuar?", "Calculo IMC", JOptionPane.YES_NO_OPTION)==0);
	}	


}
