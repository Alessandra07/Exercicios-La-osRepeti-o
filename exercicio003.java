package la�osexercicios;
import java.util.Scanner;

public class exercicio003 {

	public static void main(String[] args) {
		
		
     Scanner leia = new Scanner(System.in);
		
		
	
		int idade;
		
		
		
		System.out.println("Qual sua idade ? ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("Inafantil"); 
		}
		else if (idade>=15 && idade <= 17) {
			System.out.println("Juvenil");
		}else if (idade>=18 && idade<=25) {
			System.out.println("Adulto");
		}else if ((idade<15 && idade>0)  || idade>25) {
			System.out.println("Que pena N�o pode competir");
		}else {
			System.out.println("Idade invalida");
			
			leia.close();
		}
		
	}

}
