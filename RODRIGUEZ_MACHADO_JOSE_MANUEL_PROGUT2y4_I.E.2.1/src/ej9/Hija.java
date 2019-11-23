package ej9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hija extends Persona {
	
	private int codigo; 
	private double pension;
	private String categoria, colegio;
	
	Hija() {
		super();
	}
	
	Hija(int codigo,double pension,String categoria,String colegio,String nombre,String apellido,String sexo,String dni) {
		super(nombre, apellido, sexo, dni);
		this.codigo = codigo;
		this.pension = pension;
		this.categoria = categoria;
		this.colegio = colegio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPension() {
		return pension;
	}

	public void setPension(double pension) {
		this.pension = pension;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	
	public void descuento() throws NumberFormatException, IOException {
		int edad;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Edad de la estudiante:");
		edad = Integer.parseInt(teclado.readLine());
		
		if(edad<13) {
			System.out.println("Pension: "+getPension()+"$");
			
		}else if(edad<17) {
			pension = pension * 0.92;
			System.out.println("Pension: "+getPension()+"$");
			
		}else {
			pension = pension * 0.85;
			System.out.println("Pension: "+getPension()+"$");
		}
	}

}
