package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main (String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nhap chieu dai: ");
		int cd = scan.nextInt();
		System.out.printf("Nhap chieu rong: ");
		int cr = scan.nextInt();
		
		int CV = (cd+cr)*2;
		System.out.printf("Chu vi: (%d + %d) x 2 = %d\n", cd, cr, CV);
		System.out.printf("Dien tich: %d x %d = %d\n", cd, cr, cd*cr);
	
		System.out.printf("Canh nho nhat: %d", Math.min(cd, cr));
	}
}
