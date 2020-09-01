package exercicios.operadoresConclusao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Base? = ");
		double base = in.nextDouble();
		System.out.printf("Altura? = ");
		double altura = in.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.printf("Com Base = %.2f e Altura = %.2f temos Area = %.2f.", base, altura,area);
		
						
		in.close();
		
	}
	
}
