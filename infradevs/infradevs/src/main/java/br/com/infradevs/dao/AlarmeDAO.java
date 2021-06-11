package br.com.infradevs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.infradevs.modelo.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme,Integer>{

}
