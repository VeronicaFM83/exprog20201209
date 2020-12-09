package fp.daw.examen1ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduzca un texto: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Usamos clase BufferedReader
		String cadena =  reader.readLine(); // Almacenamos el texto captado por teclado
		cadena = cadena.toLowerCase();
		int tamanio = cadena.length();
		
		char[] charArray = new char[tamanio]; // Creamos un array del tamaño de la cadena
	
		for (int i=0; i<tamanio; i++) {
			charArray[i] = cadena.charAt(i);
			}
	
		System.out.println("Cadena: " + cadena);
		System.out.println("Array: " + Arrays.toString(charArray));
		Arrays.sort(charArray);
		System.out.println("Array ordenado: " + Arrays.toString(charArray));
	}

}
