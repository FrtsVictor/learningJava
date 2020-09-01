package controle.conclusao;

import java.util.Scanner;

public class NumeroPosisito_7 {
	public static void main(String[] args) {
//		
//		7. Criar um programa que enquanto estiver recebendo números positivos, 
//		imprime no console a soma dos números inseridos, caso receba um número negativo
//		, encerre o programa. Tente utilizar a estrutura do while. 
	
		Scanner in = new Scanner(System.in);
		System.out.printf("Digite um numero positivo");
		int numeroIn = in.nextInt();
		
		while(numeroIn > 0 ) {
			System.out.println(numeroIn +"\n");
			var num = in.nextInt();
			numeroIn += num;
			if(num <0){
				 break;
			}
		}
		
		
		
		
		in.close();
	
	
	
	}

}
