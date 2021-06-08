         /*
		 * Exercicio 3:
		 * Receba o valor do salário bruto, o nome de um colaborador e 
		 * a qtde de faltas.
		 * Se não houver faltas o salario bruto receberá um aumento de 2%.
		 * Calcule o valor do INSS sobre o salário bruto.
		 * Exiba no final o salário bruto, e o salário liquido (retirando
		 * o INSS e 8% do FGTS)
		 * 
		 */




package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		String nome_colab =JOptionPane.showInputDialog("Digite o nome do colaborador").toUpperCase();
	    float sal_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário bruto:"));
	    byte qtd_falta = Byte.parseByte(JOptionPane.showInputDialog("Digite o quantidade de faltas:"));	
	    if (qtd_falta==0) {
	         sal_bruto = sal_bruto * (float) 1.02;
	    }
	    
	    float inss=0;
	    if (sal_bruto<=1100) {
	    	inss = sal_bruto * (float) 0.07;
	    }else if (sal_bruto>1100 && sal_bruto<=2203.48) {
	    	inss = sal_bruto * (float) 0.09;
	    }else if (sal_bruto>2203.48 && sal_bruto<=3305.22) {
   	        inss = sal_bruto * (float) 0.12;
	    }else  {
   	        inss = sal_bruto * (float) 0.14;     
	    }	
	  
	    System.out.println("Nome colaborador..: " + nome_colab);
    	System.out.println("Salário Bruto.....: " + sal_bruto);
    	System.out.println("Salário liquido...: " + (sal_bruto - inss - sal_bruto*0.08));
	 }	    	
	    	
		
	}
	

