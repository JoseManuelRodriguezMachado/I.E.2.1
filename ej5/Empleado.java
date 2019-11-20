package ej5;

public class Empleado {
	
	private static double pagoPorHoraExtra = 10;
    private String nif, nombre, casado;
    private double sueldoBase, tipoIRPF;
    private int h_extras, n_hijos;
   
    public Empleado() {
    }

    public Empleado(String nif, String nombre, String casado, double sueldoBase, double tipoIRPF, int h_extras, int n_hijos) {
        this.nif = nif;
        this.nombre = nombre;
        this.casado = casado;
        this.sueldoBase = sueldoBase;
        this.tipoIRPF = tipoIRPF;
        this.h_extras = h_extras;
        this.n_hijos = n_hijos;
    }
    
	public static double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
		Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public int getH_extras() {
		return h_extras;
	}

	public void setH_extras(int h_extras) {
		this.h_extras = h_extras;
	}

	public int getN_hijos() {
		return n_hijos;
	}

	public void setN_hijos(int n_hijos) {
		this.n_hijos = n_hijos;
	}

	public String getCasado() {
		return casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}
	
	public double horas_extras(){
        return h_extras * pagoPorHoraExtra;
    }
	
	public double sueldo_bruto(){
        return sueldoBase + horas_extras();
    }
	
	public double retencion_irpf(){
        double tipo = tipoIRPF;
        if(casado == "si") {
            tipo = tipo - 2;
        }
        tipo = tipo - n_hijos; 
        if(tipo<0){
            tipo = 0;
        }
        return sueldo_bruto() * tipo / 100;
    }
	
	public double sueldo_neto(){
        return sueldo_bruto() - retencion_irpf();
    }

	public void println() {
		System.out.println("Nombre: "+nombre
				+"\nNif: "+nif
				+"\nCasado: "+casado);
	}
	
	public void printAll() {
		System.out.println("Nombre: "+nombre
				+"\nNif: "+nif
				+"\nCasado: "+casado
				+"\nSueldo base: "+sueldoBase
				+"\nComplemento por horas extras: "+horas_extras()
				+"\nSueldo bruto: "+sueldo_bruto()
				+"\nRetencion de IRPF: "+retencion_irpf()
				+"\nSueldo neto: "+sueldo_neto());
	}
	
	public void copia() {
		System.out.println();
	}
}
