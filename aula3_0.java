package nljava;

import java.util.Scanner;

public class aula3_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double altura;
		double imc;
		int peso;
		
		System.out.print("qual sua altura?");
		altura = sc.nextDouble();
		
		System.out.print("qual seu peso?");
		peso = sc.nextInt();
		
		imc = peso/(altura*altura);
		System.out.print("Seu IMC é:" + imc);
		
		sc.close();
	}

}
