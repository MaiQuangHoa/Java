package Lab2;

import java.util.Scanner;

public class Bai1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nhap a: ");
		int a = scan.nextInt();
		System.out.printf("Nhap b: ");
		int b = scan.nextInt();
		
		if(a == 0)
			System.out.println("Phuong trinh vo nghiem!");
		else
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem!");
			else
				System.out.println("Nghiem cua phuong trinh la "+ -b*1.0/a);
	}
}
