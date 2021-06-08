package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;

import br.com.lojaregina.modelo.Endereco;


public class TesteCliente2 {

	public static void main(String[] args) {
		
		Cliente objeto = new Cliente();
		Endereco endereco = new Endereco();

		
		
		endereco.setLogradouro("Rua Cel. Job B");
		endereco.setNumero("111");
		endereco.setComplemento("AP14a");
		endereco.setBairro("Mooca");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("03127-175");
		
		objeto.setAll(endereco , 1, "XPTO", "rr@rr.com.br", "2222-3333");
		
		System.out.println(objeto.toString());
		System.out.println("Bairro: " + objeto.getEndereco().getBairro());
		System.out.println("Usuário: " + objeto.getUsuario());
		
	}
	
	
	
}
