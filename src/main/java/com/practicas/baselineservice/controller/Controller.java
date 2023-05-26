package com.practicas.baselineservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.baselineservice.model.Tabla;
import com.practicas.baselineservice.procesamiento.Procesar;

@RestController
@RequestMapping("/API")
public class Controller {
	
	@Autowired
	Procesar proc;
	
	@GetMapping(value = "/CalcularIntereses")
	public List<Tabla> MostrarResultados(@RequestBody Tabla DatosEntrada){
		
		return proc.CalcularIntereses(DatosEntrada);
	}
	

}
