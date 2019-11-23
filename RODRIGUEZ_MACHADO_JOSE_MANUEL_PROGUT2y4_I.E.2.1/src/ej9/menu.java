package ej9;

import java.io.IOException;

public class menu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Docente d = new Docente(1,6,15,"matematicas","fisica","Albert","Jhonson","Hombre","31013644F");
		Hija h = new Hija(1,1500,"Secundaria","San Luis Rey EESS","Jenny","Jhonson","Mujer","30580016J");
		
		d.datos();
		d.pago_parcial();
		System.out.println();
		
		h.datos();
		h.descuento();
	}
}
