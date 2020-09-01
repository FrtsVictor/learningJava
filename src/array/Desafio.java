package array;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a qtd de notas que pretende calcular");
		int qtd= in.nextInt();	
		
		double[] notas = new double[qtd] ;
		double total = 0 ;
		
		
		for (int i = 0; i < notas.length ; i++) {
			System.out.printf("Nota 0%d =  ", i+1);
			notas[i] = in.nextDouble();
		}
		
		for (double nt : notas) {
			System.out.println(nt);
			total += nt;
			System.out.println(total);
		}
		
		double media = total/notas.length;
		
		
		System.out.println(media);
		
		
		
		
		in.close();
		
		
		
		

	}

}
