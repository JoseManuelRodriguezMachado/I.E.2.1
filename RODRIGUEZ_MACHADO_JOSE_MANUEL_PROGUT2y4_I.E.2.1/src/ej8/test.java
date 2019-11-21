package ej8;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a1 = new Alumno("jose",21,"programacion",8);
		Alumno a2 = new Alumno("alvaro",25,"lenguaje de marcas",10);
		Alumno a3 = new Alumno("luis",18,"base de datos",4);
		
		a1.mostrar_datos();
		a1.calificacion();
		System.out.println();
		
		a2.mostrar_datos();
		a2.calificacion();
		System.out.println();
		
		a3.mostrar_datos();
		a3.calificacion();
	}
}
