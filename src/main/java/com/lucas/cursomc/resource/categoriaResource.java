package com.lucas.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
	 
		Categoria c1 = new Categoria(1,"informatica");
		Categoria c2 = new Categoria(2,"adimi");
		
		List<Categoria> lista = new ArrayList<>();
		
		
		lista.add(c1);
		lista.add(c2);
		
		return lista;
		
		
	}
	
	
	
	
	
}
