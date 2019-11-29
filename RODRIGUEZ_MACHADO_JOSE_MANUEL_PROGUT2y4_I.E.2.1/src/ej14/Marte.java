package ej14;

import java.util.ArrayList;

public class Marte {
	
	private static ArrayList<Marciano> poblacion = new ArrayList<Marciano>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marciano et1 = new Marciano("Pepe");
		nuevoMarciano(et1);
		
		Marciano et2 = new Marciano("Manueee");
		nuevoMarciano(et2);
		
		Marciano et3 = new Marciano("Rodolfo");
		nuevoMarciano(et3);
		
		
		et2.muere();
		
		Marciano et4=new Marciano("Eustakio");
		nuevoMarciano(et4);
		
		et2.muere();
		
		for (Marciano individuo : poblacion) {
			System.out.println(individuo.getNombre() + " está vivo -> " + individuo.estaVivo());
		}
		
	}
	
	private static void nuevoMarciano(Marciano mar) {
		poblacion.add(mar);
		System.out.println(Marciano.cuentaMarcianos() + " Marciano vivos actualmente en Marte");	
	}
}
