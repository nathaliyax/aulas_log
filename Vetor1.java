package nljava;

import java.util.Scanner;

public class aula6_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[5];

		System.out.println("Digite 5 números inteiros:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}

		System.out.println("Os números guardados foram:");
		for (int num : vetor) {
			System.out.println(num);
		}

		scanner.close();
	}
}
