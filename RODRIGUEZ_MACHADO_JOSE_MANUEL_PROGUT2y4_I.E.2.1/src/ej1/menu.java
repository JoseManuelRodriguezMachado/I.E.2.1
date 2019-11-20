package ej1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int a;
		DVDCine p1 = new DVDCine();
		
			System.out.println("Introduzca los datos de la pelicula");
			System.out.println("Nombre:");
			p1.setNombre(teclado.readLine());
			System.out.println("Director:");
			p1.setDirector(teclado.readLine());
			System.out.println("Reparto:");
			p1.setReparto(teclado.readLine());
			System.out.println("Categoria:");
			p1.setCategoria(teclado.readLine());
			System.out.println("Duracion:");
			p1.setDuracion(Integer.parseInt(teclado.readLine()));
			System.out.println("Resumen:");
			p1.setResumen(teclado.readLine());
				
			do {
				
				System.out.println("¡BIENVENID0! \n¿Que operacion desea realizar? \n1 - Mostrar datos \n2 - Saber si es thriller \n3 - Saber si tiene resumen \n4 - Ver la duracion \n5 - Salir");
				a = Integer.parseInt(teclado.readLine());
				
				switch (a) {
				case 1:
					p1.muestraDVDCine();
					break;
				case 2:
					p1.esThriller();
					break;
				case 3:
					p1.tieneResumen();
					break;
				case 4:
					p1.muestraDuracion();
					break;
				}
			} while (a!=5);
			
			System.out.println("¡Gracias por usar nuestro servicio!");
	}
}
