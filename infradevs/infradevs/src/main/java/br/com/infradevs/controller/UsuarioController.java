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

import br.com.infradevs.dao.UsuarioDAO;
import br.com.infradevs.modelo.Usuario;


@RestController 
@CrossOrigin("*") 
public class UsuarioController {
	
	
	
	@Autowired 
	private UsuarioDAO dao;
	
	@PostMapping("/login2")
	public ResponseEntity<Usuario> login2(@RequestBody Usuario objeto) {
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		
		if (resposta == null) {
			return ResponseEntity.status(403).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario objeto) 
	{
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		for (Usuario usuario : lista) {
			if(usuario.getEmail().equals(objeto.getEmail())) {
				if(usuario.getSenha().equals(objeto.getSenha())) {
					usuario.setSenha("");
					return ResponseEntity.ok(usuario);
				}

			}
		}
		return ResponseEntity.status(403).build();
	}

	@GetMapping("/usuarioid/{cod}")
	public ResponseEntity<Usuario> getUser2(@PathVariable int cod){
		Usuario resposta = dao.findById(cod).orElse(null);
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> getUser(@RequestBody Usuario objeto) {
		Usuario resposta = dao.findById(objeto.getId()).orElse(null);
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}



	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> addUser(@RequestBody Usuario objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}


	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll() {
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	

}
