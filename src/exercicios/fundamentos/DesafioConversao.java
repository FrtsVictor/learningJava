package exercicios.fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro salário = ");
		String s1 = in.next().replace(',' , '.');
		System.out.print("Digite seu segundo salário = ");
		String s2 = in.next().replace(',' , '.');
		System.out.print("Digite seu terceiro salário = ");
		String s3 =in.next().replace(',' , '.');
	
		in.close();
		
		double sal1 = Double.parseDouble(s1);
		double sal2 = Double.parseDouble(s2);
		double sal3 = Double.parseDouble(s3);
		

		double total = sal1 + sal2 + sal3;
		double media = total / 3;
		System.out.print("Salario Trimestral = " + total);
		System.out.print("\nMédia Salarial = " + media);
		System.out.printf("\nSalario trimestral = %.2f com a média de = %.2f mensal", total, media);
		
		
		
		
		
		
		
		
	}
}
