package ej12;

public class Empleado {
	
	private String nombre;
	private int horas;
	private double tarifa;
	
	Empleado() {
	
	}
	
	Empleado(String nombre, int horas, double tarifa) {
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public void mostrar_datos() {
		if(horas>40) {
			System.out.println(getNombre()+" ha trabajado "+getHoras()+" horas con una tarifa de "+getTarifa()+"."+
					"\nPor lo tanto le corresponde un sueldo de "+(40*tarifa+(horas-40)*1.5*tarifa));
		}else {
			System.out.println(getNombre()+" ha trabajado "+getHoras()+" horas con una tarifa de "+getTarifa()+"."+
					"\nPor lo tanto le corresponde un sueldo de "+(horas*tarifa));
		}
	}

}
