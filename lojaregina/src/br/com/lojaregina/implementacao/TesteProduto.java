package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Produto;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setAll(1, "Chrurros", 5, 10, 50);
		System.out.println("Produto: " + produto.toString());
		System.out.println("10% Desconto: " + produto.getDesconto());
		System.out.println("50% Desconto: " + produto.getDesconto(50));
	    System.out.println("Total Venda: " + produto.getTotalVenda());
	    System.out.println("Estoque: " + produto.getVerificarEstoque());
	    produto.setAtualizarValores(100);
	    System.out.println("Apos o aumento: " + produto.toString());	    
	
	}
	

}
