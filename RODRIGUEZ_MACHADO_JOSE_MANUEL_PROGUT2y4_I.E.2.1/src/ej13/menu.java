package ej13;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alimento a1 = new Alimento("Pera");
		System.out.println("Alimento dietetico: ");
		System.out.println(a1.esDietetico() ? "SI" : "NO");
		System.out.println(a1.muestraAlimento());
		System.out.println("");
		
		Alimento a2 = new Alimento("Manzana", 25f, 36f, 15f, false, "medio", "alto");
		System.out.print("Alimento dietetico: ");
		System.out.println(a2.esDietetico() ? "SI" : "NO");
		System.out.println(a2.muestraAlimento());

	}

}
