package nljava;

import java.util.Scanner;

public class aula4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota;
		System.out.println("Qual foi sua nota?");
		nota = sc.nextDouble();
		if (nota >= 7) {
			System.out.println("Você foi aprovado");
		} else {
			System.out.println("Você não foi aprovado :/");

		}

		sc.close();
	}
}
