package ej7;

public class Asignatura {
	
	private String asignatura;
	private int nota_obtenida;
	
	Asignatura() {
		
	}
	
	Asignatura(String asignatura, int nota_obtenida) {
		this.asignatura = asignatura;
		this.nota_obtenida = nota_obtenida;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota_obtenida() {
		return nota_obtenida;
	}

	public void setNota_obtenida(int nota_obtenida) {
		this.nota_obtenida = nota_obtenida;
	}
	
	public void calificacion() {
		if(nota_obtenida >= 5) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspenso");
		}
	}
	
	public void dato() {
		System.out.println("el alumno ha sido calificado en siguiente asignatura: "+getAsignatura());
	}
}
