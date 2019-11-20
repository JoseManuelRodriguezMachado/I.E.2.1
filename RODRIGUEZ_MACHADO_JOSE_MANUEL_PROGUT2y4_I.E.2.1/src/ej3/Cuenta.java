package ej3;

public class Cuenta {
	
	private long dni;
	private static long n_cuenta = 100001;
	private double saldo, interes;
	
	Cuenta(){
		n_cuenta++;
	}
	
	Cuenta(long dni, double saldo, double interes){
		this.dni = dni;
		this.interes = interes;
		this.saldo = saldo;
		n_cuenta++;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double sueldo) {
		this.saldo = sueldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public long getN_cuenta() {
		return n_cuenta;
	}
	
	public void datos() {
		System.out.println("Bienvenido, mostrando datos personales:"
				+"\n"+getDni()
				+"\n"+getN_cuenta()
				+"\n"+getSaldo());
	}
	
	public void actualizarSaldo() {
		this.saldo = saldo + (interes/365);
	}
	
	public void ingresar(double meter_dinero) {
		this.saldo = saldo + meter_dinero;
	}
	
	public void retirar(double sacar_dinero) {
		this.saldo = saldo - sacar_dinero;
	}
}
