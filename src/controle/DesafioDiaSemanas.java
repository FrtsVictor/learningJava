package controle;

import java.util.Scanner;

public class DesafioDiaSemanas {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.print("Digite nome do dia");
	
	String dia = in.next();
	
	
	if (dia.equalsIgnoreCase("segunda")){
		System.out.println("2");
	}else if (dia.equalsIgnoreCase("ter�a") || dia.equalsIgnoreCase("terca")){
		System.out.println("3");
	}else if (dia.equalsIgnoreCase("quarta")) {
		System.out.println("4");
	}else if (dia.equalsIgnoreCase("quinta")) {
		System.out.println("5");
	}else if (dia.equalsIgnoreCase("sexta")) {
		System.out.println("6");
	}else if (dia.equalsIgnoreCase("s�bado") || dia.equalsIgnoreCase("sabado")) {
		System.out.println("7");
	}else if (dia.equalsIgnoreCase("domingo")) {
		System.out.println("1");
	}else System.out.println("Digite um dia v�lido");
			
	
	in.close();
		
		
		
	}
	
}
