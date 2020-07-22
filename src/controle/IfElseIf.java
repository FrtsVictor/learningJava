package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = in.nextDouble();
		
		 //Quando executa uma das sentenças, finaliza.
		
		if (nota >10 || nota <0) {
			System.out.println("Nota invalida");
		}else if(nota >= 8.0) {
			System.out.println("Aprovado");
		}else if (nota >= 5.0) {
			System.out.println("Recuperação");
		}else if (nota<5.0) {
			System.out.println("Reprovado");
		}else if (nota == 10) {
			System.out.println("Parabéns!!! Vc é boladao"); 
		}
		if(nota == 10) {
			System.out.println("Paraéns!! Vc é sinistrooo");
		}
			
		in.close();
		
	}
	
}
