package exercicios.fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite Pimeiro Numero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite segundo numero");
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		double media = soma/2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("E a média é: " + media);
		System.out.printf("A soma dessa paradae é = %.2f e a média é de %.2f", soma,media);
		
	}

}
