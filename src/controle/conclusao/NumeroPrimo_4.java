package controle.conclusao;


public class NumeroPrimo_4 {

	public static void main(String[] args) {

		// numero >1 e divisivel por ele mesmo
		// numero %2 == 0 <- n�o � primo
		// divisor de 3 >3 n�o � primo
		// divisores de 5 > 5 n�o � primo
		// divisores de 7 > 7 n�o � primo

		int num = 0;

		for (; num <= 100; num++) {

			if (num == 2 ^ num % 2 == 0) {
			} else if (num == 3 ^ num % 3 == 0) {
			} else if (num == 5 ^ num % 5 == 0) {
			} else if (num == 7 ^ num % 7 == 0) {
			} else {
				System.out.printf("\n %d � primo ", num);
			}

		}

	}

}



//int contadorDeDivisores = 0;
//Scanner scanner = new Scanner(System.in);
//
//System.out.println("\nDigite um numero para verificar se � primo:");
//int numero = scanner.nextInt();
//
//for (int i = 2; i < numero; i++) {
//	if (numero % i == 0) {
//		contadorDeDivisores++;
//	}
//}
//
//if (contadorDeDivisores == 0) {
//	System.out.println("\nO numero " + numero + " � primo.");
//} else {
//	System.out.println("\nO numero " + numero + " n�o � primo.");
//}
//
//scanner.close();
