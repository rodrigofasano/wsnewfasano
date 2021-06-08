         /*
		 * Exercicio 2:
		 * Considere receber a quantidade de diárias de um hotel e o valor da diária.
		 *  Sobre a diária haverá uma taxa que depende da quantidade
		 * de diárias.
		 * Se a quantidade de diárias for maior que 10 a taxa será de 5% aumento
		 * Se a quantidade estiver entre 5 e 10 a taxa será de 8%
		 * Se a quantidade de diarias for menor que 5 a taxa será de 10%
		 * Exiba o valor final.
		 * 
		 */


package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		    
		    short qtd_diaria = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de Diárias:"));
		    float valor_diaria = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da Diária:"));	
		    float taxa=0;
    
   
		    if (qtd_diaria>10) {
		        taxa = valor_diaria * (float) 0.05;
		    }else if (qtd_diaria<5) {
		    	taxa = valor_diaria* (float) 0.1;
		    }else {
		         taxa = valor_diaria * (float) 0.08;	
		    }
		         
		    System.out.println("O valor total de diárias: R$ " + (valor_diaria + taxa)*qtd_diaria);
		    
		    	
		    	
		    	
		    	
		    //} else if (qtd_diaria>5 && qtd_diaria<=10) {
		    // 	System.out.println("O valor total de diárias com 8% de aumento: " + (valor_diaria * qtd_diaria)*0.8);
		    //} else if (qtd_diaria<5) {
		    //	System.out.println("O valor total de diárias com 10% de aumento: " + (valor_diaria * qtd_diaria)*0.10);
		    //}    
		    		    
		    
		    //double valor_total_diaria = valor_diaria * qtd_diaria;
		    
		    
		    ///double calculo_taxa = (valor_diaria * qtd_diaria)*0.17; 
		    		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
