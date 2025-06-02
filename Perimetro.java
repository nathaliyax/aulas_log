package nljava;

import java.util.Scanner;

public class aula4_2 {

	public static void main(String[] args) {
		double largura;
		double altura;
		double area;
		double perimetro;
		double diagonal;
		Scanner sc = new Scanner(System.in);
		
		largura = sc.nextDouble();
		altura = sc.nextDouble();
		area = largura * altura;
		perimetro = (largura + largura) + (altura + altura);
		diagonal = Math.sqrt((altura * altura) + (largura * largura));
		
		
		System.out.print("a area e:" + area);
		System.out.print("o perimetro e: " + perimetro);
		System.out.print("a diagonal e: " + diagonal );
		sc.close();
	}

}
