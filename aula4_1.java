package nljava;

import java.util.Scanner;

public class aula4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura1;
		double altura2;
		double media;
		
		System.out.println("dados da primeira pessoa:");
		System.out.print("nome: ");
		String nome1 = sc.nextLine();
		System.out.print("digite a altura: ");
		altura1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("dados da segunda pessoa");
		System.out.print("nome: ");
		String nome2 = sc.nextLine();
		System.out.print("digite a altura: ");
		altura2 = sc.nextDouble();
		sc.nextLine();
		
		media = (altura1 + altura2) / 2;
		
		System.out.println("a media da altura de "+ nome1 + " e " + nome2 + " é: "+ String.format("%.2f", media));
		sc.close();
	}

}
