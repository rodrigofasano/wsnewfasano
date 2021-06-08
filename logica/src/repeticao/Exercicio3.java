package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
	
		String cargo ="";
		float salario =0;
	    float total_global =0;
		int qtd_cargo =0;
		float maior_salario =0;
		String maior_cargo ="";
			
				
		do {
			cargo = JOptionPane.showInputDialog("Digite o cargo").toUpperCase();
		    salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário"));
		    total_global+=salario; 
		    qtd_cargo++;
		    if (salario>maior_salario) {
		    	maior_salario=salario;
		    	maior_cargo=cargo;
		    	
		    }
			
		}while (JOptionPane.showConfirmDialog(null,  "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("O total de salários: " + total_global);
		System.out.println("Média: " + (total_global/qtd_cargo));
		System.out.println("O cargo " + maior_cargo + " possui o maior salário com o valor de " + maior_salario);
		
			
	}
}


/*
* Exercicio 3
* Solicite ao usuário (enquanto ele quiser), o cargo e o salario do cargo.
* No final exiba:
* - total de todos os salarios
* - média
* - o maior valor entre todos os salários que foram digitados, com o cargo.
* 
*/