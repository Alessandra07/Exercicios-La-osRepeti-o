package la�osexercicios;

import java.util.Scanner;

public class exercicio004 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		 
		 int num;
		 
		 System.out.println("Qual numero ?");
		 num = leia.nextInt();
		 
		 if (num%2 == 0 ) {
			 
			 System.out.println("O n�mero � par e a raiz dele �" + Math.sqrt(num));
			 
             }else {
			 
			 System.out.println("O n�mero � impar e a raiz dele �" + Math.pow(num,2));
			 
			 
			 leia.close();
			 
		 }
		
		
		
	}

}
