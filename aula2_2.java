package nljava;

import java.util.Scanner;

public class aula2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double metroquadrado;
		double custoTotal; 
		double area;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroquadrado = sc.nextDouble();	
		area = largura * comprimento;
		custoTotal = area*metroquadrado;
		System.out.print("a area é: " + area);
		System.out.print("custo total = " + custoTotal);
		sc.close();
		
				
		
	}

}
