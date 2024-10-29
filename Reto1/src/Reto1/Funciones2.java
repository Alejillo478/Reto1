package Reto1;



public class Funciones2 {
	

	public static int multiplico(int n1, int n2) {
		return (n1 * n2);
	}

	public static int dividir(int n1, int n2) {

		if (n2 == 0)
			return 0;
		else
			return (n1 / n2);
	}

	public static boolean numPositivo(int n1) {
		if (n1 > 0)
			return true;
		else
			return false;
	}

	public static boolean numNegativo(int n2) {
		if (n2 < 0)
			return true;
		else
			return false;
	}
}