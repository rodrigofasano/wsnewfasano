package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Artista;

public interface ArtistaDAO extends CrudRepository<Artista,Integer>{
	
	List<Artista> findByNacionalidadeLike(String nacionalidade);
	

}
