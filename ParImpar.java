package nljava;
import java.util.Scanner;
public class aula5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("para encerrar o loop, digite 0");
		
		int num, par=0;
		int impar =0;
		
		System.out.println("Digite o numero que você queira saber se é par ou impar");
		
		do {
			num = sc.nextInt();
			if(num == 0) {
				System.out.println(" ");
			}
			else if (num % 2 == 0) {
				System.out.println("o numero é par");
				
			}else {
				System.out.println ("o numero é impar");}
			
		}while (num != 0);
	}

}
