package Lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main (String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		String HoTen = scan.nextLine();
		System.out.print("Điem: ");
		double diem = scan.nextDouble();
		
		System.out.printf("Ho ten: %s\nDiem: %.2f", HoTen, diem);
	}
}
