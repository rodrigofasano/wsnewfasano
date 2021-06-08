package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
    
	public static void main(String[] args) {
	
		
		  /*
		   *  - nome do produto
		   *  - qtd do produto
		   *  - valor unitario
		   *  exibir no final:
		   *  
		   *  - nome do produto
		   *  - valor totql
		   *  - valor do imposto (17%sobre o valor total)
		   */
		
		 String nome_produto =JOptionPane.showInputDialog("Digite o nome do produto");
		    
		    int qtd_produto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		    double valor_unitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto"));
		    
		    // Calculo sendo executado com entrada declaradas em variaveis e saida pelas variaveis
		    
		    // double valor_total = valor_unitario * qtd_produto;
		    // double valor_imposto = (valor_unitario * qtd_produto)*0.17;	    		
		    
		   
		    //System.out.println("Produto...............: "+ nome_produto);
		    //System.out.println("Valor Total...........: R$ "+ valor_total);
		    //System.out.println("Imposto calculado.....: R$ "+ valor_imposto);
			
		    // Calculo sendo executado direto na saida de valores
		    
		    System.out.println("Produto...............: "+ nome_produto);
		    System.out.println("Valor Total...........: R$ "+ (valor_unitario * qtd_produto));
		    System.out.println("Imposto calculado.....: R$ "+ (valor_unitario * qtd_produto)*0.17);
			
		    
		
		    
		    /*
		     * Tipos de dados
		     * 
		     * Tipos Primitivos (Todos aqueles que começam com letra minuscula)
		     * Boolean => Lógico (True/False)
		     * char => um caracter entre apostrofos " "
		     * 
		     * byte -> -127/+127
		     * short => -32 mil / +32 mil
 		     * int => -2 Trilhoes / +2 trilhoes
		     * long => (-) 9 quintilhoes / (+) 9 quintilhoes 
		     * 
		     * float => até 5 casas decimais
		     * double => acima disso.
		     */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }
}
