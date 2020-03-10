package com.Leather.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leather.models.entity.Departamento;
import com.Leather.models.services.IDepartamentoService;

@RestController
@RequestMapping("/api")
public class DepartamentoRestController {
	
	@Autowired
	private IDepartamentoService clienteService;
	
	@GetMapping("/departamentos")
	public List<Departamento>index() {
		return clienteService.listarDepartamentos();	
	}
}
