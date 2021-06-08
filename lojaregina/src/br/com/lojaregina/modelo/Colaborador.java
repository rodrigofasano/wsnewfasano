package br.com.lojaregina.modelo;

public class Colaborador {
	
	private int id;
	private String nome_colab;
	private Endereco endereco;
	private String cargo;
	private double salario;
	
	
	
	
		
	public Colaborador() {
		super();
	}
	
	public Colaborador(int id, String nome_colab, Endereco endereco, String cargo, double salario) {
		super();
		this.id = id;
		this.nome_colab = nome_colab;
		this.endereco = endereco;
		this.cargo = cargo;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome_colab + ", endereco=" + endereco + ", cargo=" + cargo + ", salario="
				+ salario + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_colab() {
		return nome_colab;
	}
	public void setNome_colab(String nome_colab) {
		this.nome_colab = nome_colab;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
