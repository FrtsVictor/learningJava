package controle;

public class For1 {

	public static void main(String[] args) {
		
	//	int  contador = 0;		

	//	while(contador <=20) {
	//	System.out.printf("Contador = %d  \n", contador);
	//	contador +=2;
	//	}
		
		// Feito especificamente para estruturas com quantidades determinadas de repetição
		
		for (int contador = 0 ; contador <=20; contador += 2) {
			System.out.printf("\"Cont = %d // ", contador);
		}
		
		// /\ procurar sempre usar dessa forma a cima com 3 valores para as ;
		
		System.out.println("");
		
		int x = 10;
		for(; x <=20;) {
			System.out.printf("x = %d // ",x);
			x++;
		}
		
		System.out.println("");

		int y = 0;
		for(; y <=50; y+= 10) {
			System.out.printf("y = %d // ", y);
			
		}
		
	//laço Infinito!
	//	for(;;) {
	//		System.out.println("Fim");
	//		}
		
		
				
	}
	
}
