package exercicios.fundamentos.operadores;

public class Aritimeticos {
	public static void main(String[] args) {

		var x = 3;
		double y = 8;
		
		System.out.println(x + y);		
		System.out.println(x - y);		
		System.out.println(x * y);		
		System.out.println(x / y);		
		
		int a = 3; //Int sempre retorna int,m ignorando a casa das virgurlas
		int b = 8;

		System.out.println("");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a/(double)b ); // USANDO CAST
		
		System.out.println(3%8); // Módulo Pega o resto da divisão
		System.out.println(a%b);
	}
}
