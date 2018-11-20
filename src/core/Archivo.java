package core;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Archivo {

	public static Minotauro leer(final String archivo) throws FileNotFoundException {

		
		Scanner sc = new Scanner(new FileReader(archivo));
		
		int cantidadNodos = sc.nextInt();
		Minotauro minotauro = new Minotauro(cantidadNodos);
		for (int i = 0; i < cantidadNodos; i++) {
			for (int j = 0; j < cantidadNodos; j++) {
				minotauro.add(i, j, sc.nextInt());
			}
		}
		sc.close();
		return minotauro;
	}
	
	public static void escribir(final int resultado, final String archivo) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(archivo));
		
		pw.println(resultado);
		
//		for (Baldosa baldosa : baldosas) {
//			pw.print(baldosa.get());
//		}
		pw.close();
	}
}
