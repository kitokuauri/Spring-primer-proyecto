package com.ejemplo;

import org.springframework.stereotype.Component;

//@Component
//@Component("mientrenador") seria para un nombre personalizado. 
//Si no lo añadimos, por defecto es el nombre de la clase "entrenadorBaloncesto"
public class EntrenadorBaloncesto implements Entrenador {
	
	private ExperienciaServicio experienciaServicio;

	@Override
	public String getEntrenamiento() {
		// TODO Auto-generated method stub
		return "Lanzar 30 tiros a canasta";
	}

	@Override
	public int getExperiencia() {
		// TODO Auto-generated method stub
		return experienciaServicio.getExperiencia();
	}
	
	// (constructor) inyección del servicio en un método setter
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en un método setter");
	this.experienciaServicio = experienciaServicio;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEquipo(String equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getExperienciaEntrenador() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ejecutar2() {
		// TODO Auto-generated method stub
		
	}

}
