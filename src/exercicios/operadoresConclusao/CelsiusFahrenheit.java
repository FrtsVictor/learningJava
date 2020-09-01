package exercicios.operadoresConclusao;

import java.util.Scanner;

class CelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Temperatura em Cº =  ");
		
		double c = in.nextDouble();
		
		double f = ((double)9/5)*c + 32; //Definindo (Double) pra pegar a casa decimal
		double ff = (9.0/5.0)*c + 32; // Se n colocar o .0 depois do numero o doubçle ignora a casa decimal
		
		
		System.out.printf("Temperatura em fahrenheit = %.4f ", f);
		System.out.println(ff);
		in.close();
		
	}
	
}
