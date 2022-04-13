package com.trabajo1.componente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implement implements Dependencia {

	@Override
	public void SalidaMensaje(String mensaje) {
		System.out.println("La respuesta es: " + mensaje);

	}

	@Override
	public int LeerTeclado() {
		System.out.println("Ingrese un numero: ");
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}

	@Override
	public String Suma(int a, int b) {
		double sum = a + b;
		return String.valueOf(sum);
	}

	@Override
	public String Resta(int a, int b) {
		double res = a - b;
		return String.valueOf(res);
	}

	@Override
	public String Multiplicacion(int a, int b) {
		double mul = a * b;
		return String.valueOf(mul);
	}

	@Override
	public String Division(int a, int b) {
		double div = a / b;
		return String.valueOf(div);
	}

	@Override
	public String Mayor(int a, int b) {
		int res = a > b ? a : b;
		return String.valueOf(res);
	}

	@Override
	public List<String> tabla(int numero) {
		List<String> lista = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			lista.add(i + " * " + numero + " = " + String.valueOf(i * numero));
		}
		return lista;
	}

}
