package com.trabajo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabajo1.componente.Dependencia;

@SpringBootApplication
public class Trabajo1Application implements CommandLineRunner {

	@Autowired
	Dependencia dependencia;

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Suma");
		dependencia.SalidaMensaje(dependencia.Suma(dependencia.LeerTeclado(), dependencia.LeerTeclado()));

		System.out.println("Resta");
		dependencia.SalidaMensaje(dependencia.Resta(dependencia.LeerTeclado(), dependencia.LeerTeclado()));

		System.out.println("Multiplicacion");
		dependencia.SalidaMensaje(dependencia.Multiplicacion(dependencia.LeerTeclado(), dependencia.LeerTeclado()));

		System.out.println("Division");
		dependencia.SalidaMensaje(dependencia.Division(dependencia.LeerTeclado(), dependencia.LeerTeclado()));

		System.out.println("Numero mayor");
		dependencia.SalidaMensaje(dependencia.Mayor(dependencia.LeerTeclado(), dependencia.LeerTeclado()));

		System.out.println("Tabla de multiplicar");
		List<String> lista = dependencia.tabla(dependencia.LeerTeclado());
		for (String item : lista) {
			System.out.println(item);
		}

	}

}
