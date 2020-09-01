package controle.conclusao;

import java.util.Random;
import java.util.Scanner;

public class Aleatorioo {

	public static void main(String[] args) {
		
		
		int sorteio;
		int tentativas;
		int numero;
		int continuar;
		
		Scanner in = new Scanner(System.in);
		
		
		do {
			System.out.println("Quero ver se vc advinha um numero entre 0 e 100");
			Random aleatorio = new Random();
			sorteio = aleatorio.nextInt(100);
			
			tentativas = 0;
			
		do {
			tentativas++;
			System.out.printf("Tentativa: %d \n", tentativas);
			System.out.printf("Digite um numero: ");
			numero = in.nextInt();			
			
			if(numero > sorteio) {
				System.out.printf("Numero %d é  > que sorteio \n", numero);
			}else if(numero < sorteio){
				System.out.printf("Numero %d < que sorteio \n", numero);				
			} 
			else {
				System.out.println("Parabéns! Voce Ganhou.");
			}
			
			
		}while (numero !=sorteio ^ tentativas ==10);
	
			System.out.println("Digite 0 caso queira sair");
			continuar = in.nextInt();
		}while(continuar != 0);
		
		in.close();
		}
	
}
