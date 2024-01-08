package com.anpemore.app.injeccion.services;


import org.springframework.stereotype.Service;

import com.anpemore.app.injeccion.interfaces.IServicios;

@Service
public class ServiceImportante implements IServicios{
    
	
	public String Operacion() {		
		return "Hotel Piscina Bar y Restaurante";
		
	}
	
	public String MasInformacion() {
		
		return "San Jose De Playón";
	}
	
}
