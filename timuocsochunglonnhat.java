package tim_uoc_so_chung_lon_nhat;

import java.util.Scanner;

public class timuocsochunglonnhat {

	public static void main(String[] args) {
		int a, b;
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap vao a:");
		a = nhap.nextInt();
		System.out.println("Nhap vao b:");
		b = nhap.nextInt();
		a = Math.abs(a);
		b = Math.abs(b);
		if (a==0 || b == 0) {
			System.out.println("No greatest common factor");
		}
		while(a!=b) {
			if(a>b) {
				a = a - b;
			}else {
				b = b - a;
			}
		}
		System.out.println("Greatest common factor: "+a);

	}

}
