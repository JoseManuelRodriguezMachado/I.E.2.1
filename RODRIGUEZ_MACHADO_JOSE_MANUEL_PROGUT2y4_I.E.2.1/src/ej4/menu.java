package ej4;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cafetera c1 = new Cafetera();
		Cafetera c2 = new Cafetera(1000);
		Cafetera c3 = new Cafetera(500, 1000);
		
		c1.vaciarCafetera();
		c1.llenarCafetera();
		c1.servirTaza(50);
		c1.agreagarCafe(250);
		System.out.println();
		c2.agreagarCafe(500);
		c2.servirTaza(175);
		c2.vaciarCafetera();
		c2.llenarCafetera();
		System.out.println();
		c3.agreagarCafe(800);
		c3.servirTaza(1000);
		c3.llenarCafetera();
		c3.vaciarCafetera();

	}

}
