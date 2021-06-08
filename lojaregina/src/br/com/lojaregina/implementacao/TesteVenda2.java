package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Vendas;

public class TesteVenda2 {
	
   public static void main(String[] args) {
	  
	   Vendas vendas = new Vendas(
			   1,
			   "02/06/2021",
			   new Produto(
					   100,
					   "Churros",
					   6,
					   12,
					   10
					   ),
			   new Cliente(
					   5,
					   "XPTO",
					   "xpto@xtpot.com.br",
					   "2222-3333",
					   new Endereco(
							   "Rua da PAZ",
							   "10",
							   "Anexo B",
							   "Santo Amaro",
							   "São Paulo",
							   "SP",
							   "00029-000"							   
							   )
					   ),
			   new Colaborador(
					   
					   1,
					   "Jose",
					   new Endereco(
							   "Rua da Cel Jov B",
							   "173",
							   "APTO 14 Bloco A",
							   "Mooca",
							   "São Paulo",
							   "SP",
							   "03127-175"
							   ),
					   "Vendedor",
					   1000
					   ),
			   new Pagamento(
					   1,
					   10,
					   "02/06/2021",
					   "Dinheiro"
					   )
			   );
	   
	   System.out.println(vendas.toString());
	   
		   
	   
	   
}
}
