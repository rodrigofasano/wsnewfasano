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
		    salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o sal�rio"));
		    total_global+=salario; 
		    qtd_cargo++;
		    if (salario>maior_salario) {
		    	maior_salario=salario;
		    	maior_cargo=cargo;
		    	
		    }
			
		}while (JOptionPane.showConfirmDialog(null,  "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("O total de sal�rios: " + total_global);
		System.out.println("M�dia: " + (total_global/qtd_cargo));
		System.out.println("O cargo " + maior_cargo + " possui o maior sal�rio com o valor de " + maior_salario);
		
			
	}
}


/*
* Exercicio 3
* Solicite ao usu�rio (enquanto ele quiser), o cargo e o salario do cargo.
* No final exiba:
* - total de todos os salarios
* - m�dia
* - o maior valor entre todos os sal�rios que foram digitados, com o cargo.
* 
*/