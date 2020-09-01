package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		//MAIS USADOS
		//Rank 1  for (...;...;...) senten�a; ou {}
		//Rank 2 while (..) senten�a ; ou {}
		//Rank 3 do senten�a; ou {} {} while(...);

		// if(...) senten�a ; ou {}


		Scanner in = new Scanner(System.in);

		String texto = "";
		int valor2 = 0;

		do {
			System.out.println("Fale as palavras m�gicas....");
			System.out.println("Quer sair? ");
			texto = in.nextLine();
		} while (!texto.equalsIgnoreCase("sim"));

		System.out.println("Obrigado");


		do {
			System.out.println("Digite um valor");
			valor2 = in.nextInt();
			System.out.println(valor2 * 10);
		} while (valor2 != 3);

		in.close();
	}
}
