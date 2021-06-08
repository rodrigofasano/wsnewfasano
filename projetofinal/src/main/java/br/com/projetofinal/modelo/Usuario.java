package br.com.projetofinal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica para o Spring boot que esta classe estará ligada à uma tabela do DB
@Table(name="TB_USUARIO") // indica qual tabela ligada com a classe
public class Usuario {


	@GeneratedValue(strategy=GenerationType.IDENTITY) //Aponta para o Spring que o campo vai se autoincrementar
	@Id //Indica para o Spring qe o campo é a chave primaria da tabela
	@Column(name="id") // especifica qual a coluna da tabela que esta relacionada com o atributo
	private int id;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="email", length=70)
	private String email;
	
	@Column(name="senha", length=20)
	private String senha;
	
	@Column(name="foto", length=100)
	private String foto;
	
	
	// Gerando os construtores

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Usuario() {
		super();
	}
	public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
		
	}
	
}
