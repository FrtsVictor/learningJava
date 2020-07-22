package exercicios.fundamentos;

import java.util.Scanner;

public class Console {
public static void main(String[] args) {
	
	
	System.out.print("System.out.print vai imprimir na mesma linha");
	System.out.print(", continuando assim a frase");

	System.out.println("\n\nSystem.out.println vai imprimir porem quebrando a linha");
	System.out.println(", continuando assim na linha de baixo");
	
	
	System.out.printf("\n\nSystem.out.printf vai imprimir usando caracters especiais %s %S %d anos " , "Victor", "Freitas", 26);

	Scanner entrada = new Scanner(System.in);
	
	System.out.print("\n\n\nDigite seu nome: ");
	String nome = entrada.nextLine();
	System.out.print("Digite seu Sobrenome: ");
	String sobrenome = entrada.nextLine();
	System.out.print("Digite sua idade: ");
	int idade = entrada.nextInt();
	System.out.print("Digite seu CPF");
	long cpf = entrada.nextLong();

	entrada.close();
	System.out.printf("O usuario %s %s de %d de idade e CPF %d", nome, sobrenome, idade, cpf);
	 		

	Scanner s1 = new Scanner(System.in);
    System.out.print("Enter your entire name: ");
    String w = s1.next();
    System.out.println("Your name is " + w);
    String st = s1.nextLine();
    System.out.println("\nYour lastname is " + st);
    s1.close();
}

	
}
