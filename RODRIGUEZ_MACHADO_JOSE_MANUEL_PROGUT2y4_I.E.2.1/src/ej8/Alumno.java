package ej8;

public class Alumno extends Asignatura {
	
	private String nombre;
	private int edad;
	
	Alumno() {
		super();
	}
	
	Alumno(String nombre, int edad, String asignatura, int nota_obtenida) {
		super(asignatura, nota_obtenida);
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrar_datos() {
		System.out.println("Nombre: "+nombre
				+"\nEdad: "+edad
				+"\nAsignatura que curso:"
				+"\n"+getAsignatura()
				+"\n"+getNota_obtenida());
	}
}
