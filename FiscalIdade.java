package nljava;

import java.util.Scanner;

public class aula4_0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Qual sua idade?");

		idade = sc.nextInt();

		if (idade >= 60) {

			System.out.print("Você é idoso!");

		} else if (idade >= 18 && idade < 60) {

			System.out.println("É adulto");

		} else {

			System.out.println("É criança");
			sc.close();

		}

	}
}
