package exercicios.operadoresConclusao;

import java.util.Scanner;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digite sua altura");
		double altura = in.nextDouble();
		System.out.print("Digita seu peso: ");
		double peso = in.nextDouble();
		
		double imc = (double)peso / (Math.pow(altura, 2)); 
		
		
		String abaixo = imc <= 18.5 ? "abaixo do peso" : "";
		String normal = imc >= 18.6 ? "no peso normal" : abaixo ;
		String sobrepeso = imc >= 25 ? "com sobrepeso" : normal;
		String ob1 = imc >=30 ? "com obesidade grau 1" : sobrepeso;
		String ob2 = imc >=35 ? "com obesidade grau 2" : ob1;
		String ob3 = imc >=40 ? "com obesidade grau 3" : ob2;
	
		
		System.out.printf("Seu imc é de %.2f \n", imc);

		System.out.printf("você está, %s", ob3);
		
		
		in.close();
		
	}
}
