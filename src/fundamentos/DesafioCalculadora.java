package exercicios.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//ler num1
		//ler num2
		// + - * / 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Primeiro valor = ");
		double num1 = in.nextDouble();
		System.out.print("Segundo valor = ");
		double num2 = in.nextDouble();
		System.out.print("Operador = ");
		String op = in.next();

		
		double  //resultado = op.equals("+") ? num1+num2 : 0;
				//resultado = op.equals("-") ? num1-num2 : 0;
				//resultado = op.equals("*") ? num1*num2 : 0;
				//resultado = op.equals("/") ? num1/num2 : 0;
				//resultado = op.equals("%") ? num1%num2 : 0;
		
				resultado = "+".equals(op)? num1+num2 : 0;
				resultado = "-".equals(op)? num1-num2 : resultado;
				resultado = "*".equals(op)? num1*num2 : resultado;
				resultado = "/".equals(op)? num1/num2 : resultado;
				resultado = "%".equals(op)? num1%num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);

		
		in.close();		
		

		
		

	}
	
}
