package br.com.infradevs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.infradevs.modelo.Equipamento;

public interface EquipamentoDAO extends CrudRepository<Equipamento, Integer> {
	

}
