package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = in.nextDouble();
		
		if(media >= 7.0 && media <= 10 ) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 5) {
			System.out.println("Recupera��o");
			System.out.println("Deu mole!");
		}
		
		if(media < 5 && media >=0) {
			System.out.println("Reprovado");
			System.out.println("Retorne ano que vem.");
		}
		
		boolean gabaritou = media == 10;
		
		if (gabaritou) {
			System.out.println("Parab�ns! Tu � bolado d+");
			
		}
		
		
		in.close();
		
	}
	
}
