package Reto1;

import java.util.Scanner;

public class Funciones1 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		String s1 = sc.nextLine();
		int n1 = Integer.parseInt(s1);

		

		boolean resultado=esImpar(n1);
		System.out.println(resultado);
		sc.close();
		
	}
	public static int sumar (int a,int b)
	{
		return (a+b);
	}
	public static int restar (int a,int b)
	{
		
		return (a-b);
		
	}
	
	public static boolean esPar(int a)
	
	{
		return a%2==0;
	}

	public static boolean esImpar(int a)
	{
		
		return a%2!=0;
		
	}
	
	
	
	
}
