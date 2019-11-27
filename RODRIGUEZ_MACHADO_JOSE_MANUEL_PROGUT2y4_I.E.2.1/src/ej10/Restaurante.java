package ej10;

public class Restaurante {
	
	private double chocos, papas;
	
	Restaurante() {
		
	}
	
	Restaurante(double chocos,double papas) {
		this.chocos = chocos;
		this.papas = papas;
	}

	public double getChocos() {
		return chocos;
	}

	public void setChocos(double chocos) {
		this.chocos = chocos;
	}

	public double getPapas() {
		return papas;
	}

	public void setPapas(double papas) {
		this.papas = papas;
	}
	
	public int getComensales() {
		int comensales;
		if(this.papas*2<=this.chocos) {
			comensales = (int)(this.papas*3);
		}else {
			comensales = (int)(this.chocos*6);
		}
		return comensales;
	}
	
	public void showChocos() {
		System.out.println("Quedan "+getChocos()+" kg de chocos");
	}
	
	public void showPapas() {
		System.out.println("Quedan "+getPapas()+" kg de papas");
	}
	
	public void addChocos(int x) {
		this.chocos = getChocos() + x;
	}
	
	public void addPapas(int x) {
		this.papas = getPapas() + x;
	}
}
