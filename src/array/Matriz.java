package array;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos");
		int qtdAlunos = in.nextInt();
		
		System.out.println("Quantas notas");
		double qtdNotas = in.nextInt();
		double totalTurma = 0;
		double[][] notasDaTurma = new double [qtdAlunos][(int) qtdNotas];
		double mediaTurma = 0;
		
		
		//corre o tamanho de alunos
		for (int a = 0; a < notasDaTurma.length; a++) {
			//corre as quantidades de notas
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("\nAluno %d   nota%d: ", a+1, n+1);
				notasDaTurma[a][n] = in.nextDouble();
				//soma as notas na posisao do array n de aluno a
				totalTurma += notasDaTurma[a][n];
			}
		}
		
		System.out.println(totalTurma);
		mediaTurma = totalTurma / (qtdAlunos * qtdNotas);
		System.out.println(mediaTurma);
		
		
		in.close();
		
	}
	
}
