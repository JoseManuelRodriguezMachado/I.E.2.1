package ej15;

public class Cuenta {
	
	private float saldo;

	public Cuenta() {
		this.saldo = 0;
	}
	public Cuenta(float saldo) {
		this.saldo = saldo;
	}

	public void ingresar(float c) {
		this.saldo += c;
		System.out.println("Su saldo actual es de "+saldo);
	}

	public void extraer(float c) {
		if (this.saldo >= c) {
			this.saldo-=c;
			System.out.println("Su saldo actual es de "+saldo);
		}else {
			System.out.println("No tiene suficiente saldo para realizar la operación");
			System.out.println("Su saldo actual es de "+saldo);
		}
	}

	public float getSaldo() {
		return saldo;
	}

}
