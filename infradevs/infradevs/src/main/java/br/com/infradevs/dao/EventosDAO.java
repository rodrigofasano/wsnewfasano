package br.com.infradevs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.infradevs.modelo.Eventos;


public interface EventosDAO extends CrudRepository<Eventos,Integer> {
	List<Eventos> findByDataBetween(Date inicio, Date termino);
}
