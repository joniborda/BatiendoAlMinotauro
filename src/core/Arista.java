package core;

public class Arista {

	private int nodoActual;
	private int nodoMinimo;
	private int costoMinimo;

	public Arista(int nodoActual, int nodoMinimo, int costoMinimo) {
		this.nodoActual = nodoActual;
		this.nodoMinimo = nodoMinimo;
		this.costoMinimo = costoMinimo;
	}
	
	public String toString() {
		return this.nodoActual + " " + this.nodoMinimo + " " + this.costoMinimo;
	}

}
