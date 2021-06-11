package br.com.infradevs.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.infradevs.dao.EventosDAO;
import br.com.infradevs.modelo.Eventos;

@RestController
@CrossOrigin("*")

public class EventosController {
			
		@Autowired
		private EventosDAO dao;
		
		@GetMapping("/intervalo/{ini}/{fim}")	
		public ResponseEntity<List<Eventos>> getIntervalo(@PathVariable String ini, @PathVariable String fim) {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date inicio = formato.parse(ini);
				Date termino = formato.parse(fim);
				List<Eventos> lista = dao.findByDataBetween(inicio, termino);
				if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				}
				return ResponseEntity.ok(lista);
			}catch (Exception e) {
				e.printStackTrace();
				return ResponseEntity.status(403).build();

			}
}
}
