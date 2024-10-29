package Reto1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do
			{do {
			do {
				try {
					System.out.println("Elige la operación:");
					System.out.println("1.Sumar");
					System.out.println("2.Restar");
					System.out.println("3.Multiplicar");
					System.out.println("4.Dividir");
					System.out.println("5.Par");
					System.out.println("6.Impar");
					System.out.println("7.Positivo");
					System.out.println("8.Negativo");
					System.out.println("0.Salir");

					String s = sc.nextLine();
					n = Integer.parseInt(s);
					break;

				} catch (Exception ex) {
					System.out.println("Introduce una opción correcta");
				}
			} while (true);
		} while (0 > n || n > 8);

		switch (n) {

		case 1:
			n = 1;
			int n1;
			int n2;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n1 = Integer.parseInt(s);

					System.out.println("Introduce otro nº");
					String s2 = sc.nextLine();
					n2 = Integer.parseInt(s2);
					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			int resultado = sumar(n1, n2);
			System.out.println(resultado);
			break;

		case 2:
			n = 2;
			int n3;
			int n4;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n3 = Integer.parseInt(s);

					System.out.println("Introduce otro nº");
					String s2 = sc.nextLine();
					n4 = Integer.parseInt(s2);
					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			int resultado2 = restar(n3, n4);
			System.out.println(resultado2);
			break;

		case 3:
			n = 3;
			int n5;
			int n6;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n5 = Integer.parseInt(s);

					System.out.println("Introduce otro nº");
					String s2 = sc.nextLine();
					n6 = Integer.parseInt(s2);
					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			int resultado3 = multiplico(n5, n6);
			System.out.println(resultado3);
			break;

		case 4:
			n = 4;
			int n7;
			int n8;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n7 = Integer.parseInt(s);

					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);
			
			
			do{do {
				try {
					System.out.println("Introduce otro nº");
					String s2 = sc.nextLine();
					n8 = Integer.parseInt(s2);
					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);
			}while (n8==0);
			
			int resultado4 = dividir(n7, n8);
			System.out.println(resultado4);
			break;

		case 5:
			n = 5;
			int n9;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n9 = Integer.parseInt(s);

					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			boolean resultado5 = esPar(n9);
			System.out.println(resultado5);
			break;

		case 6:
			n = 6;
			int n10;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n10 = Integer.parseInt(s);

					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			boolean resultado6 = esImpar(n10);
			System.out.println(resultado6);
			break;

		case 7:
			n = 7;
			int n11;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n11 = Integer.parseInt(s);

					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			boolean resultado7 = numPositivo(n11);
			System.out.println(resultado7);
			break;

		case 8:
			n = 8;
			int n12;

			do {
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					n12 = Integer.parseInt(s);

					break;
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			} while (true);

			boolean resultado8 = numNegativo(n12);
			System.out.println(resultado8);
			break;

		}}while(n!=0);

		sc.close();
	}

	public static int sumar(int a, int b) {
		return (a + b);
	}

	public static int restar(int a, int b) {

		return (a - b);

	}

	public static boolean esPar(int a)

	{
		return a % 2 == 0;
	}

	public static boolean esImpar(int a) {

		return a % 2 != 0;

	}

	public static int multiplico(int n1, int n2) {
		return (n1 * n2);
	}

	public static int dividir(int n1, int n2) {

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
