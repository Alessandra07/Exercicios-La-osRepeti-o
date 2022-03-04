package laçosexercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1 , num2 , num3 , maior = 0 ;
		
		System.out.println("\nDigite o Primeiro número? " );
		num1 = leia.nextInt();
		
		System.out.println("\nDigite o Segundo número? ");
		num2 = leia.nextInt();
		
		System.out.println("\nDigite o Terceiro número? ");
		num3 = leia.nextInt();
		
		if (num1>maior) {
			 maior = num1;
			 
		}
		if (num2>maior) {
			  maior = num2;
			  
		}
		if (num3>maior) {
			maior = num3;
		}
		
		System.out.println("O maior número é : " + maior);
		
		leia.close();
		
	}

}
