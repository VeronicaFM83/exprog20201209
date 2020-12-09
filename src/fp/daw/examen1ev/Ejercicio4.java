package fp.daw.examen1ev;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] miArray = {{1,5,5,2,4},{2,1,4,14,3},{3,7,11,2,8},{4,8,12,16,4}}; 
		System.out.println(miArray.length);
		System.out.println(miArray[0].length);
		max3x3sum(miArray);

	}
	
	public static int[][] max3x3sum (int[][] miArray) {
		int[][] resultado;
		Random r= new Random();
		int suma;
		
		for (int i=0; i < miArray.length; i++) { // relleno el array
			for (int j=0; j<miArray[0].length; j++) {
				int n=Math.round(r.nextInt(Integer.MAX_VALUE -3))+3;
				miArray[i][j] = n;
			}
			//System.out.print(Arrays.toString(miArray[i]));
		}
		int k=0;
		int l=0;
		while ((k < miArray.length)
		for (int k=0; k < miArray.length; k++) { 
			for (int l=0; l<miArray[0].length; j++) {
				suma += miArray[i][j]
				miArray[i][j] = n;
			}
			//System.out.print(Arrays.toString(miArray[i]));
		}
		
		resultado = miArray;
		return resultado;
	}
	
	

}
