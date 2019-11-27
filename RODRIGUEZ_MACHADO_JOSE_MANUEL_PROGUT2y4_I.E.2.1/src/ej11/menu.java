package ej11;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tipo;
		Triangulo t1 = new Triangulo(1,2,3);
		Triangulo t2 = new Triangulo(3,2,1);
		Triangulo t3 = new Triangulo(3,1,2);
		Triangulo t4 = new Triangulo(3,3,3);
		Triangulo t5 = new Triangulo(3,2,3);
		Triangulo[] at1 = {t1,t2,t3};
		Triangulo[] at2 = {t1,t2,t3,t4,t5};
		
		System.out.println("comparamos t1 y t2");
		System.out.println(t1.compareTo_Triangulos(t1, t2));
		System.out.println("comparamos t3 y t5");
		System.out.println(t3.compareTo_Triangulos(t3, t5));
		
		System.out.println("comprobamos que tipo de triangulo es t4");
		System.out.println(t4.tipo_Triangulo());
		tipo = t4.tipo_Triangulo();
		switch(tipo) {
		case 1:
			System.out.println("es equilatero");
			break;
		case 2:
			System.out.println("es isosceles");
			break;
		case 3:
			System.out.println("es escaleno");
			break;
		}
		
		System.out.println("comparamos t1, t2 y t3");
		if(t1.compareTo_VTriangulos(at1)) {
			System.out.println("son iguales");
		}else {
			System.out.println("son distintos");
		}
		
		System.out.println("añadimos t4 y t5 para volver a comparar");
		if(t1.compareTo_VTriangulos(at2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("son distintos");
		}
	}
}
