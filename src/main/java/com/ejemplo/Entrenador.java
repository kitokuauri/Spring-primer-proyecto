package com.ejemplo;

public interface Entrenador {

	public abstract String getEntrenamiento();
	
//	nuevo método para obtener la experiencia
//	a partir del servicio que se inyectará
	public abstract int getExperiencia();
	
	public int getExperienciaEntrenador();
	public void ejecutar2();
	
	public String getEmail();
	public void setEmail(String email);
	public String getEquipo();
	public void setEquipo(String equipo);
	
	
	
}
