package ej3;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c1 = new Cuenta(31013644, 1250, 7);
		
		c1.ingresar(50);
		c1.retirar(200);
		c1.actualizarSaldo();
		c1.datos();
		

	}

}
