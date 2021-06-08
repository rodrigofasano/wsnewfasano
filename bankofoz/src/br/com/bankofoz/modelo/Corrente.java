
package br.com.bankofoz.modelo;

public class Corrente extends Conta {

	private double limite;
	private double taxa;


	// Declarando os atibuitos

	public String getResumo() {
		return 
				"Taxa....: " + taxa + "\n" +
				"Limite..: " + limite + "\n" +
				super.getSaldo() + "nCliente: " + super.getCliente().getNome();
	}

	public double getSaldo() {
	return limite = super.getSaldo();
	}

			public boolean sacar(double valor) {
		double resultado = limite + super.getSaldo();
		if (resultado>=valor) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		} else {
			return false;
		}
	}


	
	// Declarando os construtores
	public Corrente() {
		super();
	}

	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}


	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}


	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}



}
