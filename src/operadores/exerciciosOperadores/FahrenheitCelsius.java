package exercicios.operadoresConclusao;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Fahrenheit = ");
		double f = in.nextDouble();
		
		double c = ((double)f - 32) * (double)5/9;
		
		System.out.printf("%f Fahrenheits = Celcius = %f ", f,c);
		
		in.close();
		
	}
	
}
