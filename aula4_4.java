package nljava;
import java.util.Scanner;
public class aula4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Escreva o primeiro numero");
		num1 = sc.nextInt();
		System.out.println("Escreva o segundo numero");
		num2 = sc.nextInt();
		
		if (num1 >= num2) {
			System.out.println(" " + num1 );
		}
		else 
			System.out.println("Esse é o maior numero: "+ num2);
		
		sc.close();
	}

}
