package Lab1;

import java.util.Scanner;

public class Bai4 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nhap a: ");
		int a = scan.nextInt();
		System.out.printf("Nhap b: ");
		int b = scan.nextInt();
		System.out.printf("Nhap c: ");
		int c = scan.nextInt();
		
		double Delta = Math.pow(b,2) - 4.0*a*c;
		System.out.println("Delta: "+ Delta);
		System.out.println(" "+ Math.sqrt(Delta));
	}
}
