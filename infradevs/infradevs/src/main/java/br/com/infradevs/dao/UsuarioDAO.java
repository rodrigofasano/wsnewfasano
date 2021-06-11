package br.com.infradevs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.infradevs.modelo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	
}
