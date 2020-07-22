package controle;

public class For3 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 10; j >= 0; j--) {
				System.out.printf("[%d  %d]", i, j);
			}
			System.out.println("");
		}

		//definindo var dentro do laço ela fica restrita ao laço, 
		//mesmo se criada dentro de um bloco, se quiser usar a variavel fora tem q criala fora
		

	}

}
