package controle;

public class ContinueRotulado {
	public static void main(String[] args) {

		//Diferente do Break, o continue não quebra o codigo, só pula a parte designada para o "continue"
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (i == 1) {
					continue; // age no laço internono for de dentro
				}
				System.out.printf("[%d  %d]", i, j);
			}
			System.out.println("");
		}
		System.out.println("----------");
		externo: for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {

				if (a == 1) {
					continue externo;
				}
				System.out.printf("[%d  %d]", a, b);
			}
			System.out.println();
		}
	}
}
