package br.com.infradevs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.infradevs.dao.EquipamentoDAO;
import br.com.infradevs.modelo.Equipamento;


@RestController
@CrossOrigin("*")
public class EquipamentoController {

	@Autowired
	private EquipamentoDAO dao;
	

	
	@GetMapping("/equipamentoid/{cod}")
	public ResponseEntity<Equipamento> getUser2(@PathVariable int cod){
		Equipamento resposta = dao.findById(cod).orElse(null);
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
	}


	@PostMapping("/equipamento")
	public ResponseEntity<Equipamento> getArtista(@RequestBody Equipamento objeto) {
		Equipamento resposta = dao.findById(objeto.getId()).orElse(null);
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}


	@GetMapping("/equipamentos")
	public ResponseEntity<List<Equipamento>> getAll() {
		List<Equipamento> lista = (List<Equipamento>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);

	}

	@PostMapping("/novoEquipamento")
	public ResponseEntity<Equipamento> addUser(@RequestBody Equipamento objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}

	
}
