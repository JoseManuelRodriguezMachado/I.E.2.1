package ej7;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura a1 = new Asignatura("Programacion", 5);
		Asignatura a2 = new Asignatura("Lenguaje de Marcas", 8);
		Asignatura a3 = new Asignatura("Base de Datos", 4);
		
		a1.dato();
		a1.calificacion();
		System.out.println();
		
		a2.dato();
		a2.calificacion();
		System.out.println();
		
		a3.dato();
		a3.calificacion();
	}

}
