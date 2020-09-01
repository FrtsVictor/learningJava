package exercicios.operadoresConclusao;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		//a b c Y
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o valor de A = ");
		double a = in.nextDouble();
		
		System.out.print("Digite o valor de B = ");
		double b = -in.nextDouble();
	
		System.out.print("Digite o valor de C = ");
		double c = in.nextDouble();
		
		double delta = (Math.pow(b, 2))- (4*a*c); // calcula delta
		System.out.print("Valor de delta = " + delta);
		
		double x = (-b + Math.sqrt(delta)) / (2*a); // calcula -b+ raiz delta sobe 2.a
		double xx = (-b - Math.sqrt(delta)) / (2*a); // calcula -b - raiz delta sobe 2.a
		
		System.out.print("\nRaiz 1 = "+ x);
		System.out.print("\nRaiz 2 = "+ xx);
		
		in.close();
	}
	
}
