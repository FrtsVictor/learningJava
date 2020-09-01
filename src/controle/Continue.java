package controle;


public class Continue {

	public static void main(String[] args) {
		
		//Quando impar é true ele volta pro for por causa do continue
		//Quando  impar é false ele n passa pelo continue então sai o print
		//Interrompe a repetição sem sair do laço, diferente do break
		
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