package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		// user digita nota válida
		// notas da turma, n sei qts alunos
		// armazenar valor da nota, acrescentar nota na variavel
		// total = soma todas notas
		Scanner in = new Scanner(System.in);

		int quantNota = 0;
		double nota = 1;
		double total = 0;

		while (nota != 0) {
			System.out.print("Digite a nota: ");
			nota = in.nextDouble();

			if (nota <= 10 && nota > 0) {
				quantNota++;
				total += nota;
			}else {
				System.out.println("Nota invalida");
			}
		}
		System.out.println(total);
		System.out.println(quantNota);

		double media = total / quantNota;
		System.out.println("Media = " + media);
		in.close();

	}

}

//		while (nota > 10 || nota < 0) {
//			System.out.println("Digite uma nota valida");
//			nota = in.nextDouble();
//		}