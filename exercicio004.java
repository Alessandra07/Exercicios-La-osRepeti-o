package laçosexercicios;

import java.util.Scanner;

public class exercicio004 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		 
		 int num;
		 
		 System.out.println("Qual numero ?");
		 num = leia.nextInt();
		 
		 if (num%2 == 0 ) {
			 
			 System.out.println("O número é par e a raiz dele é" + Math.sqrt(num));
			 
             }else {
			 
			 System.out.println("O número é impar e a raiz dele é" + Math.pow(num,2));
			 
			 
			 leia.close();
			 
		 }
		
		
		
	}

}
