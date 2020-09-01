package controle.conclusao;

import java.util.Scanner;

//Criar um programa que receba um numero e verifique se ele está entre 0 e 10 e par; 


public class NumeroPar_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite um numero inteiro");
		// int num = in.nextInt();
		int num = in.nextInt();
		while(num>10) {
			System.out.println("Digite um numero valido entre 0 e 10");
			num = in.nextInt();
		}		
		
		
		for (;num >= 0 && num <= 10; num++) {
			if(num % 2 == 1) {
				continue;
		}
		System.out.print(num+ " ");
		
		in.close();
		}
		
	}


}

