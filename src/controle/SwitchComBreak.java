package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String conceito = "";
		System.out.print("Nota? = ");
		int nota = in.nextInt();

		switch (nota) {
		case 10:
		case 9:
		case 8:
			conceito = "A";
			break;
		case 7:
		case 6:
			conceito = "B";
			break;
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = "não informado";
		}

		System.out.println("Conseito = " + conceito);

		in.close();

	}

}
