package controle.conclusao;

import java.util.Scanner;

public class NumeroPrimoSwitch_5 {

	public static void main(String[] args) {
		
		
		int contDiv = 0;
		
		Scanner in = new Scanner(System.in);

		int n = 95;
		
		for (int i =2 ; i < n; i++ ) {
			if ( n % i == 0) {
			contDiv++;
		}
		}
		
		if(contDiv == 0) {
			System.out.printf("%d é primo",n );
			
		}else {
			System.out.printf("%d não é primo", n);
			
		} 	
		
				
		in.close();
		
	}
	
}
