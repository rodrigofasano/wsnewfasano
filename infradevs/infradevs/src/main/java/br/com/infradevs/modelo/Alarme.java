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
	@Table(name="TB_ALARME")
	public class Alarme {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="nomeAlarme", length=100)
		private String nomeAlarme;
		
		@Column(name="descricao", length=200)
		private String descricao;
		
						
		@JsonIgnoreProperties("alarme")
		@OneToMany(cascade=CascadeType.ALL)
		private List<Eventos> eventos;


		public Alarme(int id, String nomeAlarme, String descricao, List<Eventos> eventos) {
			super();
			this.id = id;
			this.nomeAlarme = nomeAlarme;
			this.descricao = descricao;
			this.eventos = eventos;
		}


		public Alarme() {
			super();
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNomeAlarme() {
			return nomeAlarme;
		}


		public void setNomeAlarme(String nomeAlarme) {
			this.nomeAlarme = nomeAlarme;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public List<Eventos> getEventos() {
			return eventos;
		}


		public void setEventos(List<Eventos> eventos) {
			this.eventos = eventos;
		}
		
		
		
		
		
		
}
