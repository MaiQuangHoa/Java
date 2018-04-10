package Lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nhap canh cua khoi lap phuong: ");
		int canh = scan.nextInt();
				
		System.out.println("Delta: "+  Math.pow(canh,3));
	}
}
