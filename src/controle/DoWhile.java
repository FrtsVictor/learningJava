package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		//MAIS USADOS
		//Rank 1  for (...;...;...) sentença; ou {}
		//Rank 2 while (..) sentença ; ou {}
		//Rank 3 do sentença; ou {} {} while(...);

		// if(...) sentença ; ou {}


		Scanner in = new Scanner(System.in);

		String texto = "";
		int valor2 = 0;

		do {
			System.out.println("Fale as palavras mágicas....");
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
