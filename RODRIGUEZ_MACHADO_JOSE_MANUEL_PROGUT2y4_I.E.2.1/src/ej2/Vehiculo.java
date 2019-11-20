package ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vehiculo {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	Vehiculo(){
		
	}
	
	Vehiculo(String modelo){
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean iscRuedas() {
		return cRuedas;
	}

	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	public void datos() throws IOException {
		System.out.println("modelo:");
		modelo = teclado.readLine();
		System.out.println("potencia:");
		potencia = Double.parseDouble(teclado.readLine());
		System.out.println("tiene traccion a las 4 ruedas:");
		cRuedas = Boolean.parseBoolean(teclado.readLine());
	}
	
	public void imprimir() throws IOException {
		String traccion;
		if(cRuedas = true) {
			traccion = "si";
		}else {
			traccion = "no";
		}
		System.out.println("Modelo: "+modelo+"\nPotencia: "+getPotencia()+"\nTraccion a las 4 ruedas: "+traccion); 
	}

}
