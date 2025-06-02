package nljava;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in) ;
		double x, y, media;
		System.out.print("1");
		x = sc.nextDouble () ;
		System.out.print("4");
		y = sc.nextDouble ();
		media = (x + y) / 2.0;
		System.out.println("Media = " + media) ;
		sc.close();
	}

}
