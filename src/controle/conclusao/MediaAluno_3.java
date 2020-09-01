package controle.conclusao;

// Criar um programa que receba duas notas parciais, calcular a média final.
//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
//caso contrário imprime no console "Reprovado". 


import java.util.Scanner;

public class MediaAluno_3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Primeira nota = ");
		double nota1 = in.nextInt();
		System.out.print("Segunda nota = ");
		double nota2 = in.nextInt();
		double total = nota1 + nota2;
		double media = total/2;
		
		if (media> 10 || media <0) {
			System.out.println("media invalida");
		}else if (media >=7) {
			System.out.println("Aprovado");
		}else if (media >=5) {
			System.out.println("Recuperação");
		}else if(media <5){
			System.out.println("Reprovado");
		}
		
		
	in.close();
		
	}
		
		
	
}
