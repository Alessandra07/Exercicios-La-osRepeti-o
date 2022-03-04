package laçosexercicios;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		
		
		 Scanner leia = new Scanner(System.in);
			
			int num1 , num2 , num3  ;
			
			System.out.println("\nDigite o Primeiro número? " );
			num1 = leia.nextInt();
			
			System.out.println("\nDigite o Segundo número? ");
			num2 = leia.nextInt();
			
			System.out.println("\nDigite o Terceiro número? ");
			num3 = leia.nextInt();
			
			System.out.println("A Ordem crescente é : ");
			
		
			
			if (num1 < num2){
				if (num2 < num3) {
					System.out.println(num1 + "\n"+num2+"\n"+num3);
				}
				else if (num1 < num3) {
					System.out.println(num1+"\n"+num3+"\n"+num2);
				}
				else {
					System.out.println(num3+"\n"+num1+"\n"+num2);
				}
				
			}
			
				else if (num2 < num3) {
					if (num1 < num3) {
						System.out.println(num2+"\n"+num1+"\n"+num3);
					}
					else {
						System.out.println(num2+"\n"+num3+"\n"+num1);
					}
					
				} 
				
				else {
					System.out.println(num3+"\n"+num2+"\n"+num1);
					
					leia.close();
					
				
					
				}
	}

}
