package controle;


public class Continue {

	public static void main(String[] args) {
		
		//Quando impar � true ele volta pro for por causa do continue
		//Quando  impar � false ele n passa pelo continue ent�o sai o print
		//Interrompe a repeti��o sem sair do la�o, diferente do break
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
		}
		System.out.print(i+ " ");
	}
		
		for (int i = 0; i < 10; i++) {
			if(i  == 5) {
				continue;
		}
		System.out.println(i);
	}
		
	}
}