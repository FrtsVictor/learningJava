package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite uma frase");

		String frase = in.nextLine();

		
		//Enquanto frase n�o for igual sair, repete. qd � igual, n repete e sai
		while (!frase.equalsIgnoreCase("sair")) {
			System.out.println("Digite novamente uma frase");
			frase = in.nextLine();
		}
		
		in.close();
		
	}
}
