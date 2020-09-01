package exercicios.fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		// Sempre que for comparar strings usar o EQUALS nunca o ==
		
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner in = new Scanner(System.in);
		
		String s2 = in.next();
		System.out.println("2" == s2.trim()); //s2.trim() serve pra ignorar espaços
		System.out.println("2".equals(s2.trim()));  
		
		
		in.close();
		
		
	}
	
}
