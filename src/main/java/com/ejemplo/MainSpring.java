package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		EntrenadorFutbol entrenador01 = new EntrenadorFutbol();
//		EntrenadorBaloncesto entrenador02 = new EntrenadorBaloncesto();
//		
//		System.out.println(entrenador01.getEntrenamiento());
		
//		Referencia a entrenadorFutbol desde la interfaz
//		Entrenador entrenadorFutbol = new EntrenadorFutbol();
//		Entrenador entrenadorBaloncesto = new EntrenadorBaloncesto();
		
//		System.out.println(entrenadorFutbol.getEntrenamiento());
//		System.out.println(entrenadorBaloncesto.getEntrenamiento());
		
//		abre el contexto a partir del archivo de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		obtiene el bean, donde:
		- el primer parámetro es el identificador del bean
		- el segundo parámetro es la interfaz que implementa el bean a recibir, realizando
		una especie casting (conversion de tipo)
		*/
		
		Entrenador entrenador = context.getBean("mientrenador", Entrenador.class);
		Entrenador entrenador2 = context.getBean("mientrenador2", Entrenador.class);
//		System.out.println(entrenador.getEntrenamiento());
//		System.out.println(entrenador2.getEntrenamiento());
		
//		Inyeccion de dependencias
//		System.out.println(entrenador.getExperiencia());
		System.out.println(entrenador2.getExperiencia());
		
//		Inyección de valores literales
		System.out.println(entrenador.getEmail());
		System.out.println(entrenador.getEquipo());
		
		// cierra el contexto
		context.close();
		
	
	}

}
