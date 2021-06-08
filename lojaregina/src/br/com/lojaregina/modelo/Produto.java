package br.com.lojaregina.modelo;

public class Produto {

	private int id;
	private String descricao;
	private double valorCompra;
	private double valorVenda;
	private int qtde;
	
	
	
	
	public Produto() {
		super();
	}


	public Produto(int id, String descricao, double valorCompra, double valorVenda, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}


	public String getVerificarEstoque() {
		 if (qtde>20 ) {
			 return "Estoque Alto";
		 } else if (qtde<10) {
           return "Estoque Baixo";
		 } else {
			 return "Estoque Médio";
		 }
	}
	
	
	public void setAtualizarValores(double porc) {
		 valorCompra = valorCompra + valorCompra * (porc/100);
		 valorVenda = valorVenda + valorVenda +(porc/100);
	}


	public double getTotalVenda() {
	   return valorVenda * qtde;
	}  

	public double getDesconto(double porc) {
		return valorVenda - valorVenda * (porc/100);
	}

	public double getDesconto() {
		return valorVenda * 0.9;
	}


	public String toString() {
		return "ID: " + id +", Descrição " + descricao + ", Valor Compra " + valorCompra + ", Valor Venda " + valorVenda + " e quantidade: " + qtde;
	}


	public void setAll (int id, String d, double vc, double vv, int q) {
		this.id = id;
		this.descricao = d;
		this.valorCompra = vc;
		this.valorVenda = vv;
		this.qtde = q;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}



}
