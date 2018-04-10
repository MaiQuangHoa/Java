package Lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nhap a: ");
		int a = scan.nextInt();
		System.out.printf("Nhap b: ");
		int b = scan.nextInt();
		System.out.printf("Nhap c: ");
		int c = scan.nextInt();
		
		
		if(a == 0)
		{
			if(b == 0)
				System.out.println("Phuong trinh vo nghiem!");
			else
				if(c == 0)
					System.out.println("Phuong trinh vo so nghiem!");
				else
					System.out.println("Nghiem cua phuong trinh la x= "+ -c*1.0/b);
		}
		else
		{
			double Delta = Math.pow(b,2) - 4.0*a*c;
			if(Delta < 0)
				System.out.println("Phuong trinh vo so nghiem!");
			if(Delta == 0)
				System.out.println("Phuong trinh co 2 nghiem kep x="+ -b*1.0/(2*a));
			if(Delta > 0)
				System.out.printf("Phuong trinh co 2 nghiem:\n\t x1 = %.2f\n\t x2 = %.2f", (-b - Math.sqrt(Delta))/a*2, (-b + Math.sqrt(Delta))/a*2);
		}
	}
		
}
