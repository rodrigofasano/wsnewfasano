package br.com.infradevs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.infradevs.dao.AlarmeDAO;
import br.com.infradevs.modelo.Alarme;


@RestController
@CrossOrigin("*")
public class AlarmeController {

	@Autowired
	private AlarmeDAO dao;
	
	
	@PostMapping("/apagaralarme")
	public ResponseEntity<Boolean> deleteAlarme(@RequestBody Alarme objeto){
		try {
			dao.deleteById(objeto.getId());
			return ResponseEntity.ok(true);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	
	@PostMapping("/alarme")
	public ResponseEntity<Alarme> getAlarme(@RequestBody Alarme objeto){
		Alarme resposta = dao.findById(objeto.getId()).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	
	
	@GetMapping("/alarmes")
	public ResponseEntity<List<Alarme>> getAll(){
		List<Alarme> lista = (List<Alarme>)dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	
	@PostMapping("/novoAlarme")
	public ResponseEntity<Alarme> addAlarme(@RequestBody Alarme objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
}
