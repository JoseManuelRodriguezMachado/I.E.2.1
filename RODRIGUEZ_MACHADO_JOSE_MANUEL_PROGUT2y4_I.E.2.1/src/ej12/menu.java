package ej12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Empleado p1 = new Empleado();
		Empleado p2 = new Empleado();
		Empleado p3 = new Empleado();
		
		System.out.println("Introduzca en orden, su nombre, horas trabajadas y su tarifa");
		p1.setNombre(teclado.readLine());
		p1.setHoras(teclado.read());
		p1.setTarifa(teclado.read());
		System.out.println("");

		
		System.out.println("Introduzca en orden, su nombre, horas trabajadas y su tarifa");
		p2.setNombre(teclado.readLine());
		p2.setHoras(teclado.read());
		p2.setTarifa(teclado.read());
		System.out.println("");
		
		System.out.println("Introduzca en orden, su nombre, horas trabajadas y su tarifa");
		p3.setNombre(teclado.readLine());
		p3.setHoras(teclado.read());
		p3.setTarifa(teclado.read());
		System.out.println("");
		
		p1.mostrar_datos();
		p2.mostrar_datos();
		p3.mostrar_datos();
	}

}
