package exercicios.fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a =3;
		int b = a;
		int c = a+b;  //operador com 2 operando
		
		c += b; // c = c+ b; 
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= b; // c = c / a ; 
		
		System.out.println(c);
		c %= 2;  //c = c % 2 resto da divisao de 2; 0 ou 1       0 = par 1 = impar 
		System.out.println(c);
		
	}
	
}
