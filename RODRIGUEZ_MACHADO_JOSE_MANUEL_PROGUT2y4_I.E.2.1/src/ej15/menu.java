package ej15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class menu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		int cuenta, a;
		float aux;
		
		do {
			System.out.println("1 - crear una cuenta vacia"
					+ "\n2 - crear una cuenta con saldo" 
					+ "\n3 - ingresar dinero"
					+ "\n4 - desea sacar dinero" 
					+ "\n5 - ver el saldo de la cuenta"
					+ "\n6 - salir del programa");
			a = teclado.read();

			switch (a) {

			case 1:
				cuentas.add(new Cuenta());
				System.out.println("Cuenta creada");
				break;
			case 2:
				System.out.println("Introduzca saldo inicial:");
				cuentas.add(new Cuenta());
				System.out.println("Cuenta creada");
				break;
			case 3:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=teclado.read();
				if(cuenta <=cuentas.size()) {
					System.out.println("Introduzca la cantidad de dinero que desee ingresar");
					aux=teclado.read();
					cuentas.get(cuenta-1).ingresar(aux);
					
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 4:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=teclado.read();
				if(cuenta <=cuentas.size()) {
					System.out.println("Introduzca la cantidad de dinero que desee retirar");
					aux=teclado.read();
					cuentas.get(cuenta-1).extraer(aux);
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 5:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=teclado.read();
				if(cuenta <=cuentas.size()) {
					System.out.println("Su saldo es de: "+(cuentas.get(cuenta-1).getSaldo()));
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 6:
				System.out.println("Gracias por usar nuestros serivicios");
				break;
			default:
				System.out.println("Comando erroneo");
			}
		} while (a != 6);
	}
}
