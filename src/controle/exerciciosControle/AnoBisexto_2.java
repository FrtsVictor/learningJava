package controle.conclusao;

public class AnoBisexto_2 {

	public static void main(String[] args) {

		boolean bissexto = false;
		int ano = 2020;

		if (ano % 400 == 0) {
			bissexto = true;
		} else {
			if (ano % 4 == 0 && ano % 100 != 0) {
				bissexto = true;
			}
			
			System.out.println(bissexto);
		}
	}
}
