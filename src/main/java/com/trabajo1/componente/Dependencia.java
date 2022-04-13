package com.trabajo1.componente;

import java.util.List;

public interface Dependencia {
	void SalidaMensaje(String mensaje);

	int LeerTeclado();

	String Suma(int a, int b);

	String Resta(int a, int b);

	String Multiplicacion(int a, int b);

	String Division(int a, int b);

	String Mayor(int a, int b);

	List<String> tabla(int numero);
}
