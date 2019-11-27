package ej11;

import java.util.Arrays;

public class Triangulo {
	
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	Triangulo() {
		
	}
	
	Triangulo(double long_lado1, double long_lado2, double long_lado3) {
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}
	
	public int tipo_Triangulo() {
		if (long_lado1 == long_lado2 && long_lado1 == long_lado3) {
			return 1;
		} else if(long_lado1 == long_lado2 || long_lado1 == long_lado3 || long_lado2 == long_lado3) {
			return 2;
		}else {
			return 3;
		}
	}
	
	public boolean compareTo_VTriangulos(Triangulo v[]) {
		boolean compareto = true;
		for(int i=0; i<v.length; i++) {
			if(compareTo_Triangulos(v[0],v[i]) == false) {
				compareto = false;
			}
		}
		return compareto;
	}
	
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		double[] a1 = {a.long_lado1, a.long_lado2, a.long_lado3};
		double[] b1 = {b.long_lado1, b.long_lado2, b.long_lado3};
		Arrays.sort(a1);
		Arrays.sort(b1);
		return (Arrays.equals(a1, b1));
	}
}
