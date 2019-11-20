package ej5;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e = new Empleado("31013644F", "Jose Manuel", "si", 1200, 21, 20, 3);
		
		e.println();
		System.out.println();
		e.printAll();
		System.out.println();
		e.copia();
	}

}
