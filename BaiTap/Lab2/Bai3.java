package Lab2;

import java.util.Scanner;

public class Bai3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap nhap so dien: ");
		int so = scan.nextInt();
		double KetQua = 0;
		
		if(so > 0)
			if (so <= 50)
			{
				KetQua = so*1000;
				System.out.printf("Tien dien: "+ KetQua);
			}
			else
			{
				KetQua = 50*1000 + (so-50)*1200;
				System.out.printf("Tien dien: "+ KetQua);
			}
		else
			System.out.printf("ban da nhap sai so dien");			
			
			
	}

}
