package fp.daw.examen1ev;


public class Ejercicio2 {

	public static void main(String[] args) {
		
		int anyo =  2020;

		if ((anyo % 4 == 0)) {
			if ((anyo % 100) != 0) {
				if ((anyo % 400) == 0) {
					System.out.println("Es bisiesto (divisible entre 4 y 400 pero no entre 100)");
				} else {
					System.out.println("NO es bisiesto (no es divisible entre 400)");
				}	
			} else {
				System.out.println("NO es bisiesto (es divisible entre 100)");
			}	
		} else {
			System.out.println("NO es bisiesto (no es divisible entre 4");
		}	
		
	}
}
