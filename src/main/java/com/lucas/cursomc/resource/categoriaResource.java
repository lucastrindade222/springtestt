package com.lucas.cursomc.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class categoriaResource {

	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "rest esta funma";
	}
	
	
	
	
	
}
