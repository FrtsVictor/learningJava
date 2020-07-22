package controle;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		
		double num = in.nextDouble();
		
		for (; num >=0; num-=2 ) {
			
			System.out.println(num);
			in.close();
		}
		
		
		
		
	}
	
}
