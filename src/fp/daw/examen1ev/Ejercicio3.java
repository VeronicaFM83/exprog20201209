package fp.daw.examen1ev;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba un número (valor de variable)");
		double lin1 = Double.parseDouble(input.nextLine()); // Almacenamos num por teclado
		System.out.println("Escriba los valores de los coeficientes separados por espacios");
		String lin2 = input.nextLine(); // Almacenamos texto por teclado
		String soloNum[] =  lin2.split(" ");
		calculo(lin1,soloNum);
		input.close();
	}

	private static char[] valueOf(String lin1) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean isNaN(char[] cs) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void calculo(double lin1, String[] soloNum) {
		double potencia, resultado = 0, parcial = 0;
		for (int i=0; i<soloNum.length; i++) {
			int n = (int) Integer.parseInt(soloNum[i]);
			potencia = Math.pow(lin1, i);
			parcial = potencia * n;
			resultado += parcial;
			/*System.out.println(" potencia " + potencia);
			System.out.println(" parcial " + parcial);
			System.out.println(" resultado " + resultado);*/
		}
		System.out.println("El resultado es: " + resultado);
	}
}
