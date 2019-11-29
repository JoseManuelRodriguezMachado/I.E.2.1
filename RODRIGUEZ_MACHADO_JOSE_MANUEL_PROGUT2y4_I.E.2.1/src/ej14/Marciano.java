package ej14;

public class Marciano {
	
	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos; 
	
	Marciano() {
		
	}
	
	Marciano(String nombre) {
		this.vivo = true;
		this.nombre = nombre;
		this.numMarcianos += 1;
		this.nace(nombre);
	}
	
	public void nace(String nombre) {
		System.out.println("Hola, he nacido y soy "+nombre);
	}
	
	public void muere() {
		numMarcianos = vivo ? numMarcianos -= 1 : numMarcianos;
		String x = vivo ? "El marciano " + nombre + " ha muerto" : "El marciano " + nombre + " ya está muerto";
		vivo = false;
		System.out.println(x);
	}
	
	public boolean estaVivo() {
		return vivo;
	}
	
	public static int cuentaMarcianos() {
		return numMarcianos;
	}
	
	public String getNombre() {
		return nombre;
	}
}
