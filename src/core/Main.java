package core;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Minotauro minotauro = Archivo.leer("archivos/dos.in");
		
		Archivo.escribir(minotauro.resolver(), "archivos/dos.out");
	}
}
