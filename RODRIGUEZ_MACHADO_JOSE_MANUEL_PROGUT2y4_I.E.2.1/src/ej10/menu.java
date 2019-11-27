package ej10;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante r = new Restaurante(0.5,1);
		
		r.showChocos();
		r.showPapas();
		System.out.println("puede servir a los siguientes comensales: "+r.getComensales());
		System.out.println("recargando chocos");
		r.addChocos(9);
		r.showChocos();
		System.out.println("recargando papas");
		r.addPapas(10);
		r.showPapas();
		System.out.println("los comensales a servir son: "+r.getComensales());
	}
}
