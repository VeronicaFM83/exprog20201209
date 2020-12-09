package fp.daw.examen1ev;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] miArray = {{1,5,5,2,4},{2,1,4,14,3},{3,7,11,2,8},{4,8,12,16,4}}; 
		System.out.println(miArray.length);
		System.out.println(miArray[0].length);
		int resultado = max3x3sum(miArray);
		System.out.println("RESULTADO: " + resultado);
	}
	
	public static int max3x3sum (int[][] miArray) {
		int resultado = 0;
		Random r= new Random();
		int suma = 0;
		
		for (int i=0; i < miArray.length; i++) { // Relleno el array
			for (int j=0; j<miArray[0].length; j++) {
				//int n=Math.round(r.nextInt(10 -3))+3;
				int n=Math.round(r.nextInt(Integer.MAX_VALUE -3))+3;
				miArray[i][j] = n;
			}
			System.out.print(Arrays.toString(miArray[i]));
		}
		int a=0, b=0, contadorA=0, contadorB=0;
		while ((a < miArray.length)&& (contadorA<3)) {
			while ((b < miArray[0].length)&& (contadorB<3)) {
				suma += miArray[a][b];
				contadorB++;
				b++;
				/*System.out.println("contadorB " + contadorB);
				System.out.println("suma " + suma);*/
				
			}
			contadorB = 0;
			contadorA++;
			a++;
			/*System.out.println("contadorA " + contadorA);
			System.out.println();
			System.out.println(suma);*/
			if (suma>resultado) {
				resultado = suma;
			}
		}

		return resultado;
	}

}
