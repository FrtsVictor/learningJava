package exercicios.fundamentos.operadores;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Primeiro Valor : ");
		double num1 = in.nextDouble();
		
		System.out.print("Segundo Valor : ");
		double num2 = in.nextDouble();
			
		System.out.println("Operador : ");		
		String op = in.next();
		
		double soma = num1+num2;
		double sub = num1-num2;
		double mult = num1*num2;
		double div = num1/num2;
		double rest = num1%num2;
		
		
		String  ma = "+".equals(op)? (op.replace("+", Double.toString(soma))) : "";
				ma = "-".equals(op)? (op.replace(op, Double.toString(sub))) : "";
				ma = "*".equals(op)? (op.replace(op, Double.toString(mult))) : "";
				ma = "/".equals(op)? (op.replace(op, Double.toString(div))) : "";
				ma = "&".equals(op)? (op.replace(op, Double.toString(rest))) : "";
	
		System.out.print(ma);
		
		
	in.close();
		
	}
	
}
