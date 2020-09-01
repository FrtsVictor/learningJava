package exercicios.operadoresConclusao;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Digite o Expoente: ");
		double num = in.nextDouble();
		
		System.out.printf("Digite a Potencia: ");
		double pot = in.nextDouble();
		
		double result = Math.pow(num, pot); 
		System.out.printf("%.2f Elevado a %.2f = %.2f",num, pot, result);
		
		
		in.close();
		
		
		
	}
	
}