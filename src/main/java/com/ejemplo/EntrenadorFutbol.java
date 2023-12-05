package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class EntrenadorFutbol implements Entrenador {
	
//	atributos
	protected String email;
	protected String equipo;
	
//	Referencia al servicio
	private ExperienciaServicio experienciaServicio;

//	Constructor con el servicio inyectado

	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
		}
	
//	este método se invocará automáticamente al crearse una instancia de EntrenadorFutbol
	@Autowired
	public void ejecutar1(ExperienciaServicio experienciaServicio) {
		System.out.println("ejecutar1");
		this.experienciaServicio = experienciaServicio;
	}
	
//	este método también se invocará automáticamente al crearse una instancia aunque no inyecte ningún bean
	@Override
	public void ejecutar2() {
		System.out.println("ejecutar2");
	}
	
	@Override
	public String getEntrenamiento() {
		// TODO Auto-generated method stub
		return "Correr durante 30 minutos";
	}

//	implementación del método del servicio inyectado
	@Override
	public int getExperiencia() {
		// TODO Auto-generated method stub
		return this.experienciaServicio.getExperiencia();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println("Inyección de un literal en un método setter: " + email);
		this.email = email;
	}

	@Override
	public void setEquipo(String equipo) {
		// TODO Auto-generated method stub
		System.out.println("Inyección de un literal en un método setter: " + equipo);
		this.equipo = equipo;
	}
	
	// inyección del servicio en un método setter
	@Autowired
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en un método setter");
	this.experienciaServicio = experienciaServicio;
	}
	
	@Override
	public int getExperienciaEntrenador() {
	return this.experienciaServicio.getExperiencia();
	}
	
	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return equipo;
	}
	
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	
	
}
