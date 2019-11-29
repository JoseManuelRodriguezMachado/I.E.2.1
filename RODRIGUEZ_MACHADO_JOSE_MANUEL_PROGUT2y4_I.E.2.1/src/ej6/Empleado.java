package ej6;

public class Empleado extends Persona {
	
	private double sueldo;
	
	Empleado(){
		super();
	}
	
	Empleado(String nombre, int edad, double sueldo){
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrar_datos() {
		System.out.println("Empleado: "+getNombre()
							+"\nEdad: "+getEdad()
							+"\nSueldo: "+getSueldo());
	}
}
