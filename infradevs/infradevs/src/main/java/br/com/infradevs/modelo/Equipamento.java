package br.com.infradevs.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_EQUIPAMENTO")
public class Equipamento {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
		
	@Column(name="numIp", length=50)
	private String numIp;
		
	@Column(name="nomeEquipamento", length=50)
	private String nomeEquipamento;

	@JsonIgnoreProperties("equipamento")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Eventos> eventos;

	public Equipamento(int id, String numIp, String nomeEquipamento, List<Eventos> eventos) {
		super();
		this.id = id;
		this.numIp = numIp;
		this.nomeEquipamento = nomeEquipamento;
		this.eventos = eventos;
	}

	public Equipamento() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumIp() {
		return numIp;
	}

	public void setNumIp(String numIp) {
		this.numIp = numIp;
	}

	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	public void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}

	public List<Eventos> getEventos() {
		return eventos;
	}

	public void setEventos(List<Eventos> eventos) {
		this.eventos = eventos;
	}
	
	
	

	
	
	
	

}
