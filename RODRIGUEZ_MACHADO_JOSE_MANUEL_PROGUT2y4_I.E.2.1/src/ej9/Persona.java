package ej9;

public class Persona {
	
	private String nombre, apellido, sexo, dni;
	
	Persona() {
		
	}
	
	Persona(String nombre, String apellido, String sexo, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void datos() {
		System.out.println("\nNombre: "+getNombre()
							+"\nApellidos: "+getApellido()
							+"\nSexo: "+getSexo()
							+"\nDNI: "+getDni());
	}
}
