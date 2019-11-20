package ej1;

public class DVDCine {
	
	private String nombre, director, reparto, categoria, resumen;
	private int duracion;
	
	DVDCine(){
		
	}
	
	DVDCine(String nombre, String director, String reparto, String categoria, String resumen, int duracion){
		this.nombre = nombre;
		this.director = director;
		this.reparto = reparto;
		this.categoria = categoria;
		this.resumen = resumen;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public void muestraDVDCine(){
		System.out.println(getNombre()+
				"\nDe: "+getDirector()+
				"\nCon: "+getReparto()+
				"\n"+getCategoria()+" - "+getDuracion()+" min"+
				"\nResumen: "+getResumen());	
	}
	
	public boolean esThriller() {
		boolean esThriller;
		if ("Thriller".equalsIgnoreCase(categoria)) {
			esThriller = true;
		}else {
			esThriller = false;
		}
		return esThriller;
	}
	
	public boolean tieneResumen() {
		return !resumen.isEmpty();
	}
	
	public void muestraDuracion() {
		System.out.println(getDuracion()+" min.");

	}

}
