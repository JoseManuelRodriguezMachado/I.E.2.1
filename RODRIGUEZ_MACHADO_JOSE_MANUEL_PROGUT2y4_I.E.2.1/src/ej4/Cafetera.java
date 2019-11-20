package ej4;

public class Cafetera {
	
	int _capacidadMaxima, _capacidadActual;
	
	Cafetera() {
		this._capacidadMaxima = 1000;
		this._capacidadActual = 0;
	}
	
	Cafetera(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
		this._capacidadActual = _capacidadMaxima;
	}
	
	Cafetera(int _capacidadActual, int _capacidadMaxima){
		
		if(_capacidadActual > _capacidadMaxima) {
			this._capacidadActual = _capacidadMaxima;
			this._capacidadMaxima = _capacidadMaxima;
		}else {
			this._capacidadActual = _capacidadActual;
			this._capacidadMaxima = _capacidadMaxima;
		}
	}

	public int get_capacidadMaxima() {
		return _capacidadMaxima;
	}

	public void set_capacidadMaxima(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
	}

	public int get_capacidadActual() {
		return _capacidadActual;
	}

	public void set_capacidadActual(int _capacidadActual) {
		this._capacidadActual = _capacidadActual;
	}
	
	public void llenarCafetera(){
		this._capacidadActual = _capacidadMaxima;
		System.out.println("cafetera llenada: "+_capacidadActual);
	}
	
	public void servirTaza(int servir) {
		if (servir <= _capacidadActual) {
			this._capacidadActual = _capacidadActual - servir;
			System.out.println("cafe dsiponible: "+_capacidadActual);
		}else {
			servir = _capacidadActual;
			this._capacidadActual = _capacidadActual - servir;
			System.out.println("cafe dsiponible: "+_capacidadActual);
		}
	}
	
	public void vaciarCafetera() {
		this._capacidadActual = 0;
		System.out.println("la cafetera esta vacia");
	}
	
	public void agreagarCafe(int llenar) {
		this._capacidadActual = _capacidadActual + llenar;
		System.out.println("cafe disponible: "+_capacidadActual);
	}

}
