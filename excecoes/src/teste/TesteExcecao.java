package teste;

import excecao.MinhaExcecao;

public class TesteExcecao {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {

			int numero = Integer.parseInt("7");
			System.out.println("Valor: " + numero);

			String palavra = ""; //null;
						System.out.println("Qtd de letras: " + palavra.length());
			
						
						/*
						 * Caracteristica do vetor:
						 * - o tamanho dele � estatico
						 * - o vetor precisa de uma varivel para controlar o indice (posi��o)
						 * - os dados s�o homogeneos (do mesmo tipo)
						 * - n�o � possivel excluir uma posi��o em tempo de execu��o
						 * - ordena��o dos dados � complexa
						 */
			
			int numeros[] = new int[3]; // vetor
					numeros[0] = 542;
			        numeros[1] = 100;
			        numeros[2] = 12;
			        //System.out.println(numeros[1]);
          
			        for (int posicao=0; posicao<numeros.length;posicao++) {
			        	System.out.println("Valor:" + numeros[posicao]);
			        }
			        
			        
		}catch(Exception e) {
			
			System.out.println(MinhaExcecao.tratar(e));
			
		
		//}catch(NullPointerException e) {
			
		//	System.out.println("Existe um objeto nulo");

	 	//} catch(NumberFormatException e) {
			
		//	System.out.println("N�mero incompat�vel");
			
		//} catch(Exception e) {
			
		//	System.out.println("Deu ruim");
			//e.printStackTrace();
			
			
			
		}

	}

}
