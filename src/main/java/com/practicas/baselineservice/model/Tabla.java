package com.practicas.baselineservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tabla {
	
	
	private float inversioninicial;
	private float aportacionanual;
	private float incrementoanual;
	private int añosdeinversion;
	private float rendimiento;
	
	private float ganancia;
	private float montofinal;

}
