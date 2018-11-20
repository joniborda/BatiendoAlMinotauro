package core;

import java.util.ArrayList;

public class Minotauro {

	private static final int INFINITO = -1;
	private int[][] matriz;

	public Minotauro(int cantidadNodos) {
		this.matriz = new int[cantidadNodos][cantidadNodos];
	}

	public void add(int i, int j, int costo) {
		this.matriz[i][j] = costo;
	}

	public ArrayList<Arista> resolver() {
		ArrayList<Integer> noConectados = new ArrayList<Integer>();
		ArrayList<Integer> conectados = new ArrayList<Integer>();
		ArrayList<Arista> aristas = new ArrayList<Arista>();

		for (int i = 0; i < matriz.length; i++) {
			noConectados.add(i);
		}
		
		int nodoActual = noConectados.get(0);
		int costoMinimo = INFINITO;
		int nodoMinimo = INFINITO;

		while(noConectados.size() != 0) {
			nodoActual = noConectados.get(0);
			for (int i = 0; i < matriz.length; i++) {
				if (nodoActual != i && (costoMinimo == INFINITO || this.matriz[nodoActual][i] < costoMinimo)) {
					costoMinimo = this.matriz[nodoActual][i];
					nodoMinimo = i;
				}
			}
			
			conectados.add(nodoActual);
			if (nodoMinimo != INFINITO) {
				aristas.add(new Arista(nodoActual, nodoMinimo, costoMinimo));
			}
			noConectados.remove(0);
			conectados.add(nodoActual);
		}
		return aristas;
	}

}
