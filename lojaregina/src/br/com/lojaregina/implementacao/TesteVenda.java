package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Vendas;

public class TesteVenda {
public static void main(String[] args) {
	
		
	Cliente cliente = new Cliente();
	Endereco endereco = new Endereco();
	Colaborador colaborador = new Colaborador();
	Vendas vendas = new Vendas();
	Pagamento pagamento = new Pagamento();
	Produto produto = new Produto();
	
	
	
	endereco.setLogradouro("Rua Cel. Job B");
	endereco.setNumero("111");
	endereco.setComplemento("AP14a");
	endereco.setBairro("Mooca");
	endereco.setCidade("São Paulo");
	endereco.setUf("SP");
	endereco.setCep("03127-175");
	
	cliente.setAll(endereco, 1, "Jose", "jose@email.com", "2222-3333");
	
	colaborador.setEndereco(endereco);
	colaborador.setCargo("Vendedor");
	colaborador.setId(12);
	colaborador.setNome_colab("CARLA");
	colaborador.setSalario(5000);
	
	produto.setAll(1, "CHURROS", 6, 12, 10);
	
	pagamento.setData("02/05/2021");
	pagamento.setForma("DINHEIRO");
	pagamento.setId(125);
	pagamento.setValor(120);
		
	
	vendas.setId(5421);
	vendas.setData("02/05/2021");
	vendas.setCliente(cliente);
	vendas.setPagamento(pagamento);
	vendas.setProduto(produto);
	vendas.setVendedor(colaborador);
	
	System.out.println("Cliente: " + vendas.getCliente().getNome());
	System.out.println("Cidade: " + vendas.getCliente().getEndereco().getCidade());
	System.out.println("Vendedor: " + vendas.getVendedor().getNome_colab());
	System.out.println("Produto: " + vendas.getProduto().getDescricao());
	System.out.println("Pagamento: " + vendas.getPagamento().getForma());
	
    
    

}
}
