package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Usuario;

/*
 * DAO (Data Access Object) é um Pattern que aponta como boa prática 
 * que todos os comando SML (select, insert, update, delete) 
 * devem estar em uma camada isolada (DAO)
 * Por isso todo DAO contém um CRUD (Create - Read - Update - Delete)
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	
	public Usuario findByEmailAndSenha(String email, String senha);
	
	/*
	 *  save () => salva um objeto no banco de dados
	 *  findById() => pesquisa um objeto no banco de dados pela chave primaria
	 *  findAll() => retorna todas as linhas da tabela
	 *  deleAll() => apaga tudo
	 *  deleById() => apaga um usuário pela chave primária
	 *  
	 */

	

}
