package com.practicas.baselineservice.procesamiento;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practicas.baselineservice.model.Tabla;

@Service
public class Procesar {
	
	public List<Tabla> CalcularIntereses(Tabla Entrada){
		
	
		if(Entrada.getInversioninicial()<1000) {
			System.out.println("La inversion inicial debe ser mayor o igual a 1,000");
			System.out.println("No es posible procesar su solicitud con los datos proporcionados");
		}else if(Entrada.getAñosdeinversion()<1){
			System.out.println("La duracion en años de la inversion debe ser mayor a cero");
			System.out.println("No es posible procesar su solicitud con los datos proporcionados");
			
		}else if(Entrada.getRendimiento()<1){
			System.out.println("El porcentaje de rendimiento de la inversion debe ser mayor a cero");
			System.out.println("No es posible procesar su solicitud con los datos proporcionados");
			
		}else {
			Tabla tablaporaño;
			List<Tabla> tablaresultados = new ArrayList<Tabla>();
			float sumaaportaciones=0, montofinal=0, gananciaporinversion=0, fin=0, apor=0;
			for(int i=0;i<Entrada.getAñosdeinversion();i++) {
				tablaporaño = new Tabla();
				tablaporaño.setAñosdeinversion(i+1);
				if(i==0){
					tablaporaño.setInversioninicial(Entrada.getInversioninicial());
					tablaporaño.setAportacionanual(Entrada.getAportacionanual());;
				}else {
					tablaporaño.setInversioninicial(fin);;
					tablaporaño.setAportacionanual((apor *(1+(Entrada.getIncrementoanual()/100))));;
				}
				
				tablaporaño.setRendimiento((tablaporaño.getInversioninicial()+tablaporaño.getAportacionanual())*(Entrada.getRendimiento()/100));
				
				//saldo final
				tablaporaño.setIncrementoanual((tablaporaño.getInversioninicial()+tablaporaño.getAportacionanual()+tablaporaño.getRendimiento()));
				//saldofinal
				
				sumaaportaciones=sumaaportaciones+tablaporaño.getAportacionanual();
				
				
				fin = tablaporaño.getIncrementoanual();
				apor = tablaporaño.getAportacionanual();
				if(i==Entrada.getAñosdeinversion()-1) {
					montofinal=tablaporaño.getIncrementoanual();
					gananciaporinversion= montofinal-Entrada.getInversioninicial()-sumaaportaciones;
					tablaporaño.setMontofinal(montofinal);
					tablaporaño.setGanancia(gananciaporinversion);
				}
				tablaresultados.add(tablaporaño);
				
			}	
			return tablaresultados;
		}
		return null;
	}

}
