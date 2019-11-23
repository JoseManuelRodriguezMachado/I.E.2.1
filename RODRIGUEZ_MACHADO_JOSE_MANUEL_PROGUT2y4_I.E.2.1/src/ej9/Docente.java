package ej9;

public class Docente extends Persona {
	
	private int codigo, h_clase, pago_hora;
	private String categoria, postgrado;
	
	Docente() {
		super();
	}
	
	Docente(int codigo,int h_clase,int pago_hora,String categoria,String postgrado,String nombre,String apellido,String sexo,String dni) {
		super(nombre, apellido, sexo, dni);
		this.codigo = codigo;
		this.h_clase = h_clase;
		this.pago_hora = pago_hora;
		this.categoria = categoria;
		this.postgrado = postgrado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getH_clase() {
		return h_clase;
	}

	public void setH_clase(int h_clase) {
		this.h_clase = h_clase;
	}

	public int getPago_hora() {
		return pago_hora;
	}

	public void setPago_hora(int pago_hora) {
		this.pago_hora = pago_hora;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPostgrado() {
		return postgrado;
	}

	public void setPostgrado(String postgrado) {
		this.postgrado = postgrado;
	}
	
	public void pago_parcial() {
		int pago_parcial;
		pago_parcial = getH_clase() * getPago_hora();
		System.out.println("El pago parcial es de: "+pago_parcial+"$");
	}
}
