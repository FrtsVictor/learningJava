package controle.conclusao;

import java.util.Scanner;

public class Soletrar_8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String soletrar = in.next();
		
		int contador = soletrar.length();
		System.out.println(contador);
		
		while ( contador > 0 ) {
			contador --;
			System.out.println(soletrar.charAt(contador));
			}
		if(contador == 0) {
			System.out.println("fim");
		}
		
		
		String palavra = in.next();
		
		char solet [] = palavra.toCharArray();
		
		
		for (int i = 0; i < solet.length; i++) {
			System.out.println(solet[i]);
		}
		
		
		
		
		
		
		in.close();
		
		
		
				}
		
	
	
}
